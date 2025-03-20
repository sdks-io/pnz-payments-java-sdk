
# Offer Model

## Structure

`OfferModel`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountId` | `String` | Required | A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `40` | String getAccountId() | setAccountId(String accountId) |
| `OfferId` | `String` | Optional | A unique and immutable identifier used to identify the offer resource. This identifier has no meaning to the account owner.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `40` | String getOfferId() | setOfferId(String offerId) |
| `OfferType` | [`OfferTypeEnum`](../../doc/models/offer-type-enum.md) | Optional | Offer type, in a coded form. | OfferTypeEnum getOfferType() | setOfferType(OfferTypeEnum offerType) |
| `Description` | `String` | Optional | Further details of the offer.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `500` | String getDescription() | setDescription(String description) |
| `StartDateTime` | `LocalDateTime` | Optional | Date and time at which the offer starts.<br>All dates in the JSON payloads are represented in ISO 8601 date-time format.<br>All date-time fields in responses must include the timezone. An example is below:<br>2017-04-05T10:43:07+00:00 | LocalDateTime getStartDateTime() | setStartDateTime(LocalDateTime startDateTime) |
| `EndDateTime` | `LocalDateTime` | Optional | Date and time at which the offer ends.<br>All dates in the JSON payloads are represented in ISO 8601 date-time format.<br>All date-time fields in responses must include the timezone. An example is below:<br>2017-04-05T10:43:07+00:00 | LocalDateTime getEndDateTime() | setEndDateTime(LocalDateTime endDateTime) |
| `Amount` | [`Amount`](../../doc/models/amount.md) | Optional | Amount of money of the cash balance. | Amount getAmount() | setAmount(Amount amount) |
| `Fee` | [`Fee`](../../doc/models/fee.md) | Optional | Fee associated with the offer type. | Fee getFee() | setFee(Fee fee) |
| `Rate` | `String` | Optional | Rate associated with the offer type.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `10`, *Pattern*: `^(-?\d{1,3}){1}(\.\d{1,4}){0,1}$` | String getRate() | setRate(String rate) |
| `Value` | `Integer` | Optional | Value associated with the offer type. | Integer getValue() | setValue(Integer value) |
| `Term` | `String` | Optional | Further details of the term of the offer.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `500` | String getTerm() | setTerm(String term) |
| `URL` | `String` | Optional | URL (Uniform Resource Locator) where the document can be found<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `256` | String getURL() | setURL(String uRL) |

## Example (as JSON)

```json
{
  "AccountId": "AccountId4",
  "OfferId": "OfferId6",
  "OfferType": "Other",
  "Description": "Description8",
  "StartDateTime": "2016-03-13T12:52:32.123Z",
  "EndDateTime": "2016-03-13T12:52:32.123Z"
}
```

