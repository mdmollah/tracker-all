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
import com.swift.tracker.trackerv2.model.CamtA0700102;
import com.swift.tracker.trackerv2.model.CamtA0700202;
import com.swift.tracker.trackerv2.model.ErrorCode;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CancellationStatusConfirmationsApi
 */
@Ignore
public class CancellationStatusConfirmationsApiTest {

    private final CancellationStatusConfirmationsApi api = new CancellationStatusConfirmationsApi();

    
    /**
     * Cancellation Status Confirmations
     *
     * This call informs the tracker about the updated status of a given payment
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cancellationStatusConfirmationsPostTest() throws ApiException {
        String laUApplicationID = null;
        String laUVersion = null;
        String laUCallTime = null;
        String laURequestNonce = null;
        String laUSigned = null;
        String laUSignature = null;
        Boolean signatureRequired = null;
        String xApiKey = null;
        CamtA0700102 requestBody = null;
        CamtA0700202 response = api.cancellationStatusConfirmationsPost(laUApplicationID, laUVersion, laUCallTime, laURequestNonce, laUSigned, laUSignature, signatureRequired, xApiKey, requestBody);

        // TODO: test validations
    }
    
}
