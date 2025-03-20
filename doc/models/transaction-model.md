
# Transaction Model

## Structure

`TransactionModel`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountId` | `String` | Required | A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `40` | String getAccountId() | setAccountId(String accountId) |
| `TransactionId` | `String` | Optional | Unique identifier for the transaction within an servicing institution. This identifier is both unique and immutable.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `40` | String getTransactionId() | setTransactionId(String transactionId) |
| `TransactionReference` | [`TransactionReference`](../../doc/models/transaction-reference.md) | Optional | - | TransactionReference getTransactionReference() | setTransactionReference(TransactionReference transactionReference) |
| `StatementReference` | `List<String>` | Optional | Unique reference for the statement. This reference may be optionally populated if available.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `35` | List<String> getStatementReference() | setStatementReference(List<String> statementReference) |
| `Amount` | [`Amount`](../../doc/models/amount.md) | Required | Amount of money of the cash balance. | Amount getAmount() | setAmount(Amount amount) |
| `CreditDebitIndicator` | [`CreditDebitIndicatorEnum`](../../doc/models/credit-debit-indicator-enum.md) | Required | Indicates whether the balance is a credit or a debit balance. Usage: A zero balance is considered to be a credit balance. | CreditDebitIndicatorEnum getCreditDebitIndicator() | setCreditDebitIndicator(CreditDebitIndicatorEnum creditDebitIndicator) |
| `Status` | [`TransactionStatusEnum`](../../doc/models/transaction-status-enum.md) | Required | Status of a transaction entry on the books of the account servicer. | TransactionStatusEnum getStatus() | setStatus(TransactionStatusEnum status) |
| `BookingDateTime` | `LocalDateTime` | Required | Date and time when a transaction entry is posted to an account on the account servicer's books. Usage: Booking date is the expected booking date, unless the status is booked, in which case it is the actual booking date.<br>All dates in the JSON payloads are represented in ISO 8601 date-time format.<br>All date-time fields in responses must include the timezone. An example is below:<br>2017-04-05T10:43:07+00:00 | LocalDateTime getBookingDateTime() | setBookingDateTime(LocalDateTime bookingDateTime) |
| `ValueDateTime` | `LocalDateTime` | Optional | Date and time at which assets become available to the account owner in case of a credit entry, or cease to be available to the account owner in case of a debit entry.  Usage: If entry status is pending and value date is present, then the value date refers to an expected/requested value date. For entries subject to availability/float and for which availability information is provided, the value date must not be used. In this case the availability component identifies the  number of availability days.<br>All dates in the JSON payloads are represented in ISO 8601 date-time format.<br>All date-time fields in responses must include the timezone. An example is below:<br>2017-04-05T10:43:07+00:00 | LocalDateTime getValueDateTime() | setValueDateTime(LocalDateTime valueDateTime) |
| `AddressLine` | `String` | Optional | Information that locates and identifies a specific address, as defined by postal services, that is presented in free format text.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `70` | String getAddressLine() | setAddressLine(String addressLine) |
| `BankTransactionCode` | [`BankTransactionCode`](../../doc/models/bank-transaction-code.md) | Optional | Set of elements used to fully identify the type of underlying transaction resulting in an entry. | BankTransactionCode getBankTransactionCode() | setBankTransactionCode(BankTransactionCode bankTransactionCode) |
| `ProprietaryBankTransactionCode` | [`ProprietaryBankTransactionCode`](../../doc/models/proprietary-bank-transaction-code.md) | Optional | Set of elements to fully identify a proprietary bank transaction code. | ProprietaryBankTransactionCode getProprietaryBankTransactionCode() | setProprietaryBankTransactionCode(ProprietaryBankTransactionCode proprietaryBankTransactionCode) |
| `CurrencyExchange` | [`CurrencyExchange`](../../doc/models/currency-exchange.md) | Optional | Set of elements used to provide details on the currency exchange. | CurrencyExchange getCurrencyExchange() | setCurrencyExchange(CurrencyExchange currencyExchange) |
| `CreditorAgent` | [`CreditorAgent`](../../doc/models/creditor-agent.md) | Optional | Party that manages the account on behalf of the account owner, that is manages the registration and booking of entries on the account, calculates balances on the account and provides information about the account.<br>This is the servicer of the beneficiary account. | CreditorAgent getCreditorAgent() | setCreditorAgent(CreditorAgent creditorAgent) |
| `DebtorAgent` | [`DebtorAgent`](../../doc/models/debtor-agent.md) | Optional | Financial institution servicing an account for the debtor. | DebtorAgent getDebtorAgent() | setDebtorAgent(DebtorAgent debtorAgent) |
| `CardInstrument` | [`CardInstrument`](../../doc/models/card-instrument.md) | Optional | Set of elements to describe the card instrument used in the transaction. | CardInstrument getCardInstrument() | setCardInstrument(CardInstrument cardInstrument) |
| `TransactionInformation` | `String` | Optional | Further details of the transaction. This is the transaction narrative, which is unstructured text.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `500` | String getTransactionInformation() | setTransactionInformation(String transactionInformation) |
| `Balance` | [`Balance`](../../doc/models/balance.md) | Optional | Set of elements used to define the balance as a numerical representation of the net increases and decreases in an account after a transaction entry is applied to the account. | Balance getBalance() | setBalance(Balance balance) |
| `MerchantDetails` | [`MerchantDetails`](../../doc/models/merchant-details.md) | Optional | Details of the merchant involved in the transaction. | MerchantDetails getMerchantDetails() | setMerchantDetails(MerchantDetails merchantDetails) |
| `CreditorAccount` | [`CreditorAccount`](../../doc/models/creditor-account.md) | Optional | Unambiguous identification of the account of the creditor, in the case of a debit transaction. | CreditorAccount getCreditorAccount() | setCreditorAccount(CreditorAccount creditorAccount) |
| `DebtorAccount` | [`DebtorAccount`](../../doc/models/debtor-account.md) | Optional | Unambiguous identification of the account of the debtor, in the case of a crebit transaction. | DebtorAccount getDebtorAccount() | setDebtorAccount(DebtorAccount debtorAccount) |

## Example (as JSON)

```json
{
  "AccountId": "AccountId6",
  "TransactionId": "TransactionId8",
  "TransactionReference": {
    "CreditorName": "CreditorName2",
    "CreditorReference": {
      "Particulars": "Particulars4",
      "Code": "Code8",
      "Reference": "Reference0"
    },
    "DebtorName": "DebtorName4",
    "DebtorReference": {
      "Particulars": "Particulars8",
      "Code": "Code2",
      "Reference": "Reference4"
    }
  },
  "StatementReference": [
    "StatementReference2",
    "StatementReference3",
    "StatementReference4"
  ],
  "Amount": {
    "Amount": "Amount0",
    "Currency": "Currency6"
  },
  "CreditDebitIndicator": "Credit",
  "Status": "Booked",
  "BookingDateTime": "2016-03-13T12:52:32.123Z",
  "ValueDateTime": "2016-03-13T12:52:32.123Z",
  "AddressLine": "AddressLine0"
}
```

