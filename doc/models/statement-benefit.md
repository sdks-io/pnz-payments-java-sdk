
# Statement Benefit

Set of elements used to provide details of a benefit or reward amount for the statement resource.

## Structure

`StatementBenefit`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Amount` | [`Amount`](../../doc/models/amount.md) | Required | Amount of money of the cash balance. | Amount getAmount() | setAmount(Amount amount) |
| `Type` | [`StatementBenefitTypeEnum`](../../doc/models/statement-benefit-type-enum.md) | Required | Benefit type, in a coded form. | StatementBenefitTypeEnum getType() | setType(StatementBenefitTypeEnum type) |

## Example (as JSON)

```json
{
  "Amount": {
    "Amount": "Amount0",
    "Currency": "Currency6"
  },
  "Type": "Cashback"
}
```

