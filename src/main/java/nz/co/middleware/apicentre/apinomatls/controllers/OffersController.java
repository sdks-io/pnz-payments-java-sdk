/*
 * AccountAndTransactionAPISpecificationLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package nz.co.middleware.apicentre.apinomatls.controllers;

import io.apimatic.core.ApiCall;
import io.apimatic.core.ErrorCase;
import io.apimatic.core.GlobalConfiguration;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import nz.co.middleware.apicentre.apinomatls.ApiHelper;
import nz.co.middleware.apicentre.apinomatls.Server;
import nz.co.middleware.apicentre.apinomatls.exceptions.AccountsOffers400ErrorException;
import nz.co.middleware.apicentre.apinomatls.exceptions.AccountsOffers403ErrorException;
import nz.co.middleware.apicentre.apinomatls.exceptions.AccountsOffers500ErrorException;
import nz.co.middleware.apicentre.apinomatls.exceptions.AccountsOffers503ErrorException;
import nz.co.middleware.apicentre.apinomatls.exceptions.ApiException;
import nz.co.middleware.apicentre.apinomatls.exceptions.Offers400ErrorException;
import nz.co.middleware.apicentre.apinomatls.exceptions.Offers403ErrorException;
import nz.co.middleware.apicentre.apinomatls.exceptions.Offers500ErrorException;
import nz.co.middleware.apicentre.apinomatls.exceptions.Offers503ErrorException;
import nz.co.middleware.apicentre.apinomatls.http.request.HttpMethod;
import nz.co.middleware.apicentre.apinomatls.models.GetAccountOffersResponse;
import nz.co.middleware.apicentre.apinomatls.models.GetOffersResponse;

/**
 * This class lists all the endpoints of the groups.
 */
