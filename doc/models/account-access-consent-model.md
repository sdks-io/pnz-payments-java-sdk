
# Account Access Consent Model

## Structure

`AccountAccessConsentModel`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Consent` | [`Consent`](../../doc/models/consent.md) | Required | Contains the requested consent | Consent getConsent() | setConsent(Consent consent) |

## Example (as JSON)

```json
{
  "Consent": {
    "Permissions": [
      "ReadStandingOrdersDetail"
    ],
    "ExpirationDateTime": "2016-03-13T12:52:32.123Z",
    "TransactionFromDateTime": "2016-03-13T12:52:32.123Z",
    "TransactionToDateTime": "2016-03-13T12:52:32.123Z"
  }
}
```

