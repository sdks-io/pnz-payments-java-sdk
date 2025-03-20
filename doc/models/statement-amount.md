
# Statement Amount

Set of elements used to provide details of a generic amount for the statement resource.

## Structure

`StatementAmount`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Amount` | [`Amount`](../../doc/models/amount.md) | Required | Amount of money of the cash balance. | Amount getAmount() | setAmount(Amount amount) |
| `CreditDebitIndicator` | [`CreditDebitIndicatorEnum`](../../doc/models/credit-debit-indicator-enum.md) | Required | Indicates whether the balance is a credit or a debit balance. Usage: A zero balance is considered to be a credit balance. | CreditDebitIndicatorEnum getCreditDebitIndicator() | setCreditDebitIndicator(CreditDebitIndicatorEnum creditDebitIndicator) |
| `Type` | [`StatementAmountTypeEnum`](../../doc/models/statement-amount-type-enum.md) | Required | Amount type, in a coded form. | StatementAmountTypeEnum getType() | setType(StatementAmountTypeEnum type) |

## Example (as JSON)

```json
{
  "Amount": {
    "Amount": "Amount0",
    "Currency": "Currency6"
  },
  "CreditDebitIndicator": "Credit",
  "Type": "CashClosingBalance"
}
```

