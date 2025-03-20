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
import java.time.LocalDateTime;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import nz.co.middleware.apicentre.apinomatls.ApiHelper;
import nz.co.middleware.apicentre.apinomatls.DateTimeHelper;
import nz.co.middleware.apicentre.apinomatls.Server;
import nz.co.middleware.apicentre.apinomatls.exceptions.AccountsTransactions400ErrorException;
import nz.co.middleware.apicentre.apinomatls.exceptions.AccountsTransactions403ErrorException;
import nz.co.middleware.apicentre.apinomatls.exceptions.AccountsTransactions500ErrorException;
import nz.co.middleware.apicentre.apinomatls.exceptions.AccountsTransactions503ErrorException;
import nz.co.middleware.apicentre.apinomatls.exceptions.ApiException;
import nz.co.middleware.apicentre.apinomatls.exceptions.Transactions400ErrorException;
import nz.co.middleware.apicentre.apinomatls.exceptions.Transactions403ErrorException;
import nz.co.middleware.apicentre.apinomatls.exceptions.Transactions500ErrorException;
import nz.co.middleware.apicentre.apinomatls.exceptions.Transactions503ErrorException;
import nz.co.middleware.apicentre.apinomatls.http.request.HttpMethod;
import nz.co.middleware.apicentre.apinomatls.models.TransactionsResponse;

/**
 * This class lists all the endpoints of the groups.
 */
