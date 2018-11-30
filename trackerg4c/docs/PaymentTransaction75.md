
# PaymentTransaction75

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**uetr** | **String** | Contains the unique end to end transaction reference of a payment. | 
**transactionStatus** | [**PaymentStatus4**](PaymentStatus4.md) | Specifies the status of a transaction, in a coded form. | 
**eventTime** | **String** | This is the time when the related status was reached. | 
**originator** | **String** | Party that issues the status. | 
**instructedAmount** | [**ActiveOrHistoricCurrencyAndAmount**](ActiveOrHistoricCurrencyAndAmount.md) | Amount of money to be moved between the debtor and creditor, before deduction of charges, expressed in the currency as ordered by the initiating party.  This amount has to be transported unchanged through the transaction chain. |  [optional]
**confirmedAmount** | [**ActiveOrHistoricCurrencyAndAmount**](ActiveOrHistoricCurrencyAndAmount.md) | The actual amount that has been paid to the ultimate beneficiary, after all charges etc... have been deducted. |  [optional]
**paymentEvent** | [**List&lt;PaymentEvent6&gt;**](PaymentEvent6.md) | This groups the information of an event, i.e., of a payment message or status confirmation update. It is repeated as many times as there are events to be returned. | 