public final class OffersController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public OffersController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Get Offers related to an account.
     * @param  accountId  Required parameter: A unique identifier used to identify the account
     *         resource.
     * @param  xFapiAuthDate  Optional parameter: The time when the Customer last logged in with the
     *         Third Party. All dates in the HTTP headers are represented as RFC 7231 Full Dates. An
     *         example is below: Sun, 10 Sep 2017 19:43:31 UTC
     * @param  xFapiCustomerIpAddress  Optional parameter: The Customer's IP address if the Customer
     *         is currently logged in with the Third Party.
     * @param  xFapiInteractionId  Optional parameter: An RFC4122 UID used as a correlation id.
     * @param  xMerchantIpAddress  Optional parameter: The IP address of the merchant when making
     *         account information requests through a Third Party.
     * @param  xCustomerUserAgent  Optional parameter: The User-Agent of the application on the
     *         customer device that is used to make the account information request
     * @return    Returns the GetAccountOffersResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public GetAccountOffersResponse getAccountOffers(
            final String accountId,
            final String xFapiAuthDate,
            final String xFapiCustomerIpAddress,
            final String xFapiInteractionId,
            final String xMerchantIpAddress,
            final String xCustomerUserAgent) throws ApiException, IOException {
        return prepareGetAccountOffersRequest(accountId, xFapiAuthDate, xFapiCustomerIpAddress,
                xFapiInteractionId, xMerchantIpAddress, xCustomerUserAgent).execute();
    }

    /**
     * Get Offers related to an account.
     * @param  accountId  Required parameter: A unique identifier used to identify the account
     *         resource.
     * @param  xFapiAuthDate  Optional parameter: The time when the Customer last logged in with the
     *         Third Party. All dates in the HTTP headers are represented as RFC 7231 Full Dates. An
     *         example is below: Sun, 10 Sep 2017 19:43:31 UTC
     * @param  xFapiCustomerIpAddress  Optional parameter: The Customer's IP address if the Customer
     *         is currently logged in with the Third Party.
     * @param  xFapiInteractionId  Optional parameter: An RFC4122 UID used as a correlation id.
     * @param  xMerchantIpAddress  Optional parameter: The IP address of the merchant when making
     *         account information requests through a Third Party.
     * @param  xCustomerUserAgent  Optional parameter: The User-Agent of the application on the
     *         customer device that is used to make the account information request
     * @return    Returns the GetAccountOffersResponse response from the API call
     */
    public CompletableFuture<GetAccountOffersResponse> getAccountOffersAsync(
            final String accountId,
            final String xFapiAuthDate,
            final String xFapiCustomerIpAddress,
            final String xFapiInteractionId,
            final String xMerchantIpAddress,
            final String xCustomerUserAgent) {
        try { 
            return prepareGetAccountOffersRequest(accountId, xFapiAuthDate, xFapiCustomerIpAddress,
            xFapiInteractionId, xMerchantIpAddress, xCustomerUserAgent).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for getAccountOffers.
     */
    private ApiCall<GetAccountOffersResponse, ApiException> prepareGetAccountOffersRequest(
            final String accountId,
            final String xFapiAuthDate,
            final String xFapiCustomerIpAddress,
            final String xFapiInteractionId,
            final String xMerchantIpAddress,
            final String xCustomerUserAgent) throws IOException {
        return new ApiCall.Builder<GetAccountOffersResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/accounts/{AccountId}/offers")
                        .templateParam(param -> param.key("AccountId").value(accountId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("x-fapi-auth-date")
                                .value(xFapiAuthDate).isRequired(false))
                        .headerParam(param -> param.key("x-fapi-customer-ip-address")
                                .value(xFapiCustomerIpAddress).isRequired(false))
                        .headerParam(param -> param.key("x-fapi-interaction-id")
                                .value(xFapiInteractionId).isRequired(false))
                        .headerParam(param -> param.key("x-merchant-ip-address")
                                .value(xMerchantIpAddress).isRequired(false))
                        .headerParam(param -> param.key("x-customer-user-agent")
                                .value(xCustomerUserAgent).isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("HTTPBearerAuthentication"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, GetAccountOffersResponse.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("Bad Request",
                                (reason, context) -> new AccountsOffers400ErrorException(reason, context)))
                        .localErrorCase("401",
                                 ErrorCase.setReason("Unauthorized",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("403",
                                 ErrorCase.setReason("Forbidden",
                                (reason, context) -> new AccountsOffers403ErrorException(reason, context)))
                        .localErrorCase("405",
                                 ErrorCase.setReason("Method Not Allowed",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("406",
                                 ErrorCase.setReason("Not Acceptable",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("429",
                                 ErrorCase.setReason("Too Many Requests",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("500",
                                 ErrorCase.setReason("Internal Server Error",
                                (reason, context) -> new AccountsOffers500ErrorException(reason, context)))
                        .localErrorCase("501",
                                 ErrorCase.setReason("Not Implemented",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("503",
                                 ErrorCase.setReason("Service Unavailable",
                                (reason, context) -> new AccountsOffers503ErrorException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Get Offers.
     * @param  xFapiAuthDate  Optional parameter: The time when the Customer last logged in with the
     *         Third Party. All dates in the HTTP headers are represented as RFC 7231 Full Dates. An
     *         example is below: Sun, 10 Sep 2017 19:43:31 UTC
     * @param  xFapiCustomerIpAddress  Optional parameter: The Customer's IP address if the Customer
     *         is currently logged in with the Third Party.
     * @param  xFapiInteractionId  Optional parameter: An RFC4122 UID used as a correlation id.
     * @param  xMerchantIpAddress  Optional parameter: The IP address of the merchant when making
     *         account information requests through a Third Party.
     * @param  xCustomerUserAgent  Optional parameter: The User-Agent of the application on the
     *         customer device that is used to make the account information request
     * @return    Returns the GetOffersResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public GetOffersResponse getOffers(
            final String xFapiAuthDate,
            final String xFapiCustomerIpAddress,
            final String xFapiInteractionId,
            final String xMerchantIpAddress,
            final String xCustomerUserAgent) throws ApiException, IOException {
        return prepareGetOffersRequest(xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId,
                xMerchantIpAddress, xCustomerUserAgent).execute();
    }

    /**
     * Get Offers.
     * @param  xFapiAuthDate  Optional parameter: The time when the Customer last logged in with the
     *         Third Party. All dates in the HTTP headers are represented as RFC 7231 Full Dates. An
     *         example is below: Sun, 10 Sep 2017 19:43:31 UTC
     * @param  xFapiCustomerIpAddress  Optional parameter: The Customer's IP address if the Customer
     *         is currently logged in with the Third Party.
     * @param  xFapiInteractionId  Optional parameter: An RFC4122 UID used as a correlation id.
     * @param  xMerchantIpAddress  Optional parameter: The IP address of the merchant when making
     *         account information requests through a Third Party.
     * @param  xCustomerUserAgent  Optional parameter: The User-Agent of the application on the
     *         customer device that is used to make the account information request
     * @return    Returns the GetOffersResponse response from the API call
     */
    public CompletableFuture<GetOffersResponse> getOffersAsync(
            final String xFapiAuthDate,
            final String xFapiCustomerIpAddress,
            final String xFapiInteractionId,
            final String xMerchantIpAddress,
            final String xCustomerUserAgent) {
        try { 
            return prepareGetOffersRequest(xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId,
            xMerchantIpAddress, xCustomerUserAgent).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for getOffers.
     */
    private ApiCall<GetOffersResponse, ApiException> prepareGetOffersRequest(
            final String xFapiAuthDate,
            final String xFapiCustomerIpAddress,
            final String xFapiInteractionId,
            final String xMerchantIpAddress,
            final String xCustomerUserAgent) throws IOException {
        return new ApiCall.Builder<GetOffersResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/offers")
                        .headerParam(param -> param.key("x-fapi-auth-date")
                                .value(xFapiAuthDate).isRequired(false))
                        .headerParam(param -> param.key("x-fapi-customer-ip-address")
                                .value(xFapiCustomerIpAddress).isRequired(false))
                        .headerParam(param -> param.key("x-fapi-interaction-id")
                                .value(xFapiInteractionId).isRequired(false))
                        .headerParam(param -> param.key("x-merchant-ip-address")
                                .value(xMerchantIpAddress).isRequired(false))
                        .headerParam(param -> param.key("x-customer-user-agent")
                                .value(xCustomerUserAgent).isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("HTTPBearerAuthentication"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, GetOffersResponse.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("Bad Request",
                                (reason, context) -> new Offers400ErrorException(reason, context)))
                        .localErrorCase("401",
                                 ErrorCase.setReason("Unauthorized",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("403",
                                 ErrorCase.setReason("Forbidden",
                                (reason, context) -> new Offers403ErrorException(reason, context)))
                        .localErrorCase("405",
                                 ErrorCase.setReason("Method Not Allowed",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("406",
                                 ErrorCase.setReason("Not Acceptable",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("429",
                                 ErrorCase.setReason("Too Many Requests",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("500",
                                 ErrorCase.setReason("Internal Server Error",
                                (reason, context) -> new Offers500ErrorException(reason, context)))
                        .localErrorCase("501",
                                 ErrorCase.setReason("Not Implemented",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("503",
                                 ErrorCase.setReason("Service Unavailable",
                                (reason, context) -> new Offers503ErrorException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}