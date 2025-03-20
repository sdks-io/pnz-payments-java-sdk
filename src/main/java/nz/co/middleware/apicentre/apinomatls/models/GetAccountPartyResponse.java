/*
 * AccountAndTransactionAPISpecificationLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package nz.co.middleware.apicentre.apinomatls.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for GetAccountPartyResponse type.
 */
public class GetAccountPartyResponse {
    private GetAccountPartyResponseData data;
    private Links links;
    private Meta meta;

    /**
     * Default constructor.
     */
    public GetAccountPartyResponse() {
    }

    /**
     * Initialization constructor.
     * @param  data  GetAccountPartyResponseData value for data.
     * @param  links  Links value for links.
     * @param  meta  Meta value for meta.
     */
    public GetAccountPartyResponse(
            GetAccountPartyResponseData data,
            Links links,
            Meta meta) {
        this.data = data;
        this.links = links;
        this.meta = meta;
    }

    /**
     * Getter for Data.
     * @return Returns the GetAccountPartyResponseData
     */
    @JsonGetter("Data")
    public GetAccountPartyResponseData getData() {
        return data;
    }

    /**
     * Setter for Data.
     * @param data Value for GetAccountPartyResponseData
     */
    @JsonSetter("Data")
    public void setData(GetAccountPartyResponseData data) {
        this.data = data;
    }

    /**
     * Getter for Links.
     * Links relevant to the payload
     * @return Returns the Links
     */
    @JsonGetter("Links")
    public Links getLinks() {
        return links;
    }

    /**
     * Setter for Links.
     * Links relevant to the payload
     * @param links Value for Links
     */
    @JsonSetter("Links")
    public void setLinks(Links links) {
        this.links = links;
    }

    /**
     * Getter for Meta.
     * @return Returns the Meta
     */
    @JsonGetter("Meta")
    public Meta getMeta() {
        return meta;
    }

    /**
     * Setter for Meta.
     * @param meta Value for Meta
     */
    @JsonSetter("Meta")
    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    /**
     * Converts this GetAccountPartyResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GetAccountPartyResponse [" + "data=" + data + ", links=" + links + ", meta=" + meta
                + "]";
    }

    /**
     * Builds a new {@link GetAccountPartyResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GetAccountPartyResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(data, links, meta);
        return builder;
    }

    /**
     * Class to build instances of {@link GetAccountPartyResponse}.
     */
    public static class Builder {
        private GetAccountPartyResponseData data;
        private Links links;
        private Meta meta;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  data  GetAccountPartyResponseData value for data.
         * @param  links  Links value for links.
         * @param  meta  Meta value for meta.
         */
        public Builder(GetAccountPartyResponseData data, Links links, Meta meta) {
            this.data = data;
            this.links = links;
            this.meta = meta;
        }

        /**
         * Setter for data.
         * @param  data  GetAccountPartyResponseData value for data.
         * @return Builder
         */
        public Builder data(GetAccountPartyResponseData data) {
            this.data = data;
            return this;
        }

        /**
         * Setter for links.
         * @param  links  Links value for links.
         * @return Builder
         */
        public Builder links(Links links) {
            this.links = links;
            return this;
        }

        /**
         * Setter for meta.
         * @param  meta  Meta value for meta.
         * @return Builder
         */
        public Builder meta(Meta meta) {
            this.meta = meta;
            return this;
        }

        /**
         * Builds a new {@link GetAccountPartyResponse} object using the set fields.
         * @return {@link GetAccountPartyResponse}
         */
        public GetAccountPartyResponse build() {
            return new GetAccountPartyResponse(data, links, meta);
        }
    }
}
