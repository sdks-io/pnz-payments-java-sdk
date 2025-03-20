
# Debtor Account

Unambiguous identification of the account of the debtor, in the case of a crebit transaction.

## Structure

`DebtorAccount`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `SchemeName` | [`AccountSchemeModelEnum`](../../doc/models/account-scheme-model-enum.md) | Required | - | AccountSchemeModelEnum getSchemeName() | setSchemeName(AccountSchemeModelEnum schemeName) |
| `Identification` | `String` | Required | Identification assigned by an institution to identify an account. This identification is known by the account owner.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `34` | String getIdentification() | setIdentification(String identification) |
| `Name` | `String` | Optional | Name of the account, as assigned by the account servicing institution, in agreement with the account owner in order to provide an additional means of identification of the account.<br>Usage: The account name is different from the account owner name. The account name is used in certain user communities to provide a means of identifying the account, in addition to the account owner's identity and the account number.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `70` | String getName() | setName(String name) |
| `SecondaryIdentification` | `String` | Optional | This is secondary identification of the account, as assigned by the account servicing institution.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `34` | String getSecondaryIdentification() | setSecondaryIdentification(String secondaryIdentification) |

## Example (as JSON)

```json
{
  "SchemeName": "BECSElectronicCredit",
  "Identification": "Identification4",
  "Name": "Name6",
  "SecondaryIdentification": "SecondaryIdentification2"
}
```

