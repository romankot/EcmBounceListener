
package com.ecircle.developer.ecmapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for metaUpdateLinkCategory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="metaUpdateLinkCategory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="category" type="{http://ecircle.com/developer/ecmapi}linkCategory"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "metaUpdateLinkCategory", propOrder = {
    "category"
})
public class MetaUpdateLinkCategory {

    @XmlElement(required = true)
    protected LinkCategory category;

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link LinkCategory }
     *     
     */
    public LinkCategory getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkCategory }
     *     
     */
    public void setCategory(LinkCategory value) {
        this.category = value;
    }

}
