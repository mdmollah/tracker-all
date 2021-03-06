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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Contains the different states which a payment transaction can be in.
 */
@JsonAdapter(PaymentTransactionState1Code.Adapter.class)
public enum PaymentTransactionState1Code {
  
  CRED("CRED"),
  
  RCCA("RCCA"),
  
  RCMY("RCMY"),
  
  STMY("STMY"),
  
  STDA("STDA");

  private String value;

  PaymentTransactionState1Code(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PaymentTransactionState1Code fromValue(String text) {
    for (PaymentTransactionState1Code b : PaymentTransactionState1Code.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<PaymentTransactionState1Code> {
    @Override
    public void write(final JsonWriter jsonWriter, final PaymentTransactionState1Code enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PaymentTransactionState1Code read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PaymentTransactionState1Code.fromValue(String.valueOf(value));
    }
  }
}

