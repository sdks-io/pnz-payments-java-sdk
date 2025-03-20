
# Direct Debit Response

## Structure

`DirectDebitResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Data` | [`DirectDebitResponseData`](../../doc/models/direct-debit-response-data.md) | Required | - | DirectDebitResponseData getData() | setData(DirectDebitResponseData data) |
| `Links` | [`Links`](../../doc/models/links.md) | Required | Links relevant to the payload | Links getLinks() | setLinks(Links links) |
| `Meta` | [`Meta`](../../doc/models/meta.md) | Required | - | Meta getMeta() | setMeta(Meta meta) |

## Example (as JSON)

```json
{
  "Data": {
    "DirectDebit": [
      {
        "AccountId": "AccountId8",
        "DirectDebitId": "DirectDebitId6",
        "MandateIdentification": "MandateIdentification2",
        "DirectDebitStatusCode": "Active",
        "Name": "Name8",
        "PreviousPaymentDateTime": "2016-03-13T12:52:32.123Z",
        "PreviousPaymentAmount": {
          "Amount": "Amount0",
          "Currency": "Currency6"
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

