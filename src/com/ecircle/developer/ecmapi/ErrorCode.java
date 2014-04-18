
package com.ecircle.developer.ecmapi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for errorCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="errorCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ARCHIVED_ATTRIBUTE"/>
 *     &lt;enumeration value="INCORRECT_STATUS"/>
 *     &lt;enumeration value="INVALID_ATTRIBUTE"/>
 *     &lt;enumeration value="INVALID_ATTRIBUTE_VALUE"/>
 *     &lt;enumeration value="INVALID_JOB_ARGUMENT"/>
 *     &lt;enumeration value="INVALID_JOB_DEFINITION_ID"/>
 *     &lt;enumeration value="INVALID_PARAMETER"/>
 *     &lt;enumeration value="INVALID_REQUEST"/>
 *     &lt;enumeration value="MAXIMUM_ATTRIBUTE_COUNT_EXCEEDED"/>
 *     &lt;enumeration value="MAXIMUM_SIZE_EXCEEDED"/>
 *     &lt;enumeration value="MISSING_JOB_ARGUMENT"/>
 *     &lt;enumeration value="MISSING_PARAMETER"/>
 *     &lt;enumeration value="NO_SUCH_ATTRIBUTE"/>
 *     &lt;enumeration value="NO_SUCH_OBJECT"/>
 *     &lt;enumeration value="OBJECT_ALREADY_EXISTS"/>
 *     &lt;enumeration value="OPERATION_DISABLED"/>
 *     &lt;enumeration value="PERMISSION_DENIED"/>
 *     &lt;enumeration value="UNEXPECTED_ERROR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "errorCode")
@XmlEnum
public enum ErrorCode {

    ARCHIVED_ATTRIBUTE,
    INCORRECT_STATUS,
    INVALID_ATTRIBUTE,
    INVALID_ATTRIBUTE_VALUE,
    INVALID_JOB_ARGUMENT,
    INVALID_JOB_DEFINITION_ID,
    INVALID_PARAMETER,
    INVALID_REQUEST,
    MAXIMUM_ATTRIBUTE_COUNT_EXCEEDED,
    MAXIMUM_SIZE_EXCEEDED,
    MISSING_JOB_ARGUMENT,
    MISSING_PARAMETER,
    NO_SUCH_ATTRIBUTE,
    NO_SUCH_OBJECT,
    OBJECT_ALREADY_EXISTS,
    OPERATION_DISABLED,
    PERMISSION_DENIED,
    UNEXPECTED_ERROR;

    public String value() {
        return name();
    }

    public static ErrorCode fromValue(String v) {
        return valueOf(v);
    }

}
