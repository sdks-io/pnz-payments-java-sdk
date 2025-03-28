/*
 * AccountAndTransactionAPISpecificationLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package nz.co.middleware.apicentre.apinomatls.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.LocalDateTime;
import java.util.List;
import nz.co.middleware.apicentre.apinomatls.DateTimeHelper;

/**
 * This is a model class for TransactionModel type.
 */
public class TransactionModel {
    private String accountId;
    private String transactionId;
    private TransactionReference transactionReference;
    private List<String> statementReference;
    private Amount amount;
    private CreditDebitIndicatorEnum creditDebitIndicator;
    private TransactionStatusEnum status;
    private LocalDateTime bookingDateTime;
    private LocalDateTime valueDateTime;
    private String addressLine;
    private BankTransactionCode bankTransactionCode;
    private ProprietaryBankTransactionCode proprietaryBankTransactionCode;
    private CurrencyExchange currencyExchange;
    private CreditorAgent creditorAgent;
    private DebtorAgent debtorAgent;
    private CardInstrument cardInstrument;
    private String transactionInformation;
    private Balance balance;
    private MerchantDetails merchantDetails;
    private CreditorAccount creditorAccount;
    private DebtorAccount debtorAccount;

    /**
     * Default constructor.
     */
    public TransactionModel() {
    }

    /**
     * Initialization constructor.
     * @param  accountId  String value for accountId.
     * @param  amount  Amount value for amount.
     * @param  creditDebitIndicator  CreditDebitIndicatorEnum value for creditDebitIndicator.
     * @param  status  TransactionStatusEnum value for status.
     * @param  bookingDateTime  LocalDateTime value for bookingDateTime.
     * @param  transactionId  String value for transactionId.
     * @param  transactionReference  TransactionReference value for transactionReference.
     * @param  statementReference  List of String value for statementReference.
     * @param  valueDateTime  LocalDateTime value for valueDateTime.
     * @param  addressLine  String value for addressLine.
     * @param  bankTransactionCode  BankTransactionCode value for bankTransactionCode.
     * @param  proprietaryBankTransactionCode  ProprietaryBankTransactionCode value for
     *         proprietaryBankTransactionCode.
     * @param  currencyExchange  CurrencyExchange value for currencyExchange.
     * @param  creditorAgent  CreditorAgent value for creditorAgent.
     * @param  debtorAgent  DebtorAgent value for debtorAgent.
     * @param  cardInstrument  CardInstrument value for cardInstrument.
     * @param  transactionInformation  String value for transactionInformation.
     * @param  balance  Balance value for balance.
     * @param  merchantDetails  MerchantDetails value for merchantDetails.
     * @param  creditorAccount  CreditorAccount value for creditorAccount.
     * @param  debtorAccount  DebtorAccount value for debtorAccount.
     */
    public TransactionModel(
            String accountId,
            Amount amount,
            CreditDebitIndicatorEnum creditDebitIndicator,
            TransactionStatusEnum status,
            LocalDateTime bookingDateTime,
            String transactionId,
            TransactionReference transactionReference,
            List<String> statementReference,
            LocalDateTime valueDateTime,
            String addressLine,
            BankTransactionCode bankTransactionCode,
            ProprietaryBankTransactionCode proprietaryBankTransactionCode,
            CurrencyExchange currencyExchange,
            CreditorAgent creditorAgent,
            DebtorAgent debtorAgent,
            CardInstrument cardInstrument,
            String transactionInformation,
            Balance balance,
            MerchantDetails merchantDetails,
            CreditorAccount creditorAccount,
            DebtorAccount debtorAccount) {
        this.accountId = accountId;
        this.transactionId = transactionId;
        this.transactionReference = transactionReference;
        this.statementReference = statementReference;
        this.amount = amount;
        this.creditDebitIndicator = creditDebitIndicator;
        this.status = status;
        this.bookingDateTime = bookingDateTime;
        this.valueDateTime = valueDateTime;
        this.addressLine = addressLine;
        this.bankTransactionCode = bankTransactionCode;
        this.proprietaryBankTransactionCode = proprietaryBankTransactionCode;
        this.currencyExchange = currencyExchange;
        this.creditorAgent = creditorAgent;
        this.debtorAgent = debtorAgent;
        this.cardInstrument = cardInstrument;
        this.transactionInformation = transactionInformation;
        this.balance = balance;
        this.merchantDetails = merchantDetails;
        this.creditorAccount = creditorAccount;
        this.debtorAccount = debtorAccount;
    }

