# SearchingForCorporatePaymentTransactionsApi

All URIs are relative to *https://sandbox.swift.com/api-tracker-for-corporates-pilot/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCorporatePaymentTransactionsPost**](SearchingForCorporatePaymentTransactionsApi.md#getCorporatePaymentTransactionsPost) | **POST** /get_corporate_payment_transactions | Searching for corporate payment transactions


<a name="getCorporatePaymentTransactionsPost"></a>
# **getCorporatePaymentTransactionsPost**
> CamtA0800201 getCorporatePaymentTransactionsPost(laUApplicationID, laUVersion, laUCallTime, laURequestNonce, laUSigned, laUSignature, xApiKey, requestBody, xRecord)

Searching for corporate payment transactions

This API is a payment transaction search to get transaction-level information regarding all payments that match the search criteria.

### Example
```java
// Import classes:
//import com.swift.tracker.trackerg4c.ApiException;
//import com.swift.tracker.trackerg4c.api.SearchingForCorporatePaymentTransactionsApi;


SearchingForCorporatePaymentTransactionsApi apiInstance = new SearchingForCorporatePaymentTransactionsApi();
String laUApplicationID = "001"; // String | ID that identifies the application generationg the API and used by the gpi Connector to retrieve the related LAU keys
String laUVersion = "1.0"; // String | version of the LAUSigned header. Mandatory. \"1.0\" for this first release
String laUCallTime = "2018-03-23T15:56:26.728Z"; // String | timestamp in UTC of the API call in the format YYYY-MM-DDTHH:MM:SS.sssZ
String laURequestNonce = "e802ab96-bb3a-4965-9139-5214b9f0f074"; // String | a random value generated by the client. Provided with the request and copied by the gpi Connector on the response
String laUSigned = "(ApplAPIKey=yVGhKiV5z1ZGdaqFXoZ8AiSA9n5CrY6B),(RBACRole=[FullViewer/Scope/cclabeb0])"; // String | service specific HTTP headers
String laUSignature = "U1khA8h9Lm1PqzB99fG6uw=="; // String | contains the LAU signature, base64 ecoded
String xApiKey = "yVGhKiV5z1ZGdaqFXoZ8AiSA9n5CrY6B"; // String | An API key given to your application to authenticate against the sandbox URL
CamtA0800101 requestBody = new CamtA0800101(); // CamtA0800101 | Contains the request to obtain information on the corporate status of one or more payment transaction
String xRecord = "1"; // String | A type of API response to get from API Sandbox. A value between 1 and 7
try {
    CamtA0800201 result = apiInstance.getCorporatePaymentTransactionsPost(laUApplicationID, laUVersion, laUCallTime, laURequestNonce, laUSigned, laUSignature, xApiKey, requestBody, xRecord);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchingForCorporatePaymentTransactionsApi#getCorporatePaymentTransactionsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **laUApplicationID** | **String**| ID that identifies the application generationg the API and used by the gpi Connector to retrieve the related LAU keys | [default to 001]
 **laUVersion** | **String**| version of the LAUSigned header. Mandatory. \&quot;1.0\&quot; for this first release | [default to 1.0]
 **laUCallTime** | **String**| timestamp in UTC of the API call in the format YYYY-MM-DDTHH:MM:SS.sssZ | [default to 2018-03-23T15:56:26.728Z]
 **laURequestNonce** | **String**| a random value generated by the client. Provided with the request and copied by the gpi Connector on the response | [default to e802ab96-bb3a-4965-9139-5214b9f0f074]
 **laUSigned** | **String**| service specific HTTP headers | [default to (ApplAPIKey&#x3D;yVGhKiV5z1ZGdaqFXoZ8AiSA9n5CrY6B),(RBACRole&#x3D;[FullViewer/Scope/cclabeb0])]
 **laUSignature** | **String**| contains the LAU signature, base64 ecoded | [default to U1khA8h9Lm1PqzB99fG6uw&#x3D;&#x3D;]
 **xApiKey** | **String**| An API key given to your application to authenticate against the sandbox URL | [default to yVGhKiV5z1ZGdaqFXoZ8AiSA9n5CrY6B]
 **requestBody** | [**CamtA0800101**](CamtA0800101.md)| Contains the request to obtain information on the corporate status of one or more payment transaction |
 **xRecord** | **String**| A type of API response to get from API Sandbox. A value between 1 and 7 | [optional] [default to 1]

### Return type

[**CamtA0800201**](CamtA0800201.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