public final class TransactionsController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public TransactionsController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Get transactions related to an account.
     * @param  accountId  Required parameter: A unique identifier used to identify the account
     *         resource.
     * @param  fromBookingDateTime  Optional parameter: The UTC ISO 8601 Date Time to filter
     *         transactions FROM NB Time component is optional - set to 00:00:00 for just Date. If
     *         the Date Time contains a timezone, the API Provider must ignore the timezone
     *         component.
     * @param  toBookingDateTime  Optional parameter: The UTC ISO 8601 Date Time to filter
     *         transactions TO NB Time component is optional - set to 00:00:00 for just Date. If the
     *         Date Time contains a timezone, the API Provider must ignore the timezone component.
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
     * @return    Returns the TransactionsResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public TransactionsResponse getAccountTransactions(
            final String accountId,
            final LocalDateTime fromBookingDateTime,
            final LocalDateTime toBookingDateTime,
            final String xFapiAuthDate,
            final String xFapiCustomerIpAddress,
            final String xFapiInteractionId,
            final String xMerchantIpAddress,
            final String xCustomerUserAgent) throws ApiException, IOException {
        return prepareGetAccountTransactionsRequest(accountId, fromBookingDateTime,
                toBookingDateTime, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId,
                xMerchantIpAddress, xCustomerUserAgent).execute();
    }

    /**
     * Get transactions related to an account.
     * @param  accountId  Required parameter: A unique identifier used to identify the account
     *         resource.
     * @param  fromBookingDateTime  Optional parameter: The UTC ISO 8601 Date Time to filter
     *         transactions FROM NB Time component is optional - set to 00:00:00 for just Date. If
     *         the Date Time contains a timezone, the API Provider must ignore the timezone
     *         component.
     * @param  toBookingDateTime  Optional parameter: The UTC ISO 8601 Date Time to filter
     *         transactions TO NB Time component is optional - set to 00:00:00 for just Date. If the
     *         Date Time contains a timezone, the API Provider must ignore the timezone component.
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
     * @return    Returns the TransactionsResponse response from the API call
     */
    public CompletableFuture<TransactionsResponse> getAccountTransactionsAsync(
            final String accountId,
            final LocalDateTime fromBookingDateTime,
            final LocalDateTime toBookingDateTime,
            final String xFapiAuthDate,
            final String xFapiCustomerIpAddress,
            final String xFapiInteractionId,
            final String xMerchantIpAddress,
            final String xCustomerUserAgent) {
        try { 
            return prepareGetAccountTransactionsRequest(accountId, fromBookingDateTime, toBookingDateTime,
            xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xMerchantIpAddress,
            xCustomerUserAgent).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for getAccountTransactions.
     */
    private ApiCall<TransactionsResponse, ApiException> prepareGetAccountTransactionsRequest(
            final String accountId,
            final LocalDateTime fromBookingDateTime,
            final LocalDateTime toBookingDateTime,
            final String xFapiAuthDate,
            final String xFapiCustomerIpAddress,
            final String xFapiInteractionId,
            final String xMerchantIpAddress,
            final String xCustomerUserAgent) throws IOException {
        return new ApiCall.Builder<TransactionsResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/accounts/{AccountId}/transactions")
                        .queryParam(param -> param.key("fromBookingDateTime")
                                .value(DateTimeHelper.toRfc8601DateTime(fromBookingDateTime)).isRequired(false))
                        .queryParam(param -> param.key("toBookingDateTime")
                                .value(DateTimeHelper.toRfc8601DateTime(toBookingDateTime)).isRequired(false))
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
                                response -> ApiHelper.deserialize(response, TransactionsResponse.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("Bad Request",
                                (reason, context) -> new AccountsTransactions400ErrorException(reason, context)))
                        .localErrorCase("401",
                                 ErrorCase.setReason("Unauthorized",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("403",
                                 ErrorCase.setReason("Forbidden",
                                (reason, context) -> new AccountsTransactions403ErrorException(reason, context)))
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
                                (reason, context) -> new AccountsTransactions500ErrorException(reason, context)))
                        .localErrorCase("501",
                                 ErrorCase.setReason("Not Implemented",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("503",
                                 ErrorCase.setReason("Service Unavailable",
                                (reason, context) -> new AccountsTransactions503ErrorException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Get Transactions.
     * @param  fromBookingDateTime  Optional parameter: The UTC ISO 8601 Date Time to filter
     *         transactions FROM NB Time component is optional - set to 00:00:00 for just Date. If
     *         the Date Time contains a timezone, the API Provider must ignore the timezone
     *         component.
     * @param  toBookingDateTime  Optional parameter: The UTC ISO 8601 Date Time to filter
     *         transactions TO NB Time component is optional - set to 00:00:00 for just Date. If the
     *         Date Time contains a timezone, the API Provider must ignore the timezone component.
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
     * @return    Returns the TransactionsResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public TransactionsResponse getTransactions(
            final LocalDateTime fromBookingDateTime,
            final LocalDateTime toBookingDateTime,
            final String xFapiAuthDate,
            final String xFapiCustomerIpAddress,
            final String xFapiInteractionId,
            final String xMerchantIpAddress,
            final String xCustomerUserAgent) throws ApiException, IOException {
        return prepareGetTransactionsRequest(fromBookingDateTime, toBookingDateTime, xFapiAuthDate,
                xFapiCustomerIpAddress, xFapiInteractionId, xMerchantIpAddress,
                xCustomerUserAgent).execute();
    }

    /**
     * Get Transactions.
     * @param  fromBookingDateTime  Optional parameter: The UTC ISO 8601 Date Time to filter
     *         transactions FROM NB Time component is optional - set to 00:00:00 for just Date. If
     *         the Date Time contains a timezone, the API Provider must ignore the timezone
     *         component.
     * @param  toBookingDateTime  Optional parameter: The UTC ISO 8601 Date Time to filter
     *         transactions TO NB Time component is optional - set to 00:00:00 for just Date. If the
     *         Date Time contains a timezone, the API Provider must ignore the timezone component.
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
     * @return    Returns the TransactionsResponse response from the API call
     */
    public CompletableFuture<TransactionsResponse> getTransactionsAsync(
            final LocalDateTime fromBookingDateTime,
            final LocalDateTime toBookingDateTime,
            final String xFapiAuthDate,
            final String xFapiCustomerIpAddress,
            final String xFapiInteractionId,
            final String xMerchantIpAddress,
            final String xCustomerUserAgent) {
        try { 
            return prepareGetTransactionsRequest(fromBookingDateTime, toBookingDateTime, xFapiAuthDate,
            xFapiCustomerIpAddress, xFapiInteractionId, xMerchantIpAddress,
            xCustomerUserAgent).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for getTransactions.
     */
    private ApiCall<TransactionsResponse, ApiException> prepareGetTransactionsRequest(
            final LocalDateTime fromBookingDateTime,
            final LocalDateTime toBookingDateTime,
            final String xFapiAuthDate,
            final String xFapiCustomerIpAddress,
            final String xFapiInteractionId,
            final String xMerchantIpAddress,
            final String xCustomerUserAgent) throws IOException {
        return new ApiCall.Builder<TransactionsResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/transactions")
                        .queryParam(param -> param.key("fromBookingDateTime")
                                .value(DateTimeHelper.toRfc8601DateTime(fromBookingDateTime)).isRequired(false))
                        .queryParam(param -> param.key("toBookingDateTime")
                                .value(DateTimeHelper.toRfc8601DateTime(toBookingDateTime)).isRequired(false))
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
                                response -> ApiHelper.deserialize(response, TransactionsResponse.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("Bad Request",
                                (reason, context) -> new Transactions400ErrorException(reason, context)))
                        .localErrorCase("401",
                                 ErrorCase.setReason("Unauthorized",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("403",
                                 ErrorCase.setReason("Forbidden",
                                (reason, context) -> new Transactions403ErrorException(reason, context)))
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
                                (reason, context) -> new Transactions500ErrorException(reason, context)))
                        .localErrorCase("501",
                                 ErrorCase.setReason("Not Implemented",
                                (reason, context) -> new ApiException(reason, context)))
                        .localErrorCase("503",
                                 ErrorCase.setReason("Service Unavailable",
                                (reason, context) -> new Transactions503ErrorException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}