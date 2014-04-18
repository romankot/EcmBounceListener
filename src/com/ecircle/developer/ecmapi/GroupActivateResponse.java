
package com.ecircle.developer.ecmapi;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for groupActivateResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="groupActivateResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="activatingResults" type="{http://ecircle.com/developer/ecmapi}callResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "groupActivateResponse", propOrder = {
    "activatingResults"
})
public class GroupActivateResponse {

    protected List<CallResult> activatingResults;

    /**
     * Gets the value of the activatingResults property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the activatingResults property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActivatingResults().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CallResult }
     * 
     * 
     */
    public List<CallResult> getActivatingResults() {
        if (activatingResults == null) {
            activatingResults = new ArrayList<CallResult>();
        }
        return this.activatingResults;
    }

}
