
# GetCorporatePaymentTransactionsRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**myInstitution** | **List&lt;String&gt;** | Specifies the institution which payments are requested. | 
**uetr** | **String** | Contains the unique end to end transaction reference.   Format is lowercase separated by hyphens. |  [optional]
**timeWindow** | [**DateTimePeriodDetails**](DateTimePeriodDetails.md) | Time window for this institution to which the search applies. |  [optional]
**transactionStatus** | [**List&lt;PaymentStatus4&gt;**](PaymentStatus4.md) | Specifies the status of a transaction, in a coded form. |  [optional]
**maximumNumber** | **String** | Indicates the maximum number of entries returned. |  [optional]
**more** | **String** | Contains the token to get the next set of responses. |  [optional]



