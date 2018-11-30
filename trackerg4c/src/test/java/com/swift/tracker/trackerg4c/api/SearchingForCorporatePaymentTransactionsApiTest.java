/*
 * gpi Corporate API
 * Move your app forward with the gpi Corporate API
 */



package com.swift.tracker.trackerg4c.api;

import com.swift.tracker.trackerg4c.ApiException;
import com.swift.tracker.trackerg4c.model.CamtA0800101;
import com.swift.tracker.trackerg4c.model.CamtA0800201;
import com.swift.tracker.trackerg4c.model.ErrorCode;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SearchingForCorporatePaymentTransactionsApi
 */
@Ignore
public class SearchingForCorporatePaymentTransactionsApiTest {

    private final SearchingForCorporatePaymentTransactionsApi api = new SearchingForCorporatePaymentTransactionsApi();

    
    /**
     * Searching for corporate payment transactions
     *
     * This API is a payment transaction search to get transaction-level information regarding all payments that match the search criteria.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCorporatePaymentTransactionsPostTest() throws ApiException {
        String laUApplicationID = null;
        String laUVersion = null;
        String laUCallTime = null;
        String laURequestNonce = null;
        String laUSigned = null;
        String laUSignature = null;
        String xApiKey = null;
        CamtA0800101 requestBody = null;
        String xRecord = null;
        CamtA0800201 response = api.getCorporatePaymentTransactionsPost(laUApplicationID, laUVersion, laUCallTime, laURequestNonce, laUSigned, laUSignature, xApiKey, requestBody, xRecord);

        // TODO: test validations
    }
    
}
