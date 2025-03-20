
# Currency Exchange

Set of elements used to provide details on the currency exchange.

## Structure

`CurrencyExchange`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `SourceCurrency` | `String` | Required | Currency from which an amount is to be converted in a currency conversion.<br>**Constraints**: *Pattern*: `^[A-Z]{3,3}$` | String getSourceCurrency() | setSourceCurrency(String sourceCurrency) |
| `TargetCurrency` | `String` | Optional | Currency from which an amount is to be converted in a currency conversion.<br>**Constraints**: *Pattern*: `^[A-Z]{3,3}$` | String getTargetCurrency() | setTargetCurrency(String targetCurrency) |
| `UnitCurrency` | `String` | Optional | Currency from which an amount is to be converted in a currency conversion.<br>**Constraints**: *Pattern*: `^[A-Z]{3,3}$` | String getUnitCurrency() | setUnitCurrency(String unitCurrency) |
| `ExchangeRate` | `double` | Required | Factor used to convert an amount from one currency into another. This reflects the price at which one currency was bought with another currency.<br>Usage: ExchangeRate expresses the ratio between UnitCurrency and QuotedCurrency (ExchangeRate = UnitCurrency/QuotedCurrency). | double getExchangeRate() | setExchangeRate(double exchangeRate) |
| `ContractIdentification` | `String` | Optional | Unique identification to unambiguously identify the foreign exchange contract.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `35` | String getContractIdentification() | setContractIdentification(String contractIdentification) |
| `QuotationDate` | `LocalDateTime` | Optional | Date and time at which an exchange rate is quoted.<br>All dates in the JSON payloads are represented in ISO 8601 date-time format.<br>All date-time fields in responses must include the timezone. An example is below:<br>2017-04-05T10:43:07+00:00 | LocalDateTime getQuotationDate() | setQuotationDate(LocalDateTime quotationDate) |
| `InstructedAmount` | [`InstructedAmount`](../../doc/models/instructed-amount.md) | Optional | Amount of money of the cash balance after a transaction entry is applied to the account.. | InstructedAmount getInstructedAmount() | setInstructedAmount(InstructedAmount instructedAmount) |

## Example (as JSON)

```json
{
  "SourceCurrency": "SourceCurrency8",
  "TargetCurrency": "TargetCurrency4",
  "UnitCurrency": "UnitCurrency4",
  "ExchangeRate": 100.0,
  "ContractIdentification": "ContractIdentification8",
  "QuotationDate": "2016-03-13T12:52:32.123Z",
  "InstructedAmount": {
    "Amount": "Amount0",
    "Currency": "Currency6"
  }
}
```

