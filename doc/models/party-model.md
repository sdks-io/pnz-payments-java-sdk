
# Party Model

## Structure

`PartyModel`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PartyId` | `String` | Required | A unique and immutable identifier used to identify the customer resource. This identifier has no meaning to the account owner.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `40` | String getPartyId() | setPartyId(String partyId) |
| `PartyNumber` | `String` | Optional | Number assigned by an agent to identify its customer.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `35` | String getPartyNumber() | setPartyNumber(String partyNumber) |
| `PartyType` | [`PartyTypeEnum`](../../doc/models/party-type-enum.md) | Optional | Party type, in a coded form. | PartyTypeEnum getPartyType() | setPartyType(PartyTypeEnum partyType) |
| `Name` | `String` | Optional | Name by which a party is known and which is usually used to identify that party.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `70` | String getName() | setName(String name) |
| `EmailAddress` | `String` | Optional | Address for electronic mail (e-mail).<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `256` | String getEmailAddress() | setEmailAddress(String emailAddress) |
| `Phone` | `String` | Optional | Collection of information that identifies a phone number, as defined by telecom services.<br>**Constraints**: *Pattern*: `\+[0-9]{1,3}-[0-9()+\-]{1,30}` | String getPhone() | setPhone(String phone) |
| `Mobile` | `String` | Optional | Collection of information that identifies a mobile phone number, as defined by telecom services.<br>**Constraints**: *Pattern*: `\+[0-9]{1,3}-[0-9()+\-]{1,30}` | String getMobile() | setMobile(String mobile) |
| `Address` | [`List<Address>`](../../doc/models/address.md) | Optional | Postal address of a party. | List<Address> getAddress() | setAddress(List<Address> address) |

## Example (as JSON)

```json
{
  "PartyId": "PartyId2",
  "PartyNumber": "PartyNumber2",
  "PartyType": "Joint",
  "Name": "Name0",
  "EmailAddress": "EmailAddress6",
  "Phone": "Phone8"
}
```

