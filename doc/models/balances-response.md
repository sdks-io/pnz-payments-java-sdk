
# Balances Response

## Structure

`BalancesResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Data` | [`BalancesResponseData`](../../doc/models/balances-response-data.md) | Required | - | BalancesResponseData getData() | setData(BalancesResponseData data) |
| `Links` | [`Links`](../../doc/models/links.md) | Required | Links relevant to the payload | Links getLinks() | setLinks(Links links) |
| `Meta` | [`Meta`](../../doc/models/meta.md) | Required | - | Meta getMeta() | setMeta(Meta meta) |

## Example (as JSON)

```json
{
  "Data": {
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

