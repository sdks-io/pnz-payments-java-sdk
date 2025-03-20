
# Error

## Structure

`Error`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ErrorCode` | [`ErrorCodeEnum`](../../doc/models/error-code-enum.md) | Required | Low level textual error code. | ErrorCodeEnum getErrorCode() | setErrorCode(ErrorCodeEnum errorCode) |
| `Message` | `String` | Required | A free text description of the error that occurred. E.g., 'A mandatory field isn't supplied'.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `500` | String getMessage() | setMessage(String message) |
| `Path` | `String` | Optional | A recommended but optional reference to the JSON Path of the field with error, e.g., Data.Consent.InstructedAmount.Currency<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `500` | String getPath() | setPath(String path) |
| `Url` | `String` | Optional | URL to help remediate the problem, provide more information or to API Reference. | String getUrl() | setUrl(String url) |

## Example (as JSON)

```json
{
  "ErrorCode": "Reauthorise",
  "Message": "Message0",
  "Path": "Path2",
  "Url": "Url8"
}
```

