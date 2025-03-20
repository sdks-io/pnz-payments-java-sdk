
# Risk

The Risk section is sent by the initiating party to the API Provider. It is used to specify additional details for risk scoring.

## Structure

`Risk`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `GeoLocation` | [`GeoLocation`](../../doc/models/geo-location.md) | Optional | Location of the end-user on the earth specified by two numbers representing vertical and horizontal position | GeoLocation getGeoLocation() | setGeoLocation(GeoLocation geoLocation) |
| `PaymentContextCode` | [`PaymentContextCodeEnum`](../../doc/models/payment-context-code-enum.md) | Optional | Specifies the payment context | PaymentContextCodeEnum getPaymentContextCode() | setPaymentContextCode(PaymentContextCodeEnum paymentContextCode) |
| `MerchantCategoryCode` | `String` | Optional | Category code conforms to ISO 18245, related to the type of services or goods the merchant provides for the transaction<br>**Constraints**: *Minimum Length*: `3`, *Maximum Length*: `4` | String getMerchantCategoryCode() | setMerchantCategoryCode(String merchantCategoryCode) |
| `MerchantCustomerIdentification` | `String` | Optional | The unique customer identifier of the Customer with the merchant.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `70` | String getMerchantCustomerIdentification() | setMerchantCustomerIdentification(String merchantCustomerIdentification) |
| `DeliveryAddress` | [`DeliveryAddress`](../../doc/models/delivery-address.md) | Optional | Information that locates and identifies a specific address, as defined by postal services or in free format text. | DeliveryAddress getDeliveryAddress() | setDeliveryAddress(DeliveryAddress deliveryAddress) |
| `EndUserAppName` | `String` | Optional | Name of the end user facing application<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `70` | String getEndUserAppName() | setEndUserAppName(String endUserAppName) |
| `EndUserAppVersion` | `String` | Optional | Version of the end user facing application<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `14` | String getEndUserAppVersion() | setEndUserAppVersion(String endUserAppVersion) |
| `MerchantName` | `String` | Optional | Name of the merchant<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `70` | String getMerchantName() | setMerchantName(String merchantName) |
| `MerchantNZBN` | `String` | Optional | NZ business number for the merchant<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `70` | String getMerchantNZBN() | setMerchantNZBN(String merchantNZBN) |

## Example (as JSON)

```json
{
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
}
```

