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
 * This is a model class for DirectDebitResponseData type.
 */
public class DirectDebitResponseData {
    private List<DirectDebitModel> directDebit;

    /**
     * Default constructor.
     */
    public DirectDebitResponseData() {
    }

    /**
     * Initialization constructor.
     * @param  directDebit  List of DirectDebitModel value for directDebit.
     */
    public DirectDebitResponseData(
            List<DirectDebitModel> directDebit) {
        this.directDebit = directDebit;
    }

    /**
     * Getter for DirectDebit.
     * DirectDebit
     * @return Returns the List of DirectDebitModel
     */
    @JsonGetter("DirectDebit")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<DirectDebitModel> getDirectDebit() {
        return directDebit;
    }

    /**
     * Setter for DirectDebit.
     * DirectDebit
     * @param directDebit Value for List of DirectDebitModel
     */
    @JsonSetter("DirectDebit")
    public void setDirectDebit(List<DirectDebitModel> directDebit) {
        this.directDebit = directDebit;
    }

    /**
     * Converts this DirectDebitResponseData into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "DirectDebitResponseData [" + "directDebit=" + directDebit + "]";
    }

    /**
     * Builds a new {@link DirectDebitResponseData.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link DirectDebitResponseData.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .directDebit(getDirectDebit());
        return builder;
    }

    /**
     * Class to build instances of {@link DirectDebitResponseData}.
     */
    public static class Builder {
        private List<DirectDebitModel> directDebit;



        /**
         * Setter for directDebit.
         * @param  directDebit  List of DirectDebitModel value for directDebit.
         * @return Builder
         */
        public Builder directDebit(List<DirectDebitModel> directDebit) {
            this.directDebit = directDebit;
            return this;
        }

        /**
         * Builds a new {@link DirectDebitResponseData} object using the set fields.
         * @return {@link DirectDebitResponseData}
         */
        public DirectDebitResponseData build() {
            return new DirectDebitResponseData(directDebit);
        }
    }
}
