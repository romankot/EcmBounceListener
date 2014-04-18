
package com.ecircle.developer.ecmapi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for message complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="message">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sendoutRef" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="recipientRef" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="from" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fromName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="to" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="toName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="replyTo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="replyToName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="headers" type="{http://ecircle.com/developer/ecmapi}attribute" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="subject" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="textBody" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="htmlBody" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="attachments" type="{http://ecircle.com/developer/ecmapi}attachmentReference" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "message", propOrder = {
    "sendoutRef",
    "recipientRef",
    "from",
    "fromName",
    "to",
    "toName",
    "replyTo",
    "replyToName",
    "headers",
    "subject",
    "textBody",
    "htmlBody",
    "attachments"
})
public class Message {

    @XmlElement(required = true)
    protected String sendoutRef;
    @XmlElement(required = true)
    protected String recipientRef;
    @XmlElement(required = true)
    protected String from;
    @XmlElement(required = true)
    protected String fromName;
    @XmlElement(required = true)
    protected String to;
    @XmlElement(required = true)
    protected String toName;
    @XmlElement(required = true)
    protected String replyTo;
    @XmlElement(required = true)
    protected String replyToName;
    @XmlElement(nillable = true)
    protected List<Attribute> headers;
    @XmlElement(required = true)
    protected String subject;
    @XmlElement(required = true)
    protected String textBody;
    @XmlElement(required = true)
    protected String htmlBody;
    @XmlElement(nillable = true)
    protected List<AttachmentReference> attachments;

    /**
     * Gets the value of the sendoutRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendoutRef() {
        return sendoutRef;
    }

    /**
     * Sets the value of the sendoutRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendoutRef(String value) {
        this.sendoutRef = value;
    }

    /**
     * Gets the value of the recipientRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientRef() {
        return recipientRef;
    }

    /**
     * Sets the value of the recipientRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientRef(String value) {
        this.recipientRef = value;
    }

    /**
     * Gets the value of the from property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrom() {
        return from;
    }

    /**
     * Sets the value of the from property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrom(String value) {
        this.from = value;
    }

    /**
     * Gets the value of the fromName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromName() {
        return fromName;
    }

    /**
     * Sets the value of the fromName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromName(String value) {
        this.fromName = value;
    }

    /**
     * Gets the value of the to property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTo() {
        return to;
    }

    /**
     * Sets the value of the to property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTo(String value) {
        this.to = value;
    }

    /**
     * Gets the value of the toName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToName() {
        return toName;
    }

    /**
     * Sets the value of the toName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToName(String value) {
        this.toName = value;
    }

    /**
     * Gets the value of the replyTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplyTo() {
        return replyTo;
    }

    /**
     * Sets the value of the replyTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReplyTo(String value) {
        this.replyTo = value;
    }

    /**
     * Gets the value of the replyToName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplyToName() {
        return replyToName;
    }

    /**
     * Sets the value of the replyToName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReplyToName(String value) {
        this.replyToName = value;
    }

    /**
     * Gets the value of the headers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the headers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHeaders().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Attribute }
     * 
     * 
     */
    public List<Attribute> getHeaders() {
        if (headers == null) {
            headers = new ArrayList<Attribute>();
        }
        return this.headers;
    }

    /**
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubject(String value) {
        this.subject = value;
    }

    /**
     * Gets the value of the textBody property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextBody() {
        return textBody;
    }

    /**
     * Sets the value of the textBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextBody(String value) {
        this.textBody = value;
    }

    /**
     * Gets the value of the htmlBody property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHtmlBody() {
        return htmlBody;
    }

    /**
     * Sets the value of the htmlBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHtmlBody(String value) {
        this.htmlBody = value;
    }

    /**
     * Gets the value of the attachments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttachments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttachmentReference }
     * 
     * 
     */
    public List<AttachmentReference> getAttachments() {
        if (attachments == null) {
            attachments = new ArrayList<AttachmentReference>();
        }
        return this.attachments;
    }

}
