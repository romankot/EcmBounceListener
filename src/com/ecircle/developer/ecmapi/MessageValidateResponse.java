
package com.ecircle.developer.ecmapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for messageValidateResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="messageValidateResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="validationResult" type="{http://ecircle.com/developer/ecmapi}callResult"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "messageValidateResponse", propOrder = {
    "validationResult"
})
public class MessageValidateResponse {

    @XmlElement(required = true)
    protected CallResult validationResult;

    /**
     * Gets the value of the validationResult property.
     * 
     * @return
     *     possible object is
     *     {@link CallResult }
     *     
     */
    public CallResult getValidationResult() {
        return validationResult;
    }

    /**
     * Sets the value of the validationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CallResult }
     *     
     */
    public void setValidationResult(CallResult value) {
        this.validationResult = value;
    }

}
