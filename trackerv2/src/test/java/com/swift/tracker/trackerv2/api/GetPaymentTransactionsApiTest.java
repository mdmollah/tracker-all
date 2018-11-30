/*
 * gpi API
 * Move your app forward with the gpi API
 *
 * OpenAPI spec version: 2.0.2
 * Contact: Li.JIE@swift.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.swift.tracker.trackerv2.api;

import com.swift.tracker.trackerv2.ApiException;
import com.swift.tracker.trackerv2.model.CamtA0300103;
import com.swift.tracker.trackerv2.model.CamtA0300203;
import com.swift.tracker.trackerv2.model.ErrorCode;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GetPaymentTransactionsApi
 */
@Ignore
public class GetPaymentTransactionsApiTest {

    private final GetPaymentTransactionsApi api = new GetPaymentTransactionsApi();

    
    /**
     * Get Payment Transactions
     *
     * This API is a payment transaction search to get transaction-level information regarding all payments that match the search criteria.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPaymentTransactionsPostTest() throws ApiException {
        String laUApplicationID = null;
        String laUVersion = null;
        String laUCallTime = null;
        String laURequestNonce = null;
        String laUSigned = null;
        String laUSignature = null;
        String xApiKey = null;
        CamtA0300103 requestBody = null;
        CamtA0300203 response = api.getPaymentTransactionsPost(laUApplicationID, laUVersion, laUCallTime, laURequestNonce, laUSigned, laUSignature, xApiKey, requestBody);

        // TODO: test validations
    }
    
}
