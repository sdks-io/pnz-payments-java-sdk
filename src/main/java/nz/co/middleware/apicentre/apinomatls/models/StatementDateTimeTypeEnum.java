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
 * StatementDateTimeTypeEnum to be used.
 */
public enum StatementDateTimeTypeEnum {
    BALANCETRANSFERPROMOEND,

    DIRECTDEBITDUE,

    LASTPAYMENT,

    LASTSTATEMENT,

    NEXTSTATEMENT,

    PAYMENTDUE,

    PURCHASEPROMOEND,

    STATEMENTAVAILABLE;


    private static TreeMap<String, StatementDateTimeTypeEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        BALANCETRANSFERPROMOEND.value = "BalanceTransferPromoEnd";
        DIRECTDEBITDUE.value = "DirectDebitDue";
        LASTPAYMENT.value = "LastPayment";
        LASTSTATEMENT.value = "LastStatement";
        NEXTSTATEMENT.value = "NextStatement";
        PAYMENTDUE.value = "PaymentDue";
        PURCHASEPROMOEND.value = "PurchasePromoEnd";
        STATEMENTAVAILABLE.value = "StatementAvailable";

        valueMap.put("BalanceTransferPromoEnd", BALANCETRANSFERPROMOEND);
        valueMap.put("DirectDebitDue", DIRECTDEBITDUE);
        valueMap.put("LastPayment", LASTPAYMENT);
        valueMap.put("LastStatement", LASTSTATEMENT);
        valueMap.put("NextStatement", NEXTSTATEMENT);
        valueMap.put("PaymentDue", PAYMENTDUE);
        valueMap.put("PurchasePromoEnd", PURCHASEPROMOEND);
        valueMap.put("StatementAvailable", STATEMENTAVAILABLE);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static StatementDateTimeTypeEnum constructFromString(String toConvert) throws IOException {
        StatementDateTimeTypeEnum enumValue = fromString(toConvert);
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
    public static StatementDateTimeTypeEnum fromString(String toConvert) {
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
     * Convert list of StatementDateTimeTypeEnum values to list of string values.
     * @param toConvert The list of StatementDateTimeTypeEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<StatementDateTimeTypeEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (StatementDateTimeTypeEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 