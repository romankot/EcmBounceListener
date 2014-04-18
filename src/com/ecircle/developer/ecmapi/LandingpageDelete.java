
package com.ecircle.developer.ecmapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for landingpageDelete complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="landingpageDelete">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="landingpageId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "landingpageDelete", propOrder = {
    "landingpageId"
})
public class LandingpageDelete {

    protected long landingpageId;

    /**
     * Gets the value of the landingpageId property.
     * 
     */
    public long getLandingpageId() {
        return landingpageId;
    }

    /**
     * Sets the value of the landingpageId property.
     * 
     */
    public void setLandingpageId(long value) {
        this.landingpageId = value;
    }

}
