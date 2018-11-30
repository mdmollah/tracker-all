/*
 * Tracker API V1
 * Move your app forward with the gpi API
 */



package com.swift.tracker.trackerv1.api;

import com.swift.tracker.trackerv1.ApiException;
import com.swift.tracker.trackerv1.model.CamtA0200102;
import com.swift.tracker.trackerv1.model.CamtA0200202;
import com.swift.tracker.trackerv1.model.ErrorCode;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GetPaymentTransactionDetailsApi
 */
@Ignore
public class GetPaymentTransactionDetailsApiTest {

    private final GetPaymentTransactionDetailsApi api = new GetPaymentTransactionDetailsApi();

    
    /**
     * Get Payment Transaction Details
     *
     * This API is a payment query to get detailed information regarding a given payment. It requires the UETR to be known.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPaymentTransactionDetailsPostTest() throws ApiException {
        String laUApplicationID = null;
        String laUVersion = null;
        String laUCallTime = null;
        String laURequestNonce = null;
        String laUSigned = null;
        String laUSignature = null;
        String xApiKey = null;
        CamtA0200102 requestBody = null;
        String xRecord = null;
        CamtA0200202 response = api.getPaymentTransactionDetailsPost(laUApplicationID, laUVersion, laUCallTime, laURequestNonce, laUSigned, laUSignature, xApiKey, requestBody, xRecord);

        // TODO: test validations
    }
    
}
