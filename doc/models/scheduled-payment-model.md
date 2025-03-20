
# Scheduled Payment Model

## Structure

`ScheduledPaymentModel`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountId` | `String` | Required | A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `40` | String getAccountId() | setAccountId(String accountId) |
| `ScheduledPaymentId` | `String` | Optional | A unique and immutable identifier used to identify the scheduled payment resource. This identifier has no meaning to the account owner.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `40` | String getScheduledPaymentId() | setScheduledPaymentId(String scheduledPaymentId) |
| `ScheduledPaymentDateTime` | `LocalDateTime` | Required | The date on which the scheduled payment will be made.<br>All dates in the JSON payloads are represented in ISO 8601 date-time format.<br>All date-time fields in responses must include the timezone. An example is below:<br>2017-04-05T10:43:07+00:00 | LocalDateTime getScheduledPaymentDateTime() | setScheduledPaymentDateTime(LocalDateTime scheduledPaymentDateTime) |
| `ScheduledType` | [`ScheduledTypeEnum`](../../doc/models/scheduled-type-enum.md) | Required | Specifies the scheduled payment date type requested | ScheduledTypeEnum getScheduledType() | setScheduledType(ScheduledTypeEnum scheduledType) |
| `InstructedAmount` | [`InstructedAmount`](../../doc/models/instructed-amount.md) | Required | Amount of money of the cash balance after a transaction entry is applied to the account.. | InstructedAmount getInstructedAmount() | setInstructedAmount(InstructedAmount instructedAmount) |
| `Reference` | [`Reference`](../../doc/models/reference.md) | Optional | - | Reference getReference() | setReference(Reference reference) |
| `CreditorAgent` | [`CreditorAgent`](../../doc/models/creditor-agent.md) | Optional | Party that manages the account on behalf of the account owner, that is manages the registration and booking of entries on the account, calculates balances on the account and provides information about the account.<br>This is the servicer of the beneficiary account. | CreditorAgent getCreditorAgent() | setCreditorAgent(CreditorAgent creditorAgent) |
| `CreditorAccount` | [`CreditorAccount`](../../doc/models/creditor-account.md) | Optional | Unambiguous identification of the account of the creditor, in the case of a debit transaction. | CreditorAccount getCreditorAccount() | setCreditorAccount(CreditorAccount creditorAccount) |

## Example (as JSON)

```json
{
  "AccountId": "AccountId8",
  "ScheduledPaymentId": "ScheduledPaymentId6",
  "ScheduledPaymentDateTime": "2016-03-13T12:52:32.123Z",
  "ScheduledType": "Arrival",
  "InstructedAmount": {
    "Amount": "Amount0",
    "Currency": "Currency6"
  },
  "Reference": {
    "CreditorName": "CreditorName6",
    "CreditorReference": {
      "Particulars": "Particulars4",
      "Code": "Code8",
      "Reference": "Reference0"
    },
    "DebtorName": "DebtorName0",
    "DebtorReference": {
      "Particulars": "Particulars8",
      "Code": "Code2",
      "Reference": "Reference4"
    }
  },
  "CreditorAgent": {
    "SchemeName": "BICFI",
    "Identification": "Identification4",
    "Name": "Name4",
    "PostalAddress": {
      "AddressType": "DeliveryTo",
      "AddressLine": [
        "AddressLine3",
        "AddressLine4",
        "AddressLine5"
      ],
      "StreetName": "StreetName2",
      "BuildingNumber": "BuildingNumber6",
      "PostCode": "PostCode6",
      "Country": "Country6"
    }
  },
  "CreditorAccount": {
    "SchemeName": "BECSElectronicCredit",
    "Identification": "Identification2",
    "Name": "Name8",
    "SecondaryIdentification": "SecondaryIdentification4"
  }
}
```

