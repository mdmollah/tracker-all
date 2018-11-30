/*
 * gpi Corporate API
 * Move your app forward with the gpi Corporate API
 *
 * OpenAPI spec version: 2.0.2-sandbox
 * Contact: Li.JIE@swift.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.swift.tracker.trackerg4c.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.swift.tracker.trackerg4c.model.GetCorporatePaymentTransactionsRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ISO 20022 JSON Schema GetCorporatePaymentTransactionsRequest (camt.a08.001.01) Generated by SWIFT Standards 2018-07-12 05:30:53
 */
@ApiModel(description = "ISO 20022 JSON Schema GetCorporatePaymentTransactionsRequest (camt.a08.001.01) Generated by SWIFT Standards 2018-07-12 05:30:53")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-30T10:36:31.126-05:00")
public class CamtA0800101 {
  @SerializedName("get_corporate_payment_transactions_request")
  private GetCorporatePaymentTransactionsRequest getCorporatePaymentTransactionsRequest = null;

  public CamtA0800101 getCorporatePaymentTransactionsRequest(GetCorporatePaymentTransactionsRequest getCorporatePaymentTransactionsRequest) {
    this.getCorporatePaymentTransactionsRequest = getCorporatePaymentTransactionsRequest;
    return this;
  }

   /**
   * Get getCorporatePaymentTransactionsRequest
   * @return getCorporatePaymentTransactionsRequest
  **/
  @ApiModelProperty(value = "")
  public GetCorporatePaymentTransactionsRequest getGetCorporatePaymentTransactionsRequest() {
    return getCorporatePaymentTransactionsRequest;
  }

  public void setGetCorporatePaymentTransactionsRequest(GetCorporatePaymentTransactionsRequest getCorporatePaymentTransactionsRequest) {
    this.getCorporatePaymentTransactionsRequest = getCorporatePaymentTransactionsRequest;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CamtA0800101 camtA0800101 = (CamtA0800101) o;
    return Objects.equals(this.getCorporatePaymentTransactionsRequest, camtA0800101.getCorporatePaymentTransactionsRequest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(getCorporatePaymentTransactionsRequest);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CamtA0800101 {\n");
    
    sb.append("    getCorporatePaymentTransactionsRequest: ").append(toIndentedString(getCorporatePaymentTransactionsRequest)).append("\n");
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

