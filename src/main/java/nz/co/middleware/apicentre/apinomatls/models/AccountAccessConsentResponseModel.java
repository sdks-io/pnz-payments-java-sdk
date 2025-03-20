/*
 * AccountAndTransactionAPISpecificationLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package nz.co.middleware.apicentre.apinomatls.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.LocalDateTime;
import nz.co.middleware.apicentre.apinomatls.DateTimeHelper;

/**
 * This is a model class for AccountAccessConsentResponseModel type.
 */
public class AccountAccessConsentResponseModel {
    private String consentId;
    private AccountAccessStatusEnum status;
    private LocalDateTime creationDateTime;
    private LocalDateTime statusUpdateDateTime;
    private Consent consent;

    /**
     * Default constructor.
     */
    public AccountAccessConsentResponseModel() {
    }

    /**
     * Initialization constructor.
     * @param  consentId  String value for consentId.
     * @param  status  AccountAccessStatusEnum value for status.
     * @param  creationDateTime  LocalDateTime value for creationDateTime.
     * @param  statusUpdateDateTime  LocalDateTime value for statusUpdateDateTime.
     * @param  consent  Consent value for consent.
     */
    public AccountAccessConsentResponseModel(
            String consentId,
            AccountAccessStatusEnum status,
            LocalDateTime creationDateTime,
            LocalDateTime statusUpdateDateTime,
            Consent consent) {
        this.consentId = consentId;
        this.status = status;
        this.creationDateTime = creationDateTime;
        this.statusUpdateDateTime = statusUpdateDateTime;
        this.consent = consent;
    }

    /**
     * Getter for ConsentId.
     * Unique identification as assigned to identify the account access consent.
     * @return Returns the String
     */
    @JsonGetter("ConsentId")
    public String getConsentId() {
        return consentId;
    }

    /**
     * Setter for ConsentId.
     * Unique identification as assigned to identify the account access consent.
     * @param consentId Value for String
     */
    @JsonSetter("ConsentId")
    public void setConsentId(String consentId) {
        this.consentId = consentId;
    }

    /**
     * Getter for Status.
     * Specifies the status of the account access consent.
     * @return Returns the AccountAccessStatusEnum
     */
    @JsonGetter("Status")
    public AccountAccessStatusEnum getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * Specifies the status of the account access consent.
     * @param status Value for AccountAccessStatusEnum
     */
    @JsonSetter("Status")
    public void setStatus(AccountAccessStatusEnum status) {
        this.status = status;
    }

    /**
     * Getter for CreationDateTime.
     * Date and time at which the consent was created. All dates in the JSON payloads are
     * represented in ISO 8601 date-time format. All date-time fields in responses must include the
     * timezone. An example is below: 2017-04-05T10:43:07+00:00
     * @return Returns the LocalDateTime
     */
    @JsonGetter("CreationDateTime")
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getCreationDateTime() {
        return creationDateTime;
    }

