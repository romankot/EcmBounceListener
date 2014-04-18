
package com.ecircle.developer.ecmapi;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebFault(name = "LandingpageException", targetNamespace = "http://ecircle.com/developer/ecmapi")
public class LandingpageException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private LandingpageException faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public LandingpageException_Exception(String message, LandingpageException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public LandingpageException_Exception(String message, LandingpageException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.ecircle.developer.ecmapi.LandingpageException
     */
    public LandingpageException getFaultInfo() {
        return faultInfo;
    }

}