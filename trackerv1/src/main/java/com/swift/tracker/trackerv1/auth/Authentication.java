/*
 * Tracker API V1
 * Move your app forward with the gpi API
 */


package com.swift.tracker.trackerv1.auth;

import com.swift.tracker.trackerv1.Pair;

import java.util.Map;
import java.util.List;

public interface Authentication {
    /**
     * Apply authentication settings to header and query params.
     *
     * @param queryParams List of query parameters
     * @param headerParams Map of header parameters
     */
    void applyToParams(List<Pair> queryParams, Map<String, String> headerParams);
}
