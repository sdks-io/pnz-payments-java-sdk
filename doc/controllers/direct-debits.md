# Direct Debits

```java
DirectDebitsController directDebitsController = client.getDirectDebitsController();
```

## Class Name

`DirectDebitsController`

## Methods

* [Get Account Direct Debits](../../doc/controllers/direct-debits.md#get-account-direct-debits)
* [Get Direct Debits](../../doc/controllers/direct-debits.md#get-direct-debits)


# Get Account Direct Debits

Get Direct Debits related to an account

```java
CompletableFuture<DirectDebitResponse> getAccountDirectDebitsAsync(
    final String accountId,
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
| `xFapiAuthDate` | `String` | Header, Optional | The time when the Customer last logged in with the Third Party.<br>All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:<br>Sun, 10 Sep 2017 19:43:31 UTC<br>**Constraints**: *Pattern*: `^(Mon\|Tue\|Wed\|Thu\|Fri\|Sat\|Sun), \d{2} (Jan\|Feb\|Mar\|Apr\|May\|Jun\|Jul\|Aug\|Sep\|Oct\|Nov\|Dec) \d{4} \d{2}:\d{2}:\d{2} (GMT\|UTC)$` |
| `xFapiCustomerIpAddress` | `String` | Header, Optional | The Customer's IP address if the Customer is currently logged in with the Third Party.<br>**Constraints**: *Pattern*: `^((25[0-5]\|2[0-4][0-9]\|[01]?[0-9][0-9]?)\.){3}(25[0-5]\|2[0-4][0-9]\|[01]?[0-9][0-9]?)$` |
| `xFapiInteractionId` | `String` | Header, Optional | An RFC4122 UID used as a correlation id. |
| `xMerchantIpAddress` | `String` | Header, Optional | The IP address of the merchant when making account information requests through a Third Party.<br>**Constraints**: *Pattern*: `^((25[0-5]\|2[0-4][0-9]\|[01]?[0-9][0-9]?)\.){3}(25[0-5]\|2[0-4][0-9]\|[01]?[0-9][0-9]?)$` |
| `xCustomerUserAgent` | `String` | Header, Optional | The User-Agent of the application on the customer device that is used to make the account information request |

## Response Type

[`DirectDebitResponse`](../../doc/models/direct-debit-response.md)

## Example Usage

```java
String accountId = "AccountId0";

directDebitsController.getAccountDirectDebitsAsync(accountId, null, null, null, null, null).thenAccept(result -> {
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
| 400 | Bad Request | [`AccountsDirectDebits400ErrorException`](../../doc/models/accounts-direct-debits-400-error-exception.md) |
| 401 | Unauthorized | `ApiException` |
| 403 | Forbidden | [`AccountsDirectDebits403ErrorException`](../../doc/models/accounts-direct-debits-403-error-exception.md) |
| 405 | Method Not Allowed | `ApiException` |
| 406 | Not Acceptable | `ApiException` |
| 429 | Too Many Requests | `ApiException` |
| 500 | Internal Server Error | [`AccountsDirectDebits500ErrorException`](../../doc/models/accounts-direct-debits-500-error-exception.md) |
| 501 | Not Implemented | `ApiException` |
| 503 | Service Unavailable | [`AccountsDirectDebits503ErrorException`](../../doc/models/accounts-direct-debits-503-error-exception.md) |


# Get Direct Debits

Get Direct Debits

```java
CompletableFuture<DirectDebitResponse> getDirectDebitsAsync(
    final String xFapiAuthDate,
    final String xFapiCustomerIpAddress,
    final String xFapiInteractionId,
    final String xMerchantIpAddress,
    final String xCustomerUserAgent)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `xFapiAuthDate` | `String` | Header, Optional | The time when the Customer last logged in with the Third Party.<br>All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:<br>Sun, 10 Sep 2017 19:43:31 UTC<br>**Constraints**: *Pattern*: `^(Mon\|Tue\|Wed\|Thu\|Fri\|Sat\|Sun), \d{2} (Jan\|Feb\|Mar\|Apr\|May\|Jun\|Jul\|Aug\|Sep\|Oct\|Nov\|Dec) \d{4} \d{2}:\d{2}:\d{2} (GMT\|UTC)$` |
| `xFapiCustomerIpAddress` | `String` | Header, Optional | The Customer's IP address if the Customer is currently logged in with the Third Party.<br>**Constraints**: *Pattern*: `^((25[0-5]\|2[0-4][0-9]\|[01]?[0-9][0-9]?)\.){3}(25[0-5]\|2[0-4][0-9]\|[01]?[0-9][0-9]?)$` |
| `xFapiInteractionId` | `String` | Header, Optional | An RFC4122 UID used as a correlation id. |
| `xMerchantIpAddress` | `String` | Header, Optional | The IP address of the merchant when making account information requests through a Third Party.<br>**Constraints**: *Pattern*: `^((25[0-5]\|2[0-4][0-9]\|[01]?[0-9][0-9]?)\.){3}(25[0-5]\|2[0-4][0-9]\|[01]?[0-9][0-9]?)$` |
| `xCustomerUserAgent` | `String` | Header, Optional | The User-Agent of the application on the customer device that is used to make the account information request |

## Response Type

[`DirectDebitResponse`](../../doc/models/direct-debit-response.md)

## Example Usage

```java
directDebitsController.getDirectDebitsAsync(null, null, null, null, null).thenAccept(result -> {
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
| 400 | Bad Request | [`DirectDebits400ErrorException`](../../doc/models/direct-debits-400-error-exception.md) |
| 401 | Unauthorized | `ApiException` |
| 403 | Forbidden | [`DirectDebits403ErrorException`](../../doc/models/direct-debits-403-error-exception.md) |
| 405 | Method Not Allowed | `ApiException` |
| 406 | Not Acceptable | `ApiException` |
| 429 | Too Many Requests | `ApiException` |
| 500 | Internal Server Error | [`DirectDebits500ErrorException`](../../doc/models/direct-debits-500-error-exception.md) |
| 501 | Not Implemented | `ApiException` |
| 503 | Service Unavailable | [`DirectDebits503ErrorException`](../../doc/models/direct-debits-503-error-exception.md) |