    /**
     * Getter for AccountId.
     * A unique and immutable identifier used to identify the account resource. This identifier has
     * no meaning to the account owner.
     * @return Returns the String
     */
    @JsonGetter("AccountId")
    public String getAccountId() {
        return accountId;
    }

    /**
     * Setter for AccountId.
     * A unique and immutable identifier used to identify the account resource. This identifier has
     * no meaning to the account owner.
     * @param accountId Value for String
     */
    @JsonSetter("AccountId")
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * Getter for TransactionId.
     * Unique identifier for the transaction within an servicing institution. This identifier is
     * both unique and immutable.
     * @return Returns the String
     */
    @JsonGetter("TransactionId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * Setter for TransactionId.
     * Unique identifier for the transaction within an servicing institution. This identifier is
     * both unique and immutable.
     * @param transactionId Value for String
     */
    @JsonSetter("TransactionId")
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    /**
     * Getter for TransactionReference.
     * @return Returns the TransactionReference
     */
    @JsonGetter("TransactionReference")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public TransactionReference getTransactionReference() {
        return transactionReference;
    }

    /**
     * Setter for TransactionReference.
     * @param transactionReference Value for TransactionReference
     */
    @JsonSetter("TransactionReference")
    public void setTransactionReference(TransactionReference transactionReference) {
        this.transactionReference = transactionReference;
    }

    /**
     * Getter for StatementReference.
     * Unique reference for the statement. This reference may be optionally populated if available.
     * @return Returns the List of String
     */
    @JsonGetter("StatementReference")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getStatementReference() {
        return statementReference;
    }

    /**
     * Setter for StatementReference.
     * Unique reference for the statement. This reference may be optionally populated if available.
     * @param statementReference Value for List of String
     */
    @JsonSetter("StatementReference")
    public void setStatementReference(List<String> statementReference) {
        this.statementReference = statementReference;
    }

    /**
     * Getter for Amount.
     * Amount of money of the cash balance.
     * @return Returns the Amount
     */
    @JsonGetter("Amount")
    public Amount getAmount() {
        return amount;
    }

    /**
     * Setter for Amount.
     * Amount of money of the cash balance.
     * @param amount Value for Amount
     */
    @JsonSetter("Amount")
    public void setAmount(Amount amount) {
        this.amount = amount;
    }

    /**
     * Getter for CreditDebitIndicator.
     * Indicates whether the balance is a credit or a debit balance. Usage: A zero balance is
     * considered to be a credit balance.
     * @return Returns the CreditDebitIndicatorEnum
     */
    @JsonGetter("CreditDebitIndicator")
    public CreditDebitIndicatorEnum getCreditDebitIndicator() {
        return creditDebitIndicator;
    }

    /**
     * Setter for CreditDebitIndicator.
     * Indicates whether the balance is a credit or a debit balance. Usage: A zero balance is
     * considered to be a credit balance.
     * @param creditDebitIndicator Value for CreditDebitIndicatorEnum
     */
    @JsonSetter("CreditDebitIndicator")
    public void setCreditDebitIndicator(CreditDebitIndicatorEnum creditDebitIndicator) {
        this.creditDebitIndicator = creditDebitIndicator;
    }

    /**
     * Getter for Status.
     * Status of a transaction entry on the books of the account servicer.
     * @return Returns the TransactionStatusEnum
     */
    @JsonGetter("Status")
    public TransactionStatusEnum getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * Status of a transaction entry on the books of the account servicer.
     * @param status Value for TransactionStatusEnum
     */
    @JsonSetter("Status")
    public void setStatus(TransactionStatusEnum status) {
        this.status = status;
    }

    /**
     * Getter for BookingDateTime.
     * Date and time when a transaction entry is posted to an account on the account servicer's
     * books. Usage: Booking date is the expected booking date, unless the status is booked, in
     * which case it is the actual booking date. All dates in the JSON payloads are represented in
     * ISO 8601 date-time format. All date-time fields in responses must include the timezone. An
     * example is below: 2017-04-05T10:43:07+00:00
     * @return Returns the LocalDateTime
     */
    @JsonGetter("BookingDateTime")
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getBookingDateTime() {
        return bookingDateTime;
    }

    /**
     * Setter for BookingDateTime.
     * Date and time when a transaction entry is posted to an account on the account servicer's
     * books. Usage: Booking date is the expected booking date, unless the status is booked, in
     * which case it is the actual booking date. All dates in the JSON payloads are represented in
     * ISO 8601 date-time format. All date-time fields in responses must include the timezone. An
     * example is below: 2017-04-05T10:43:07+00:00
     * @param bookingDateTime Value for LocalDateTime
     */
    @JsonSetter("BookingDateTime")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setBookingDateTime(LocalDateTime bookingDateTime) {
        this.bookingDateTime = bookingDateTime;
    }

    /**
     * Getter for ValueDateTime.
     * Date and time at which assets become available to the account owner in case of a credit
     * entry, or cease to be available to the account owner in case of a debit entry. Usage: If
     * entry status is pending and value date is present, then the value date refers to an
     * expected/requested value date. For entries subject to availability/float and for which
     * availability information is provided, the value date must not be used. In this case the
     * availability component identifies the number of availability days. All dates in the JSON
     * payloads are represented in ISO 8601 date-time format. All date-time fields in responses must
     * include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     * @return Returns the LocalDateTime
     */
    @JsonGetter("ValueDateTime")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getValueDateTime() {
        return valueDateTime;
    }

    /**
     * Setter for ValueDateTime.
     * Date and time at which assets become available to the account owner in case of a credit
     * entry, or cease to be available to the account owner in case of a debit entry. Usage: If
     * entry status is pending and value date is present, then the value date refers to an
     * expected/requested value date. For entries subject to availability/float and for which
     * availability information is provided, the value date must not be used. In this case the
     * availability component identifies the number of availability days. All dates in the JSON
     * payloads are represented in ISO 8601 date-time format. All date-time fields in responses must
     * include the timezone. An example is below: 2017-04-05T10:43:07+00:00
     * @param valueDateTime Value for LocalDateTime
     */
    @JsonSetter("ValueDateTime")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setValueDateTime(LocalDateTime valueDateTime) {
        this.valueDateTime = valueDateTime;
    }

    /**
     * Getter for AddressLine.
     * Information that locates and identifies a specific address, as defined by postal services,
     * that is presented in free format text.
     * @return Returns the String
     */
    @JsonGetter("AddressLine")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAddressLine() {
        return addressLine;
    }

    /**
     * Setter for AddressLine.
     * Information that locates and identifies a specific address, as defined by postal services,
     * that is presented in free format text.
     * @param addressLine Value for String
     */
    @JsonSetter("AddressLine")
    public void setAddressLine(String addressLine) {
        this.addressLine = addressLine;
    }

    /**
     * Getter for BankTransactionCode.
     * Set of elements used to fully identify the type of underlying transaction resulting in an
     * entry.
     * @return Returns the BankTransactionCode
     */
    @JsonGetter("BankTransactionCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BankTransactionCode getBankTransactionCode() {
        return bankTransactionCode;
    }

    /**
     * Setter for BankTransactionCode.
     * Set of elements used to fully identify the type of underlying transaction resulting in an
     * entry.
     * @param bankTransactionCode Value for BankTransactionCode
     */
    @JsonSetter("BankTransactionCode")
    public void setBankTransactionCode(BankTransactionCode bankTransactionCode) {
        this.bankTransactionCode = bankTransactionCode;
    }

    /**
     * Getter for ProprietaryBankTransactionCode.
     * Set of elements to fully identify a proprietary bank transaction code.
     * @return Returns the ProprietaryBankTransactionCode
     */
    @JsonGetter("ProprietaryBankTransactionCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ProprietaryBankTransactionCode getProprietaryBankTransactionCode() {
        return proprietaryBankTransactionCode;
    }

    /**
     * Setter for ProprietaryBankTransactionCode.
     * Set of elements to fully identify a proprietary bank transaction code.
     * @param proprietaryBankTransactionCode Value for ProprietaryBankTransactionCode
     */
    @JsonSetter("ProprietaryBankTransactionCode")
    public void setProprietaryBankTransactionCode(ProprietaryBankTransactionCode proprietaryBankTransactionCode) {
        this.proprietaryBankTransactionCode = proprietaryBankTransactionCode;
    }

    /**
     * Getter for CurrencyExchange.
     * Set of elements used to provide details on the currency exchange.
     * @return Returns the CurrencyExchange
     */
    @JsonGetter("CurrencyExchange")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CurrencyExchange getCurrencyExchange() {
        return currencyExchange;
    }

    /**
     * Setter for CurrencyExchange.
     * Set of elements used to provide details on the currency exchange.
     * @param currencyExchange Value for CurrencyExchange
     */
    @JsonSetter("CurrencyExchange")
    public void setCurrencyExchange(CurrencyExchange currencyExchange) {
        this.currencyExchange = currencyExchange;
    }

    /**
     * Getter for CreditorAgent.
     * Party that manages the account on behalf of the account owner, that is manages the
     * registration and booking of entries on the account, calculates balances on the account and
     * provides information about the account. This is the servicer of the beneficiary account.
     * @return Returns the CreditorAgent
     */
    @JsonGetter("CreditorAgent")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CreditorAgent getCreditorAgent() {
        return creditorAgent;
    }

    /**
     * Setter for CreditorAgent.
     * Party that manages the account on behalf of the account owner, that is manages the
     * registration and booking of entries on the account, calculates balances on the account and
     * provides information about the account. This is the servicer of the beneficiary account.
     * @param creditorAgent Value for CreditorAgent
     */
    @JsonSetter("CreditorAgent")
    public void setCreditorAgent(CreditorAgent creditorAgent) {
        this.creditorAgent = creditorAgent;
    }

    /**
     * Getter for DebtorAgent.
     * Financial institution servicing an account for the debtor.
     * @return Returns the DebtorAgent
     */
    @JsonGetter("DebtorAgent")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public DebtorAgent getDebtorAgent() {
        return debtorAgent;
    }

    /**
     * Setter for DebtorAgent.
     * Financial institution servicing an account for the debtor.
     * @param debtorAgent Value for DebtorAgent
     */
    @JsonSetter("DebtorAgent")
    public void setDebtorAgent(DebtorAgent debtorAgent) {
        this.debtorAgent = debtorAgent;
    }

    /**
     * Getter for CardInstrument.
     * Set of elements to describe the card instrument used in the transaction.
     * @return Returns the CardInstrument
     */
    @JsonGetter("CardInstrument")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CardInstrument getCardInstrument() {
        return cardInstrument;
    }

    /**
     * Setter for CardInstrument.
     * Set of elements to describe the card instrument used in the transaction.
     * @param cardInstrument Value for CardInstrument
     */
    @JsonSetter("CardInstrument")
    public void setCardInstrument(CardInstrument cardInstrument) {
        this.cardInstrument = cardInstrument;
    }

    /**
     * Getter for TransactionInformation.
     * Further details of the transaction. This is the transaction narrative, which is unstructured
     * text.
     * @return Returns the String
     */
    @JsonGetter("TransactionInformation")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTransactionInformation() {
        return transactionInformation;
    }

    /**
     * Setter for TransactionInformation.
     * Further details of the transaction. This is the transaction narrative, which is unstructured
     * text.
     * @param transactionInformation Value for String
     */
    @JsonSetter("TransactionInformation")
    public void setTransactionInformation(String transactionInformation) {
        this.transactionInformation = transactionInformation;
    }

    /**
     * Getter for Balance.
     * Set of elements used to define the balance as a numerical representation of the net increases
     * and decreases in an account after a transaction entry is applied to the account.
     * @return Returns the Balance
     */
    @JsonGetter("Balance")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Balance getBalance() {
        return balance;
    }

    /**
     * Setter for Balance.
     * Set of elements used to define the balance as a numerical representation of the net increases
     * and decreases in an account after a transaction entry is applied to the account.
     * @param balance Value for Balance
     */
    @JsonSetter("Balance")
    public void setBalance(Balance balance) {
        this.balance = balance;
    }

    /**
     * Getter for MerchantDetails.
     * Details of the merchant involved in the transaction.
     * @return Returns the MerchantDetails
     */
    @JsonGetter("MerchantDetails")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public MerchantDetails getMerchantDetails() {
        return merchantDetails;
    }

    /**
     * Setter for MerchantDetails.
     * Details of the merchant involved in the transaction.
     * @param merchantDetails Value for MerchantDetails
     */
    @JsonSetter("MerchantDetails")
    public void setMerchantDetails(MerchantDetails merchantDetails) {
        this.merchantDetails = merchantDetails;
    }

    /**
     * Getter for CreditorAccount.
     * Unambiguous identification of the account of the creditor, in the case of a debit
     * transaction.
     * @return Returns the CreditorAccount
     */
    @JsonGetter("CreditorAccount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CreditorAccount getCreditorAccount() {
        return creditorAccount;
    }

    /**
     * Setter for CreditorAccount.
     * Unambiguous identification of the account of the creditor, in the case of a debit
     * transaction.
     * @param creditorAccount Value for CreditorAccount
     */
    @JsonSetter("CreditorAccount")
    public void setCreditorAccount(CreditorAccount creditorAccount) {
        this.creditorAccount = creditorAccount;
    }

    /**
     * Getter for DebtorAccount.
     * Unambiguous identification of the account of the debtor, in the case of a crebit transaction.
     * @return Returns the DebtorAccount
     */
    @JsonGetter("DebtorAccount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public DebtorAccount getDebtorAccount() {
        return debtorAccount;
    }

    /**
     * Setter for DebtorAccount.
     * Unambiguous identification of the account of the debtor, in the case of a crebit transaction.
     * @param debtorAccount Value for DebtorAccount
     */
    @JsonSetter("DebtorAccount")
    public void setDebtorAccount(DebtorAccount debtorAccount) {
        this.debtorAccount = debtorAccount;
    }

    /**
     * Converts this TransactionModel into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TransactionModel [" + "accountId=" + accountId + ", amount=" + amount
                + ", creditDebitIndicator=" + creditDebitIndicator + ", status=" + status
                + ", bookingDateTime=" + bookingDateTime + ", transactionId=" + transactionId
                + ", transactionReference=" + transactionReference + ", statementReference="
                + statementReference + ", valueDateTime=" + valueDateTime + ", addressLine="
                + addressLine + ", bankTransactionCode=" + bankTransactionCode
                + ", proprietaryBankTransactionCode=" + proprietaryBankTransactionCode
                + ", currencyExchange=" + currencyExchange + ", creditorAgent=" + creditorAgent
                + ", debtorAgent=" + debtorAgent + ", cardInstrument=" + cardInstrument
                + ", transactionInformation=" + transactionInformation + ", balance=" + balance
                + ", merchantDetails=" + merchantDetails + ", creditorAccount=" + creditorAccount
                + ", debtorAccount=" + debtorAccount + "]";
    }

    /**
     * Builds a new {@link TransactionModel.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link TransactionModel.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(accountId, amount, creditDebitIndicator, status,
                bookingDateTime)
                .transactionId(getTransactionId())
                .transactionReference(getTransactionReference())
                .statementReference(getStatementReference())
                .valueDateTime(getValueDateTime())
                .addressLine(getAddressLine())
                .bankTransactionCode(getBankTransactionCode())
                .proprietaryBankTransactionCode(getProprietaryBankTransactionCode())
                .currencyExchange(getCurrencyExchange())
                .creditorAgent(getCreditorAgent())
                .debtorAgent(getDebtorAgent())
                .cardInstrument(getCardInstrument())
                .transactionInformation(getTransactionInformation())
                .balance(getBalance())
                .merchantDetails(getMerchantDetails())
                .creditorAccount(getCreditorAccount())
                .debtorAccount(getDebtorAccount());
        return builder;
    }

    /**
     * Class to build instances of {@link TransactionModel}.
     */
    public static class Builder {
        private String accountId;
        private Amount amount;
        private CreditDebitIndicatorEnum creditDebitIndicator;
        private TransactionStatusEnum status;
        private LocalDateTime bookingDateTime;
        private String transactionId;
        private TransactionReference transactionReference;
        private List<String> statementReference;
        private LocalDateTime valueDateTime;
        private String addressLine;
        private BankTransactionCode bankTransactionCode;
        private ProprietaryBankTransactionCode proprietaryBankTransactionCode;
        private CurrencyExchange currencyExchange;
        private CreditorAgent creditorAgent;
        private DebtorAgent debtorAgent;
        private CardInstrument cardInstrument;
        private String transactionInformation;
        private Balance balance;
        private MerchantDetails merchantDetails;
        private CreditorAccount creditorAccount;
        private DebtorAccount debtorAccount;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  accountId  String value for accountId.
         * @param  amount  Amount value for amount.
         * @param  creditDebitIndicator  CreditDebitIndicatorEnum value for creditDebitIndicator.
         * @param  status  TransactionStatusEnum value for status.
         * @param  bookingDateTime  LocalDateTime value for bookingDateTime.
         */
        public Builder(String accountId, Amount amount,
                CreditDebitIndicatorEnum creditDebitIndicator, TransactionStatusEnum status,
                LocalDateTime bookingDateTime) {
            this.accountId = accountId;
            this.amount = amount;
            this.creditDebitIndicator = creditDebitIndicator;
            this.status = status;
            this.bookingDateTime = bookingDateTime;
        }

        /**
         * Setter for accountId.
         * @param  accountId  String value for accountId.
         * @return Builder
         */
        public Builder accountId(String accountId) {
            this.accountId = accountId;
            return this;
        }

        /**
         * Setter for amount.
         * @param  amount  Amount value for amount.
         * @return Builder
         */
        public Builder amount(Amount amount) {
            this.amount = amount;
            return this;
        }

        /**
         * Setter for creditDebitIndicator.
         * @param  creditDebitIndicator  CreditDebitIndicatorEnum value for creditDebitIndicator.
         * @return Builder
         */
        public Builder creditDebitIndicator(CreditDebitIndicatorEnum creditDebitIndicator) {
            this.creditDebitIndicator = creditDebitIndicator;
            return this;
        }

        /**
         * Setter for status.
         * @param  status  TransactionStatusEnum value for status.
         * @return Builder
         */
        public Builder status(TransactionStatusEnum status) {
            this.status = status;
            return this;
        }

        /**
         * Setter for bookingDateTime.
         * @param  bookingDateTime  LocalDateTime value for bookingDateTime.
         * @return Builder
         */
        public Builder bookingDateTime(LocalDateTime bookingDateTime) {
            this.bookingDateTime = bookingDateTime;
            return this;
        }

        /**
         * Setter for transactionId.
         * @param  transactionId  String value for transactionId.
         * @return Builder
         */
        public Builder transactionId(String transactionId) {
            this.transactionId = transactionId;
            return this;
        }

        /**
         * Setter for transactionReference.
         * @param  transactionReference  TransactionReference value for transactionReference.
         * @return Builder
         */
        public Builder transactionReference(TransactionReference transactionReference) {
            this.transactionReference = transactionReference;
            return this;
        }

        /**
         * Setter for statementReference.
         * @param  statementReference  List of String value for statementReference.
         * @return Builder
         */
        public Builder statementReference(List<String> statementReference) {
            this.statementReference = statementReference;
            return this;
        }

        /**
         * Setter for valueDateTime.
         * @param  valueDateTime  LocalDateTime value for valueDateTime.
         * @return Builder
         */
        public Builder valueDateTime(LocalDateTime valueDateTime) {
            this.valueDateTime = valueDateTime;
            return this;
        }

        /**
         * Setter for addressLine.
         * @param  addressLine  String value for addressLine.
         * @return Builder
         */
        public Builder addressLine(String addressLine) {
            this.addressLine = addressLine;
            return this;
        }

        /**
         * Setter for bankTransactionCode.
         * @param  bankTransactionCode  BankTransactionCode value for bankTransactionCode.
         * @return Builder
         */
        public Builder bankTransactionCode(BankTransactionCode bankTransactionCode) {
            this.bankTransactionCode = bankTransactionCode;
            return this;
        }

        /**
         * Setter for proprietaryBankTransactionCode.
         * @param  proprietaryBankTransactionCode  ProprietaryBankTransactionCode value for
         *         proprietaryBankTransactionCode.
         * @return Builder
         */
        public Builder proprietaryBankTransactionCode(
                ProprietaryBankTransactionCode proprietaryBankTransactionCode) {
            this.proprietaryBankTransactionCode = proprietaryBankTransactionCode;
            return this;
        }

        /**
         * Setter for currencyExchange.
         * @param  currencyExchange  CurrencyExchange value for currencyExchange.
         * @return Builder
         */
        public Builder currencyExchange(CurrencyExchange currencyExchange) {
            this.currencyExchange = currencyExchange;
            return this;
        }

        /**
         * Setter for creditorAgent.
         * @param  creditorAgent  CreditorAgent value for creditorAgent.
         * @return Builder
         */
        public Builder creditorAgent(CreditorAgent creditorAgent) {
            this.creditorAgent = creditorAgent;
            return this;
        }

        /**
         * Setter for debtorAgent.
         * @param  debtorAgent  DebtorAgent value for debtorAgent.
         * @return Builder
         */
        public Builder debtorAgent(DebtorAgent debtorAgent) {
            this.debtorAgent = debtorAgent;
            return this;
        }

        /**
         * Setter for cardInstrument.
         * @param  cardInstrument  CardInstrument value for cardInstrument.
         * @return Builder
         */
        public Builder cardInstrument(CardInstrument cardInstrument) {
            this.cardInstrument = cardInstrument;
            return this;
        }

        /**
         * Setter for transactionInformation.
         * @param  transactionInformation  String value for transactionInformation.
         * @return Builder
         */
        public Builder transactionInformation(String transactionInformation) {
            this.transactionInformation = transactionInformation;
            return this;
        }

        /**
         * Setter for balance.
         * @param  balance  Balance value for balance.
         * @return Builder
         */
        public Builder balance(Balance balance) {
            this.balance = balance;
            return this;
        }

        /**
         * Setter for merchantDetails.
         * @param  merchantDetails  MerchantDetails value for merchantDetails.
         * @return Builder
         */
        public Builder merchantDetails(MerchantDetails merchantDetails) {
            this.merchantDetails = merchantDetails;
            return this;
        }

        /**
         * Setter for creditorAccount.
         * @param  creditorAccount  CreditorAccount value for creditorAccount.
         * @return Builder
         */
        public Builder creditorAccount(CreditorAccount creditorAccount) {
            this.creditorAccount = creditorAccount;
            return this;
        }

        /**
         * Setter for debtorAccount.
         * @param  debtorAccount  DebtorAccount value for debtorAccount.
         * @return Builder
         */
        public Builder debtorAccount(DebtorAccount debtorAccount) {
            this.debtorAccount = debtorAccount;
            return this;
        }

        /**
         * Builds a new {@link TransactionModel} object using the set fields.
         * @return {@link TransactionModel}
         */
        public TransactionModel build() {
            return new TransactionModel(accountId, amount, creditDebitIndicator, status,
                    bookingDateTime, transactionId, transactionReference, statementReference,
                    valueDateTime, addressLine, bankTransactionCode, proprietaryBankTransactionCode,
                    currencyExchange, creditorAgent, debtorAgent, cardInstrument,
                    transactionInformation, balance, merchantDetails, creditorAccount,
                    debtorAccount);
        }
    }
}
