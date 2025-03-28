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
 * StatementRateTypeEnum to be used.
 */
public enum StatementRateTypeEnum {
    ANNUALBALANCETRANSFER,

    ANNUALBALANCETRANSFERAFTERPROMO,

    ANNUALBALANCETRANSFERPROMO,

    ANNUALCASH,

    ANNUALPURCHASE,

    ANNUALPURCHASEAFTERPROMO,

    ANNUALPURCHASEPROMO,

    MONTHLYBALANCETRANSFER,

    MONTHLYCASH,

    MONTHLYPURCHASE;


    private static TreeMap<String, StatementRateTypeEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ANNUALBALANCETRANSFER.value = "AnnualBalanceTransfer";
        ANNUALBALANCETRANSFERAFTERPROMO.value = "AnnualBalanceTransferAfterPromo";
        ANNUALBALANCETRANSFERPROMO.value = "AnnualBalanceTransferPromo";
        ANNUALCASH.value = "AnnualCash";
        ANNUALPURCHASE.value = "AnnualPurchase";
        ANNUALPURCHASEAFTERPROMO.value = "AnnualPurchaseAfterPromo";
        ANNUALPURCHASEPROMO.value = "AnnualPurchasePromo";
        MONTHLYBALANCETRANSFER.value = "MonthlyBalanceTransfer";
        MONTHLYCASH.value = "MonthlyCash";
        MONTHLYPURCHASE.value = "MonthlyPurchase";

        valueMap.put("AnnualBalanceTransfer", ANNUALBALANCETRANSFER);
        valueMap.put("AnnualBalanceTransferAfterPromo", ANNUALBALANCETRANSFERAFTERPROMO);
        valueMap.put("AnnualBalanceTransferPromo", ANNUALBALANCETRANSFERPROMO);
        valueMap.put("AnnualCash", ANNUALCASH);
        valueMap.put("AnnualPurchase", ANNUALPURCHASE);
        valueMap.put("AnnualPurchaseAfterPromo", ANNUALPURCHASEAFTERPROMO);
        valueMap.put("AnnualPurchasePromo", ANNUALPURCHASEPROMO);
        valueMap.put("MonthlyBalanceTransfer", MONTHLYBALANCETRANSFER);
        valueMap.put("MonthlyCash", MONTHLYCASH);
        valueMap.put("MonthlyPurchase", MONTHLYPURCHASE);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static StatementRateTypeEnum constructFromString(String toConvert) throws IOException {
        StatementRateTypeEnum enumValue = fromString(toConvert);
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
    public static StatementRateTypeEnum fromString(String toConvert) {
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
     * Convert list of StatementRateTypeEnum values to list of string values.
     * @param toConvert The list of StatementRateTypeEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<StatementRateTypeEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (StatementRateTypeEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 