/*
 * AccountAndTransactionAPISpecificationLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package nz.co.middleware.apicentre.apinomatls.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for BankTransactionCode type.
 */
public class BankTransactionCode {
    private String code;
    private String subCode;

    /**
     * Default constructor.
     */
    public BankTransactionCode() {
    }

    /**
     * Initialization constructor.
     * @param  code  String value for code.
     * @param  subCode  String value for subCode.
     */
    public BankTransactionCode(
            String code,
            String subCode) {
        this.code = code;
        this.subCode = subCode;
    }

    /**
     * Getter for Code.
     * Specifies the family within a domain.
     * @return Returns the String
     */
    @JsonGetter("Code")
    public String getCode() {
        return code;
    }

    /**
     * Setter for Code.
     * Specifies the family within a domain.
     * @param code Value for String
     */
    @JsonSetter("Code")
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Getter for SubCode.
     * Specifies the sub-product family within a specific family.
     * @return Returns the String
     */
    @JsonGetter("SubCode")
    public String getSubCode() {
        return subCode;
    }

    /**
     * Setter for SubCode.
     * Specifies the sub-product family within a specific family.
     * @param subCode Value for String
     */
    @JsonSetter("SubCode")
    public void setSubCode(String subCode) {
        this.subCode = subCode;
    }

    /**
     * Converts this BankTransactionCode into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "BankTransactionCode [" + "code=" + code + ", subCode=" + subCode + "]";
    }

    /**
     * Builds a new {@link BankTransactionCode.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link BankTransactionCode.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(code, subCode);
        return builder;
    }

    /**
     * Class to build instances of {@link BankTransactionCode}.
     */
    public static class Builder {
        private String code;
        private String subCode;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  code  String value for code.
         * @param  subCode  String value for subCode.
         */
        public Builder(String code, String subCode) {
            this.code = code;
            this.subCode = subCode;
        }

        /**
         * Setter for code.
         * @param  code  String value for code.
         * @return Builder
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Setter for subCode.
         * @param  subCode  String value for subCode.
         * @return Builder
         */
        public Builder subCode(String subCode) {
            this.subCode = subCode;
            return this;
        }

        /**
         * Builds a new {@link BankTransactionCode} object using the set fields.
         * @return {@link BankTransactionCode}
         */
        public BankTransactionCode build() {
            return new BankTransactionCode(code, subCode);
        }
    }
}
