/*
 * AccountAndTransactionAPISpecificationLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package nz.co.middleware.apicentre.apinomatls.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for CreditorReference type.
 */
public class CreditorReference {
    private String particulars;
    private String code;
    private String reference;

    /**
     * Default constructor.
     */
    public CreditorReference() {
    }

    /**
     * Initialization constructor.
     * @param  particulars  String value for particulars.
     * @param  code  String value for code.
     * @param  reference  String value for reference.
     */
    public CreditorReference(
            String particulars,
            String code,
            String reference) {
        this.particulars = particulars;
        this.code = code;
        this.reference = reference;
    }

    /**
     * Getter for Particulars.
     * @return Returns the String
     */
    @JsonGetter("Particulars")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getParticulars() {
        return particulars;
    }

    /**
     * Setter for Particulars.
     * @param particulars Value for String
     */
    @JsonSetter("Particulars")
    public void setParticulars(String particulars) {
        this.particulars = particulars;
    }

    /**
     * Getter for Code.
     * @return Returns the String
     */
    @JsonGetter("Code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCode() {
        return code;
    }

    /**
     * Setter for Code.
     * @param code Value for String
     */
    @JsonSetter("Code")
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Getter for Reference.
     * @return Returns the String
     */
    @JsonGetter("Reference")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getReference() {
        return reference;
    }

    /**
     * Setter for Reference.
     * @param reference Value for String
     */
    @JsonSetter("Reference")
    public void setReference(String reference) {
        this.reference = reference;
    }

    /**
     * Converts this CreditorReference into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreditorReference [" + "particulars=" + particulars + ", code=" + code
                + ", reference=" + reference + "]";
    }

    /**
     * Builds a new {@link CreditorReference.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreditorReference.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .particulars(getParticulars())
                .code(getCode())
                .reference(getReference());
        return builder;
    }

    /**
     * Class to build instances of {@link CreditorReference}.
     */
    public static class Builder {
        private String particulars;
        private String code;
        private String reference;



        /**
         * Setter for particulars.
         * @param  particulars  String value for particulars.
         * @return Builder
         */
        public Builder particulars(String particulars) {
            this.particulars = particulars;
            return this;
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
         * Setter for reference.
         * @param  reference  String value for reference.
         * @return Builder
         */
        public Builder reference(String reference) {
            this.reference = reference;
            return this;
        }

        /**
         * Builds a new {@link CreditorReference} object using the set fields.
         * @return {@link CreditorReference}
         */
        public CreditorReference build() {
            return new CreditorReference(particulars, code, reference);
        }
    }
}
