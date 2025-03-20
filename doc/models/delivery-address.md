
# Delivery Address

Information that locates and identifies a specific address, as defined by postal services or in free format text.

## Structure

`DeliveryAddress`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AddressType` | [`AddressTypeEnum`](../../doc/models/address-type-enum.md) | Optional | Identifies the nature of the postal address. | AddressTypeEnum getAddressType() | setAddressType(AddressTypeEnum addressType) |
| `AddressLine` | `List<String>` | Optional | Information that locates and identifies a specific address, as defined by postal services, that is presented in free format text.<br>**Constraints**: *Minimum Items*: `0`, *Maximum Items*: `5`, *Minimum Length*: `1`, *Maximum Length*: `70` | List<String> getAddressLine() | setAddressLine(List<String> addressLine) |
| `StreetName` | `String` | Optional | Name of a street or thoroughfare.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `70` | String getStreetName() | setStreetName(String streetName) |
| `BuildingNumber` | `String` | Optional | Number that identifies the position of a building on a street.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `16` | String getBuildingNumber() | setBuildingNumber(String buildingNumber) |
| `PostCode` | `String` | Optional | Identifier consisting of a group of letters and/or numbers that is added to a postal address to assist the sorting of mail<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `16` | String getPostCode() | setPostCode(String postCode) |
| `TownName` | `String` | Optional | Name of a built-up area, with defined boundaries, and a local government.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `35` | String getTownName() | setTownName(String townName) |
| `CountrySubDivision` | `String` | Optional | Identifies a subdivision of a country, for instance state, region, county.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `35` | String getCountrySubDivision() | setCountrySubDivision(String countrySubDivision) |
| `Country` | `String` | Required | Nation with its own government, occupying a particular territory.<br>**Constraints**: *Pattern*: `^[A-Z]{2,2}$` | String getCountry() | setCountry(String country) |

## Example (as JSON)

```json
{
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
```

