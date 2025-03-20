
# Transaction Reference

## Structure

`TransactionReference`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CreditorName` | `String` | Required | **Constraints**: *Maximum Length*: `20` | String getCreditorName() | setCreditorName(String creditorName) |
| `CreditorReference` | [`CreditorReference`](../../doc/models/creditor-reference.md) | Optional | - | CreditorReference getCreditorReference() | setCreditorReference(CreditorReference creditorReference) |
| `DebtorName` | `String` | Optional | **Constraints**: *Maximum Length*: `20` | String getDebtorName() | setDebtorName(String debtorName) |
| `DebtorReference` | [`CreditorReference`](../../doc/models/creditor-reference.md) | Optional | - | CreditorReference getDebtorReference() | setDebtorReference(CreditorReference debtorReference) |

## Example (as JSON)

```json
{
  "CreditorName": "CreditorName2",
  "CreditorReference": {
    "Particulars": "Particulars4",
    "Code": "Code8",
    "Reference": "Reference0"
  },
  "DebtorName": "DebtorName4",
  "DebtorReference": {
    "Particulars": "Particulars8",
    "Code": "Code2",
    "Reference": "Reference4"
  }
}
```

