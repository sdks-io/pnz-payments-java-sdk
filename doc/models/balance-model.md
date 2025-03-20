
# Balance Model

Balance object schema

## Structure

`BalanceModel`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountId` | `String` | Required | A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `40` | String getAccountId() | setAccountId(String accountId) |
| `Amount` | [`Amount`](../../doc/models/amount.md) | Required | Amount of money of the cash balance. | Amount getAmount() | setAmount(Amount amount) |
| `CreditDebitIndicator` | [`CreditDebitIndicatorEnum`](../../doc/models/credit-debit-indicator-enum.md) | Required | Indicates whether the balance is a credit or a debit balance. Usage: A zero balance is considered to be a credit balance. | CreditDebitIndicatorEnum getCreditDebitIndicator() | setCreditDebitIndicator(CreditDebitIndicatorEnum creditDebitIndicator) |
| `Type` | [`BalanceModelTypeEnum`](../../doc/models/balance-model-type-enum.md) | Required | Balance type, in a coded form. | BalanceModelTypeEnum getType() | setType(BalanceModelTypeEnum type) |
| `DateTime` | `LocalDateTime` | Required | Indicates the date (and time) of the balance.<br>All dates in the JSON payloads are represented in ISO 8601 date-time format.<br>All date-time fields in responses must include the timezone. An example is below:<br>2017-04-05T10:43:07+00:00 | LocalDateTime getDateTime() | setDateTime(LocalDateTime dateTime) |
| `CreditLine` | [`List<CreditLine>`](../../doc/models/credit-line.md) | Optional | - | List<CreditLine> getCreditLine() | setCreditLine(List<CreditLine> creditLine) |

## Example (as JSON)

```json
{
  "AccountId": "AccountId2",
  "Amount": {
    "Amount": "Amount0",
    "Currency": "Currency6"
  },
  "CreditDebitIndicator": "Credit",
  "Type": "Expected",
  "DateTime": "2016-03-13T12:52:32.123Z",
  "CreditLine": [
    {
      "Included": false,
      "Amount": {
        "Amount": "Amount0",
        "Currency": "Currency6"
      },
      "Type": "Temporary"
    }
  ]
}
```

