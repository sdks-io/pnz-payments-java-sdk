
# Card Instrument

Set of elements to describe the card instrument used in the transaction.

## Structure

`CardInstrument`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CardSchemeName` | [`CardSchemeNameEnum`](../../doc/models/card-scheme-name-enum.md) | Required | Name of the card scheme. | CardSchemeNameEnum getCardSchemeName() | setCardSchemeName(CardSchemeNameEnum cardSchemeName) |
| `AuthorisationType` | [`AuthorisationTypeEnum`](../../doc/models/authorisation-type-enum.md) | Optional | The card authorisation type. | AuthorisationTypeEnum getAuthorisationType() | setAuthorisationType(AuthorisationTypeEnum authorisationType) |
| `Name` | `String` | Optional | Name of the cardholder using the card instrument.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `70` | String getName() | setName(String name) |
| `Identification` | `String` | Optional | Identification assigned by an institution to identify the card instrument used in the transaction. This identification is known by the account owner, and may be masked.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `34` | String getIdentification() | setIdentification(String identification) |

## Example (as JSON)

```json
{
  "CardSchemeName": "Diners",
  "AuthorisationType": "None",
  "Name": "Name8",
  "Identification": "Identification2"
}
```

