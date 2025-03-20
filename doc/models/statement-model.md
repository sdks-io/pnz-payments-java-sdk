
# Statement Model

Provides further details on a statement resource.

## Structure

`StatementModel`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountId` | `String` | Required | A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `40` | String getAccountId() | setAccountId(String accountId) |
| `StatementId` | `String` | Optional | Unique identifier for the statement resource within an servicing institution. This identifier is both unique and immutable.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `40` | String getStatementId() | setStatementId(String statementId) |
| `StatementReference` | `String` | Optional | Unique reference for the statement. This reference may be optionally populated if available.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `35` | String getStatementReference() | setStatementReference(String statementReference) |
| `Type` | [`StatementTypeEnum`](../../doc/models/statement-type-enum.md) | Required | Statement type, in a coded form. | StatementTypeEnum getType() | setType(StatementTypeEnum type) |
| `StartDateTime` | `LocalDateTime` | Required | Date and time at which the statement period starts.<br>All dates in the JSON payloads are represented in ISO 8601 date-time format.<br>All date-time fields in responses must include the timezone. An example is below:<br>2017-04-05T10:43:07+00:00 | LocalDateTime getStartDateTime() | setStartDateTime(LocalDateTime startDateTime) |
| `EndDateTime` | `LocalDateTime` | Required | Date and time at which the statement period ends.<br>All dates in the JSON payloads are represented in ISO 8601 date-time format.<br>All date-time fields in responses must include the timezone. An example is below:<br>2017-04-05T10:43:07+00:00 | LocalDateTime getEndDateTime() | setEndDateTime(LocalDateTime endDateTime) |
| `CreationDateTime` | `LocalDateTime` | Required | Date and time at which the resource was created.<br>All dates in the JSON payloads are represented in ISO 8601 date-time format.<br>All date-time fields in responses must include the timezone. An example is below:<br>2017-04-05T10:43:07+00:00 | LocalDateTime getCreationDateTime() | setCreationDateTime(LocalDateTime creationDateTime) |
| `StatementDescription` | `List<String>` | Optional | Other descriptions that may be available for the statement resource.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `500` | List<String> getStatementDescription() | setStatementDescription(List<String> statementDescription) |
| `StatementBenefit` | [`List<StatementBenefit>`](../../doc/models/statement-benefit.md) | Optional | Set of elements used to provide details of a benefit or reward amount for the statement resource. | List<StatementBenefit> getStatementBenefit() | setStatementBenefit(List<StatementBenefit> statementBenefit) |
| `StatementFee` | [`List<StatementFee>`](../../doc/models/statement-fee.md) | Optional | Set of elements used to provide details of a fee for the statement resource. | List<StatementFee> getStatementFee() | setStatementFee(List<StatementFee> statementFee) |
| `StatementInterest` | [`List<StatementInterest>`](../../doc/models/statement-interest.md) | Optional | Set of elements used to provide details of a generic interest amount related to the statement resource. | List<StatementInterest> getStatementInterest() | setStatementInterest(List<StatementInterest> statementInterest) |
| `StatementDateTime` | [`List<StatementDateTime>`](../../doc/models/statement-date-time.md) | Optional | Set of elements used to provide details of a generic date time for the statement resource. | List<StatementDateTime> getStatementDateTime() | setStatementDateTime(List<StatementDateTime> statementDateTime) |
| `StatementRate` | [`List<StatementRate>`](../../doc/models/statement-rate.md) | Optional | Set of elements used to provide details of a generic rate related to the statement resource. | List<StatementRate> getStatementRate() | setStatementRate(List<StatementRate> statementRate) |
| `StatementValue` | [`List<StatementValue>`](../../doc/models/statement-value.md) | Optional | Set of elements used to provide details of a generic number value related to the statement resource. | List<StatementValue> getStatementValue() | setStatementValue(List<StatementValue> statementValue) |
| `StatementAmount` | [`List<StatementAmount>`](../../doc/models/statement-amount.md) | Optional | Set of elements used to provide details of a generic amount for the statement resource. | List<StatementAmount> getStatementAmount() | setStatementAmount(List<StatementAmount> statementAmount) |

## Example (as JSON)

```json
{
  "AccountId": "AccountId6",
  "StatementId": "StatementId2",
  "StatementReference": "StatementReference0",
  "Type": "AccountOpening",
  "StartDateTime": "2016-03-13T12:52:32.123Z",
  "EndDateTime": "2016-03-13T12:52:32.123Z",
  "CreationDateTime": "2016-03-13T12:52:32.123Z",
  "StatementDescription": [
    "StatementDescription8",
    "StatementDescription9",
    "StatementDescription0"
  ],
  "StatementBenefit": [
    {
      "Amount": {
        "Amount": "Amount0",
        "Currency": "Currency6"
      },
      "Type": "Cashback"
    },
    {
      "Amount": {
        "Amount": "Amount0",
        "Currency": "Currency6"
      },
      "Type": "Cashback"
    }
  ],
  "StatementFee": [
    {
      "Amount": {
        "Amount": "Amount0",
        "Currency": "Currency6"
      },
      "CreditDebitIndicator": "Credit",
      "Type": "ForeignTransaction"
    },
    {
      "Amount": {
        "Amount": "Amount0",
        "Currency": "Currency6"
      },
      "CreditDebitIndicator": "Credit",
      "Type": "ForeignTransaction"
    }
  ]
}
```

