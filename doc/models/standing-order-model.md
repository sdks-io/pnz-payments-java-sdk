
# Standing Order Model

## Structure

`StandingOrderModel`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountId` | `String` | Required | A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `40` | String getAccountId() | setAccountId(String accountId) |
| `StandingOrderId` | `String` | Optional | A unique and immutable identifier used to identify the standing order resource. This identifier has no meaning to the account owner.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `40` | String getStandingOrderId() | setStandingOrderId(String standingOrderId) |
| `Frequency` | `String` | Required | EvryDay - Every day<br>EvryWorkgDay - Every working day<br>IntrvlWkDay - An interval specified in weeks (01 to 09), and the day within the week (01 to 07)<br>WkInMnthDay - A monthly interval, specifying the week of the month (01 to 05) and day within the week (01 to 07)<br>IntrvlMnthDay - An interval specified in months (between 01 to 06, 12, 24), specifying the day within the month (-5 to -1, 1 to 31)<br><br>Patterns:<br>EvryDay (ScheduleCode)<br>EvryWorkgDay (ScheduleCode)<br>IntrvlWkDay:IntervalInWeeks:DayInWeek (ScheduleCode + IntervalInWeeks + DayInWeek)<br>WkInMnthDay:WeekInMonth:DayInWeek (ScheduleCode + WeekInMonth + DayInWeek)<br>IntrvlMnthDay:IntervalInMonths:DayInMonth (ScheduleCode + IntervalInMonths + DayInMonth)<br><br>The regular expression for this element combines five smaller versions for each permitted pattern. To aid legibility - the components are presented individually here:<br>EvryDay<br>EvryWorkgDay<br>IntrvlWkDay:0[1-9]:0[1-7]<br>WkInMnthDay:0[1-5]:0[1-7]<br>IntrvlMnthDay:(0[1-6]\|12\|24):(-0[1-5]\|0[1-9]\|[12][0-9]\|3[01])<br>**Constraints**: *Pattern*: `^(EvryDay)$\|^(EvryWorkgDay)$\|^(IntrvlWkDay:0[1-9]:0[1-7])$\|^(WkInMnthDay:0[1-5]:0[1-7])$\|^(IntrvlMnthDay:(0[1-6]\|12\|24):(-0[1-5]\|0[1-9]\|[12][0-9]\|3[01]))$` | String getFrequency() | setFrequency(String frequency) |
| `Reference` | [`Reference`](../../doc/models/reference.md) | Optional | - | Reference getReference() | setReference(Reference reference) |
| `FirstPaymentDateTime` | `LocalDateTime` | Optional | The date on which the first payment for a Standing Order schedule will be made.<br>All dates in the JSON payloads are represented in ISO 8601 date-time format.<br>All date-time fields in responses must include the timezone. An example is below:<br>2017-04-05T10:43:07+00:00 | LocalDateTime getFirstPaymentDateTime() | setFirstPaymentDateTime(LocalDateTime firstPaymentDateTime) |
| `FirstPaymentAmount` | [`FirstPaymentAmount`](../../doc/models/first-payment-amount.md) | Optional | The amount of the first Standing Order | FirstPaymentAmount getFirstPaymentAmount() | setFirstPaymentAmount(FirstPaymentAmount firstPaymentAmount) |
| `NextPaymentDateTime` | `LocalDateTime` | Required | The date on which the next payment for a Standing Order schedule will be made.<br>All dates in the JSON payloads are represented in ISO 8601 date-time format.<br>All date-time fields in responses must include the timezone. An example is below:<br>2017-04-05T10:43:07+00:00 | LocalDateTime getNextPaymentDateTime() | setNextPaymentDateTime(LocalDateTime nextPaymentDateTime) |
| `NextPaymentAmount` | [`NextPaymentAmount`](../../doc/models/next-payment-amount.md) | Required | The amount of the next Standing Order | NextPaymentAmount getNextPaymentAmount() | setNextPaymentAmount(NextPaymentAmount nextPaymentAmount) |
| `FinalPaymentDateTime` | `LocalDateTime` | Optional | The date on which the final payment for a Standing Order schedule will be made.<br>All dates in the JSON payloads are represented in ISO 8601 date-time format.<br>All date-time fields in responses must include the timezone. An example is below:<br>2017-04-05T10:43:07+00:00 | LocalDateTime getFinalPaymentDateTime() | setFinalPaymentDateTime(LocalDateTime finalPaymentDateTime) |
| `FinalPaymentAmount` | [`FinalPaymentAmount`](../../doc/models/final-payment-amount.md) | Optional | The amount of the final Standing Order | FinalPaymentAmount getFinalPaymentAmount() | setFinalPaymentAmount(FinalPaymentAmount finalPaymentAmount) |
| `StandingOrderStatusCode` | [`StandingOrderStatusCodeEnum`](../../doc/models/standing-order-status-code-enum.md) | Optional | Specifies the status of the standing order in code form. | StandingOrderStatusCodeEnum getStandingOrderStatusCode() | setStandingOrderStatusCode(StandingOrderStatusCodeEnum standingOrderStatusCode) |
| `CreditorAgent` | [`CreditorAgent`](../../doc/models/creditor-agent.md) | Optional | Party that manages the account on behalf of the account owner, that is manages the registration and booking of entries on the account, calculates balances on the account and provides information about the account.<br>This is the servicer of the beneficiary account. | CreditorAgent getCreditorAgent() | setCreditorAgent(CreditorAgent creditorAgent) |
| `CreditorAccount` | [`CreditorAccount`](../../doc/models/creditor-account.md) | Optional | Unambiguous identification of the account of the creditor, in the case of a debit transaction. | CreditorAccount getCreditorAccount() | setCreditorAccount(CreditorAccount creditorAccount) |

## Example (as JSON)

```json
{
  "AccountId": "AccountId6",
  "StandingOrderId": "StandingOrderId0",
  "Frequency": "Frequency8",
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
  "FirstPaymentDateTime": "2016-03-13T12:52:32.123Z",
  "FirstPaymentAmount": {
    "Amount": "Amount0",
    "Currency": "Currency6"
  },
  "NextPaymentDateTime": "2016-03-13T12:52:32.123Z",
  "NextPaymentAmount": {
    "Amount": "Amount6",
    "Currency": "Currency2"
  },
  "FinalPaymentDateTime": "2016-03-13T12:52:32.123Z"
}
```

