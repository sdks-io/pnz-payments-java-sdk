
# Creditor Agent

Party that manages the account on behalf of the account owner, that is manages the registration and booking of entries on the account, calculates balances on the account and provides information about the account.
This is the servicer of the beneficiary account.

## Structure

`CreditorAgent`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `SchemeName` | [`SchemeNameEnum`](../../doc/models/scheme-name-enum.md) | Optional | Name of the identification scheme, in a coded form as published in an external list. | SchemeNameEnum getSchemeName() | setSchemeName(SchemeNameEnum schemeName) |
| `Identification` | `String` | Optional | Unique and unambiguous identification of the servicing institution.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `35` | String getIdentification() | setIdentification(String identification) |
| `Name` | `String` | Optional | Name by which an agent is known and which is usually used to identify that agent.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `140` | String getName() | setName(String name) |
| `PostalAddress` | [`PostalAddress`](../../doc/models/postal-address.md) | Optional | Information that locates and identifies a specific address, as defined by postal services. | PostalAddress getPostalAddress() | setPostalAddress(PostalAddress postalAddress) |

## Example (as JSON)

```json
{
  "SchemeName": "BICFI",
  "Identification": "Identification4",
  "Name": "Name4",
  "PostalAddress": {
    "AddressType": "DeliveryTo",
    "AddressLine": [
      "AddressLine3",
      "AddressLine4",
      "AddressLine5"
    ],
    "StreetName": "StreetName2",
    "BuildingNumber": "BuildingNumber6",
    "PostCode": "PostCode6",
    "Country": "Country6"
  }
}
```

