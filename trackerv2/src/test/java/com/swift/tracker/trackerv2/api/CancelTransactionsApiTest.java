/*
 * gpi API
 * Move your app forward with the gpi API
 */



package com.swift.tracker.trackerv2.api;

import com.swift.tracker.trackerv2.ApiException;
import com.swift.tracker.trackerv2.model.CamtA0600102;
import com.swift.tracker.trackerv2.model.CamtA0600202;
import com.swift.tracker.trackerv2.model.ErrorCode;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CancelTransactionsApi
 */
@Ignore
public class CancelTransactionsApiTest {

    private final CancelTransactionsApi api = new CancelTransactionsApi();

    
    /**
     * Cancel Transactions
     *
     * This API informs the tracker about the cancellation of a given transaction
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cancelTransactionsPostTest() throws ApiException {
        String laUApplicationID = null;
        String laUVersion = null;
        String laUCallTime = null;
        String laURequestNonce = null;
        String laUSigned = null;
        String laUSignature = null;
        Boolean signatureRequired = null;
        String xApiKey = null;
        CamtA0600102 requestBody = null;
        CamtA0600202 response = api.cancelTransactionsPost(laUApplicationID, laUVersion, laUCallTime, laURequestNonce, laUSigned, laUSignature, signatureRequired, xApiKey, requestBody);

        // TODO: test validations
    }
    
}
