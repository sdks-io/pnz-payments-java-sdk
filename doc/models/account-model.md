
# Account Model

## Structure

`AccountModel`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountId` | `String` | Required | A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `40` | String getAccountId() | setAccountId(String accountId) |
| `Currency` | `String` | Required | Identification of the currency in which the account is held.  Usage: Currency should only be used in case one and the same account number covers several currencies and the initiating party needs to identify which currency needs to be used for settlement on the account.<br>**Constraints**: *Pattern*: `^[A-Z]{3,3}$` | String getCurrency() | setCurrency(String currency) |
| `AccountType` | [`AccountTypeEnum`](../../doc/models/account-type-enum.md) | Optional | Specifies the type of account (personal or business). | AccountTypeEnum getAccountType() | setAccountType(AccountTypeEnum accountType) |
| `AccountSubType` | [`AccountSubTypeEnum`](../../doc/models/account-sub-type-enum.md) | Optional | Specifies the sub type of account (product family group). | AccountSubTypeEnum getAccountSubType() | setAccountSubType(AccountSubTypeEnum accountSubType) |
| `Description` | `String` | Optional | Specifies the description of the account type.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `35` | String getDescription() | setDescription(String description) |
| `Nickname` | `String` | Required | The nickname of the account, assigned by the account owner in order to provide an additional means of identification of the account.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `70` | String getNickname() | setNickname(String nickname) |
| `Account` | [`Account`](../../doc/models/account.md) | Optional | Provides the details to identify an account. | Account getAccount() | setAccount(Account account) |
| `Servicer` | [`Servicer`](../../doc/models/servicer.md) | Optional | Party that manages the account on behalf of the account owner, that is manages the registration and booking of entries on the account, calculates balances on the account and provides information about the account. | Servicer getServicer() | setServicer(Servicer servicer) |

## Example (as JSON)

```json
{
  "AccountId": "AccountId4",
  "Currency": "Currency2",
  "AccountType": "Business",
  "AccountSubType": "PrePaidCard",
  "Description": "Description2",
  "Nickname": "Nickname6",
  "Account": {
    "SchemeName": "BECSElectronicCredit",
    "Identification": "Identification2",
    "Name": "Name8",
    "SecondaryIdentification": "SecondaryIdentification4"
  },
  "Servicer": {
    "SchemeName": "SchemeName4",
    "Identification": "Identification6"
  }
}
```

