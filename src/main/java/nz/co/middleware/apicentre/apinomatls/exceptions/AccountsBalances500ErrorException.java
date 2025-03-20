/*
 * AccountAndTransactionAPISpecificationLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package nz.co.middleware.apicentre.apinomatls.exceptions;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.coreinterfaces.http.Context;
import java.util.List;
import nz.co.middleware.apicentre.apinomatls.models.Error;

/**
 * This is a model class for AccountsBalances500ErrorException type.
 */
public class AccountsBalances500ErrorException extends ApiException {
    private static final long serialVersionUID = -6237023860581718069L;
    private String code;
    private String id;
    private String message;
    private List<Error> errors;

    /**
     * Initialization constructor.
     * @param   reason  The reason for throwing exception
     * @param   context The context of the API exception
     */
    public AccountsBalances500ErrorException(String reason, Context context) {
        super(reason, context);
    }


    /**
     * Getter for Code.
     * High level textual error code to help categorise the errors.
     * @return Returns the String
     */
    @JsonGetter("Code")
    public String getCode() {
        return this.code;
    }

    /**
     * Setter for Code.
     * High level textual error code to help categorise the errors.
     * @param code Value for String
     */
    @JsonSetter("Code")
    private void setCode(String code) {
        this.code = code;
    }

    /**
     * Getter for Id.
     * A unique reference for the error instance, for audit purposes, in case of
     * unknown/unclassified errors.
     * @return Returns the String
     */
    @JsonGetter("Id")
    public String getId() {
        return this.id;
    }

    /**
     * Setter for Id.
     * A unique reference for the error instance, for audit purposes, in case of
     * unknown/unclassified errors.
     * @param id Value for String
     */
    @JsonSetter("Id")
    private void setId(String id) {
        this.id = id;
    }

    /**
     * Getter for Message.
     * Brief Error message. E.g., 'There is something wrong with the request parameters provided'
     * @return Returns the String
     */
    @JsonGetter("Message")
    public String getMessageField() {
        return this.message;
    }

    /**
     * Setter for Message.
     * Brief Error message. E.g., 'There is something wrong with the request parameters provided'
     * @param messageField Value for String
     */
    @JsonSetter("Message")
    private void setMessageField(String messageField) {
        this.message = messageField;
    }

    /**
     * Getter for Errors.
     * @return Returns the List of Error
     */
    @JsonGetter("Errors")
    public List<Error> getErrors() {
        return this.errors;
    }

    /**
     * Setter for Errors.
     * @param errors Value for List of Error
     */
    @JsonSetter("Errors")
    private void setErrors(List<Error> errors) {
        this.errors = errors;
    }

    /**
     * Converts this AccountsBalances500ErrorException into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AccountsBalances500ErrorException [" + "statusCode=" + getResponseCode()
                + ", message=" + getMessage() + ", code=" + code + ", id=" + id + ", message="
                + message + ", errors=" + errors + "]";
    }
}
