/*
 * AccountAndTransactionAPISpecificationLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package nz.co.middleware.apicentre.apinomatls.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for InstructedAmount type.
 */
public class InstructedAmount {
    private String amount;
    private String currency;

    /**
     * Default constructor.
     */
    public InstructedAmount() {
    }

    /**
     * Initialization constructor.
     * @param  amount  String value for amount.
     * @param  currency  String value for currency.
     */
    public InstructedAmount(
            String amount,
            String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    /**
     * Getter for Amount.
     * A number of monetary units specified in an active currency where the unit of currency is
     * explicit and compliant with ISO 4217.
     * @return Returns the String
     */
    @JsonGetter("Amount")
    public String getAmount() {
        return amount;
    }

    /**
     * Setter for Amount.
     * A number of monetary units specified in an active currency where the unit of currency is
     * explicit and compliant with ISO 4217.
     * @param amount Value for String
     */
    @JsonSetter("Amount")
    public void setAmount(String amount) {
        this.amount = amount;
    }

    /**
     * Getter for Currency.
     * A code allocated to a currency by a Maintenance Agency under an international identification
     * scheme, as described in the latest edition of the international standard ISO 4217 "Codes for
     * the representation of currencies and funds".
     * @return Returns the String
     */
    @JsonGetter("Currency")
    public String getCurrency() {
        return currency;
    }

    /**
     * Setter for Currency.
     * A code allocated to a currency by a Maintenance Agency under an international identification
     * scheme, as described in the latest edition of the international standard ISO 4217 "Codes for
     * the representation of currencies and funds".
     * @param currency Value for String
     */
    @JsonSetter("Currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * Converts this InstructedAmount into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "InstructedAmount [" + "amount=" + amount + ", currency=" + currency + "]";
    }

    /**
     * Builds a new {@link InstructedAmount.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link InstructedAmount.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(amount, currency);
        return builder;
    }

    /**
     * Class to build instances of {@link InstructedAmount}.
     */
    public static class Builder {
        private String amount;
        private String currency;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  amount  String value for amount.
         * @param  currency  String value for currency.
         */
        public Builder(String amount, String currency) {
            this.amount = amount;
            this.currency = currency;
        }

        /**
         * Setter for amount.
         * @param  amount  String value for amount.
         * @return Builder
         */
        public Builder amount(String amount) {
            this.amount = amount;
            return this;
        }

        /**
         * Setter for currency.
         * @param  currency  String value for currency.
         * @return Builder
         */
        public Builder currency(String currency) {
            this.currency = currency;
            return this;
        }

        /**
         * Builds a new {@link InstructedAmount} object using the set fields.
         * @return {@link InstructedAmount}
         */
        public InstructedAmount build() {
            return new InstructedAmount(amount, currency);
        }
    }
}
