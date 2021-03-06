/*
 * gpi API
 * Move your app forward with the gpi API
 */



package com.swift.tracker.trackerv2.api;

import com.swift.tracker.trackerv2.ApiException;
import com.swift.tracker.trackerv2.model.CamtA0400103;
import com.swift.tracker.trackerv2.model.CamtA0400203;
import com.swift.tracker.trackerv2.model.ErrorCode;
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
        CamtA0400103 requestBody = null;
        CamtA0400203 response = api.getChangedPaymentTransactionsPost(laUApplicationID, laUVersion, laUCallTime, laURequestNonce, laUSigned, laUSignature, xApiKey, requestBody);

        // TODO: test validations
    }
    
}
