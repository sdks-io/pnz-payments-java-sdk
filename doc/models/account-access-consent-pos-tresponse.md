
# Account Access Consent POS Tresponse

## Structure

`AccountAccessConsentPOSTresponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Data` | [`AccountAccessConsentResponseModel`](../../doc/models/account-access-consent-response-model.md) | Required | - | AccountAccessConsentResponseModel getData() | setData(AccountAccessConsentResponseModel data) |
| `Risk` | [`Risk`](../../doc/models/risk.md) | Required | The Risk section is sent by the initiating party to the API Provider. It is used to specify additional details for risk scoring. | Risk getRisk() | setRisk(Risk risk) |
| `Links` | [`Links`](../../doc/models/links.md) | Required | Links relevant to the payload | Links getLinks() | setLinks(Links links) |
| `Meta` | [`Meta`](../../doc/models/meta.md) | Required | - | Meta getMeta() | setMeta(Meta meta) |

## Example (as JSON)

```json
{
  "Data": {
    "ConsentId": "ConsentId8",
    "Status": "Authorised",
    "CreationDateTime": "2016-03-13T12:52:32.123Z",
    "StatusUpdateDateTime": "2016-03-13T12:52:32.123Z",
    "Consent": {
      "Permissions": [
        "ReadStandingOrdersDetail"
      ],
      "ExpirationDateTime": "2016-03-13T12:52:32.123Z",
      "TransactionFromDateTime": "2016-03-13T12:52:32.123Z",
      "TransactionToDateTime": "2016-03-13T12:52:32.123Z"
    }
  },
  "Risk": {
    "GeoLocation": {
      "Latitude": "Latitude0",
      "Longitude": "Longitude8"
    },
    "PaymentContextCode": "Other",
    "MerchantCategoryCode": "MerchantCategoryCode8",
    "MerchantCustomerIdentification": "MerchantCustomerIdentification2",
    "DeliveryAddress": {
      "AddressType": "DeliveryTo",
      "AddressLine": [
        "AddressLine5",
        "AddressLine6",
        "AddressLine7"
      ],
      "StreetName": "StreetName4",
      "BuildingNumber": "BuildingNumber8",
      "PostCode": "PostCode8",
      "Country": "Country8"
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

