# Transactions

A resource that describes a posting to an account that results in an increase or decrease to a balance

```java
TransactionsController transactionsController = client.getTransactionsController();
```

## Class Name

`TransactionsController`

## Methods

* [Get Account Transactions](../../doc/controllers/transactions.md#get-account-transactions)
* [Get Transactions](../../doc/controllers/transactions.md#get-transactions)


# Get Account Transactions

Get transactions related to an account

```java
CompletableFuture<TransactionsResponse> getAccountTransactionsAsync(
    final String accountId,
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
| `fromBookingDateTime` | `LocalDateTime` | Query, Optional | The UTC ISO 8601 Date Time to filter transactions FROM NB Time component is optional - set to 00:00:00 for just Date. If the Date Time contains a timezone, the API Provider must ignore the timezone component. |
| `toBookingDateTime` | `LocalDateTime` | Query, Optional | The UTC ISO 8601 Date Time to filter transactions TO NB Time component is optional - set to 00:00:00 for just Date. If the Date Time contains a timezone, the API Provider must ignore the timezone component. |
| `xFapiAuthDate` | `String` | Header, Optional | The time when the Customer last logged in with the Third Party.<br>All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:<br>Sun, 10 Sep 2017 19:43:31 UTC<br>**Constraints**: *Pattern*: `^(Mon\|Tue\|Wed\|Thu\|Fri\|Sat\|Sun), \d{2} (Jan\|Feb\|Mar\|Apr\|May\|Jun\|Jul\|Aug\|Sep\|Oct\|Nov\|Dec) \d{4} \d{2}:\d{2}:\d{2} (GMT\|UTC)$` |
| `xFapiCustomerIpAddress` | `String` | Header, Optional | The Customer's IP address if the Customer is currently logged in with the Third Party.<br>**Constraints**: *Pattern*: `^((25[0-5]\|2[0-4][0-9]\|[01]?[0-9][0-9]?)\.){3}(25[0-5]\|2[0-4][0-9]\|[01]?[0-9][0-9]?)$` |
| `xFapiInteractionId` | `String` | Header, Optional | An RFC4122 UID used as a correlation id. |
| `xMerchantIpAddress` | `String` | Header, Optional | The IP address of the merchant when making account information requests through a Third Party.<br>**Constraints**: *Pattern*: `^((25[0-5]\|2[0-4][0-9]\|[01]?[0-9][0-9]?)\.){3}(25[0-5]\|2[0-4][0-9]\|[01]?[0-9][0-9]?)$` |
| `xCustomerUserAgent` | `String` | Header, Optional | The User-Agent of the application on the customer device that is used to make the account information request |

## Response Type

[`TransactionsResponse`](../../doc/models/transactions-response.md)

## Example Usage

```java
String accountId = "AccountId0";

transactionsController.getAccountTransactionsAsync(accountId, null, null, null, null, null, null, null).thenAccept(result -> {
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
| 400 | Bad Request | [`AccountsTransactions400ErrorException`](../../doc/models/accounts-transactions-400-error-exception.md) |
| 401 | Unauthorized | `ApiException` |
| 403 | Forbidden | [`AccountsTransactions403ErrorException`](../../doc/models/accounts-transactions-403-error-exception.md) |
| 405 | Method Not Allowed | `ApiException` |
| 406 | Not Acceptable | `ApiException` |
| 429 | Too Many Requests | `ApiException` |
| 500 | Internal Server Error | [`AccountsTransactions500ErrorException`](../../doc/models/accounts-transactions-500-error-exception.md) |
| 501 | Not Implemented | `ApiException` |
| 503 | Service Unavailable | [`AccountsTransactions503ErrorException`](../../doc/models/accounts-transactions-503-error-exception.md) |


# Get Transactions

Get Transactions

```java
CompletableFuture<TransactionsResponse> getTransactionsAsync(
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
| `fromBookingDateTime` | `LocalDateTime` | Query, Optional | The UTC ISO 8601 Date Time to filter transactions FROM NB Time component is optional - set to 00:00:00 for just Date. If the Date Time contains a timezone, the API Provider must ignore the timezone component. |
| `toBookingDateTime` | `LocalDateTime` | Query, Optional | The UTC ISO 8601 Date Time to filter transactions TO NB Time component is optional - set to 00:00:00 for just Date. If the Date Time contains a timezone, the API Provider must ignore the timezone component. |
| `xFapiAuthDate` | `String` | Header, Optional | The time when the Customer last logged in with the Third Party.<br>All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:<br>Sun, 10 Sep 2017 19:43:31 UTC<br>**Constraints**: *Pattern*: `^(Mon\|Tue\|Wed\|Thu\|Fri\|Sat\|Sun), \d{2} (Jan\|Feb\|Mar\|Apr\|May\|Jun\|Jul\|Aug\|Sep\|Oct\|Nov\|Dec) \d{4} \d{2}:\d{2}:\d{2} (GMT\|UTC)$` |
| `xFapiCustomerIpAddress` | `String` | Header, Optional | The Customer's IP address if the Customer is currently logged in with the Third Party.<br>**Constraints**: *Pattern*: `^((25[0-5]\|2[0-4][0-9]\|[01]?[0-9][0-9]?)\.){3}(25[0-5]\|2[0-4][0-9]\|[01]?[0-9][0-9]?)$` |
| `xFapiInteractionId` | `String` | Header, Optional | An RFC4122 UID used as a correlation id. |
| `xMerchantIpAddress` | `String` | Header, Optional | The IP address of the merchant when making account information requests through a Third Party.<br>**Constraints**: *Pattern*: `^((25[0-5]\|2[0-4][0-9]\|[01]?[0-9][0-9]?)\.){3}(25[0-5]\|2[0-4][0-9]\|[01]?[0-9][0-9]?)$` |
| `xCustomerUserAgent` | `String` | Header, Optional | The User-Agent of the application on the customer device that is used to make the account information request |

## Response Type

[`TransactionsResponse`](../../doc/models/transactions-response.md)

## Example Usage

```java
transactionsController.getTransactionsAsync(null, null, null, null, null, null, null).thenAccept(result -> {
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
| 400 | Bad Request | [`Transactions400ErrorException`](../../doc/models/transactions-400-error-exception.md) |
| 401 | Unauthorized | `ApiException` |
| 403 | Forbidden | [`Transactions403ErrorException`](../../doc/models/transactions-403-error-exception.md) |
| 405 | Method Not Allowed | `ApiException` |
| 406 | Not Acceptable | `ApiException` |
| 429 | Too Many Requests | `ApiException` |
| 500 | Internal Server Error | [`Transactions500ErrorException`](../../doc/models/transactions-500-error-exception.md) |
| 501 | Not Implemented | `ApiException` |
| 503 | Service Unavailable | [`Transactions503ErrorException`](../../doc/models/transactions-503-error-exception.md) |

