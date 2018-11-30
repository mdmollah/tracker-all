
# PaymentEvent6

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**from** | **String** | The sending MessagingEndpoint that has created this Business Message for the receiving MessagingEndpoint that will process this Business Message.    Note the sending MessagingEndpoint might be different from the sending address potentially contained in the transport header (as defined in the transport layer). | 
**to** | **String** | The MessagingEndpoint designated by the sending MessagingEndpoint to be the recipient who will ultimately process this Business Message.    Note the receiving MessagingEndpoint might be different from the receiving address potentially contained in the transport header (as defined in the transport layer). |  [optional]
**chargeBearer** | [**ChargeBearerType3Code**](ChargeBearerType3Code.md) | Specifies which party/parties will bear the charges associated with the processing of the payment transaction. |  [optional]
**chargeAmount** | [**ActiveOrHistoricCurrencyAndAmount**](ActiveOrHistoricCurrencyAndAmount.md) | Amount of money asked or paid for the charge. |  [optional]
**foreignExchangeDetails** | [**CurrencyExchange8**](CurrencyExchange8.md) | Specifies the exchange rate details between two currencies. |  [optional]



