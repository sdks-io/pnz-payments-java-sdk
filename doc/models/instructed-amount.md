
# Instructed Amount

Amount of money of the cash balance after a transaction entry is applied to the account..

## Structure

`InstructedAmount`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Amount` | `String` | Required | A number of monetary units specified in an active currency where the unit of currency is explicit and compliant with ISO 4217.<br>**Constraints**: *Pattern*: `^\d{1,13}\.\d{1,5}$` | String getAmount() | setAmount(String amount) |
| `Currency` | `String` | Required | A code allocated to a currency by a Maintenance Agency under an international identification scheme, as described in the latest edition of the international standard ISO 4217 "Codes for the representation of currencies and funds".<br>**Constraints**: *Pattern*: `^[A-Z]{3,3}$` | String getCurrency() | setCurrency(String currency) |

## Example (as JSON)

```json
{
  "Amount": "Amount0",
  "Currency": "Currency6"
}
```

