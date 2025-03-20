
# Direct Debit Model

## Structure

`DirectDebitModel`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountId` | `String` | Required | A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `40` | String getAccountId() | setAccountId(String accountId) |
| `DirectDebitId` | `String` | Optional | A unique and immutable identifier used to identify the direct debit resource. This identifier has no meaning to the account owner.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `40` | String getDirectDebitId() | setDirectDebitId(String directDebitId) |
| `MandateIdentification` | `String` | Required | Direct Debit reference.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `35` | String getMandateIdentification() | setMandateIdentification(String mandateIdentification) |
| `DirectDebitStatusCode` | [`DirectDebitStatusCodeEnum`](../../doc/models/direct-debit-status-code-enum.md) | Optional | Specifies the status of the direct debit in code form. | DirectDebitStatusCodeEnum getDirectDebitStatusCode() | setDirectDebitStatusCode(DirectDebitStatusCodeEnum directDebitStatusCode) |
| `Name` | `String` | Required | Name of Service User<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `70` | String getName() | setName(String name) |
| `PreviousPaymentDateTime` | `LocalDateTime` | Optional | Date of most recent direct debit collection.<br>All dates in the JSON payloads are represented in ISO 8601 date-time format.<br>All date-time fields in responses must include the timezone. An example is below:<br>2017-04-05T10:43:07+00:00 | LocalDateTime getPreviousPaymentDateTime() | setPreviousPaymentDateTime(LocalDateTime previousPaymentDateTime) |
| `PreviousPaymentAmount` | [`PreviousPaymentAmount`](../../doc/models/previous-payment-amount.md) | Optional | The amount of the most recent direct debit collection. | PreviousPaymentAmount getPreviousPaymentAmount() | setPreviousPaymentAmount(PreviousPaymentAmount previousPaymentAmount) |

## Example (as JSON)

```json
{
  "AccountId": "AccountId6",
  "DirectDebitId": "DirectDebitId4",
  "MandateIdentification": "MandateIdentification0",
  "DirectDebitStatusCode": "Active",
  "Name": "Name4",
  "PreviousPaymentDateTime": "2016-03-13T12:52:32.123Z",
  "PreviousPaymentAmount": {
    "Amount": "Amount0",
    "Currency": "Currency6"
  }
}
```

