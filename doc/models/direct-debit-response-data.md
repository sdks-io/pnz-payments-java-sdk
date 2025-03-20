
# Direct Debit Response Data

## Structure

`DirectDebitResponseData`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DirectDebit` | [`List<DirectDebitModel>`](../../doc/models/direct-debit-model.md) | Optional | DirectDebit | List<DirectDebitModel> getDirectDebit() | setDirectDebit(List<DirectDebitModel> directDebit) |

## Example (as JSON)

```json
{
  "DirectDebit": [
    {
      "AccountId": "AccountId8",
      "DirectDebitId": "DirectDebitId6",
      "MandateIdentification": "MandateIdentification2",
      "DirectDebitStatusCode": "Active",
      "Name": "Name8",
      "PreviousPaymentDateTime": "2016-03-13T12:52:32.123Z",
      "PreviousPaymentAmount": {
        "Amount": "Amount0",
        "Currency": "Currency6"
      }
    }
  ]
}
```

