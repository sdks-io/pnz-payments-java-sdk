
# Get Party Response

## Structure

`GetPartyResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Data` | [`GetAccountPartyResponseData`](../../doc/models/get-account-party-response-data.md) | Required | - | GetAccountPartyResponseData getData() | setData(GetAccountPartyResponseData data) |
| `Links` | [`Links`](../../doc/models/links.md) | Required | Links relevant to the payload | Links getLinks() | setLinks(Links links) |
| `Meta` | [`Meta`](../../doc/models/meta.md) | Required | - | Meta getMeta() | setMeta(Meta meta) |

## Example (as JSON)

```json
{
  "Data": {
    "Party": {
      "PartyId": "PartyId4",
      "PartyNumber": "PartyNumber8",
      "PartyType": "Joint",
      "Name": "Name6",
      "EmailAddress": "EmailAddress2",
      "Phone": "Phone8"
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

