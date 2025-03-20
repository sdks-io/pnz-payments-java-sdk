
# Client Class Documentation

The following parameters are configurable for the API Client:

| Parameter | Type | Description |
|  --- | --- | --- |
| `environment` | `Environment` | The API environment. <br> **Default: `Environment.PRODUCTION`** |
| `httpClientConfig` | [`Consumer<HttpClientConfiguration.Builder>`](http-client-configuration-builder.md) | Set up Http Client Configuration instance. |
| `bearerAuthCredentials` | [`BearerAuthCredentials`](auth/oauth-2-bearer-token.md) | The Credentials Setter for OAuth 2 Bearer token |

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

## Account and Transaction API SpecificationClient Class

The gateway for the SDK. This class acts as a factory for the Controllers and also holds the configuration of the SDK.

### Controllers

| Name | Description | Return Type |
|  --- | --- | --- |
| `getAccountsController()` | Provides access to Accounts controller. | `AccountsController` |
| `getBalancesController()` | Provides access to Balances controller. | `BalancesController` |
| `getBeneficiariesController()` | Provides access to Beneficiaries controller. | `BeneficiariesController` |
| `getDirectDebitsController()` | Provides access to DirectDebits controller. | `DirectDebitsController` |
| `getOffersController()` | Provides access to Offers controller. | `OffersController` |
| `getPartyController()` | Provides access to Party controller. | `PartyController` |
| `getScheduledPaymentsController()` | Provides access to ScheduledPayments controller. | `ScheduledPaymentsController` |
| `getStandingOrdersController()` | Provides access to StandingOrders controller. | `StandingOrdersController` |
| `getStatementsController()` | Provides access to Statements controller. | `StatementsController` |
| `getTransactionsController()` | Provides access to Transactions controller. | `TransactionsController` |

### Methods

| Name | Description | Return Type |
|  --- | --- | --- |
| `shutdown()` | Shutdown the underlying HttpClient instance. | `void` |
| `getEnvironment()` | Current API environment. | `Environment` |
| `getHttpClient()` | The HTTP Client instance to use for making HTTP requests. | `HttpClient` |
| `getHttpClientConfig()` | Http Client Configuration instance. | [`ReadonlyHttpClientConfiguration`](http-client-configuration.md) |
| `getBearerAuthCredentials()` | The credentials to use with BearerAuth. | [`BearerAuthCredentials`](auth/oauth-2-bearer-token.md) |
| `getBaseUri(Server server)` | Get base URI by current environment | `String` |
| `getBaseUri()` | Get base URI by current environment | `String` |

