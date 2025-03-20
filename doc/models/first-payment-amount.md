
# First Payment Amount

The amount of the first Standing Order

## Structure

`FirstPaymentAmount`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Amount` | `String` | Required | **Constraints**: *Pattern*: `^\d{1,13}\.\d{1,5}$` | String getAmount() | setAmount(String amount) |
| `Currency` | `String` | Required | A code allocated to a currency by a Maintenance Agency under an international identification scheme, as described in the latest edition of the international standard ISO 4217 'Codes for the representation of currencies and funds'<br>**Constraints**: *Pattern*: `^[A-Z]{3,3}$` | String getCurrency() | setCurrency(String currency) |

## Example (as JSON)

```json
{
  "Amount": "Amount0",
  "Currency": "Currency6"
}
```