    /**
     * Setter for CreationDateTime.
     * Date and time at which the consent was created. All dates in the JSON payloads are
     * represented in ISO 8601 date-time format. All date-time fields in responses must include the
     * timezone. An example is below: 2017-04-05T10:43:07+00:00
     * @param creationDateTime Value for LocalDateTime
     */
    @JsonSetter("CreationDateTime")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setCreationDateTime(LocalDateTime creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    /**
     * Getter for StatusUpdateDateTime.
     * Date and time at which the consent status was updated. All dates in the JSON payloads are
     * represented in ISO 8601 date-time format. All date-time fields in responses must include the
     * timezone. An example is below: 2017-04-05T10:43:07+00:00
     * @return Returns the LocalDateTime
     */
    @JsonGetter("StatusUpdateDateTime")
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getStatusUpdateDateTime() {
        return statusUpdateDateTime;
    }

    /**
     * Setter for StatusUpdateDateTime.
     * Date and time at which the consent status was updated. All dates in the JSON payloads are
     * represented in ISO 8601 date-time format. All date-time fields in responses must include the
     * timezone. An example is below: 2017-04-05T10:43:07+00:00
     * @param statusUpdateDateTime Value for LocalDateTime
     */
    @JsonSetter("StatusUpdateDateTime")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setStatusUpdateDateTime(LocalDateTime statusUpdateDateTime) {
        this.statusUpdateDateTime = statusUpdateDateTime;
    }

    /**
     * Getter for Consent.
     * Contains the requested consent
     * @return Returns the Consent
     */
    @JsonGetter("Consent")
    public Consent getConsent() {
        return consent;
    }

    /**
     * Setter for Consent.
     * Contains the requested consent
     * @param consent Value for Consent
     */
    @JsonSetter("Consent")
    public void setConsent(Consent consent) {
        this.consent = consent;
    }

    /**
     * Converts this AccountAccessConsentResponseModel into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AccountAccessConsentResponseModel [" + "consentId=" + consentId + ", status="
                + status + ", creationDateTime=" + creationDateTime + ", statusUpdateDateTime="
                + statusUpdateDateTime + ", consent=" + consent + "]";
    }

    /**
     * Builds a new {@link AccountAccessConsentResponseModel.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link AccountAccessConsentResponseModel.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(consentId, status, creationDateTime, statusUpdateDateTime,
                consent);
        return builder;
    }

    /**
     * Class to build instances of {@link AccountAccessConsentResponseModel}.
     */
    public static class Builder {
        private String consentId;
        private AccountAccessStatusEnum status;
        private LocalDateTime creationDateTime;
        private LocalDateTime statusUpdateDateTime;
        private Consent consent;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  consentId  String value for consentId.
         * @param  status  AccountAccessStatusEnum value for status.
         * @param  creationDateTime  LocalDateTime value for creationDateTime.
         * @param  statusUpdateDateTime  LocalDateTime value for statusUpdateDateTime.
         * @param  consent  Consent value for consent.
         */
        public Builder(String consentId, AccountAccessStatusEnum status,
                LocalDateTime creationDateTime, LocalDateTime statusUpdateDateTime,
                Consent consent) {
            this.consentId = consentId;
            this.status = status;
            this.creationDateTime = creationDateTime;
            this.statusUpdateDateTime = statusUpdateDateTime;
            this.consent = consent;
        }

        /**
         * Setter for consentId.
         * @param  consentId  String value for consentId.
         * @return Builder
         */
        public Builder consentId(String consentId) {
            this.consentId = consentId;
            return this;
        }

        /**
         * Setter for status.
         * @param  status  AccountAccessStatusEnum value for status.
         * @return Builder
         */
        public Builder status(AccountAccessStatusEnum status) {
            this.status = status;
            return this;
        }

        /**
         * Setter for creationDateTime.
         * @param  creationDateTime  LocalDateTime value for creationDateTime.
         * @return Builder
         */
        public Builder creationDateTime(LocalDateTime creationDateTime) {
            this.creationDateTime = creationDateTime;
            return this;
        }

        /**
         * Setter for statusUpdateDateTime.
         * @param  statusUpdateDateTime  LocalDateTime value for statusUpdateDateTime.
         * @return Builder
         */
        public Builder statusUpdateDateTime(LocalDateTime statusUpdateDateTime) {
            this.statusUpdateDateTime = statusUpdateDateTime;
            return this;
        }

        /**
         * Setter for consent.
         * @param  consent  Consent value for consent.
         * @return Builder
         */
        public Builder consent(Consent consent) {
            this.consent = consent;
            return this;
        }

        /**
         * Builds a new {@link AccountAccessConsentResponseModel} object using the set fields.
         * @return {@link AccountAccessConsentResponseModel}
         */
        public AccountAccessConsentResponseModel build() {
            return new AccountAccessConsentResponseModel(consentId, status, creationDateTime,
                    statusUpdateDateTime, consent);
        }
    }
}
