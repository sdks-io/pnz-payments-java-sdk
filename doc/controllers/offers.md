# Offers

A set of elements that descirbe the list of offers avaialble to a specific account

```java
OffersController offersController = client.getOffersController();
```

## Class Name

`OffersController`

## Methods

* [Get Account Offers](../../doc/controllers/offers.md#get-account-offers)
* [Get Offers](../../doc/controllers/offers.md#get-offers)


# Get Account Offers

Get Offers related to an account

```java
CompletableFuture<GetAccountOffersResponse> getAccountOffersAsync(
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

[`GetAccountOffersResponse`](../../doc/models/get-account-offers-response.md)

## Example Usage

```java
String accountId = "AccountId0";

offersController.getAccountOffersAsync(accountId, null, null, null, null, null).thenAccept(result -> {
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
| 400 | Bad Request | [`AccountsOffers400ErrorException`](../../doc/models/accounts-offers-400-error-exception.md) |
| 401 | Unauthorized | `ApiException` |
| 403 | Forbidden | [`AccountsOffers403ErrorException`](../../doc/models/accounts-offers-403-error-exception.md) |
| 405 | Method Not Allowed | `ApiException` |
| 406 | Not Acceptable | `ApiException` |
| 429 | Too Many Requests | `ApiException` |
| 500 | Internal Server Error | [`AccountsOffers500ErrorException`](../../doc/models/accounts-offers-500-error-exception.md) |
| 501 | Not Implemented | `ApiException` |
| 503 | Service Unavailable | [`AccountsOffers503ErrorException`](../../doc/models/accounts-offers-503-error-exception.md) |


# Get Offers

Get Offers

```java
CompletableFuture<GetOffersResponse> getOffersAsync(
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

[`GetOffersResponse`](../../doc/models/get-offers-response.md)

## Example Usage

```java
offersController.getOffersAsync(null, null, null, null, null).thenAccept(result -> {
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
| 400 | Bad Request | [`Offers400ErrorException`](../../doc/models/offers-400-error-exception.md) |
| 401 | Unauthorized | `ApiException` |
| 403 | Forbidden | [`Offers403ErrorException`](../../doc/models/offers-403-error-exception.md) |
| 405 | Method Not Allowed | `ApiException` |
| 406 | Not Acceptable | `ApiException` |
| 429 | Too Many Requests | `ApiException` |
| 500 | Internal Server Error | [`Offers500ErrorException`](../../doc/models/offers-500-error-exception.md) |
| 501 | Not Implemented | `ApiException` |
| 503 | Service Unavailable | [`Offers503ErrorException`](../../doc/models/offers-503-error-exception.md) |

