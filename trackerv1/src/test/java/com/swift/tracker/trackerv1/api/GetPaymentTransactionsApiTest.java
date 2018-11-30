/*
 * Tracker API V1
 * Move your app forward with the gpi API
 */


package com.swift.tracker.trackerv1.api;

import com.swift.tracker.trackerv1.ApiException;
import com.swift.tracker.trackerv1.model.CamtA0300102;
import com.swift.tracker.trackerv1.model.CamtA0300202;
import com.swift.tracker.trackerv1.model.ErrorCode;
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
        CamtA0300102 requestBody = null;
        String xRecord = null;
        CamtA0300202 response = api.getPaymentTransactionsPost(laUApplicationID, laUVersion, laUCallTime, laURequestNonce, laUSigned, laUSignature, xApiKey, requestBody, xRecord);

        // TODO: test validations
    }
    
}
