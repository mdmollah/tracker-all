/*
 * Tracker API V1
 * Move your app forward with the gpi API
 *
 * OpenAPI spec version: 1.2.37
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.swift.tracker.trackerv1.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.swift.tracker.trackerv1.model.GetPaymentTransactionsRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Generated by SWIFT Standards 2017-06-29 13:18:18
 */
@ApiModel(description = "Generated by SWIFT Standards 2017-06-29 13:18:18")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-30T10:19:12.083-05:00")
public class CamtA0300102 {
  @SerializedName("get_payment_transactions_request")
  private GetPaymentTransactionsRequest getPaymentTransactionsRequest = null;

  public CamtA0300102 getPaymentTransactionsRequest(GetPaymentTransactionsRequest getPaymentTransactionsRequest) {
    this.getPaymentTransactionsRequest = getPaymentTransactionsRequest;
    return this;
  }

   /**
   * Get getPaymentTransactionsRequest
   * @return getPaymentTransactionsRequest
  **/
  @ApiModelProperty(value = "")
  public GetPaymentTransactionsRequest getGetPaymentTransactionsRequest() {
    return getPaymentTransactionsRequest;
  }

  public void setGetPaymentTransactionsRequest(GetPaymentTransactionsRequest getPaymentTransactionsRequest) {
    this.getPaymentTransactionsRequest = getPaymentTransactionsRequest;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CamtA0300102 camtA0300102 = (CamtA0300102) o;
    return Objects.equals(this.getPaymentTransactionsRequest, camtA0300102.getPaymentTransactionsRequest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(getPaymentTransactionsRequest);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CamtA0300102 {\n");
    
    sb.append("    getPaymentTransactionsRequest: ").append(toIndentedString(getPaymentTransactionsRequest)).append("\n");
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

