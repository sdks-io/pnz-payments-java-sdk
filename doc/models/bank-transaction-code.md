
# Bank Transaction Code

Set of elements used to fully identify the type of underlying transaction resulting in an entry.

## Structure

`BankTransactionCode`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Code` | `String` | Required | Specifies the family within a domain. | String getCode() | setCode(String code) |
| `SubCode` | `String` | Required | Specifies the sub-product family within a specific family. | String getSubCode() | setSubCode(String subCode) |

## Example (as JSON)

```json
{
  "Code": "Code4",
  "SubCode": "SubCode0"
}
```

