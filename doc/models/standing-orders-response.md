
# Standing Orders Response

## Structure

`StandingOrdersResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Data` | [`StandingOrdersResponseData`](../../doc/models/standing-orders-response-data.md) | Required | - | StandingOrdersResponseData getData() | setData(StandingOrdersResponseData data) |
| `Links` | [`Links`](../../doc/models/links.md) | Required | Links relevant to the payload | Links getLinks() | setLinks(Links links) |
| `Meta` | [`Meta`](../../doc/models/meta.md) | Required | - | Meta getMeta() | setMeta(Meta meta) |

## Example (as JSON)

```json
{
  "Data": {
    "StandingOrder": [
      {
        "AccountId": "AccountId8",
        "StandingOrderId": "StandingOrderId2",
        "Frequency": "Frequency0",
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
        "FirstPaymentDateTime": "2016-03-13T12:52:32.123Z",
        "FirstPaymentAmount": {
          "Amount": "Amount0",
          "Currency": "Currency6"
        },
        "NextPaymentDateTime": "2016-03-13T12:52:32.123Z",
        "NextPaymentAmount": {
          "Amount": "Amount6",
          "Currency": "Currency2"
        },
        "FinalPaymentDateTime": "2016-03-13T12:52:32.123Z"
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

