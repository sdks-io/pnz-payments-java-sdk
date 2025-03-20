
# Accounts Transactions 400 Error Exception

## Structure

`AccountsTransactions400ErrorException`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Code` | `String` | Required | High level textual error code to help categorise the errors.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `128` | String getCode() | setCode(String code) |
| `Id` | `String` | Optional | A unique reference for the error instance, for audit purposes, in case of unknown/unclassified errors.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `128` | String getId() | setId(String id) |
| `Message` | `String` | Required | Brief Error message. E.g., 'There is something wrong with the request parameters provided'<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `500` | String getMessageField() | setMessageField(String messageField) |
| `Errors` | [`List<Error>`](../../doc/models/error.md) | Required | **Constraints**: *Minimum Items*: `1` | List<Error> getErrors() | setErrors(List<Error> errors) |

## Example (as JSON)

```json
{
  "Code": "Code8",
  "Message": "Message4",
  "Errors": [
    {
      "ErrorCode": "Reauthorise",
      "Message": "Message0",
      "Path": "Path2",
      "Url": "Url8"
    }
  ],
  "Id": "Id4"
}
```

