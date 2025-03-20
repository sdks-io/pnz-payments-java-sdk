# Statements

A resource that describes summary details for an account statement period

```java
StatementsController statementsController = client.getStatementsController();
```

## Class Name

`StatementsController`

## Methods

* [Get Account Statement](../../doc/controllers/statements.md#get-account-statement)
* [Get Account Statement File](../../doc/controllers/statements.md#get-account-statement-file)
* [Get Account Statement Transactions](../../doc/controllers/statements.md#get-account-statement-transactions)
* [Get Account Statements](../../doc/controllers/statements.md#get-account-statements)
* [Get Statements](../../doc/controllers/statements.md#get-statements)


# Get Account Statement

Get Statement related to an account

```java
CompletableFuture<GetAccountStatementResponse> getAccountStatementAsync(
    final String accountId,
    final String statementId,
    final LocalDateTime fromStatementDateTime,
    final LocalDateTime toStatementDateTime,
    final String xFapiAuthDate,
    final String xFapiCustomerIpAddress,
    final String xFapiInteractionId,
    final String xMerchantIpAddress,
    final String xCustomerUserAgent)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `accountId` | `String` | Template, Required | A unique identifier used to identify the account resource. |
| `statementId` | `String` | Template, Required | A unique identifier used to identify the statement resource. |
| `fromStatementDateTime` | `LocalDateTime` | Query, Optional | The UTC ISO 8601 Date Time to filter statements FROM NB Time component is optional - set to 00:00:00 for just Date. If the Date Time contains a timezone, the API Provider must ignore the timezone component. |
| `toStatementDateTime` | `LocalDateTime` | Query, Optional | The UTC ISO 8601 Date Time to filter statements TO NB Time component is optional - set to 00:00:00 for just Date. If the Date Time contains a timezone, the API Provider must ignore the timezone component. |
| `xFapiAuthDate` | `String` | Header, Optional | The time when the Customer last logged in with the Third Party.<br>All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:<br>Sun, 10 Sep 2017 19:43:31 UTC<br>**Constraints**: *Pattern*: `^(Mon\|Tue\|Wed\|Thu\|Fri\|Sat\|Sun), \d{2} (Jan\|Feb\|Mar\|Apr\|May\|Jun\|Jul\|Aug\|Sep\|Oct\|Nov\|Dec) \d{4} \d{2}:\d{2}:\d{2} (GMT\|UTC)$` |
| `xFapiCustomerIpAddress` | `String` | Header, Optional | The Customer's IP address if the Customer is currently logged in with the Third Party.<br>**Constraints**: *Pattern*: `^((25[0-5]\|2[0-4][0-9]\|[01]?[0-9][0-9]?)\.){3}(25[0-5]\|2[0-4][0-9]\|[01]?[0-9][0-9]?)$` |
| `xFapiInteractionId` | `String` | Header, Optional | An RFC4122 UID used as a correlation id. |
| `xMerchantIpAddress` | `String` | Header, Optional | The IP address of the merchant when making account information requests through a Third Party.<br>**Constraints**: *Pattern*: `^((25[0-5]\|2[0-4][0-9]\|[01]?[0-9][0-9]?)\.){3}(25[0-5]\|2[0-4][0-9]\|[01]?[0-9][0-9]?)$` |
| `xCustomerUserAgent` | `String` | Header, Optional | The User-Agent of the application on the customer device that is used to make the account information request |

## Response Type

[`GetAccountStatementResponse`](../../doc/models/get-account-statement-response.md)

## Example Usage

```java
String accountId = "AccountId0";
String statementId = "StatementId6";

statementsController.getAccountStatementAsync(accountId, statementId, null, null, null, null, null, null, null).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Bad Request | [`AccountsStatements400ErrorException`](../../doc/models/accounts-statements-400-error-exception.md) |
| 401 | Unauthorized | `ApiException` |
| 403 | Forbidden | [`AccountsStatements403ErrorException`](../../doc/models/accounts-statements-403-error-exception.md) |
| 405 | Method Not Allowed | `ApiException` |
| 406 | Not Acceptable | `ApiException` |
| 429 | Too Many Requests | `ApiException` |
| 500 | Internal Server Error | [`AccountsStatements500ErrorException`](../../doc/models/accounts-statements-500-error-exception.md) |
| 501 | Not Implemented | `ApiException` |
| 503 | Service Unavailable | [`AccountsStatements503ErrorException`](../../doc/models/accounts-statements-503-error-exception.md) |


# Get Account Statement File

Get Statement related to an account

```java
CompletableFuture<Object> getAccountStatementFileAsync(
    final String accountId,
    final String statementId,
    final String xFapiAuthDate,
    final String xFapiCustomerIpAddress,
    final String xFapiInteractionId,
    final String xMerchantIpAddress,
    final String xCustomerUserAgent)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `accountId` | `String` | Template, Required | A unique identifier used to identify the account resource. |
| `statementId` | `String` | Template, Required | A unique identifier used to identify the statement resource. |
| `xFapiAuthDate` | `String` | Header, Optional | The time when the Customer last logged in with the Third Party.<br>All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:<br>Sun, 10 Sep 2017 19:43:31 UTC<br>**Constraints**: *Pattern*: `^(Mon\|Tue\|Wed\|Thu\|Fri\|Sat\|Sun), \d{2} (Jan\|Feb\|Mar\|Apr\|May\|Jun\|Jul\|Aug\|Sep\|Oct\|Nov\|Dec) \d{4} \d{2}:\d{2}:\d{2} (GMT\|UTC)$` |
| `xFapiCustomerIpAddress` | `String` | Header, Optional | The Customer's IP address if the Customer is currently logged in with the Third Party.<br>**Constraints**: *Pattern*: `^((25[0-5]\|2[0-4][0-9]\|[01]?[0-9][0-9]?)\.){3}(25[0-5]\|2[0-4][0-9]\|[01]?[0-9][0-9]?)$` |
| `xFapiInteractionId` | `String` | Header, Optional | An RFC4122 UID used as a correlation id. |
| `xMerchantIpAddress` | `String` | Header, Optional | The IP address of the merchant when making account information requests through a Third Party.<br>**Constraints**: *Pattern*: `^((25[0-5]\|2[0-4][0-9]\|[01]?[0-9][0-9]?)\.){3}(25[0-5]\|2[0-4][0-9]\|[01]?[0-9][0-9]?)$` |
| `xCustomerUserAgent` | `String` | Header, Optional | The User-Agent of the application on the customer device that is used to make the account information request |

## Response Type

`Object`

## Example Usage

```java
String accountId = "AccountId0";
String statementId = "StatementId6";

statementsController.getAccountStatementFileAsync(accountId, statementId, null, null, null, null, null).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Bad Request | `ApiException` |
| 401 | Unauthorized | `ApiException` |
| 403 | Forbidden | `ApiException` |
| 405 | Method Not Allowed | `ApiException` |
| 406 | Not Acceptable | `ApiException` |
| 429 | Too Many Requests | `ApiException` |
| 500 | Internal Server Error | `ApiException` |
| 501 | Not Implemented | `ApiException` |
| 503 | Service Unavailable | `ApiException` |


# Get Account Statement Transactions

Get Statement Transactions related to an account

```java
CompletableFuture<GetAccountStatementTransactionsResponse> getAccountStatementTransactionsAsync(
    final String accountId,
    final String statementId,
    final LocalDateTime fromBookingDateTime,
    final LocalDateTime toBookingDateTime,
    final String xFapiAuthDate,
    final String xFapiCustomerIpAddress,
    final String xFapiInteractionId,
    final String xMerchantIpAddress,
    final String xCustomerUserAgent)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `accountId` | `String` | Template, Required | A unique identifier used to identify the account resource. |
| `statementId` | `String` | Template, Required | A unique identifier used to identify the statement resource. |
| `fromBookingDateTime` | `LocalDateTime` | Query, Optional | The UTC ISO 8601 Date Time to filter transactions FROM NB Time component is optional - set to 00:00:00 for just Date. If the Date Time contains a timezone, the API Provider must ignore the timezone component. |
| `toBookingDateTime` | `LocalDateTime` | Query, Optional | The UTC ISO 8601 Date Time to filter transactions TO NB Time component is optional - set to 00:00:00 for just Date. If the Date Time contains a timezone, the API Provider must ignore the timezone component. |
| `xFapiAuthDate` | `String` | Header, Optional | The time when the Customer last logged in with the Third Party.<br>All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:<br>Sun, 10 Sep 2017 19:43:31 UTC<br>**Constraints**: *Pattern*: `^(Mon\|Tue\|Wed\|Thu\|Fri\|Sat\|Sun), \d{2} (Jan\|Feb\|Mar\|Apr\|May\|Jun\|Jul\|Aug\|Sep\|Oct\|Nov\|Dec) \d{4} \d{2}:\d{2}:\d{2} (GMT\|UTC)$` |
| `xFapiCustomerIpAddress` | `String` | Header, Optional | The Customer's IP address if the Customer is currently logged in with the Third Party.<br>**Constraints**: *Pattern*: `^((25[0-5]\|2[0-4][0-9]\|[01]?[0-9][0-9]?)\.){3}(25[0-5]\|2[0-4][0-9]\|[01]?[0-9][0-9]?)$` |
| `xFapiInteractionId` | `String` | Header, Optional | An RFC4122 UID used as a correlation id. |
| `xMerchantIpAddress` | `String` | Header, Optional | The IP address of the merchant when making account information requests through a Third Party.<br>**Constraints**: *Pattern*: `^((25[0-5]\|2[0-4][0-9]\|[01]?[0-9][0-9]?)\.){3}(25[0-5]\|2[0-4][0-9]\|[01]?[0-9][0-9]?)$` |
| `xCustomerUserAgent` | `String` | Header, Optional | The User-Agent of the application on the customer device that is used to make the account information request |

## Response Type

[`GetAccountStatementTransactionsResponse`](../../doc/models/get-account-statement-transactions-response.md)

## Example Usage

```java
String accountId = "AccountId0";
String statementId = "StatementId6";

statementsController.getAccountStatementTransactionsAsync(accountId, statementId, null, null, null, null, null, null, null).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Bad Request | [`AccountsStatementsTransactions400ErrorException`](../../doc/models/accounts-statements-transactions-400-error-exception.md) |
| 401 | Unauthorized | `ApiException` |
| 403 | Forbidden | [`AccountsStatementsTransactions403ErrorException`](../../doc/models/accounts-statements-transactions-403-error-exception.md) |
| 405 | Method Not Allowed | `ApiException` |
| 406 | Not Acceptable | `ApiException` |
| 429 | Too Many Requests | `ApiException` |
| 500 | Internal Server Error | [`AccountsStatementsTransactions500ErrorException`](../../doc/models/accounts-statements-transactions-500-error-exception.md) |
| 501 | Not Implemented | `ApiException` |
| 503 | Service Unavailable | [`AccountsStatementsTransactions503ErrorException`](../../doc/models/accounts-statements-transactions-503-error-exception.md) |


# Get Account Statements

Get Statements related to an account

```java
CompletableFuture<GetAccountStatementsResponse> getAccountStatementsAsync(
    final String accountId,
    final LocalDateTime fromStatementDateTime,
    final LocalDateTime toStatementDateTime,
    final String xFapiAuthDate,
    final String xFapiCustomerIpAddress,
    final String xFapiInteractionId,
    final String xMerchantIpAddress,
    final String xCustomerUserAgent)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `accountId` | `String` | Template, Required | A unique identifier used to identify the account resource. |
| `fromStatementDateTime` | `LocalDateTime` | Query, Optional | The UTC ISO 8601 Date Time to filter statements FROM NB Time component is optional - set to 00:00:00 for just Date. If the Date Time contains a timezone, the API Provider must ignore the timezone component. |
| `toStatementDateTime` | `LocalDateTime` | Query, Optional | The UTC ISO 8601 Date Time to filter statements TO NB Time component is optional - set to 00:00:00 for just Date. If the Date Time contains a timezone, the API Provider must ignore the timezone component. |
| `xFapiAuthDate` | `String` | Header, Optional | The time when the Customer last logged in with the Third Party.<br>All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:<br>Sun, 10 Sep 2017 19:43:31 UTC<br>**Constraints**: *Pattern*: `^(Mon\|Tue\|Wed\|Thu\|Fri\|Sat\|Sun), \d{2} (Jan\|Feb\|Mar\|Apr\|May\|Jun\|Jul\|Aug\|Sep\|Oct\|Nov\|Dec) \d{4} \d{2}:\d{2}:\d{2} (GMT\|UTC)$` |
| `xFapiCustomerIpAddress` | `String` | Header, Optional | The Customer's IP address if the Customer is currently logged in with the Third Party.<br>**Constraints**: *Pattern*: `^((25[0-5]\|2[0-4][0-9]\|[01]?[0-9][0-9]?)\.){3}(25[0-5]\|2[0-4][0-9]\|[01]?[0-9][0-9]?)$` |
| `xFapiInteractionId` | `String` | Header, Optional | An RFC4122 UID used as a correlation id. |
| `xMerchantIpAddress` | `String` | Header, Optional | The IP address of the merchant when making account information requests through a Third Party.<br>**Constraints**: *Pattern*: `^((25[0-5]\|2[0-4][0-9]\|[01]?[0-9][0-9]?)\.){3}(25[0-5]\|2[0-4][0-9]\|[01]?[0-9][0-9]?)$` |
| `xCustomerUserAgent` | `String` | Header, Optional | The User-Agent of the application on the customer device that is used to make the account information request |

## Response Type

[`GetAccountStatementsResponse`](../../doc/models/get-account-statements-response.md)

## Example Usage

```java
String accountId = "AccountId0";

statementsController.getAccountStatementsAsync(accountId, null, null, null, null, null, null, null).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Bad Request | [`AccountsStatements400ErrorException`](../../doc/models/accounts-statements-400-error-exception.md) |
| 401 | Unauthorized | `ApiException` |
| 403 | Forbidden | [`AccountsStatements403ErrorException`](../../doc/models/accounts-statements-403-error-exception.md) |
| 405 | Method Not Allowed | `ApiException` |
| 406 | Not Acceptable | `ApiException` |
| 429 | Too Many Requests | `ApiException` |
| 500 | Internal Server Error | [`AccountsStatements500ErrorException`](../../doc/models/accounts-statements-500-error-exception.md) |
| 501 | Not Implemented | `ApiException` |
| 503 | Service Unavailable | [`AccountsStatements503ErrorException`](../../doc/models/accounts-statements-503-error-exception.md) |


# Get Statements

Get Statements

```java
CompletableFuture<GetStatementsResponse> getStatementsAsync(
    final LocalDateTime fromStatementDateTime,
    final LocalDateTime toStatementDateTime,
    final String xFapiAuthDate,
    final String xFapiCustomerIpAddress,
    final String xFapiInteractionId,
    final String xMerchantIpAddress,
    final String xCustomerUserAgent)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `fromStatementDateTime` | `LocalDateTime` | Query, Optional | The UTC ISO 8601 Date Time to filter statements FROM NB Time component is optional - set to 00:00:00 for just Date. If the Date Time contains a timezone, the API Provider must ignore the timezone component. |
| `toStatementDateTime` | `LocalDateTime` | Query, Optional | The UTC ISO 8601 Date Time to filter statements TO NB Time component is optional - set to 00:00:00 for just Date. If the Date Time contains a timezone, the API Provider must ignore the timezone component. |
| `xFapiAuthDate` | `String` | Header, Optional | The time when the Customer last logged in with the Third Party.<br>All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:<br>Sun, 10 Sep 2017 19:43:31 UTC<br>**Constraints**: *Pattern*: `^(Mon\|Tue\|Wed\|Thu\|Fri\|Sat\|Sun), \d{2} (Jan\|Feb\|Mar\|Apr\|May\|Jun\|Jul\|Aug\|Sep\|Oct\|Nov\|Dec) \d{4} \d{2}:\d{2}:\d{2} (GMT\|UTC)$` |
| `xFapiCustomerIpAddress` | `String` | Header, Optional | The Customer's IP address if the Customer is currently logged in with the Third Party.<br>**Constraints**: *Pattern*: `^((25[0-5]\|2[0-4][0-9]\|[01]?[0-9][0-9]?)\.){3}(25[0-5]\|2[0-4][0-9]\|[01]?[0-9][0-9]?)$` |
| `xFapiInteractionId` | `String` | Header, Optional | An RFC4122 UID used as a correlation id. |
| `xMerchantIpAddress` | `String` | Header, Optional | The IP address of the merchant when making account information requests through a Third Party.<br>**Constraints**: *Pattern*: `^((25[0-5]\|2[0-4][0-9]\|[01]?[0-9][0-9]?)\.){3}(25[0-5]\|2[0-4][0-9]\|[01]?[0-9][0-9]?)$` |
| `xCustomerUserAgent` | `String` | Header, Optional | The User-Agent of the application on the customer device that is used to make the account information request |

## Response Type

[`GetStatementsResponse`](../../doc/models/get-statements-response.md)

## Example Usage

```java
statementsController.getStatementsAsync(null, null, null, null, null, null, null).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Bad Request | [`Statements400ErrorException`](../../doc/models/statements-400-error-exception.md) |
| 401 | Unauthorized | `ApiException` |
| 403 | Forbidden | [`Statements403ErrorException`](../../doc/models/statements-403-error-exception.md) |
| 405 | Method Not Allowed | `ApiException` |
| 406 | Not Acceptable | `ApiException` |
| 429 | Too Many Requests | `ApiException` |
| 500 | Internal Server Error | [`Statements500ErrorException`](../../doc/models/statements-500-error-exception.md) |
| 501 | Not Implemented | `ApiException` |
| 503 | Service Unavailable | [`Statements503ErrorException`](../../doc/models/statements-503-error-exception.md) |

