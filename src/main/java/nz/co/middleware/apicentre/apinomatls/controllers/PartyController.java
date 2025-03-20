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
import nz.co.middleware.apicentre.apinomatls.exceptions.AccountsParty400ErrorException;
import nz.co.middleware.apicentre.apinomatls.exceptions.AccountsParty403ErrorException;
import nz.co.middleware.apicentre.apinomatls.exceptions.AccountsParty500ErrorException;
import nz.co.middleware.apicentre.apinomatls.exceptions.AccountsParty503ErrorException;
import nz.co.middleware.apicentre.apinomatls.exceptions.ApiException;
import nz.co.middleware.apicentre.apinomatls.exceptions.Party400ErrorException;
import nz.co.middleware.apicentre.apinomatls.exceptions.Party403ErrorException;
import nz.co.middleware.apicentre.apinomatls.exceptions.Party500ErrorException;
import nz.co.middleware.apicentre.apinomatls.exceptions.Party503ErrorException;
import nz.co.middleware.apicentre.apinomatls.http.request.HttpMethod;
import nz.co.middleware.apicentre.apinomatls.models.GetAccountPartyResponse;
import nz.co.middleware.apicentre.apinomatls.models.GetPartyResponse;

/**
 * This class lists all the endpoints of the groups.
 */
public final class PartyController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public PartyController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Get Party related to an account.
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
     * @return    Returns the GetAccountPartyResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public GetAccountPartyResponse getAccountParty(
            final String accountId,
            final String xFapiAuthDate,
            final String xFapiCustomerIpAddress,
            final String xFapiInteractionId,
            final String xMerchantIpAddress,
            final String xCustomerUserAgent) throws ApiException, IOException {
        return prepareGetAccountPartyRequest(accountId, xFapiAuthDate, xFapiCustomerIpAddress,
                xFapiInteractionId, xMerchantIpAddress, xCustomerUserAgent).execute();
    }

    /**
     * Get Party related to an account.
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
     * @return    Returns the GetAccountPartyResponse response from the API call
     */
    public CompletableFuture<GetAccountPartyResponse> getAccountPartyAsync(
            final String accountId,
            final String xFapiAuthDate,
            final String xFapiCustomerIpAddress,
            final String xFapiInteractionId,
            final String xMerchantIpAddress,
            final String xCustomerUserAgent) {
        try { 
            return prepareGetAccountPartyRequest(accountId, xFapiAuthDate, xFapiCustomerIpAddress,
            xFapiInteractionId, xMerchantIpAddress, xCustomerUserAgent).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for getAccountParty.
     */
    private ApiCall<GetAccountPartyResponse, ApiException> prepareGetAccountPartyRequest(
            final String accountId,
            final String xFapiAuthDate,
            final String xFapiCustomerIpAddress,
            final String xFapiInteractionId,
            final String xMerchantIpAddress,
            final String xCustomerUserAgent) throws IOException {
        return new ApiCall.Builder<GetAccountPartyResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/accounts/{AccountId}/party")
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
                                response -> ApiHelper.deserialize(response, GetAccountPartyResponse.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("Bad Request",
                                (reason, context) -> new AccountsParty400ErrorException(reason, context)))
                        .localErrorCase("401",
                                 ErrorCase.setReason("Unauthorized",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("403",
                                 ErrorCase.setReason("Forbidden",
                                (reason, context) -> new AccountsParty403ErrorException(reason, context)))
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
                                (reason, context) -> new AccountsParty500ErrorException(reason, context)))
                        .localErrorCase("501",
                                 ErrorCase.setReason("Not Implemented",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("503",
                                 ErrorCase.setReason("Service Unavailable",
                                (reason, context) -> new AccountsParty503ErrorException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Get Party of logged in Customer.
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
     * @return    Returns the GetPartyResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public GetPartyResponse getParty(
            final String xFapiAuthDate,
            final String xFapiCustomerIpAddress,
            final String xFapiInteractionId,
            final String xMerchantIpAddress,
            final String xCustomerUserAgent) throws ApiException, IOException {
        return prepareGetPartyRequest(xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId,
                xMerchantIpAddress, xCustomerUserAgent).execute();
    }

    /**
     * Get Party of logged in Customer.
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
     * @return    Returns the GetPartyResponse response from the API call
     */
    public CompletableFuture<GetPartyResponse> getPartyAsync(
            final String xFapiAuthDate,
            final String xFapiCustomerIpAddress,
            final String xFapiInteractionId,
            final String xMerchantIpAddress,
            final String xCustomerUserAgent) {
        try { 
            return prepareGetPartyRequest(xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId,
            xMerchantIpAddress, xCustomerUserAgent).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for getParty.
     */
    private ApiCall<GetPartyResponse, ApiException> prepareGetPartyRequest(
            final String xFapiAuthDate,
            final String xFapiCustomerIpAddress,
            final String xFapiInteractionId,
            final String xMerchantIpAddress,
            final String xCustomerUserAgent) throws IOException {
        return new ApiCall.Builder<GetPartyResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/party")
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
                                response -> ApiHelper.deserialize(response, GetPartyResponse.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("Bad Request",
                                (reason, context) -> new Party400ErrorException(reason, context)))
                        .localErrorCase("401",
                                 ErrorCase.setReason("Unauthorized",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("403",
                                 ErrorCase.setReason("Forbidden",
                                (reason, context) -> new Party403ErrorException(reason, context)))
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
                                (reason, context) -> new Party500ErrorException(reason, context)))
                        .localErrorCase("501",
                                 ErrorCase.setReason("Not Implemented",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("503",
                                 ErrorCase.setReason("Service Unavailable",
                                (reason, context) -> new Party503ErrorException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}