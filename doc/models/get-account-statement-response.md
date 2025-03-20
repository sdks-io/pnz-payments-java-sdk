
# Get Account Statement Response

## Structure

`GetAccountStatementResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Data` | [`GetAccountStatementResponseData`](../../doc/models/get-account-statement-response-data.md) | Required | - | GetAccountStatementResponseData getData() | setData(GetAccountStatementResponseData data) |
| `Links` | [`Links`](../../doc/models/links.md) | Required | Links relevant to the payload | Links getLinks() | setLinks(Links links) |
| `Meta` | [`Meta`](../../doc/models/meta.md) | Required | - | Meta getMeta() | setMeta(Meta meta) |

## Example (as JSON)

```json
{
  "Data": {
    "Statement": {
      "AccountId": "AccountId6",
      "StatementId": "StatementId2",
      "StatementReference": "StatementReference0",
      "Type": "AccountOpening",
      "StartDateTime": "2016-03-13T12:52:32.123Z",
      "EndDateTime": "2016-03-13T12:52:32.123Z",
      "CreationDateTime": "2016-03-13T12:52:32.123Z",
      "StatementDescription": [
        "StatementDescription8",
        "StatementDescription9",
        "StatementDescription0"
      ],
      "StatementBenefit": [
        {
          "Amount": {
            "Amount": "Amount0",
            "Currency": "Currency6"
          },
          "Type": "Cashback"
        },
        {
          "Amount": {
            "Amount": "Amount0",
            "Currency": "Currency6"
          },
          "Type": "Cashback"
        }
      ],
      "StatementFee": [
        {
          "Amount": {
            "Amount": "Amount0",
            "Currency": "Currency6"
          },
          "CreditDebitIndicator": "Credit",
          "Type": "ForeignTransaction"
        },
        {
          "Amount": {
            "Amount": "Amount0",
            "Currency": "Currency6"
          },
          "CreditDebitIndicator": "Credit",
          "Type": "ForeignTransaction"
        }
      ]
    }
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

