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
 * AccountSchemeModelEnum to be used.
 */
public enum AccountSchemeModelEnum {
    BECSELECTRONICCREDIT,

    MASKEDCARDNUMBER;


    private static TreeMap<String, AccountSchemeModelEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        BECSELECTRONICCREDIT.value = "BECSElectronicCredit";
        MASKEDCARDNUMBER.value = "MaskedCardNumber";

        valueMap.put("BECSElectronicCredit", BECSELECTRONICCREDIT);
        valueMap.put("MaskedCardNumber", MASKEDCARDNUMBER);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static AccountSchemeModelEnum constructFromString(String toConvert) throws IOException {
        AccountSchemeModelEnum enumValue = fromString(toConvert);
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
    public static AccountSchemeModelEnum fromString(String toConvert) {
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
     * Convert list of AccountSchemeModelEnum values to list of string values.
     * @param toConvert The list of AccountSchemeModelEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<AccountSchemeModelEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (AccountSchemeModelEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 