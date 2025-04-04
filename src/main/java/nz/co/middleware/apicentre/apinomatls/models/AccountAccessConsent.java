/*
 * AccountAndTransactionAPISpecificationLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package nz.co.middleware.apicentre.apinomatls.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for AccountAccessConsent type.
 */
public class AccountAccessConsent {
    private AccountAccessConsentModel data;
    private Risk risk;

    /**
     * Default constructor.
     */
    public AccountAccessConsent() {
    }

    /**
     * Initialization constructor.
     * @param  data  AccountAccessConsentModel value for data.
     * @param  risk  Risk value for risk.
     */
    public AccountAccessConsent(
            AccountAccessConsentModel data,
            Risk risk) {
        this.data = data;
        this.risk = risk;
    }

    /**
     * Getter for Data.
     * @return Returns the AccountAccessConsentModel
     */
    @JsonGetter("Data")
    public AccountAccessConsentModel getData() {
        return data;
    }

    /**
     * Setter for Data.
     * @param data Value for AccountAccessConsentModel
     */
    @JsonSetter("Data")
    public void setData(AccountAccessConsentModel data) {
        this.data = data;
    }

    /**
     * Getter for Risk.
     * The Risk section is sent by the initiating party to the API Provider. It is used to specify
     * additional details for risk scoring.
     * @return Returns the Risk
     */
    @JsonGetter("Risk")
    public Risk getRisk() {
        return risk;
    }

    /**
     * Setter for Risk.
     * The Risk section is sent by the initiating party to the API Provider. It is used to specify
     * additional details for risk scoring.
     * @param risk Value for Risk
     */
    @JsonSetter("Risk")
    public void setRisk(Risk risk) {
        this.risk = risk;
    }

    /**
     * Converts this AccountAccessConsent into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AccountAccessConsent [" + "data=" + data + ", risk=" + risk + "]";
    }

    /**
     * Builds a new {@link AccountAccessConsent.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link AccountAccessConsent.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(data, risk);
        return builder;
    }

    /**
     * Class to build instances of {@link AccountAccessConsent}.
     */
    public static class Builder {
        private AccountAccessConsentModel data;
        private Risk risk;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  data  AccountAccessConsentModel value for data.
         * @param  risk  Risk value for risk.
         */
        public Builder(AccountAccessConsentModel data, Risk risk) {
            this.data = data;
            this.risk = risk;
        }

        /**
         * Setter for data.
         * @param  data  AccountAccessConsentModel value for data.
         * @return Builder
         */
        public Builder data(AccountAccessConsentModel data) {
            this.data = data;
            return this;
        }

        /**
         * Setter for risk.
         * @param  risk  Risk value for risk.
         * @return Builder
         */
        public Builder risk(Risk risk) {
            this.risk = risk;
            return this;
        }

        /**
         * Builds a new {@link AccountAccessConsent} object using the set fields.
         * @return {@link AccountAccessConsent}
         */
        public AccountAccessConsent build() {
            return new AccountAccessConsent(data, risk);
        }
    }
}
