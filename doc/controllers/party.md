# Party

A set of elements that describe the party linked to a specific account

```java
PartyController partyController = client.getPartyController();
```

## Class Name

`PartyController`

## Methods

* [Get Account Party](../../doc/controllers/party.md#get-account-party)
* [Get Party](../../doc/controllers/party.md#get-party)


# Get Account Party

Get Party related to an account

```java
CompletableFuture<GetAccountPartyResponse> getAccountPartyAsync(
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

[`GetAccountPartyResponse`](../../doc/models/get-account-party-response.md)

## Example Usage

```java
String accountId = "AccountId0";

partyController.getAccountPartyAsync(accountId, null, null, null, null, null).thenAccept(result -> {
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
| 400 | Bad Request | [`AccountsParty400ErrorException`](../../doc/models/accounts-party-400-error-exception.md) |
| 401 | Unauthorized | `ApiException` |
| 403 | Forbidden | [`AccountsParty403ErrorException`](../../doc/models/accounts-party-403-error-exception.md) |
| 405 | Method Not Allowed | `ApiException` |
| 406 | Not Acceptable | `ApiException` |
| 429 | Too Many Requests | `ApiException` |
| 500 | Internal Server Error | [`AccountsParty500ErrorException`](../../doc/models/accounts-party-500-error-exception.md) |
| 501 | Not Implemented | `ApiException` |
| 503 | Service Unavailable | [`AccountsParty503ErrorException`](../../doc/models/accounts-party-503-error-exception.md) |


# Get Party

Get Party of logged in Customer

```java
CompletableFuture<GetPartyResponse> getPartyAsync(
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

[`GetPartyResponse`](../../doc/models/get-party-response.md)

## Example Usage

```java
partyController.getPartyAsync(null, null, null, null, null).thenAccept(result -> {
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
| 400 | Bad Request | [`Party400ErrorException`](../../doc/models/party-400-error-exception.md) |
| 401 | Unauthorized | `ApiException` |
| 403 | Forbidden | [`Party403ErrorException`](../../doc/models/party-403-error-exception.md) |
| 405 | Method Not Allowed | `ApiException` |
| 406 | Not Acceptable | `ApiException` |
| 429 | Too Many Requests | `ApiException` |
| 500 | Internal Server Error | [`Party500ErrorException`](../../doc/models/party-500-error-exception.md) |
| 501 | Not Implemented | `ApiException` |
| 503 | Service Unavailable | [`Party503ErrorException`](../../doc/models/party-503-error-exception.md) |

