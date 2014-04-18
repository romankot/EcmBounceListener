
import com.ecircle.developer.ecmapi.*;
import streamserve.connector.StrsConfigVals;
import streamserve.connector.StrsInConnectable;
import streamserve.connector.StrsInDataQueueable;
import streamserve.connector.StrsServiceable;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.HandlerResolver;
import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class EcmBounceListener implements StrsInConnectable
{
    private static final String PROPERTY_SOAP_URL = "Endpoint URL";       //endpoint URL. system specific
    private static final String PROPERTY_TOPIC_NAME = "Topic name";
    static final String PROPERTY_USER = "User";
    static final String PROPERTY_USER_PSW = "User password";
    private static final String PROXY_SERVER = "Proxy server";
    private static final String PROXY_SERVER_PORT = "Proxy server port";
    private static final String PROXY_USER = "Proxy User";
    private static final String PROXY_USER_PASSWORD = "Proxy password";
    static final String PROPERTY_LOG_FILENAME = "Log filename";

    private StrsServiceable m_service;
    private String m_soap_endpoint = "";
    private String m_topic_name = "";
    private String m_username = "";
    private String m_userpassword = "";
    private String m_proxyserver = "";     //platf field
    private String m_proxyserver_port = "";     //platf field
    private String m_proxy_user = "";     //platf field
    private String m_proxy_password = "";     //platf field
    public static String m_log_control_xml_filename = "";

    private static String str = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
            "<S:Envelope xmlns:S=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" +
            "  <S:Header/>\n" +
            "  <S:Body>\n" +
            "    <ns2:asyncPollResponse xmlns:ns2=\"http://ecircle.com/developer/ecmapi\">\n" +
            "      <results>\n" +
            "        <output>\n" +
            "          <name>status</name>\n" +
            "          <value>rejected</value>\n" +
            "        </output>\n" +
            "        <output>\n" +
            "          <name>type</name>\n" +
            "          <value>B</value>\n" +
            "        </output>\n" +
            "        <output>\n" +
            "          <name>user.email</name>\n" +
            "          <value>wrong1317@opentext.com</value>\n" +
            "        </output>\n" +
            "        <output>\n" +
            "          <name>bouncing timestamp</name>\n" +
            "          <value>2013-09-12T10:17:55Z</value>\n" +
            "        </output>\n" +
            "        <queueId>7e8f3997-e816-43b5-ab45-6ce348b6f544</queueId>\n" +
            "      </results>\n" +
            "    </ns2:asyncPollResponse>\n" +
            "  </S:Body>\n" +
            "</S:Envelope>";


    public boolean strsiStart(StrsConfigVals strsConfigVals) throws RemoteException {

        if (strsConfigVals == null)
        {
            logError("strsConfigVals == null");
            return false;
        }

        LoadStrsConfigValues(strsConfigVals);

        logDebug("Endpoint : "+  m_soap_endpoint);
        logDebug("Topic name : "+  m_topic_name);
        logDebug("User : "+  m_username);
        logDebug("User password : "+  m_userpassword);
        logDebug("Proxy server : " + m_proxyserver + " port:" + m_proxyserver_port);
        logDebug("Proxy user : " + m_proxy_user);
        logDebug("Proxy pass : " + m_proxy_password);

        return true;
    }

    public boolean strsiPoll(StrsInDataQueueable inDataQueue) throws RemoteException {

        logDebug("StrsPoll function");
        try {

        if ( !m_proxyserver.isEmpty() && !m_proxyserver_port.isEmpty() )
        {
            final String authUser = m_proxy_user;
            final String authPassword = m_proxy_password;
            Authenticator.setDefault(new Authenticator()
            {
                public PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(authUser, authPassword.toCharArray());
                }
            });

            System.setProperty("proxySet", "true");
            System.setProperty("http.proxyHost", m_proxyserver);
            System.setProperty("http.proxyPort", m_proxyserver_port);

            System.setProperty("https.proxyHost", m_proxyserver);
            System.setProperty("https.proxyPort", m_proxyserver_port);

            System.setProperty("http.proxyUser", authUser);
            System.setProperty("http.proxyPassword", authPassword);

            if (m_proxy_user.isEmpty() || m_proxy_password.isEmpty() )
            {
                logInfo(String.format("Proxy anonymous %s:%s enabled. Credentials is not provided", m_proxyserver, m_proxyserver_port) );
            }
            else
            {
                logInfo(String.format("Authentication proxy %s:%s enabled. Proxy User: %s", m_proxyserver, m_proxyserver_port, m_proxy_user  ));
            }
        }

            EcmWS ecm = new EcmWS();

            HandlerResolver myHanlderResolver = new MyHandlerResolver();
            ecm.setHandlerResolver(myHanlderResolver);

            Ecm ecmService = ecm.getEcmWSPort();

            Map<String, Object> ctx = ((BindingProvider) ecmService).getRequestContext();
            URL accessUrl = new URL(m_soap_endpoint);
            ctx.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, accessUrl.toExternalForm());
            ctx.put(BindingProvider.USERNAME_PROPERTY, m_username);
            ctx.put(BindingProvider.PASSWORD_PROPERTY, m_userpassword);

            List<AsyncResult> asyncResults = new ArrayList<AsyncResult>();
            asyncResults = ecmService.asyncPoll(m_topic_name, 1);

            logDebug("asyncPoll was made");
            for (AsyncResult result_item: asyncResults) {
                List<Attribute> attributes = result_item.getOutput();
                logDebug("Queue ID:" + result_item.getQueueId());
                if (attributes != null) for (Attribute att: attributes) {
                    logDebug("   " + att.getName() + ": " + att.getValue());
                }
            }

            String stt = new String(Global.out);
            logDebug("responce string = "+ stt);
            inDataQueue.putString(stt);
            inDataQueue.signalEvent(StrsInDataQueueable.INEVENT_EOF);
            logDebug("Input sent to Strs");

            asyncResults.clear();

        } catch (AsyncException_Exception e) {
            logError(e.getLocalizedMessage());
            return false;
        } catch (UnexpectedErrorException_Exception e) {
            logError(e.getLocalizedMessage());
            return false;
        }
        catch (Throwable e)
        {
            logError(e.getLocalizedMessage());
        }
        return true;
    }

    public boolean strsiStop() throws RemoteException {
        return true;
    }

    private void logError(String message) throws RemoteException
    {
        if (m_service != null)
        {
            m_service.writeMsg(StrsServiceable.MSG_ERROR, 0, "ResponcePollInConnector ERROR: " + message);
        }
        else
        {
            System.out.println(message);
        }
    }

    private void logInfo(String message) throws RemoteException
    {
        if (m_service != null)
        {
            m_service.writeMsg(StrsServiceable.MSG_INFO, 0, "ResponcePollInConnector INFO: " + message);
        }
        else
        {
            System.out.println(message);
        }
    }

    private void logDebug(String message) throws RemoteException
    {
        if (m_service != null)
        {
            m_service.writeMsg(StrsServiceable.MSG_DEBUG, 0, "ResponcePollInConnector DEBUG: " + message);
        }
        else
        {
            System.out.println(message);
        }
    }
    private void LoadStrsConfigValues(StrsConfigVals strsConfigVals)
    {
        m_service = strsConfigVals.getStrsService();

        String soap_endpoint = strsConfigVals.getValue(PROPERTY_SOAP_URL);
        if (!soap_endpoint.isEmpty())
        {
            m_soap_endpoint = soap_endpoint;
        }

        String topic_name = strsConfigVals.getValue(PROPERTY_TOPIC_NAME);
        if (!soap_endpoint.isEmpty())
        {
            m_topic_name = topic_name;
        }

        String username = strsConfigVals.getValue(PROPERTY_USER);
        if (!username.isEmpty())
        {
            m_username = username;
        }

        String userpassword = strsConfigVals.getValue(PROPERTY_USER_PSW);
        if (!userpassword.isEmpty())
        {
            m_userpassword = userpassword;
        }

        String proxy_server = strsConfigVals.getValue(PROXY_SERVER);
        if (proxy_server != null && proxy_server.length() > 0)
        {
            m_proxyserver = proxy_server;
        }

        String proxy_server_port = strsConfigVals.getValue(PROXY_SERVER_PORT);
        if (proxy_server != null && proxy_server.length() > 0)
        {
            m_proxyserver_port = proxy_server_port;
        }

        String proxy_user = strsConfigVals.getValue(PROXY_USER);
        if (proxy_user != null && proxy_user.length() > 0)
        {
            m_proxy_user = proxy_user;
        }

        String proxy_pass = strsConfigVals.getValue(PROXY_USER_PASSWORD);
        if (proxy_pass != null && proxy_pass.length() > 0)
        {
            m_proxy_password = proxy_pass;
        }

        String logfilename = strsConfigVals.getValue(PROPERTY_LOG_FILENAME);
        if (!logfilename.isEmpty())
        {
            m_log_control_xml_filename = logfilename;
        }
    }
}
