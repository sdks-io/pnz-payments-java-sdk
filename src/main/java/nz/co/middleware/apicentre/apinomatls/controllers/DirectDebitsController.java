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
import nz.co.middleware.apicentre.apinomatls.exceptions.AccountsDirectDebits400ErrorException;
import nz.co.middleware.apicentre.apinomatls.exceptions.AccountsDirectDebits403ErrorException;
import nz.co.middleware.apicentre.apinomatls.exceptions.AccountsDirectDebits500ErrorException;
import nz.co.middleware.apicentre.apinomatls.exceptions.AccountsDirectDebits503ErrorException;
import nz.co.middleware.apicentre.apinomatls.exceptions.ApiException;
import nz.co.middleware.apicentre.apinomatls.exceptions.DirectDebits400ErrorException;
import nz.co.middleware.apicentre.apinomatls.exceptions.DirectDebits403ErrorException;
import nz.co.middleware.apicentre.apinomatls.exceptions.DirectDebits500ErrorException;
import nz.co.middleware.apicentre.apinomatls.exceptions.DirectDebits503ErrorException;
import nz.co.middleware.apicentre.apinomatls.http.request.HttpMethod;
import nz.co.middleware.apicentre.apinomatls.models.DirectDebitResponse;

/**
 * This class lists all the endpoints of the groups.
 */
public final class DirectDebitsController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public DirectDebitsController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Get Direct Debits related to an account.
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
     * @return    Returns the DirectDebitResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public DirectDebitResponse getAccountDirectDebits(
            final String accountId,
            final String xFapiAuthDate,
            final String xFapiCustomerIpAddress,
            final String xFapiInteractionId,
            final String xMerchantIpAddress,
            final String xCustomerUserAgent) throws ApiException, IOException {
        return prepareGetAccountDirectDebitsRequest(accountId, xFapiAuthDate,
                xFapiCustomerIpAddress, xFapiInteractionId, xMerchantIpAddress,
                xCustomerUserAgent).execute();
    }

    /**
     * Get Direct Debits related to an account.
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
     * @return    Returns the DirectDebitResponse response from the API call
     */
    public CompletableFuture<DirectDebitResponse> getAccountDirectDebitsAsync(
            final String accountId,
            final String xFapiAuthDate,
            final String xFapiCustomerIpAddress,
            final String xFapiInteractionId,
            final String xMerchantIpAddress,
            final String xCustomerUserAgent) {
        try { 
            return prepareGetAccountDirectDebitsRequest(accountId, xFapiAuthDate, xFapiCustomerIpAddress,
            xFapiInteractionId, xMerchantIpAddress, xCustomerUserAgent).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for getAccountDirectDebits.
     */
    private ApiCall<DirectDebitResponse, ApiException> prepareGetAccountDirectDebitsRequest(
            final String accountId,
            final String xFapiAuthDate,
            final String xFapiCustomerIpAddress,
            final String xFapiInteractionId,
            final String xMerchantIpAddress,
            final String xCustomerUserAgent) throws IOException {
        return new ApiCall.Builder<DirectDebitResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/accounts/{AccountId}/direct-debits")
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
                                response -> ApiHelper.deserialize(response, DirectDebitResponse.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("Bad Request",
                                (reason, context) -> new AccountsDirectDebits400ErrorException(reason, context)))
                        .localErrorCase("401",
                                 ErrorCase.setReason("Unauthorized",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("403",
                                 ErrorCase.setReason("Forbidden",
                                (reason, context) -> new AccountsDirectDebits403ErrorException(reason, context)))
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
                                (reason, context) -> new AccountsDirectDebits500ErrorException(reason, context)))
                        .localErrorCase("501",
                                 ErrorCase.setReason("Not Implemented",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("503",
                                 ErrorCase.setReason("Service Unavailable",
                                (reason, context) -> new AccountsDirectDebits503ErrorException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Get Direct Debits.
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
     * @return    Returns the DirectDebitResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public DirectDebitResponse getDirectDebits(
            final String xFapiAuthDate,
            final String xFapiCustomerIpAddress,
            final String xFapiInteractionId,
            final String xMerchantIpAddress,
            final String xCustomerUserAgent) throws ApiException, IOException {
        return prepareGetDirectDebitsRequest(xFapiAuthDate, xFapiCustomerIpAddress,
                xFapiInteractionId, xMerchantIpAddress, xCustomerUserAgent).execute();
    }

    /**
     * Get Direct Debits.
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
     * @return    Returns the DirectDebitResponse response from the API call
     */
    public CompletableFuture<DirectDebitResponse> getDirectDebitsAsync(
            final String xFapiAuthDate,
            final String xFapiCustomerIpAddress,
            final String xFapiInteractionId,
            final String xMerchantIpAddress,
            final String xCustomerUserAgent) {
        try { 
            return prepareGetDirectDebitsRequest(xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId,
            xMerchantIpAddress, xCustomerUserAgent).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for getDirectDebits.
     */
    private ApiCall<DirectDebitResponse, ApiException> prepareGetDirectDebitsRequest(
            final String xFapiAuthDate,
            final String xFapiCustomerIpAddress,
            final String xFapiInteractionId,
            final String xMerchantIpAddress,
            final String xCustomerUserAgent) throws IOException {
        return new ApiCall.Builder<DirectDebitResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/direct-debits")
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
                                response -> ApiHelper.deserialize(response, DirectDebitResponse.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("Bad Request",
                                (reason, context) -> new DirectDebits400ErrorException(reason, context)))
                        .localErrorCase("401",
                                 ErrorCase.setReason("Unauthorized",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("403",
                                 ErrorCase.setReason("Forbidden",
                                (reason, context) -> new DirectDebits403ErrorException(reason, context)))
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
                                (reason, context) -> new DirectDebits500ErrorException(reason, context)))
                        .localErrorCase("501",
                                 ErrorCase.setReason("Not Implemented",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("503",
                                 ErrorCase.setReason("Service Unavailable",
                                (reason, context) -> new DirectDebits503ErrorException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}