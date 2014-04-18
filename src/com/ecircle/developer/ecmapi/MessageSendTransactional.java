
package com.ecircle.developer.ecmapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for messageSendTransactional complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="messageSendTransactional">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="messageId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="externalTransactionFormula" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "messageSendTransactional", propOrder = {
    "messageId",
    "externalTransactionFormula",
    "recipientId",
    "additionalContent"
})
public class MessageSendTransactional {

    protected long messageId;
    @XmlElement(required = true)
    protected String externalTransactionFormula;
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
     * Gets the value of the externalTransactionFormula property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalTransactionFormula() {
        return externalTransactionFormula;
    }

    /**
     * Sets the value of the externalTransactionFormula property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalTransactionFormula(String value) {
        this.externalTransactionFormula = value;
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
