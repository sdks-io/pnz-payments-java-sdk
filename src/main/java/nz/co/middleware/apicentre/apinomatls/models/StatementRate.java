/*
 * AccountAndTransactionAPISpecificationLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package nz.co.middleware.apicentre.apinomatls.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for StatementRate type.
 */
public class StatementRate {
    private String rate;
    private StatementRateTypeEnum type;

    /**
     * Default constructor.
     */
    public StatementRate() {
    }

    /**
     * Initialization constructor.
     * @param  rate  String value for rate.
     * @param  type  StatementRateTypeEnum value for type.
     */
    public StatementRate(
            String rate,
            StatementRateTypeEnum type) {
        this.rate = rate;
        this.type = type;
    }

    /**
     * Getter for Rate.
     * Rate associated with the statement rate type.
     * @return Returns the String
     */
    @JsonGetter("Rate")
    public String getRate() {
        return rate;
    }

    /**
     * Setter for Rate.
     * Rate associated with the statement rate type.
     * @param rate Value for String
     */
    @JsonSetter("Rate")
    public void setRate(String rate) {
        this.rate = rate;
    }

    /**
     * Getter for Type.
     * Statement rate type, in a coded form.
     * @return Returns the StatementRateTypeEnum
     */
    @JsonGetter("Type")
    public StatementRateTypeEnum getType() {
        return type;
    }

    /**
     * Setter for Type.
     * Statement rate type, in a coded form.
     * @param type Value for StatementRateTypeEnum
     */
    @JsonSetter("Type")
    public void setType(StatementRateTypeEnum type) {
        this.type = type;
    }

    /**
     * Converts this StatementRate into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "StatementRate [" + "rate=" + rate + ", type=" + type + "]";
    }

    /**
     * Builds a new {@link StatementRate.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link StatementRate.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(rate, type);
        return builder;
    }

    /**
     * Class to build instances of {@link StatementRate}.
     */
    public static class Builder {
        private String rate;
        private StatementRateTypeEnum type;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  rate  String value for rate.
         * @param  type  StatementRateTypeEnum value for type.
         */
        public Builder(String rate, StatementRateTypeEnum type) {
            this.rate = rate;
            this.type = type;
        }

        /**
         * Setter for rate.
         * @param  rate  String value for rate.
         * @return Builder
         */
        public Builder rate(String rate) {
            this.rate = rate;
            return this;
        }

        /**
         * Setter for type.
         * @param  type  StatementRateTypeEnum value for type.
         * @return Builder
         */
        public Builder type(StatementRateTypeEnum type) {
            this.type = type;
            return this;
        }

        /**
         * Builds a new {@link StatementRate} object using the set fields.
         * @return {@link StatementRate}
         */
        public StatementRate build() {
            return new StatementRate(rate, type);
        }
    }
}
