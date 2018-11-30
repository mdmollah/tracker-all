/*
 * gpi API
 * Move your app forward with the gpi API
 */



package com.swift.tracker.trackerv2.auth;

import com.swift.tracker.trackerv2.Pair;

import java.util.Map;
import java.util.List;

public class OAuth implements Authentication {
  private String accessToken;

  public String getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  @Override
  public void applyToParams(List<Pair> queryParams, Map<String, String> headerParams) {
    if (accessToken != null) {
      headerParams.put("Authorization", "Bearer " + accessToken);
    }
  }
}
