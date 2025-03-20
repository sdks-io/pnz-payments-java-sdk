
# Account Response Data

## Structure

`AccountResponseData`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Account` | [`List<AccountModel>`](../../doc/models/account-model.md) | Optional | Account | List<AccountModel> getAccount() | setAccount(List<AccountModel> account) |

## Example (as JSON)

```json
{
  "Account": [
    {
      "AccountId": "AccountId8",
      "Currency": "Currency6",
      "AccountType": "Business",
      "AccountSubType": "PrePaidCard",
      "Description": "Description8",
      "Nickname": "Nickname0",
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
    },
    {
      "AccountId": "AccountId8",
      "Currency": "Currency6",
      "AccountType": "Business",
      "AccountSubType": "PrePaidCard",
      "Description": "Description8",
      "Nickname": "Nickname0",
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
    },
    {
      "AccountId": "AccountId8",
      "Currency": "Currency6",
      "AccountType": "Business",
      "AccountSubType": "PrePaidCard",
      "Description": "Description8",
      "Nickname": "Nickname0",
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
  ]
}
```

