/*
 * AccountAndTransactionAPISpecificationLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package nz.co.middleware.apicentre.apinomatls.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for StatementBenefit type.
 */
public class StatementBenefit {
    private Amount amount;
    private StatementBenefitTypeEnum type;

    /**
     * Default constructor.
     */
    public StatementBenefit() {
    }

    /**
     * Initialization constructor.
     * @param  amount  Amount value for amount.
     * @param  type  StatementBenefitTypeEnum value for type.
     */
    public StatementBenefit(
            Amount amount,
            StatementBenefitTypeEnum type) {
        this.amount = amount;
        this.type = type;
    }

    /**
     * Getter for Amount.
     * Amount of money of the cash balance.
     * @return Returns the Amount
     */
    @JsonGetter("Amount")
    public Amount getAmount() {
        return amount;
    }

    /**
     * Setter for Amount.
     * Amount of money of the cash balance.
     * @param amount Value for Amount
     */
    @JsonSetter("Amount")
    public void setAmount(Amount amount) {
        this.amount = amount;
    }

    /**
     * Getter for Type.
     * Benefit type, in a coded form.
     * @return Returns the StatementBenefitTypeEnum
     */
    @JsonGetter("Type")
    public StatementBenefitTypeEnum getType() {
        return type;
    }

    /**
     * Setter for Type.
     * Benefit type, in a coded form.
     * @param type Value for StatementBenefitTypeEnum
     */
    @JsonSetter("Type")
    public void setType(StatementBenefitTypeEnum type) {
        this.type = type;
    }

    /**
     * Converts this StatementBenefit into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "StatementBenefit [" + "amount=" + amount + ", type=" + type + "]";
    }

    /**
     * Builds a new {@link StatementBenefit.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link StatementBenefit.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(amount, type);
        return builder;
    }

    /**
     * Class to build instances of {@link StatementBenefit}.
     */
    public static class Builder {
        private Amount amount;
        private StatementBenefitTypeEnum type;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  amount  Amount value for amount.
         * @param  type  StatementBenefitTypeEnum value for type.
         */
        public Builder(Amount amount, StatementBenefitTypeEnum type) {
            this.amount = amount;
            this.type = type;
        }

        /**
         * Setter for amount.
         * @param  amount  Amount value for amount.
         * @return Builder
         */
        public Builder amount(Amount amount) {
            this.amount = amount;
            return this;
        }

        /**
         * Setter for type.
         * @param  type  StatementBenefitTypeEnum value for type.
         * @return Builder
         */
        public Builder type(StatementBenefitTypeEnum type) {
            this.type = type;
            return this;
        }

        /**
         * Builds a new {@link StatementBenefit} object using the set fields.
         * @return {@link StatementBenefit}
         */
        public StatementBenefit build() {
            return new StatementBenefit(amount, type);
        }
    }
}
