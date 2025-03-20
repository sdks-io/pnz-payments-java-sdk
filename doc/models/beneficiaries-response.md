
# Beneficiaries Response

## Structure

`BeneficiariesResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Data` | [`BeneficiariesResponseData`](../../doc/models/beneficiaries-response-data.md) | Required | - | BeneficiariesResponseData getData() | setData(BeneficiariesResponseData data) |
| `Links` | [`Links`](../../doc/models/links.md) | Required | Links relevant to the payload | Links getLinks() | setLinks(Links links) |
| `Meta` | [`Meta`](../../doc/models/meta.md) | Required | - | Meta getMeta() | setMeta(Meta meta) |

## Example (as JSON)

```json
{
  "Data": {
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
      }
    ]
  },
  "Links": {
    "Self": "Self2",
    "First": "First0",
    "Prev": "Prev6",
    "Next": "Next0",
    "Last": "Last4"
  },
  "Meta": {
    "TotalPages": 96,
    "FirstAvailableDateTime": "2016-03-13T12:52:32.123Z",
    "LastAvailableDateTime": "2016-03-13T12:52:32.123Z"
  }
}
```

