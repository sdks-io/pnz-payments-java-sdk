
# BECS Remittance

Unique reference, as assigned by the creditor, to unambiguously refer to the payment transaction. Usage: If available, the initiating party should provide this reference in the structured remittance information, to enable reconciliation by the creditor upon receipt of the amount of money. If the business context requires the use of a creditor reference or a payment remit identification, and only one identifier can be passed through the end-to-end chain, the creditor's reference or payment remittance identification should be quoted in the end-to-end transaction identification.
NZ - Remittance information for use with BECS Electronic Credit payment scheme. The Particulars, Code and Reference fields are currently constrained by providers.  The design choice has been made not to constrain through schema restrictions, to allow for future changes that remove the constraint. Note that not all banks will accept all valid characters, in which case a descriptive 400 Bad Request will be returned. Constraining to a-z, A-Z, - (dash) and 0-9 is advised. One example is abc-XYZ-123

## Structure

`BECSRemittance`

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
  "CreditorName": "CreditorName6",
  "CreditorReference": {
    "Particulars": "Particulars4",
    "Code": "Code8",
    "Reference": "Reference0"
  },
  "DebtorName": "DebtorName0",
  "DebtorReference": {
    "Particulars": "Particulars8",
    "Code": "Code2",
    "Reference": "Reference4"
  }
}
```

