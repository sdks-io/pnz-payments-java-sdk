
# Meta Data

Meta Data relevant to the payload

## Structure

`MetaData`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TotalPages` | `Integer` | Optional | - | Integer getTotalPages() | setTotalPages(Integer totalPages) |
| `FirstAvailableDateTime` | `LocalDateTime` | Optional | All dates in the JSON payloads are represented in ISO 8601 date-time format.<br>All date-time fields in responses must include the timezone. An example is below:<br>2017-04-05T10:43:07+00:00 | LocalDateTime getFirstAvailableDateTime() | setFirstAvailableDateTime(LocalDateTime firstAvailableDateTime) |
| `LastAvailableDateTime` | `LocalDateTime` | Optional | All dates in the JSON payloads are represented in ISO 8601 date-time format.<br>All date-time fields in responses must include the timezone. An example is below:<br>2017-04-05T10:43:07+00:00 | LocalDateTime getLastAvailableDateTime() | setLastAvailableDateTime(LocalDateTime lastAvailableDateTime) |

## Example (as JSON)

```json
{
  "TotalPages": 8,
  "FirstAvailableDateTime": "2016-03-13T12:52:32.123Z",
  "LastAvailableDateTime": "2016-03-13T12:52:32.123Z"
}
```

