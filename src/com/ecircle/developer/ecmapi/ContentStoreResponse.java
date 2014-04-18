
package com.ecircle.developer.ecmapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for contentStoreResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contentStoreResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contentReference" type="{http://ecircle.com/developer/ecmapi}attachmentReference"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contentStoreResponse", propOrder = {
    "contentReference"
})
public class ContentStoreResponse {

    @XmlElement(required = true)
    protected AttachmentReference contentReference;

    /**
     * Gets the value of the contentReference property.
     * 
     * @return
     *     possible object is
     *     {@link AttachmentReference }
     *     
     */
    public AttachmentReference getContentReference() {
        return contentReference;
    }

    /**
     * Sets the value of the contentReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttachmentReference }
     *     
     */
    public void setContentReference(AttachmentReference value) {
        this.contentReference = value;
    }

}
