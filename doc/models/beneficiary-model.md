
# Beneficiary Model

## Structure

`BeneficiaryModel`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountId` | `String` | Required | A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `40` | String getAccountId() | setAccountId(String accountId) |
| `BeneficiaryId` | `String` | Optional | A unique and immutable identifier used to identify the beneficiary resource. This identifier has no meaning to the account owner.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `40` | String getBeneficiaryId() | setBeneficiaryId(String beneficiaryId) |
| `Reference` | [`Reference`](../../doc/models/reference.md) | Optional | - | Reference getReference() | setReference(Reference reference) |
| `CreditorAgent` | [`CreditorAgent`](../../doc/models/creditor-agent.md) | Optional | Party that manages the account on behalf of the account owner, that is manages the registration and booking of entries on the account, calculates balances on the account and provides information about the account.<br>This is the servicer of the beneficiary account. | CreditorAgent getCreditorAgent() | setCreditorAgent(CreditorAgent creditorAgent) |
| `CreditorAccount` | [`CreditorAccount`](../../doc/models/creditor-account.md) | Optional | Unambiguous identification of the account of the creditor, in the case of a debit transaction. | CreditorAccount getCreditorAccount() | setCreditorAccount(CreditorAccount creditorAccount) |

## Example (as JSON)

```json
{
  "AccountId": "AccountId4",
  "BeneficiaryId": "BeneficiaryId0",
  "Reference": {
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
  },
  "CreditorAgent": {
    "SchemeName": "BICFI",
    "Identification": "Identification4",
    "Name": "Name4",
    "PostalAddress": {
      "AddressType": "DeliveryTo",
      "AddressLine": [
        "AddressLine3",
        "AddressLine4",
        "AddressLine5"
      ],
      "StreetName": "StreetName2",
      "BuildingNumber": "BuildingNumber6",
      "PostCode": "PostCode6",
      "Country": "Country6"
    }
  },
  "CreditorAccount": {
    "SchemeName": "BECSElectronicCredit",
    "Identification": "Identification2",
    "Name": "Name8",
    "SecondaryIdentification": "SecondaryIdentification4"
  }
}
```

