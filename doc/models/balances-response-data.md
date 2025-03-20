
# Balances Response Data

## Structure

`BalancesResponseData`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Balance` | [`List<BalanceModel>`](../../doc/models/balance-model.md) | Required | Balance | List<BalanceModel> getBalance() | setBalance(List<BalanceModel> balance) |

## Example (as JSON)

```json
{
  "Balance": [
    {
      "AccountId": "AccountId0",
      "Amount": {
        "Amount": "Amount0",
        "Currency": "Currency6"
      },
      "CreditDebitIndicator": "Credit",
      "Type": "ClosingAvailable",
      "DateTime": "2016-03-13T12:52:32.123Z",
      "CreditLine": [
        {
          "Included": false,
          "Amount": {
            "Amount": "Amount0",
            "Currency": "Currency6"
          },
          "Type": "Temporary"
        }
      ]
    }
  ]
}
```

