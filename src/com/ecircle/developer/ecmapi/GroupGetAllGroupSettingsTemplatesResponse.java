
package com.ecircle.developer.ecmapi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for groupGetAllGroupSettingsTemplatesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="groupGetAllGroupSettingsTemplatesResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="groupSettingsTemplates" type="{http://ecircle.com/developer/ecmapi}groupSettingsTemplate" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "groupGetAllGroupSettingsTemplatesResponse", propOrder = {
    "groupSettingsTemplates"
})
public class GroupGetAllGroupSettingsTemplatesResponse {

    protected List<GroupSettingsTemplate> groupSettingsTemplates;

    /**
     * Gets the value of the groupSettingsTemplates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groupSettingsTemplates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroupSettingsTemplates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GroupSettingsTemplate }
     * 
     * 
     */
    public List<GroupSettingsTemplate> getGroupSettingsTemplates() {
        if (groupSettingsTemplates == null) {
            groupSettingsTemplates = new ArrayList<GroupSettingsTemplate>();
        }
        return this.groupSettingsTemplates;
    }

}
