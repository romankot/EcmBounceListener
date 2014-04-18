
package com.ecircle.developer.ecmapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for asyncGetSubmitCountResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="asyncGetSubmitCountResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="puts" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "asyncGetSubmitCountResponse", propOrder = {
    "puts"
})
public class AsyncGetSubmitCountResponse {

    protected long puts;

    /**
     * Gets the value of the puts property.
     * 
     */
    public long getPuts() {
        return puts;
    }

    /**
     * Sets the value of the puts property.
     * 
     */
    public void setPuts(long value) {
        this.puts = value;
    }

}
