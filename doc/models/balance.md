
# Balance

Set of elements used to define the balance as a numerical representation of the net increases and decreases in an account after a transaction entry is applied to the account.

## Structure

`Balance`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Amount` | [`Amount`](../../doc/models/amount.md) | Required | Amount of money of the cash balance. | Amount getAmount() | setAmount(Amount amount) |
| `CreditDebitIndicator` | [`CreditDebitIndicatorEnum`](../../doc/models/credit-debit-indicator-enum.md) | Required | Indicates whether the balance is a credit or a debit balance. Usage: A zero balance is considered to be a credit balance. | CreditDebitIndicatorEnum getCreditDebitIndicator() | setCreditDebitIndicator(CreditDebitIndicatorEnum creditDebitIndicator) |
| `Type` | [`BalanceModelTypeEnum`](../../doc/models/balance-model-type-enum.md) | Required | Balance type, in a coded form. | BalanceModelTypeEnum getType() | setType(BalanceModelTypeEnum type) |

## Example (as JSON)

```json
{
  "Amount": {
    "Amount": "Amount0",
    "Currency": "Currency6"
  },
  "CreditDebitIndicator": "Credit",
  "Type": "ClosingAvailable"
}
```

