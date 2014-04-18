
package com.ecircle.developer.ecmapi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for metaMergeAttributeDefinitions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="metaMergeAttributeDefinitions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="attributeDefinitions" type="{http://ecircle.com/developer/ecmapi}attributeDefinition" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "metaMergeAttributeDefinitions", propOrder = {
    "attributeDefinitions"
})
public class MetaMergeAttributeDefinitions {

    protected List<AttributeDefinition> attributeDefinitions;

    /**
     * Gets the value of the attributeDefinitions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attributeDefinitions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttributeDefinitions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttributeDefinition }
     * 
     * 
     */
    public List<AttributeDefinition> getAttributeDefinitions() {
        if (attributeDefinitions == null) {
            attributeDefinitions = new ArrayList<AttributeDefinition>();
        }
        return this.attributeDefinitions;
    }

}
