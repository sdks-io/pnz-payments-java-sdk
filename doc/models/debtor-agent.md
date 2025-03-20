
# Debtor Agent

Financial institution servicing an account for the debtor.

## Structure

`DebtorAgent`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `SchemeName` | `String` | Required, Constant | Name of the identification scheme, in a coded form as published in an external list.<br>**Value**: `"BICFI"` | String getSchemeName() | setSchemeName(String schemeName) |
| `Identification` | `String` | Required | Unique and unambiguous identification of a financial institution or a branch of a financial institution.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `35` | String getIdentification() | setIdentification(String identification) |

## Example (as JSON)

```json
{
  "SchemeName": "BICFI",
  "Identification": "Identification2"
}
```

