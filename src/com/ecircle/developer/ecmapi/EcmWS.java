
package com.ecircle.developer.ecmapi;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "EcmWS", targetNamespace = "http://ecircle.com/developer/ecmapi", wsdlLocation = "https://secure.ecircle-ag.com/cm42/api/soap/v2?wsdl")
public class EcmWS
    extends Service
{

    private final static URL ECMWS_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(com.ecircle.developer.ecmapi.EcmWS.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = com.ecircle.developer.ecmapi.EcmWS.class.getResource(".");
            url = new URL(baseUrl, "https://secure.ecircle-ag.com/cm42/api/soap/v2?wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'https://secure.ecircle-ag.com/cm42/api/soap/v2?wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        ECMWS_WSDL_LOCATION = url;
    }

    public EcmWS(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public EcmWS() {
        super(ECMWS_WSDL_LOCATION, new QName("http://ecircle.com/developer/ecmapi", "EcmWS"));
    }

    /**
     * 
     * @return
     *     returns Ecm
     */
    @WebEndpoint(name = "EcmWSPort")
    public Ecm getEcmWSPort() {
        return super.getPort(new QName("http://ecircle.com/developer/ecmapi", "EcmWSPort"), Ecm.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Ecm
     */
    @WebEndpoint(name = "EcmWSPort")
    public Ecm getEcmWSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ecircle.com/developer/ecmapi", "EcmWSPort"), Ecm.class, features);
    }

}
