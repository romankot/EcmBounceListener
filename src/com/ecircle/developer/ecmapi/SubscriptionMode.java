
package com.ecircle.developer.ecmapi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for subscriptionMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="subscriptionMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CONFIRMED_OPT_IN"/>
 *     &lt;enumeration value="DOUBLE_OPT_IN"/>
 *     &lt;enumeration value="OPT_IN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "subscriptionMode")
@XmlEnum
public enum SubscriptionMode {

    CONFIRMED_OPT_IN,
    DOUBLE_OPT_IN,
    OPT_IN;

    public String value() {
        return name();
    }

    public static SubscriptionMode fromValue(String v) {
        return valueOf(v);
    }

}
