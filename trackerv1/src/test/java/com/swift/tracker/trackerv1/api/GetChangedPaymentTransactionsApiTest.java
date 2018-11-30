/*
 * Tracker API V1
 * Move your app forward with the gpi API
 */


package com.swift.tracker.trackerv1.api;

import com.swift.tracker.trackerv1.ApiException;
import com.swift.tracker.trackerv1.model.CamtA0400102;
import com.swift.tracker.trackerv1.model.CamtA0400202;
import com.swift.tracker.trackerv1.model.ErrorCode;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GetChangedPaymentTransactionsApi
 */
@Ignore
public class GetChangedPaymentTransactionsApiTest {

    private final GetChangedPaymentTransactionsApi api = new GetChangedPaymentTransactionsApi();

    
    /**
     * Get Changed Payment Transactions
     *
     * This API is a delta query to get all payment update information starting from a given date and time. This API allows synchronization of a local database with the tracker database.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getChangedPaymentTransactionsPostTest() throws ApiException {
        String laUApplicationID = null;
        String laUVersion = null;
        String laUCallTime = null;
        String laURequestNonce = null;
        String laUSigned = null;
        String laUSignature = null;
        String xApiKey = null;
        CamtA0400102 requestBody = null;
        String xRecord = null;
        CamtA0400202 response = api.getChangedPaymentTransactionsPost(laUApplicationID, laUVersion, laUCallTime, laURequestNonce, laUSigned, laUSignature, xApiKey, requestBody, xRecord);

        // TODO: test validations
    }
    
}
