
# Account Access Consent Response Model

## Structure

`AccountAccessConsentResponseModel`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ConsentId` | `String` | Required | Unique identification as assigned to identify the account access consent.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `128` | String getConsentId() | setConsentId(String consentId) |
| `Status` | [`AccountAccessStatusEnum`](../../doc/models/account-access-status-enum.md) | Required | Specifies the status of the account access consent. | AccountAccessStatusEnum getStatus() | setStatus(AccountAccessStatusEnum status) |
| `CreationDateTime` | `LocalDateTime` | Required | Date and time at which the consent was created.<br>All dates in the JSON payloads are represented in ISO 8601 date-time format.<br>All date-time fields in responses must include the timezone. An example is below:<br>2017-04-05T10:43:07+00:00 | LocalDateTime getCreationDateTime() | setCreationDateTime(LocalDateTime creationDateTime) |
| `StatusUpdateDateTime` | `LocalDateTime` | Required | Date and time at which the consent status was updated.<br>All dates in the JSON payloads are represented in ISO 8601 date-time format.<br>All date-time fields in responses must include the timezone. An example is below:<br>2017-04-05T10:43:07+00:00 | LocalDateTime getStatusUpdateDateTime() | setStatusUpdateDateTime(LocalDateTime statusUpdateDateTime) |
| `Consent` | [`Consent`](../../doc/models/consent.md) | Required | Contains the requested consent | Consent getConsent() | setConsent(Consent consent) |

## Example (as JSON)

```json
{
  "ConsentId": "ConsentId2",
  "Status": "Authorised",
  "CreationDateTime": "2016-03-13T12:52:32.123Z",
  "StatusUpdateDateTime": "2016-03-13T12:52:32.123Z",
  "Consent": {
    "Permissions": [
      "ReadStandingOrdersDetail"
    ],
    "ExpirationDateTime": "2016-03-13T12:52:32.123Z",
    "TransactionFromDateTime": "2016-03-13T12:52:32.123Z",
    "TransactionToDateTime": "2016-03-13T12:52:32.123Z"
  }
}
```

