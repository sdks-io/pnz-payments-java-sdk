
# Servicer

Party that manages the account on behalf of the account owner, that is manages the registration and booking of entries on the account, calculates balances on the account and provides information about the account.

## Structure

`Servicer`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `SchemeName` | `String` | Required, Constant | Name of the identification scheme, in a coded form as published in an external list.<br>**Value**: `"BICFI"` | String getSchemeName() | setSchemeName(String schemeName) |
| `Identification` | `String` | Required | Unique and unambiguous identification of the servicing institution.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `35` | String getIdentification() | setIdentification(String identification) |

## Example (as JSON)

```json
{
  "SchemeName": "BICFI",
  "Identification": "Identification6"
}
```

