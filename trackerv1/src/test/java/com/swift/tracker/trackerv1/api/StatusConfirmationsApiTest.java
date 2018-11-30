/*
 * Tracker API V1
 * Move your app forward with the gpi API
 */


package com.swift.tracker.trackerv1.api;

import com.swift.tracker.trackerv1.ApiException;
import com.swift.tracker.trackerv1.model.CamtA0100102;
import com.swift.tracker.trackerv1.model.CamtA0100202;
import com.swift.tracker.trackerv1.model.ErrorCode;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for StatusConfirmationsApi
 */
@Ignore
public class StatusConfirmationsApiTest {

    private final StatusConfirmationsApi api = new StatusConfirmationsApi();

    
    /**
     * Status Confirmations
     *
     * This API is a status confirmation update to inform the tracker about the updated status of a given payment
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void statusConfirmationsPostTest() throws ApiException {
        String laUApplicationID = null;
        String laUVersion = null;
        String laUCallTime = null;
        String laURequestNonce = null;
        String laUSigned = null;
        String laUSignature = null;
        String xApiKey = null;
        CamtA0100102 requestBody = null;
        String xRecord = null;
        CamtA0100202 response = api.statusConfirmationsPost(laUApplicationID, laUVersion, laUCallTime, laURequestNonce, laUSigned, laUSignature, xApiKey, requestBody, xRecord);

        // TODO: test validations
    }
    
}
