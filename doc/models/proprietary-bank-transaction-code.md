
# Proprietary Bank Transaction Code

Set of elements to fully identify a proprietary bank transaction code.

## Structure

`ProprietaryBankTransactionCode`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Code` | `String` | Required | Proprietary bank transaction code to identify the underlying transaction.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `35` | String getCode() | setCode(String code) |
| `Issuer` | `String` | Optional | Identification of the issuer of the proprietary bank transaction code.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `35` | String getIssuer() | setIssuer(String issuer) |

## Example (as JSON)

```json
{
  "Code": "Code0",
  "Issuer": "Issuer0"
}
```

