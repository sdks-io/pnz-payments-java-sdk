
# Credit Line

## Structure

`CreditLine`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Included` | `boolean` | Required | Indicates whether or not the credit line is included in the balance of the account. Usage: If not present, credit line is not included in the balance amount of the account. | boolean getIncluded() | setIncluded(boolean included) |
| `Amount` | [`Amount`](../../doc/models/amount.md) | Optional | Amount of money of the cash balance. | Amount getAmount() | setAmount(Amount amount) |
| `Type` | [`CreditLineTypeEnum`](../../doc/models/credit-line-type-enum.md) | Optional | Limit type, in a coded form. | CreditLineTypeEnum getType() | setType(CreditLineTypeEnum type) |

## Example (as JSON)

```json
{
  "Included": false,
  "Amount": {
    "Amount": "Amount0",
    "Currency": "Currency6"
  },
  "Type": "Temporary"
}
```

