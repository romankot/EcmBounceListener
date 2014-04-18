
package com.ecircle.developer.ecmapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AsyncException complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AsyncException">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="errorActor" type="{http://ecircle.com/developer/ecmapi}errorActor"/>
 *         &lt;element name="errorCode" type="{http://ecircle.com/developer/ecmapi}errorCode"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AsyncException", propOrder = {
    "errorActor",
    "errorCode",
    "message"
})
public class AsyncException {

    @XmlElement(required = true)
    protected ErrorActor errorActor;
    @XmlElement(required = true)
    protected ErrorCode errorCode;
    @XmlElement(required = true)
    protected String message;

    /**
     * Gets the value of the errorActor property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorActor }
     *     
     */
    public ErrorActor getErrorActor() {
        return errorActor;
    }

    /**
     * Sets the value of the errorActor property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorActor }
     *     
     */
    public void setErrorActor(ErrorActor value) {
        this.errorActor = value;
    }

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorCode }
     *     
     */
    public ErrorCode getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorCode }
     *     
     */
    public void setErrorCode(ErrorCode value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

}
