/*
 * AccountAndTransactionAPISpecificationLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package nz.co.middleware.apicentre.apinomatls.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.LocalDateTime;
import nz.co.middleware.apicentre.apinomatls.DateTimeHelper;

/**
 * This is a model class for MetaData type.
 */
public class MetaData {
    private Integer totalPages;
    private LocalDateTime firstAvailableDateTime;
    private LocalDateTime lastAvailableDateTime;

    /**
     * Default constructor.
     */
    public MetaData() {
    }

    /**
     * Initialization constructor.
     * @param  totalPages  Integer value for totalPages.
     * @param  firstAvailableDateTime  LocalDateTime value for firstAvailableDateTime.
     * @param  lastAvailableDateTime  LocalDateTime value for lastAvailableDateTime.
     */
    public MetaData(
            Integer totalPages,
            LocalDateTime firstAvailableDateTime,
            LocalDateTime lastAvailableDateTime) {
        this.totalPages = totalPages;
        this.firstAvailableDateTime = firstAvailableDateTime;
        this.lastAvailableDateTime = lastAvailableDateTime;
    }

    /**
     * Getter for TotalPages.
     * @return Returns the Integer
     */
    @JsonGetter("TotalPages")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getTotalPages() {
        return totalPages;
    }

    /**
     * Setter for TotalPages.
     * @param totalPages Value for Integer
     */
    @JsonSetter("TotalPages")
    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    /**
     * Getter for FirstAvailableDateTime.
     * All dates in the JSON payloads are represented in ISO 8601 date-time format. All date-time
     * fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     * @return Returns the LocalDateTime
     */
    @JsonGetter("FirstAvailableDateTime")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getFirstAvailableDateTime() {
        return firstAvailableDateTime;
    }

    /**
     * Setter for FirstAvailableDateTime.
     * All dates in the JSON payloads are represented in ISO 8601 date-time format. All date-time
     * fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     * @param firstAvailableDateTime Value for LocalDateTime
     */
    @JsonSetter("FirstAvailableDateTime")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setFirstAvailableDateTime(LocalDateTime firstAvailableDateTime) {
        this.firstAvailableDateTime = firstAvailableDateTime;
    }

    /**
     * Getter for LastAvailableDateTime.
     * All dates in the JSON payloads are represented in ISO 8601 date-time format. All date-time
     * fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     * @return Returns the LocalDateTime
     */
    @JsonGetter("LastAvailableDateTime")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getLastAvailableDateTime() {
        return lastAvailableDateTime;
    }

    /**
     * Setter for LastAvailableDateTime.
     * All dates in the JSON payloads are represented in ISO 8601 date-time format. All date-time
     * fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     * @param lastAvailableDateTime Value for LocalDateTime
     */
    @JsonSetter("LastAvailableDateTime")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setLastAvailableDateTime(LocalDateTime lastAvailableDateTime) {
        this.lastAvailableDateTime = lastAvailableDateTime;
    }

    /**
     * Converts this MetaData into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "MetaData [" + "totalPages=" + totalPages + ", firstAvailableDateTime="
                + firstAvailableDateTime + ", lastAvailableDateTime=" + lastAvailableDateTime + "]";
    }

    /**
     * Builds a new {@link MetaData.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link MetaData.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .totalPages(getTotalPages())
                .firstAvailableDateTime(getFirstAvailableDateTime())
                .lastAvailableDateTime(getLastAvailableDateTime());
        return builder;
    }

    /**
     * Class to build instances of {@link MetaData}.
     */
    public static class Builder {
        private Integer totalPages;
        private LocalDateTime firstAvailableDateTime;
        private LocalDateTime lastAvailableDateTime;



        /**
         * Setter for totalPages.
         * @param  totalPages  Integer value for totalPages.
         * @return Builder
         */
        public Builder totalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }

        /**
         * Setter for firstAvailableDateTime.
         * @param  firstAvailableDateTime  LocalDateTime value for firstAvailableDateTime.
         * @return Builder
         */
        public Builder firstAvailableDateTime(LocalDateTime firstAvailableDateTime) {
            this.firstAvailableDateTime = firstAvailableDateTime;
            return this;
        }

        /**
         * Setter for lastAvailableDateTime.
         * @param  lastAvailableDateTime  LocalDateTime value for lastAvailableDateTime.
         * @return Builder
         */
        public Builder lastAvailableDateTime(LocalDateTime lastAvailableDateTime) {
            this.lastAvailableDateTime = lastAvailableDateTime;
            return this;
        }

        /**
         * Builds a new {@link MetaData} object using the set fields.
         * @return {@link MetaData}
         */
        public MetaData build() {
            return new MetaData(totalPages, firstAvailableDateTime, lastAvailableDateTime);
        }
    }
}
