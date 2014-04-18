
package com.ecircle.developer.ecmapi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for attributeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="attributeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BOOLEAN"/>
 *     &lt;enumeration value="DATE"/>
 *     &lt;enumeration value="NUMBER"/>
 *     &lt;enumeration value="STRING"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "attributeType")
@XmlEnum
public enum AttributeType {

    BOOLEAN,
    DATE,
    NUMBER,
    STRING;

    public String value() {
        return name();
    }

    public static AttributeType fromValue(String v) {
        return valueOf(v);
    }

}
