
package com.ecircle.developer.ecmapi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mergeResultType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="mergeResultType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACTIVATED"/>
 *     &lt;enumeration value="ARCHIVED"/>
 *     &lt;enumeration value="CREATED"/>
 *     &lt;enumeration value="ENUM_EXTENDED"/>
 *     &lt;enumeration value="ERROR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "mergeResultType")
@XmlEnum
public enum MergeResultType {

    ACTIVATED,
    ARCHIVED,
    CREATED,
    ENUM_EXTENDED,
    ERROR;

    public String value() {
        return name();
    }

    public static MergeResultType fromValue(String v) {
        return valueOf(v);
    }

}
