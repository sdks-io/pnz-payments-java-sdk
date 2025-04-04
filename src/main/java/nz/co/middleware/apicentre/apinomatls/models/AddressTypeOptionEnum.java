/*
 * AccountAndTransactionAPISpecificationLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package nz.co.middleware.apicentre.apinomatls.models;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;


/**
 * AddressTypeOptionEnum to be used.
 */
public enum AddressTypeOptionEnum {
    BUSINESS,

    CORRESPONDENCE,

    DELIVERYTO,

    MAILTO,

    POBOX,

    POSTAL,

    RESIDENTIAL,

    STATEMENT;


    private static TreeMap<String, AddressTypeOptionEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        BUSINESS.value = "Business";
        CORRESPONDENCE.value = "Correspondence";
        DELIVERYTO.value = "DeliveryTo";
        MAILTO.value = "MailTo";
        POBOX.value = "POBox";
        POSTAL.value = "Postal";
        RESIDENTIAL.value = "Residential";
        STATEMENT.value = "Statement";

        valueMap.put("Business", BUSINESS);
        valueMap.put("Correspondence", CORRESPONDENCE);
        valueMap.put("DeliveryTo", DELIVERYTO);
        valueMap.put("MailTo", MAILTO);
        valueMap.put("POBox", POBOX);
        valueMap.put("Postal", POSTAL);
        valueMap.put("Residential", RESIDENTIAL);
        valueMap.put("Statement", STATEMENT);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static AddressTypeOptionEnum constructFromString(String toConvert) throws IOException {
        AddressTypeOptionEnum enumValue = fromString(toConvert);
        if (enumValue == null) {
            throw new IOException("Unable to create enum instance with value: " + toConvert);
        }
        return enumValue;
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    public static AddressTypeOptionEnum fromString(String toConvert) {
        return valueMap.get(toConvert);
    }

    /**
     * Returns the string value associated with the enum member.
     * @return The string value against enum member.
     */
    @JsonValue
    public String value() {
        return value;
    }
        
    /**
     * Get string representation of this enum.
     */
    @Override
    public String toString() {
        return value.toString();
    }

    /**
     * Convert list of AddressTypeOptionEnum values to list of string values.
     * @param toConvert The list of AddressTypeOptionEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<AddressTypeOptionEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (AddressTypeOptionEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 