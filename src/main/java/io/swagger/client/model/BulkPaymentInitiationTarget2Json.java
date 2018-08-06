/*
 * BG PSD2 API
 * # Summary The **NextGenPSD2** *Framework Version 1.2* offers a modern, open, harmonised and interoperable set of  Application Programming Interfaces (APIs) as the safest and most efficient way to provide data securely.  The NextGenPSD2 Framework reduces XS2A complexity and costs, addresses the problem of multiple competing standards  in Europe and, aligned with the goals of the Euro Retail Payments Board, enables European banking customers to benefit from innovative products and services ('Banking as a Service')  by granting TPPs safe and secure (authenticated and authorised) access to their bank accounts and financial data.  The possible Approaches are:   * Redirect SCA Approach   * OAuth SCA Approach   * Decoupled SCA Approach   * Embedded SCA Approach without SCA method   * Embedded SCA Approach with only one SCA method available   * Embedded SCA Approach with Selection of a SCA method    Not every message defined in this API definition is necessary for all approaches.    Futhermore this API definition does not differ between methods which are mandatory, conditional, or optional   Therfore for a particular implementation of a Berlin Group PSD2 compliant API it is only necessary to support    a certain subset of the methods defined in this API definition.    **Please have a look at the implementation guidelines if you are not sure    which message has to be used for the approach you are going to use.**  ## Some General Remarks Related to this version of the OpenAPI Specification: * **This API definition is based on the Implementation Guidelines of the Berlin Group PSD2 API.**    It is not an replacement in any sense.   The main specification is (at the moment) allways the Implementation Guidelines of the Berlin Group PSD2 API. * **This API definition contains the REST-API for requests from the PISP to the ASPSP.** * **This API definition contains the messages for all different approaches defined in the Implementation Guidelines.** * According to the OpenAPI-Specification [https://github.com/OAI/OpenAPI-Specification/blob/master/versions/3.0.1.md]        \"If in is \"header\" and the name field is \"Accept\", \"Content-Type\" or \"Authorization\", the parameter definition SHALL be ignored.\"      The element \"Accept\" will not be defined in this file at any place.      The elements \"Content-Type\" and \"Authorization\" are implicitly defined by the OpenApi tags \"content\" and \"security\".    * There are several predefined types which might occur in payment initiation messages,    but are not used in the standard JSON messages in the Implementation Guidelines.   Therefore they are not used in the corresponding messages in this file either.   We added them for the convinience of the user.   If there is a payment product, which need these field, one can easily use the predefined types.   But the ASPSP need not to accept them in general.    * **We ommit the definition of all standard HTTP header elements (mandatory/optional/conditional)    except they are mention in the Implementation Guidelines.**   Therefore the implementer might add the in his own realisation of a PSD2 comlient API in addition to the elements define in this file.     ## General Remarks on Data Types  The Berlin Group definition of UTF-8 strings in context of the PSD2 API have to support at least the following characters  a b c d e f g h i j k l m n o p q r s t u v w x y z  A B C D E F G H I J K L M N O P Q R S T U V W X Y Z  0 1 2 3 4 5 6 7 8 9  / - ? : ( ) . , ' +  Space 
 *
 * OpenAPI spec version: 1.2
 * Contact: info@berlin-group.org
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.PaymentInitiationTarget2BulkElementJson;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.LocalDate;

/**
 * JSON Body for a bulk TARGET-2 payment initation. 
 */@ApiModel(description = "JSON Body for a bulk TARGET-2 payment initation. ")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaClientCodegen", date = "2018-08-06T07:52:19.666Z[GMT]")
public class BulkPaymentInitiationTarget2Json {

  @SerializedName("batchBookingPreferred")
  private Boolean batchBookingPreferred = null;
  
  @SerializedName("requestedExecutionDate")
  private LocalDate requestedExecutionDate = null;
  
  @SerializedName("debtorAccount")
  private Object debtorAccount = null;
  
  @SerializedName("payments")
  private List<PaymentInitiationTarget2BulkElementJson> payments = new ArrayList<PaymentInitiationTarget2BulkElementJson>();
  
  public BulkPaymentInitiationTarget2Json batchBookingPreferred(Boolean batchBookingPreferred) {
    this.batchBookingPreferred = batchBookingPreferred;
    return this;
  }

  
  /**
  * Get batchBookingPreferred
  * @return batchBookingPreferred
  **/
  @ApiModelProperty(value = "")
  public Boolean getBatchBookingPreferred() {
    return batchBookingPreferred;
  }
  public void setBatchBookingPreferred(Boolean batchBookingPreferred) {
    this.batchBookingPreferred = batchBookingPreferred;
  }
  
  public BulkPaymentInitiationTarget2Json requestedExecutionDate(LocalDate requestedExecutionDate) {
    this.requestedExecutionDate = requestedExecutionDate;
    return this;
  }

  
  /**
  * Get requestedExecutionDate
  * @return requestedExecutionDate
  **/
  @ApiModelProperty(value = "")
  public LocalDate getRequestedExecutionDate() {
    return requestedExecutionDate;
  }
  public void setRequestedExecutionDate(LocalDate requestedExecutionDate) {
    this.requestedExecutionDate = requestedExecutionDate;
  }
  
  public BulkPaymentInitiationTarget2Json debtorAccount(Object debtorAccount) {
    this.debtorAccount = debtorAccount;
    return this;
  }

  
  /**
  * Get debtorAccount
  * @return debtorAccount
  **/
  @ApiModelProperty(required = true, value = "")
  public Object getDebtorAccount() {
    return debtorAccount;
  }
  public void setDebtorAccount(Object debtorAccount) {
    this.debtorAccount = debtorAccount;
  }
  
  public BulkPaymentInitiationTarget2Json payments(List<PaymentInitiationTarget2BulkElementJson> payments) {
    this.payments = payments;
    return this;
  }

  public BulkPaymentInitiationTarget2Json addPaymentsItem(PaymentInitiationTarget2BulkElementJson paymentsItem) {
    
    this.payments.add(paymentsItem);
    return this;
  }
  
  /**
  * A list of JSON bodies for TARGET-2 payments.
  * @return payments
  **/
  @ApiModelProperty(required = true, value = "A list of JSON bodies for TARGET-2 payments.")
  public List<PaymentInitiationTarget2BulkElementJson> getPayments() {
    return payments;
  }
  public void setPayments(List<PaymentInitiationTarget2BulkElementJson> payments) {
    this.payments = payments;
  }
  
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkPaymentInitiationTarget2Json bulkPaymentInitiationTarget2Json = (BulkPaymentInitiationTarget2Json) o;
    return Objects.equals(this.batchBookingPreferred, bulkPaymentInitiationTarget2Json.batchBookingPreferred) &&
        Objects.equals(this.requestedExecutionDate, bulkPaymentInitiationTarget2Json.requestedExecutionDate) &&
        Objects.equals(this.debtorAccount, bulkPaymentInitiationTarget2Json.debtorAccount) &&
        Objects.equals(this.payments, bulkPaymentInitiationTarget2Json.payments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batchBookingPreferred, requestedExecutionDate, debtorAccount, payments);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkPaymentInitiationTarget2Json {\n");
    
    sb.append("    batchBookingPreferred: ").append(toIndentedString(batchBookingPreferred)).append("\n");
    sb.append("    requestedExecutionDate: ").append(toIndentedString(requestedExecutionDate)).append("\n");
    sb.append("    debtorAccount: ").append(toIndentedString(debtorAccount)).append("\n");
    sb.append("    payments: ").append(toIndentedString(payments)).append("\n");
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



