
# Get Offers Response Data

## Structure

`GetOffersResponseData`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Offer` | [`List<OfferModel>`](../../doc/models/offer-model.md) | Optional | - | List<OfferModel> getOffer() | setOffer(List<OfferModel> offer) |

## Example (as JSON)

```json
{
  "Offer": [
    {
      "AccountId": "AccountId2",
      "OfferId": "OfferId4",
      "OfferType": "LimitIncrease",
      "Description": "Description4",
      "StartDateTime": "2016-03-13T12:52:32.123Z",
      "EndDateTime": "2016-03-13T12:52:32.123Z"
    }
  ]
}
```

