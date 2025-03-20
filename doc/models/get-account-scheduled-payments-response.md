
# Get Account Scheduled Payments Response

## Structure

`GetAccountScheduledPaymentsResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Data` | [`GetScheduledPaymentsResponseData`](../../doc/models/get-scheduled-payments-response-data.md) | Required | - | GetScheduledPaymentsResponseData getData() | setData(GetScheduledPaymentsResponseData data) |
| `Links` | [`Links`](../../doc/models/links.md) | Required | Links relevant to the payload | Links getLinks() | setLinks(Links links) |
| `Meta` | [`Meta`](../../doc/models/meta.md) | Required | - | Meta getMeta() | setMeta(Meta meta) |

## Example (as JSON)

```json
{
  "Data": {
    "ScheduledPayment": [
      {
        "AccountId": "AccountId0",
        "ScheduledPaymentId": "ScheduledPaymentId8",
        "ScheduledPaymentDateTime": "2016-03-13T12:52:32.123Z",
        "ScheduledType": "Arrival",
        "InstructedAmount": {
          "Amount": "Amount0",
          "Currency": "Currency6"
        },
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
        "AccountId": "AccountId0",
        "ScheduledPaymentId": "ScheduledPaymentId8",
        "ScheduledPaymentDateTime": "2016-03-13T12:52:32.123Z",
        "ScheduledType": "Arrival",
        "InstructedAmount": {
          "Amount": "Amount0",
          "Currency": "Currency6"
        },
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
        "AccountId": "AccountId0",
        "ScheduledPaymentId": "ScheduledPaymentId8",
        "ScheduledPaymentDateTime": "2016-03-13T12:52:32.123Z",
        "ScheduledType": "Arrival",
        "InstructedAmount": {
          "Amount": "Amount0",
          "Currency": "Currency6"
        },
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

