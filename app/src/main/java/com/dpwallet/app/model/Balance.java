/*
 * Accounts Read Data Plane
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.dpwallet.app.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

import org.threeten.bp.OffsetDateTime;

/**
 * Balance
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-28T20:27:13.465275500-07:00[America/Los_Angeles]")
public class Balance {
  public static final String SERIALIZED_NAME_BALANCE = "balance";
  @SerializedName(SERIALIZED_NAME_BALANCE)
  private Object balance = null;

  public static final String SERIALIZED_NAME_NONCE = "nonce";
  @SerializedName(SERIALIZED_NAME_NONCE)
  private Object nonce = null;

  public static final String SERIALIZED_NAME_BLOCK_NUMBER = "blockNumber";
  @SerializedName(SERIALIZED_NAME_BLOCK_NUMBER)
  private Double blockNumber;

  public static final String SERIALIZED_NAME_BLOCK_DATE = "blockDate";
  @SerializedName(SERIALIZED_NAME_BLOCK_DATE)
  private OffsetDateTime blockDate;

  public Balance balance(Object balance) {
    this.balance = balance;
    return this;
  }

   /**
   * Get balance
   * @return balance
  **/
  @ApiModelProperty(value = "")
  public Object getBalance() {
    return balance;
  }

  public void setBalance(Object balance) {
    this.balance = balance;
  }

  public Balance nonce(Object nonce) {
    this.nonce = nonce;
    return this;
  }

   /**
   * Get nonce
   * @return nonce
  **/
  @ApiModelProperty(value = "")
  public Object getNonce() {
    return nonce;
  }

  public void setNonce(Object nonce) {
    this.nonce = nonce;
  }

  public Balance blockNumber(Double blockNumber) {
    this.blockNumber = blockNumber;
    return this;
  }

   /**
   * Get blockNumber
   * @return blockNumber
  **/
  @ApiModelProperty(value = "")
  public Double getBlockNumber() {
    return blockNumber;
  }

  public void setBlockNumber(Double blockNumber) {
    this.blockNumber = blockNumber;
  }

  public Balance blockDate(OffsetDateTime blockDate) {
    this.blockDate = blockDate;
    return this;
  }

   /**
   * Get blockDate
   * @return blockDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getBlockDate() {
    return blockDate;
  }

  public void setBlockDate(OffsetDateTime blockDate) {
    this.blockDate = blockDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Balance balance = (Balance) o;
    return Objects.equals(this.balance, balance.balance) &&
        Objects.equals(this.nonce, balance.nonce) &&
        Objects.equals(this.blockNumber, balance.blockNumber) &&
        Objects.equals(this.blockDate, balance.blockDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balance, nonce, blockNumber, blockDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Balance {\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    nonce: ").append(toIndentedString(nonce)).append("\n");
    sb.append("    blockNumber: ").append(toIndentedString(blockNumber)).append("\n");
    sb.append("    blockDate: ").append(toIndentedString(blockDate)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

