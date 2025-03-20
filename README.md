
# Getting Started with Account and Transaction API Specification

## Introduction

Swagger for Account and Transaction API Specification. This is heavily derived from the Open Banking UK API - see www.openbanking.org.uk for details.

## Install the Package

Install the SDK by adding the following dependency in your project's pom.xml file:

```xml
<dependency>
  <groupId>io.sdks</groupId>
  <artifactId>pnz-payments-sdk</artifactId>
  <version>1.0.1</version>
</dependency>
```

You can also view the package at:
https://central.sonatype.com/artifact/io.sdks/pnz-payments-sdk/1.0.1

## Test the SDK

The generated code and the server can be tested using automatically generated test cases.
JUnit is used as the testing framework and test runner.

In Eclipse, for running the tests do the following:

1. Select the project AccountAndTransactionAPISpecificationLib from the package explorer.
2. Select `Run -> Run as -> JUnit Test` or use `Alt + Shift + X` followed by `T` to run the Tests.

## Initialize the API Client

**_Note:_** Documentation for the client can be found [here.](https://www.github.com/sdks-io/pnz-payments-java-sdk/tree/1.0.1/doc/client.md)

The following parameters are configurable for the API Client:

| Parameter | Type | Description |
|  --- | --- | --- |
| `environment` | `Environment` | The API environment. <br> **Default: `Environment.PRODUCTION`** |
| `httpClientConfig` | [`Consumer<HttpClientConfiguration.Builder>`](https://www.github.com/sdks-io/pnz-payments-java-sdk/tree/1.0.1/doc/http-client-configuration-builder.md) | Set up Http Client Configuration instance. |
| `bearerAuthCredentials` | [`BearerAuthCredentials`](https://www.github.com/sdks-io/pnz-payments-java-sdk/tree/1.0.1/doc/auth/oauth-2-bearer-token.md) | The Credentials Setter for OAuth 2 Bearer token |

The API client can be initialized as follows:

```java
AccountAndTransactionAPISpecificationClient client = new AccountAndTransactionAPISpecificationClient.Builder()
    .httpClientConfig(configBuilder -> configBuilder
            .timeout(0))
    .bearerAuthCredentials(new BearerAuthModel.Builder(
            "AccessToken"
        )
        .build())
    .environment(Environment.PRODUCTION)
    .build();
```

## Environments

The SDK can be configured to use a different environment for making API calls. Available environments are:

### Fields

| Name | Description |
|  --- | --- |
| production | **Default** |
| environment2 | - |

## Authorization

This API uses the following authentication schemes.

* [`HTTPBearerAuthentication (OAuth 2 Bearer token)`](https://www.github.com/sdks-io/pnz-payments-java-sdk/tree/1.0.1/doc/auth/oauth-2-bearer-token.md)

## List of APIs

* [Direct Debits](https://www.github.com/sdks-io/pnz-payments-java-sdk/tree/1.0.1/doc/controllers/direct-debits.md)
* [Scheduled Payments](https://www.github.com/sdks-io/pnz-payments-java-sdk/tree/1.0.1/doc/controllers/scheduled-payments.md)
* [Standing Orders](https://www.github.com/sdks-io/pnz-payments-java-sdk/tree/1.0.1/doc/controllers/standing-orders.md)
* [Accounts](https://www.github.com/sdks-io/pnz-payments-java-sdk/tree/1.0.1/doc/controllers/accounts.md)
* [Balances](https://www.github.com/sdks-io/pnz-payments-java-sdk/tree/1.0.1/doc/controllers/balances.md)
* [Beneficiaries](https://www.github.com/sdks-io/pnz-payments-java-sdk/tree/1.0.1/doc/controllers/beneficiaries.md)
* [Offers](https://www.github.com/sdks-io/pnz-payments-java-sdk/tree/1.0.1/doc/controllers/offers.md)
* [Party](https://www.github.com/sdks-io/pnz-payments-java-sdk/tree/1.0.1/doc/controllers/party.md)
* [Statements](https://www.github.com/sdks-io/pnz-payments-java-sdk/tree/1.0.1/doc/controllers/statements.md)
* [Transactions](https://www.github.com/sdks-io/pnz-payments-java-sdk/tree/1.0.1/doc/controllers/transactions.md)

## Classes Documentation

* [Utility Classes](https://www.github.com/sdks-io/pnz-payments-java-sdk/tree/1.0.1/doc/utility-classes.md)
* [HttpRequest](https://www.github.com/sdks-io/pnz-payments-java-sdk/tree/1.0.1/doc/http-request.md)
* [HttpResponse](https://www.github.com/sdks-io/pnz-payments-java-sdk/tree/1.0.1/doc/http-response.md)
* [HttpStringResponse](https://www.github.com/sdks-io/pnz-payments-java-sdk/tree/1.0.1/doc/http-string-response.md)
* [HttpContext](https://www.github.com/sdks-io/pnz-payments-java-sdk/tree/1.0.1/doc/http-context.md)
* [HttpBodyRequest](https://www.github.com/sdks-io/pnz-payments-java-sdk/tree/1.0.1/doc/http-body-request.md)
* [HttpCallback Interface](https://www.github.com/sdks-io/pnz-payments-java-sdk/tree/1.0.1/doc/http-callback-interface.md)
* [Headers](https://www.github.com/sdks-io/pnz-payments-java-sdk/tree/1.0.1/doc/headers.md)
* [ApiException](https://www.github.com/sdks-io/pnz-payments-java-sdk/tree/1.0.1/doc/api-exception.md)
* [Configuration Interface](https://www.github.com/sdks-io/pnz-payments-java-sdk/tree/1.0.1/doc/configuration-interface.md)
* [HttpClientConfiguration](https://www.github.com/sdks-io/pnz-payments-java-sdk/tree/1.0.1/doc/http-client-configuration.md)
* [HttpClientConfiguration.Builder](https://www.github.com/sdks-io/pnz-payments-java-sdk/tree/1.0.1/doc/http-client-configuration-builder.md)

