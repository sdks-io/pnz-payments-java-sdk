
# Statement Date Time

Set of elements used to provide details of a generic date time for the statement resource.

## Structure

`StatementDateTime`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DateTime` | `LocalDateTime` | Required | Date and time associated with the date time type.<br>All dates in the JSON payloads are represented in ISO 8601 date-time format.<br>All date-time fields in responses must include the timezone. An example is below:<br>2017-04-05T10:43:07+00:00 | LocalDateTime getDateTime() | setDateTime(LocalDateTime dateTime) |
| `Type` | [`StatementDateTimeTypeEnum`](../../doc/models/statement-date-time-type-enum.md) | Required | Date time type, in a coded form. | StatementDateTimeTypeEnum getType() | setType(StatementDateTimeTypeEnum type) |

## Example (as JSON)

```json
{
  "DateTime": "2016-03-13T12:52:32.123Z",
  "Type": "LastPayment"
}
```

