
# Beneficiaries Response Data

## Structure

`BeneficiariesResponseData`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Beneficiary` | [`List<BeneficiaryModel>`](../../doc/models/beneficiary-model.md) | Optional | Beneficiary | List<BeneficiaryModel> getBeneficiary() | setBeneficiary(List<BeneficiaryModel> beneficiary) |

## Example (as JSON)

```json
{
  "Beneficiary": [
    {
      "AccountId": "AccountId6",
      "BeneficiaryId": "BeneficiaryId2",
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
    },
    {
      "AccountId": "AccountId6",
      "BeneficiaryId": "BeneficiaryId2",
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
    },
    {
      "AccountId": "AccountId6",
      "BeneficiaryId": "BeneficiaryId2",
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
  ]
}
```

