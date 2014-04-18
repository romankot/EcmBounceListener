
package com.ecircle.developer.ecmapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for asyncGetPollCountResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="asyncGetPollCountResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="polls" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "asyncGetPollCountResponse", propOrder = {
    "polls"
})
public class AsyncGetPollCountResponse {

    protected long polls;

    /**
     * Gets the value of the polls property.
     * 
     */
    public long getPolls() {
        return polls;
    }

    /**
     * Sets the value of the polls property.
     * 
     */
    public void setPolls(long value) {
        this.polls = value;
    }

}
