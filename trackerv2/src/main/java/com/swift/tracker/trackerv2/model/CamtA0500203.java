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


package com.swift.tracker.trackerv2.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.swift.tracker.trackerv2.model.GetInvalidEventsResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ISO 20022 JSON Schema GetInvalidEventsResponse (camt.a05.002.03) Generated by SWIFT Standards 2018-07-16 09:05:02
 */
@ApiModel(description = "ISO 20022 JSON Schema GetInvalidEventsResponse (camt.a05.002.03) Generated by SWIFT Standards 2018-07-16 09:05:02")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-30T10:25:03.329-05:00")
public class CamtA0500203 {
  @SerializedName("get_invalid_events_response")
  private GetInvalidEventsResponse getInvalidEventsResponse = null;

  public CamtA0500203 getInvalidEventsResponse(GetInvalidEventsResponse getInvalidEventsResponse) {
    this.getInvalidEventsResponse = getInvalidEventsResponse;
    return this;
  }

   /**
   * Get getInvalidEventsResponse
   * @return getInvalidEventsResponse
  **/
  @ApiModelProperty(value = "")
  public GetInvalidEventsResponse getGetInvalidEventsResponse() {
    return getInvalidEventsResponse;
  }

  public void setGetInvalidEventsResponse(GetInvalidEventsResponse getInvalidEventsResponse) {
    this.getInvalidEventsResponse = getInvalidEventsResponse;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CamtA0500203 camtA0500203 = (CamtA0500203) o;
    return Objects.equals(this.getInvalidEventsResponse, camtA0500203.getInvalidEventsResponse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(getInvalidEventsResponse);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CamtA0500203 {\n");
    
    sb.append("    getInvalidEventsResponse: ").append(toIndentedString(getInvalidEventsResponse)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
