/*
 * AccountAndTransactionAPISpecificationLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package nz.co.middleware.apicentre.apinomatls.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for GetScheduledPaymentsResponseData type.
 */
public class GetScheduledPaymentsResponseData {
    private List<ScheduledPaymentModel> scheduledPayment;

    /**
     * Default constructor.
     */
    public GetScheduledPaymentsResponseData() {
    }

    /**
     * Initialization constructor.
     * @param  scheduledPayment  List of ScheduledPaymentModel value for scheduledPayment.
     */
    public GetScheduledPaymentsResponseData(
            List<ScheduledPaymentModel> scheduledPayment) {
        this.scheduledPayment = scheduledPayment;
    }

    /**
     * Getter for ScheduledPayment.
     * @return Returns the List of ScheduledPaymentModel
     */
    @JsonGetter("ScheduledPayment")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<ScheduledPaymentModel> getScheduledPayment() {
        return scheduledPayment;
    }

    /**
     * Setter for ScheduledPayment.
     * @param scheduledPayment Value for List of ScheduledPaymentModel
     */
    @JsonSetter("ScheduledPayment")
    public void setScheduledPayment(List<ScheduledPaymentModel> scheduledPayment) {
        this.scheduledPayment = scheduledPayment;
    }

    /**
     * Converts this GetScheduledPaymentsResponseData into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GetScheduledPaymentsResponseData [" + "scheduledPayment=" + scheduledPayment + "]";
    }

    /**
     * Builds a new {@link GetScheduledPaymentsResponseData.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GetScheduledPaymentsResponseData.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .scheduledPayment(getScheduledPayment());
        return builder;
    }

    /**
     * Class to build instances of {@link GetScheduledPaymentsResponseData}.
     */
    public static class Builder {
        private List<ScheduledPaymentModel> scheduledPayment;



        /**
         * Setter for scheduledPayment.
         * @param  scheduledPayment  List of ScheduledPaymentModel value for scheduledPayment.
         * @return Builder
         */
        public Builder scheduledPayment(List<ScheduledPaymentModel> scheduledPayment) {
            this.scheduledPayment = scheduledPayment;
            return this;
        }

        /**
         * Builds a new {@link GetScheduledPaymentsResponseData} object using the set fields.
         * @return {@link GetScheduledPaymentsResponseData}
         */
        public GetScheduledPaymentsResponseData build() {
            return new GetScheduledPaymentsResponseData(scheduledPayment);
        }
    }
}
