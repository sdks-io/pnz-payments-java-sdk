
# Get Scheduled Payments Response Data

## Structure

`GetScheduledPaymentsResponseData`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ScheduledPayment` | [`List<ScheduledPaymentModel>`](../../doc/models/scheduled-payment-model.md) | Optional | - | List<ScheduledPaymentModel> getScheduledPayment() | setScheduledPayment(List<ScheduledPaymentModel> scheduledPayment) |

## Example (as JSON)

```json
{
  "ScheduledPayment": [
    {
      "AccountId": "AccountId0",
      "ScheduledPaymentId": "ScheduledPaymentId8",
      "ScheduledPaymentDateTime": "2016-03-13T12:52:32.123Z",
      "ScheduledType": "Arrival",
      "InstructedAmount": {
        "Amount": "Amount0",
        "Currency": "Currency6"
      },
      "Reference": {
        "CreditorName": "CreditorName6",
        "CreditorReference": {
          "Particulars": "Particulars4",
          "Code": "Code8",
          "Reference": "Reference0"
        },
        "DebtorName": "DebtorName0",
        "DebtorReference": {
          "Particulars": "Particulars8",
          "Code": "Code2",
          "Reference": "Reference4"
        }
      },
      "CreditorAgent": {
        "SchemeName": "BICFI",
        "Identification": "Identification4",
        "Name": "Name4",
        "PostalAddress": {
          "AddressType": "DeliveryTo",
          "AddressLine": [
            "AddressLine3",
            "AddressLine4",
            "AddressLine5"
          ],
          "StreetName": "StreetName2",
          "BuildingNumber": "BuildingNumber6",
          "PostCode": "PostCode6",
          "Country": "Country6"
        }
      },
      "CreditorAccount": {
        "SchemeName": "BECSElectronicCredit",
        "Identification": "Identification2",
        "Name": "Name8",
        "SecondaryIdentification": "SecondaryIdentification4"
      }
    }
  ]
}
```

