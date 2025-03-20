
# Statement Value

Set of elements used to provide details of a generic number value related to the statement resource.

## Structure

`StatementValue`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Value` | `int` | Required | Value associated with the statement value type. | int getValue() | setValue(int value) |
| `Type` | [`StatementValueTypeEnum`](../../doc/models/statement-value-type-enum.md) | Required | Statement value type, in a coded form. | StatementValueTypeEnum getType() | setType(StatementValueTypeEnum type) |

## Example (as JSON)

```json
{
  "Value": 184,
  "Type": "Credits"
}
```

