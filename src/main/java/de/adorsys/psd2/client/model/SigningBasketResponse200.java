/*
 * NextGenPSD2 XS2A Framework
 * # Summary The **NextGenPSD2** *Framework Version 1.3.12* offers a modern, open, harmonised and interoperable set of Application Programming Interfaces (APIs) as the safest and most efficient way to provide data securely. The NextGenPSD2 Framework reduces XS2A complexity and costs, addresses the problem of multiple competing standards  in Europe and, aligned with the goals of the Euro Retail Payments Board, enables European banking customers to benefit from innovative products and services ('Banking as a Service') by granting TPPs safe and secure (authenticated and authorised) access to their bank accounts and financial data.  The possible Approaches are:   * Redirect SCA Approach    * OAuth SCA Approach   * Decoupled SCA Approach    * Embedded SCA Approach without SCA method   * Embedded SCA Approach with only one SCA method available   * Embedded SCA Approach with Selection of a SCA method    Not every message defined in this API definition is necessary for all approaches.    Furthermore this API definition does not differ between methods which are mandatory, conditional, or optional.   Therefore for a particular implementation of a Berlin Group PSD2 compliant API it is only necessary to support    a certain subset of the methods defined in this API definition.    **Please have a look at the implementation guidelines if you are not sure    which message has to be used for the approach you are going to use.**  ## Some General Remarks Related to this version of the OpenAPI Specification: * **This API definition is based on the Implementation Guidelines of the Berlin Group PSD2 API.**    It is not a replacement in any sense.   The main specification is (at the moment) always the Implementation Guidelines of the Berlin Group PSD2 API. * **This API definition contains the REST-API for requests from the PISP to the ASPSP.** * **This API definition contains the messages for all different approaches defined in the Implementation Guidelines.** * According to the OpenAPI-Specification [https://github.com/OAI/OpenAPI-Specification/blob/master/versions/3.0.1.md]        \"If in is \"header\" and the name field is \"Accept\", \"Content-Type\" or \"Authorization\", the parameter definition SHALL be ignored.\"      The element \"Accept\" will not be defined in this file at any place.      The elements \"Content-Type\" and \"Authorization\" are implicitly defined by the OpenApi tags \"content\" and \"security\".    * There are several predefined types which might occur in payment initiation messages,    but are not used in the standard JSON messages in the Implementation Guidelines.   Therefore they are not used in the corresponding messages in this file either.   We added them for the convenience of the user.   If there is a payment product, which needs these fields, one can easily use the predefined types.   But the ASPSP need not to accept them in general.    * **We omit the definition of all standard HTTP header elements (mandatory/optional/conditional)    except they are mentioned in the Implementation Guidelines.**   Therefore the implementer might add these in his own realisation of a PSD2 complient API in addition to the elements defined in this file.     ## General Remarks on Data Types  The Berlin Group definition of UTF-8 strings in context of the PSD2 API has to support at least the following characters  a b c d e f g h i j k l m n o p q r s t u v w x y z  A B C D E F G H I J K L M N O P Q R S T U V W X Y Z  0 1 2 3 4 5 6 7 8 9  / - ? : ( ) . , ' +  Space 
 *
 * OpenAPI spec version: 1.3.12_2022-07-01
 * Contact: info@berlin-group.org
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package de.adorsys.psd2.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import de.adorsys.psd2.client.model.ConsentIdList;
import de.adorsys.psd2.client.model.LinksSigningBasket;
import de.adorsys.psd2.client.model.PaymentIdList;
import de.adorsys.psd2.client.model.TransactionStatusSBS;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Body of the JSON response for a successful get signing basket request.    * &#x27;payments&#x27;: payment initiations which shall be authorised through this signing basket.   * &#x27;consents&#x27;: consent objects which shall be authorised through this signing basket.   * &#x27;transactionStatus&#x27;: Only the codes RCVD, ACTC, RJCT are used.   * &#x27;_links&#x27;: The ASPSP might integrate hyperlinks to indicate next (authorisation) steps to be taken. 
 */
@Schema(description = "Body of the JSON response for a successful get signing basket request.    * 'payments': payment initiations which shall be authorised through this signing basket.   * 'consents': consent objects which shall be authorised through this signing basket.   * 'transactionStatus': Only the codes RCVD, ACTC, RJCT are used.   * '_links': The ASPSP might integrate hyperlinks to indicate next (authorisation) steps to be taken. ")

public class SigningBasketResponse200 {
  @SerializedName("payments")
  private PaymentIdList payments = null;

  @SerializedName("consents")
  private ConsentIdList consents = null;

  @SerializedName("transactionStatus")
  private TransactionStatusSBS transactionStatus = null;

  @SerializedName("_links")
  private LinksSigningBasket _links = null;

  public SigningBasketResponse200 payments(PaymentIdList payments) {
    this.payments = payments;
    return this;
  }

   /**
   * Get payments
   * @return payments
  **/
  @Schema(description = "")
  public PaymentIdList getPayments() {
    return payments;
  }

  public void setPayments(PaymentIdList payments) {
    this.payments = payments;
  }

  public SigningBasketResponse200 consents(ConsentIdList consents) {
    this.consents = consents;
    return this;
  }

   /**
   * Get consents
   * @return consents
  **/
  @Schema(description = "")
  public ConsentIdList getConsents() {
    return consents;
  }

  public void setConsents(ConsentIdList consents) {
    this.consents = consents;
  }

  public SigningBasketResponse200 transactionStatus(TransactionStatusSBS transactionStatus) {
    this.transactionStatus = transactionStatus;
    return this;
  }

   /**
   * Get transactionStatus
   * @return transactionStatus
  **/
  @Schema(required = true, description = "")
  public TransactionStatusSBS getTransactionStatus() {
    return transactionStatus;
  }

  public void setTransactionStatus(TransactionStatusSBS transactionStatus) {
    this.transactionStatus = transactionStatus;
  }

  public SigningBasketResponse200 _links(LinksSigningBasket _links) {
    this._links = _links;
    return this;
  }

   /**
   * Get _links
   * @return _links
  **/
  @Schema(description = "")
  public LinksSigningBasket getLinks() {
    return _links;
  }

  public void setLinks(LinksSigningBasket _links) {
    this._links = _links;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SigningBasketResponse200 signingBasketResponse200 = (SigningBasketResponse200) o;
    return Objects.equals(this.payments, signingBasketResponse200.payments) &&
        Objects.equals(this.consents, signingBasketResponse200.consents) &&
        Objects.equals(this.transactionStatus, signingBasketResponse200.transactionStatus) &&
        Objects.equals(this._links, signingBasketResponse200._links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payments, consents, transactionStatus, _links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SigningBasketResponse200 {\n");
    
    sb.append("    payments: ").append(toIndentedString(payments)).append("\n");
    sb.append("    consents: ").append(toIndentedString(consents)).append("\n");
    sb.append("    transactionStatus: ").append(toIndentedString(transactionStatus)).append("\n");
    sb.append("    _links: ").append(toIndentedString(_links)).append("\n");
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
