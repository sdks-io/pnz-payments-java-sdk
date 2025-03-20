
# Consent

Contains the requested consent

## Structure

`Consent`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Permissions` | [`List<PermissionEnum>`](../../doc/models/permission-enum.md) | Required | Specifies the Open Banking account access consent types. This is a list of the data clusters being consented by the Customer, and requested for authorisation with the API Provider. | List<PermissionEnum> getPermissions() | setPermissions(List<PermissionEnum> permissions) |
| `ExpirationDateTime` | `LocalDateTime` | Optional | Specified date and time the permissions will expire. If this is not populated, the permissions will be open ended.<br>All dates in the JSON payloads are represented in ISO 8601 date-time format.<br>All date-time fields in responses must include the timezone. An example is below:<br>2017-04-05T10:43:07+00:00 | LocalDateTime getExpirationDateTime() | setExpirationDateTime(LocalDateTime expirationDateTime) |
| `TransactionFromDateTime` | `LocalDateTime` | Optional | Specified start date and time for the transaction query period. If this is not populated, the start date will be open ended, and data will be returned from the earliest available transaction.<br>All dates in the JSON payloads are represented in ISO 8601 date-time format.<br>All date-time fields in responses must include the timezone. An example is below:<br>2017-04-05T10:43:07+00:00 | LocalDateTime getTransactionFromDateTime() | setTransactionFromDateTime(LocalDateTime transactionFromDateTime) |
| `TransactionToDateTime` | `LocalDateTime` | Optional | Specified end date and time for the transaction query period. If this is not populated, the end date will be open ended, and data will be returned to the latest available transaction.<br>All dates in the JSON payloads are represented in ISO 8601 date-time format.<br>All date-time fields in responses must include the timezone. An example is below:<br>2017-04-05T10:43:07+00:00 | LocalDateTime getTransactionToDateTime() | setTransactionToDateTime(LocalDateTime transactionToDateTime) |

## Example (as JSON)

```json
{
  "Permissions": [
    "ReadStandingOrdersDetail"
  ],
  "ExpirationDateTime": "2016-03-13T12:52:32.123Z",
  "TransactionFromDateTime": "2016-03-13T12:52:32.123Z",
  "TransactionToDateTime": "2016-03-13T12:52:32.123Z"
}
```

