
package com.ecircle.developer.ecmapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for messageSendSingle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="messageSendSingle">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="messageId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="recipientId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="additionalContent" type="{http://ecircle.com/developer/ecmapi}messageContent"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "messageSendSingle", propOrder = {
    "messageId",
    "recipientId",
    "additionalContent"
})
public class MessageSendSingle {

    protected long messageId;
    protected long recipientId;
    @XmlElement(required = true)
    protected MessageContent additionalContent;

    /**
     * Gets the value of the messageId property.
     * 
     */
    public long getMessageId() {
        return messageId;
    }

    /**
     * Sets the value of the messageId property.
     * 
     */
    public void setMessageId(long value) {
        this.messageId = value;
    }

    /**
     * Gets the value of the recipientId property.
     * 
     */
    public long getRecipientId() {
        return recipientId;
    }

    /**
     * Sets the value of the recipientId property.
     * 
     */
    public void setRecipientId(long value) {
        this.recipientId = value;
    }

    /**
     * Gets the value of the additionalContent property.
     * 
     * @return
     *     possible object is
     *     {@link MessageContent }
     *     
     */
    public MessageContent getAdditionalContent() {
        return additionalContent;
    }

    /**
     * Sets the value of the additionalContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageContent }
     *     
     */
    public void setAdditionalContent(MessageContent value) {
        this.additionalContent = value;
    }

}
