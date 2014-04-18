import com.ecircle.developer.ecmapi.*;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.HandlerResolver;
import java.io.IOException;
import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * User: rkot
 * Date: 09.10.13  Time: 12:35
 */
public class ECMhandlingTest
{
    private static String m_proxyserver = "127.0.0.1";
    private static String m_proxyserver_port = "8080";
    private static String m_proxy_user = "user";
    private static String m_proxy_password = "123456";
    private static String m_soap_endpoint = "https://secure.ecircle-ag.com/cm42/api/soap/v2/";
    private static String m_username = "mmazur@opentext.com";
    private static String m_userpassword = "Test00?";
    private static String m_topic_name = "response";

    public static void main(String[] args) throws InvalidParameterException_Exception, NoSuchObjectException_Exception, UnexpectedErrorException_Exception, ObjectAlreadyExistsException_Exception, IOException, AsyncException_Exception, InterruptedException {

        if ( true )
        {
            Authenticator.setDefault(new Authenticator()
            {
                public PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(m_proxy_user, m_proxy_password.toCharArray());
                }
            });
            System.setProperty("proxySet", "true");
            System.setProperty("http.proxyHost", m_proxyserver);
            System.setProperty("http.proxyPort", m_proxyserver_port);

            System.setProperty("https.proxyHost", m_proxyserver);
            System.setProperty("https.proxyPort", m_proxyserver_port);

            System.setProperty("http.proxyUser", m_proxy_user);
            System.setProperty("http.proxyPassword", m_proxy_password);

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
        for (AsyncResult result_item: asyncResults) {
            List<Attribute> attributes = result_item.getOutput();
            logDebug("Queue ID:" + result_item.getQueueId());
            if (attributes != null) for (Attribute att: attributes) {
                logDebug("   " + att.getName() + ": " + att.getValue());
            }
        }

        logDebug("asyncPoll was made");

    }

    private static void logInfo(String format) {
        System.out.println(format);
    }
    private static void logDebug(String format) {
        System.out.println(format);
    }
}
