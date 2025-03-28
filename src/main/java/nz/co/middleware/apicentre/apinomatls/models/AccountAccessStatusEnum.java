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
 * AccountAccessStatusEnum to be used.
 */
public enum AccountAccessStatusEnum {
    AUTHORISED,

    AWAITINGAUTHORISATION,

    REJECTED,

    REVOKED;


    private static TreeMap<String, AccountAccessStatusEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        AUTHORISED.value = "Authorised";
        AWAITINGAUTHORISATION.value = "AwaitingAuthorisation";
        REJECTED.value = "Rejected";
        REVOKED.value = "Revoked";

        valueMap.put("Authorised", AUTHORISED);
        valueMap.put("AwaitingAuthorisation", AWAITINGAUTHORISATION);
        valueMap.put("Rejected", REJECTED);
        valueMap.put("Revoked", REVOKED);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static AccountAccessStatusEnum constructFromString(String toConvert) throws IOException {
        AccountAccessStatusEnum enumValue = fromString(toConvert);
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
    public static AccountAccessStatusEnum fromString(String toConvert) {
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
     * Convert list of AccountAccessStatusEnum values to list of string values.
     * @param toConvert The list of AccountAccessStatusEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<AccountAccessStatusEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (AccountAccessStatusEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 