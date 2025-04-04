/*
 * AccountAndTransactionAPISpecificationLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package nz.co.middleware.apicentre.apinomatls.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for AccountModel type.
 */
public class AccountModel {
    private String accountId;
    private String currency;
    private AccountTypeEnum accountType;
    private AccountSubTypeEnum accountSubType;
    private String description;
    private String nickname;
    private Account account;
    private Servicer servicer;

    /**
     * Default constructor.
     */
    public AccountModel() {
    }

    /**
     * Initialization constructor.
     * @param  accountId  String value for accountId.
     * @param  currency  String value for currency.
     * @param  nickname  String value for nickname.
     * @param  accountType  AccountTypeEnum value for accountType.
     * @param  accountSubType  AccountSubTypeEnum value for accountSubType.
     * @param  description  String value for description.
     * @param  account  Account value for account.
     * @param  servicer  Servicer value for servicer.
     */
    public AccountModel(
            String accountId,
            String currency,
            String nickname,
            AccountTypeEnum accountType,
            AccountSubTypeEnum accountSubType,
            String description,
            Account account,
            Servicer servicer) {
        this.accountId = accountId;
        this.currency = currency;
        this.accountType = accountType;
        this.accountSubType = accountSubType;
        this.description = description;
        this.nickname = nickname;
        this.account = account;
        this.servicer = servicer;
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
     * Getter for Currency.
     * Identification of the currency in which the account is held. Usage: Currency should only be
     * used in case one and the same account number covers several currencies and the initiating
     * party needs to identify which currency needs to be used for settlement on the account.
     * @return Returns the String
     */
    @JsonGetter("Currency")
    public String getCurrency() {
        return currency;
    }

    /**
     * Setter for Currency.
     * Identification of the currency in which the account is held. Usage: Currency should only be
     * used in case one and the same account number covers several currencies and the initiating
     * party needs to identify which currency needs to be used for settlement on the account.
     * @param currency Value for String
     */
    @JsonSetter("Currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * Getter for AccountType.
     * Specifies the type of account (personal or business).
     * @return Returns the AccountTypeEnum
     */
    @JsonGetter("AccountType")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public AccountTypeEnum getAccountType() {
        return accountType;
    }

    /**
     * Setter for AccountType.
     * Specifies the type of account (personal or business).
     * @param accountType Value for AccountTypeEnum
     */
    @JsonSetter("AccountType")
    public void setAccountType(AccountTypeEnum accountType) {
        this.accountType = accountType;
    }

    /**
     * Getter for AccountSubType.
     * Specifies the sub type of account (product family group).
     * @return Returns the AccountSubTypeEnum
     */
    @JsonGetter("AccountSubType")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public AccountSubTypeEnum getAccountSubType() {
        return accountSubType;
    }

    /**
     * Setter for AccountSubType.
     * Specifies the sub type of account (product family group).
     * @param accountSubType Value for AccountSubTypeEnum
     */
    @JsonSetter("AccountSubType")
    public void setAccountSubType(AccountSubTypeEnum accountSubType) {
        this.accountSubType = accountSubType;
    }

    /**
     * Getter for Description.
     * Specifies the description of the account type.
     * @return Returns the String
     */
    @JsonGetter("Description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * Specifies the description of the account type.
     * @param description Value for String
     */
    @JsonSetter("Description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Getter for Nickname.
     * The nickname of the account, assigned by the account owner in order to provide an additional
     * means of identification of the account.
     * @return Returns the String
     */
    @JsonGetter("Nickname")
    public String getNickname() {
        return nickname;
    }

    /**
     * Setter for Nickname.
     * The nickname of the account, assigned by the account owner in order to provide an additional
     * means of identification of the account.
     * @param nickname Value for String
     */
    @JsonSetter("Nickname")
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * Getter for Account.
     * Provides the details to identify an account.
     * @return Returns the Account
     */
    @JsonGetter("Account")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Account getAccount() {
        return account;
    }

    /**
     * Setter for Account.
     * Provides the details to identify an account.
     * @param account Value for Account
     */
    @JsonSetter("Account")
    public void setAccount(Account account) {
        this.account = account;
    }

    /**
     * Getter for Servicer.
     * Party that manages the account on behalf of the account owner, that is manages the
     * registration and booking of entries on the account, calculates balances on the account and
     * provides information about the account.
     * @return Returns the Servicer
     */
    @JsonGetter("Servicer")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Servicer getServicer() {
        return servicer;
    }

    /**
     * Setter for Servicer.
     * Party that manages the account on behalf of the account owner, that is manages the
     * registration and booking of entries on the account, calculates balances on the account and
     * provides information about the account.
     * @param servicer Value for Servicer
     */
    @JsonSetter("Servicer")
    public void setServicer(Servicer servicer) {
        this.servicer = servicer;
    }

    /**
     * Converts this AccountModel into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AccountModel [" + "accountId=" + accountId + ", currency=" + currency
                + ", nickname=" + nickname + ", accountType=" + accountType + ", accountSubType="
                + accountSubType + ", description=" + description + ", account=" + account
                + ", servicer=" + servicer + "]";
    }

    /**
     * Builds a new {@link AccountModel.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link AccountModel.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(accountId, currency, nickname)
                .accountType(getAccountType())
                .accountSubType(getAccountSubType())
                .description(getDescription())
                .account(getAccount())
                .servicer(getServicer());
        return builder;
    }

    /**
     * Class to build instances of {@link AccountModel}.
     */
    public static class Builder {
        private String accountId;
        private String currency;
        private String nickname;
        private AccountTypeEnum accountType;
        private AccountSubTypeEnum accountSubType;
        private String description;
        private Account account;
        private Servicer servicer;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  accountId  String value for accountId.
         * @param  currency  String value for currency.
         * @param  nickname  String value for nickname.
         */
        public Builder(String accountId, String currency, String nickname) {
            this.accountId = accountId;
            this.currency = currency;
            this.nickname = nickname;
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
         * Setter for currency.
         * @param  currency  String value for currency.
         * @return Builder
         */
        public Builder currency(String currency) {
            this.currency = currency;
            return this;
        }

        /**
         * Setter for nickname.
         * @param  nickname  String value for nickname.
         * @return Builder
         */
        public Builder nickname(String nickname) {
            this.nickname = nickname;
            return this;
        }

        /**
         * Setter for accountType.
         * @param  accountType  AccountTypeEnum value for accountType.
         * @return Builder
         */
        public Builder accountType(AccountTypeEnum accountType) {
            this.accountType = accountType;
            return this;
        }

        /**
         * Setter for accountSubType.
         * @param  accountSubType  AccountSubTypeEnum value for accountSubType.
         * @return Builder
         */
        public Builder accountSubType(AccountSubTypeEnum accountSubType) {
            this.accountSubType = accountSubType;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  String value for description.
         * @return Builder
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Setter for account.
         * @param  account  Account value for account.
         * @return Builder
         */
        public Builder account(Account account) {
            this.account = account;
            return this;
        }

        /**
         * Setter for servicer.
         * @param  servicer  Servicer value for servicer.
         * @return Builder
         */
        public Builder servicer(Servicer servicer) {
            this.servicer = servicer;
            return this;
        }

        /**
         * Builds a new {@link AccountModel} object using the set fields.
         * @return {@link AccountModel}
         */
        public AccountModel build() {
            return new AccountModel(accountId, currency, nickname, accountType, accountSubType,
                    description, account, servicer);
        }
    }
}
