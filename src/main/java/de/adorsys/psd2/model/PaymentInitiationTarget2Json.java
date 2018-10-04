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

package de.adorsys.psd2.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import de.adorsys.psd2.model.Address;
import de.adorsys.psd2.model.Amount;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;

/**
 * Body for a TARGET-2 payment initation. 
 */
@Schema(description = "Body for a TARGET-2 payment initation. ")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-10-04T10:10:17.188+02:00[Europe/Berlin]")public class PaymentInitiationTarget2Json {

  @SerializedName("endToEndIdentification")
  private String endToEndIdentification = null;

  @SerializedName("debtorAccount")
  private Object debtorAccount = null;

  @SerializedName("instructedAmount")
  private Amount instructedAmount = null;

  @SerializedName("creditorAccount")
  private Object creditorAccount = null;

  @SerializedName("creditorAgent")
  private String creditorAgent = null;

  @SerializedName("creditorName")
  private String creditorName = null;

  @SerializedName("creditorAddress")
  private Address creditorAddress = null;

  @SerializedName("remittanceInformationUnstructured")
  private String remittanceInformationUnstructured = null;
  public PaymentInitiationTarget2Json endToEndIdentification(String endToEndIdentification) {
    this.endToEndIdentification = endToEndIdentification;
    return this;
  }

  

  /**
  * Get endToEndIdentification
  * @return endToEndIdentification
  **/
  @Schema(description = "")
  public String getEndToEndIdentification() {
    return endToEndIdentification;
  }
  public void setEndToEndIdentification(String endToEndIdentification) {
    this.endToEndIdentification = endToEndIdentification;
  }
  public PaymentInitiationTarget2Json debtorAccount(Object debtorAccount) {
    this.debtorAccount = debtorAccount;
    return this;
  }

  

  /**
  * Get debtorAccount
  * @return debtorAccount
  **/
  @Schema(required = true, description = "")
  public Object getDebtorAccount() {
    return debtorAccount;
  }
  public void setDebtorAccount(Object debtorAccount) {
    this.debtorAccount = debtorAccount;
  }
  public PaymentInitiationTarget2Json instructedAmount(Amount instructedAmount) {
    this.instructedAmount = instructedAmount;
    return this;
  }

  

  /**
  * Get instructedAmount
  * @return instructedAmount
  **/
  @Schema(required = true, description = "")
  public Amount getInstructedAmount() {
    return instructedAmount;
  }
  public void setInstructedAmount(Amount instructedAmount) {
    this.instructedAmount = instructedAmount;
  }
  public PaymentInitiationTarget2Json creditorAccount(Object creditorAccount) {
    this.creditorAccount = creditorAccount;
    return this;
  }

  

  /**
  * Get creditorAccount
  * @return creditorAccount
  **/
  @Schema(required = true, description = "")
  public Object getCreditorAccount() {
    return creditorAccount;
  }
  public void setCreditorAccount(Object creditorAccount) {
    this.creditorAccount = creditorAccount;
  }
  public PaymentInitiationTarget2Json creditorAgent(String creditorAgent) {
    this.creditorAgent = creditorAgent;
    return this;
  }

  

  /**
  * Get creditorAgent
  * @return creditorAgent
  **/
  @Schema(description = "")
  public String getCreditorAgent() {
    return creditorAgent;
  }
  public void setCreditorAgent(String creditorAgent) {
    this.creditorAgent = creditorAgent;
  }
  public PaymentInitiationTarget2Json creditorName(String creditorName) {
    this.creditorName = creditorName;
    return this;
  }

  

  /**
  * Get creditorName
  * @return creditorName
  **/
  @Schema(required = true, description = "")
  public String getCreditorName() {
    return creditorName;
  }
  public void setCreditorName(String creditorName) {
    this.creditorName = creditorName;
  }
  public PaymentInitiationTarget2Json creditorAddress(Address creditorAddress) {
    this.creditorAddress = creditorAddress;
    return this;
  }

  

  /**
  * Get creditorAddress
  * @return creditorAddress
  **/
  @Schema(description = "")
  public Address getCreditorAddress() {
    return creditorAddress;
  }
  public void setCreditorAddress(Address creditorAddress) {
    this.creditorAddress = creditorAddress;
  }
  public PaymentInitiationTarget2Json remittanceInformationUnstructured(String remittanceInformationUnstructured) {
    this.remittanceInformationUnstructured = remittanceInformationUnstructured;
    return this;
  }

  

  /**
  * Get remittanceInformationUnstructured
  * @return remittanceInformationUnstructured
  **/
  @Schema(description = "")
  public String getRemittanceInformationUnstructured() {
    return remittanceInformationUnstructured;
  }
  public void setRemittanceInformationUnstructured(String remittanceInformationUnstructured) {
    this.remittanceInformationUnstructured = remittanceInformationUnstructured;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentInitiationTarget2Json paymentInitiationTarget2Json = (PaymentInitiationTarget2Json) o;
    return Objects.equals(this.endToEndIdentification, paymentInitiationTarget2Json.endToEndIdentification) &&
        Objects.equals(this.debtorAccount, paymentInitiationTarget2Json.debtorAccount) &&
        Objects.equals(this.instructedAmount, paymentInitiationTarget2Json.instructedAmount) &&
        Objects.equals(this.creditorAccount, paymentInitiationTarget2Json.creditorAccount) &&
        Objects.equals(this.creditorAgent, paymentInitiationTarget2Json.creditorAgent) &&
        Objects.equals(this.creditorName, paymentInitiationTarget2Json.creditorName) &&
        Objects.equals(this.creditorAddress, paymentInitiationTarget2Json.creditorAddress) &&
        Objects.equals(this.remittanceInformationUnstructured, paymentInitiationTarget2Json.remittanceInformationUnstructured);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(endToEndIdentification, debtorAccount, instructedAmount, creditorAccount, creditorAgent, creditorName, creditorAddress, remittanceInformationUnstructured);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentInitiationTarget2Json {\n");
    
    sb.append("    endToEndIdentification: ").append(toIndentedString(endToEndIdentification)).append("\n");
    sb.append("    debtorAccount: ").append(toIndentedString(debtorAccount)).append("\n");
    sb.append("    instructedAmount: ").append(toIndentedString(instructedAmount)).append("\n");
    sb.append("    creditorAccount: ").append(toIndentedString(creditorAccount)).append("\n");
    sb.append("    creditorAgent: ").append(toIndentedString(creditorAgent)).append("\n");
    sb.append("    creditorName: ").append(toIndentedString(creditorName)).append("\n");
    sb.append("    creditorAddress: ").append(toIndentedString(creditorAddress)).append("\n");
    sb.append("    remittanceInformationUnstructured: ").append(toIndentedString(remittanceInformationUnstructured)).append("\n");
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
