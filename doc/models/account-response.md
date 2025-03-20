
# Account Response

## Structure

`AccountResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Data` | [`AccountResponseData`](../../doc/models/account-response-data.md) | Required | - | AccountResponseData getData() | setData(AccountResponseData data) |
| `Links` | [`Links`](../../doc/models/links.md) | Required | Links relevant to the payload | Links getLinks() | setLinks(Links links) |
| `Meta` | [`Meta`](../../doc/models/meta.md) | Required | - | Meta getMeta() | setMeta(Meta meta) |

## Example (as JSON)

```json
{
  "Data": {
    "Account": [
      {
        "AccountId": "AccountId8",
        "Currency": "Currency6",
        "AccountType": "Business",
        "AccountSubType": "PrePaidCard",
        "Description": "Description8",
        "Nickname": "Nickname0",
        "Account": {
          "SchemeName": "BECSElectronicCredit",
          "Identification": "Identification2",
          "Name": "Name8",
          "SecondaryIdentification": "SecondaryIdentification4"
        },
        "Servicer": {
          "SchemeName": "SchemeName4",
          "Identification": "Identification6"
        }
      },
      {
        "AccountId": "AccountId8",
        "Currency": "Currency6",
        "AccountType": "Business",
        "AccountSubType": "PrePaidCard",
        "Description": "Description8",
        "Nickname": "Nickname0",
        "Account": {
          "SchemeName": "BECSElectronicCredit",
          "Identification": "Identification2",
          "Name": "Name8",
          "SecondaryIdentification": "SecondaryIdentification4"
        },
        "Servicer": {
          "SchemeName": "SchemeName4",
          "Identification": "Identification6"
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

