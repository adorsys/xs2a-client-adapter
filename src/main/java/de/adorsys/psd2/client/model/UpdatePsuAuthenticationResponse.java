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
import de.adorsys.psd2.client.model.Amount;
import de.adorsys.psd2.client.model.ChallengeData;
import de.adorsys.psd2.client.model.ChosenScaMethod;
import de.adorsys.psd2.client.model.LinksUpdatePsuAuthentication;
import de.adorsys.psd2.client.model.ScaMethods;
import de.adorsys.psd2.client.model.ScaStatus;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Body of the JSON response for a successful update PSU authentication request.
 */
@Schema(description = "Body of the JSON response for a successful update PSU authentication request.")

public class UpdatePsuAuthenticationResponse {
  @SerializedName("transactionFees")
  private Amount transactionFees = null;

  @SerializedName("currencyConversionFees")
  private Amount currencyConversionFees = null;

  @SerializedName("estimatedTotalAmount")
  private Amount estimatedTotalAmount = null;

  @SerializedName("estimatedInterbankSettlementAmount")
  private Amount estimatedInterbankSettlementAmount = null;

  @SerializedName("chosenScaMethod")
  private ChosenScaMethod chosenScaMethod = null;

  @SerializedName("challengeData")
  private ChallengeData challengeData = null;

  @SerializedName("scaMethods")
  private ScaMethods scaMethods = null;

  @SerializedName("_links")
  private LinksUpdatePsuAuthentication _links = null;

  @SerializedName("scaStatus")
  private ScaStatus scaStatus = null;

  @SerializedName("psuMessage")
  private String psuMessage = null;

  @SerializedName("authorisationId")
  private String authorisationId = null;

  public UpdatePsuAuthenticationResponse transactionFees(Amount transactionFees) {
    this.transactionFees = transactionFees;
    return this;
  }

   /**
   * Get transactionFees
   * @return transactionFees
  **/
  @Schema(description = "")
  public Amount getTransactionFees() {
    return transactionFees;
  }

  public void setTransactionFees(Amount transactionFees) {
    this.transactionFees = transactionFees;
  }

  public UpdatePsuAuthenticationResponse currencyConversionFees(Amount currencyConversionFees) {
    this.currencyConversionFees = currencyConversionFees;
    return this;
  }

   /**
   * Get currencyConversionFees
   * @return currencyConversionFees
  **/
  @Schema(description = "")
  public Amount getCurrencyConversionFees() {
    return currencyConversionFees;
  }

  public void setCurrencyConversionFees(Amount currencyConversionFees) {
    this.currencyConversionFees = currencyConversionFees;
  }

  public UpdatePsuAuthenticationResponse estimatedTotalAmount(Amount estimatedTotalAmount) {
    this.estimatedTotalAmount = estimatedTotalAmount;
    return this;
  }

   /**
   * Get estimatedTotalAmount
   * @return estimatedTotalAmount
  **/
  @Schema(description = "")
  public Amount getEstimatedTotalAmount() {
    return estimatedTotalAmount;
  }

  public void setEstimatedTotalAmount(Amount estimatedTotalAmount) {
    this.estimatedTotalAmount = estimatedTotalAmount;
  }

  public UpdatePsuAuthenticationResponse estimatedInterbankSettlementAmount(Amount estimatedInterbankSettlementAmount) {
    this.estimatedInterbankSettlementAmount = estimatedInterbankSettlementAmount;
    return this;
  }

   /**
   * Get estimatedInterbankSettlementAmount
   * @return estimatedInterbankSettlementAmount
  **/
  @Schema(description = "")
  public Amount getEstimatedInterbankSettlementAmount() {
    return estimatedInterbankSettlementAmount;
  }

  public void setEstimatedInterbankSettlementAmount(Amount estimatedInterbankSettlementAmount) {
    this.estimatedInterbankSettlementAmount = estimatedInterbankSettlementAmount;
  }

  public UpdatePsuAuthenticationResponse chosenScaMethod(ChosenScaMethod chosenScaMethod) {
    this.chosenScaMethod = chosenScaMethod;
    return this;
  }

   /**
   * Get chosenScaMethod
   * @return chosenScaMethod
  **/
  @Schema(description = "")
  public ChosenScaMethod getChosenScaMethod() {
    return chosenScaMethod;
  }

  public void setChosenScaMethod(ChosenScaMethod chosenScaMethod) {
    this.chosenScaMethod = chosenScaMethod;
  }

  public UpdatePsuAuthenticationResponse challengeData(ChallengeData challengeData) {
    this.challengeData = challengeData;
    return this;
  }

   /**
   * Get challengeData
   * @return challengeData
  **/
  @Schema(description = "")
  public ChallengeData getChallengeData() {
    return challengeData;
  }

  public void setChallengeData(ChallengeData challengeData) {
    this.challengeData = challengeData;
  }

  public UpdatePsuAuthenticationResponse scaMethods(ScaMethods scaMethods) {
    this.scaMethods = scaMethods;
    return this;
  }

   /**
   * Get scaMethods
   * @return scaMethods
  **/
  @Schema(description = "")
  public ScaMethods getScaMethods() {
    return scaMethods;
  }

  public void setScaMethods(ScaMethods scaMethods) {
    this.scaMethods = scaMethods;
  }

  public UpdatePsuAuthenticationResponse _links(LinksUpdatePsuAuthentication _links) {
    this._links = _links;
    return this;
  }

   /**
   * Get _links
   * @return _links
  **/
  @Schema(description = "")
  public LinksUpdatePsuAuthentication getLinks() {
    return _links;
  }

  public void setLinks(LinksUpdatePsuAuthentication _links) {
    this._links = _links;
  }

  public UpdatePsuAuthenticationResponse scaStatus(ScaStatus scaStatus) {
    this.scaStatus = scaStatus;
    return this;
  }

   /**
   * Get scaStatus
   * @return scaStatus
  **/
  @Schema(required = true, description = "")
  public ScaStatus getScaStatus() {
    return scaStatus;
  }

  public void setScaStatus(ScaStatus scaStatus) {
    this.scaStatus = scaStatus;
  }

  public UpdatePsuAuthenticationResponse psuMessage(String psuMessage) {
    this.psuMessage = psuMessage;
    return this;
  }

   /**
   * Get psuMessage
   * @return psuMessage
  **/
  @Schema(description = "")
  public String getPsuMessage() {
    return psuMessage;
  }

  public void setPsuMessage(String psuMessage) {
    this.psuMessage = psuMessage;
  }

  public UpdatePsuAuthenticationResponse authorisationId(String authorisationId) {
    this.authorisationId = authorisationId;
    return this;
  }

   /**
   * Get authorisationId
   * @return authorisationId
  **/
  @Schema(description = "")
  public String getAuthorisationId() {
    return authorisationId;
  }

  public void setAuthorisationId(String authorisationId) {
    this.authorisationId = authorisationId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdatePsuAuthenticationResponse updatePsuAuthenticationResponse = (UpdatePsuAuthenticationResponse) o;
    return Objects.equals(this.transactionFees, updatePsuAuthenticationResponse.transactionFees) &&
        Objects.equals(this.currencyConversionFees, updatePsuAuthenticationResponse.currencyConversionFees) &&
        Objects.equals(this.estimatedTotalAmount, updatePsuAuthenticationResponse.estimatedTotalAmount) &&
        Objects.equals(this.estimatedInterbankSettlementAmount, updatePsuAuthenticationResponse.estimatedInterbankSettlementAmount) &&
        Objects.equals(this.chosenScaMethod, updatePsuAuthenticationResponse.chosenScaMethod) &&
        Objects.equals(this.challengeData, updatePsuAuthenticationResponse.challengeData) &&
        Objects.equals(this.scaMethods, updatePsuAuthenticationResponse.scaMethods) &&
        Objects.equals(this._links, updatePsuAuthenticationResponse._links) &&
        Objects.equals(this.scaStatus, updatePsuAuthenticationResponse.scaStatus) &&
        Objects.equals(this.psuMessage, updatePsuAuthenticationResponse.psuMessage) &&
        Objects.equals(this.authorisationId, updatePsuAuthenticationResponse.authorisationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionFees, currencyConversionFees, estimatedTotalAmount, estimatedInterbankSettlementAmount, chosenScaMethod, challengeData, scaMethods, _links, scaStatus, psuMessage, authorisationId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePsuAuthenticationResponse {\n");
    
    sb.append("    transactionFees: ").append(toIndentedString(transactionFees)).append("\n");
    sb.append("    currencyConversionFees: ").append(toIndentedString(currencyConversionFees)).append("\n");
    sb.append("    estimatedTotalAmount: ").append(toIndentedString(estimatedTotalAmount)).append("\n");
    sb.append("    estimatedInterbankSettlementAmount: ").append(toIndentedString(estimatedInterbankSettlementAmount)).append("\n");
    sb.append("    chosenScaMethod: ").append(toIndentedString(chosenScaMethod)).append("\n");
    sb.append("    challengeData: ").append(toIndentedString(challengeData)).append("\n");
    sb.append("    scaMethods: ").append(toIndentedString(scaMethods)).append("\n");
    sb.append("    _links: ").append(toIndentedString(_links)).append("\n");
    sb.append("    scaStatus: ").append(toIndentedString(scaStatus)).append("\n");
    sb.append("    psuMessage: ").append(toIndentedString(psuMessage)).append("\n");
    sb.append("    authorisationId: ").append(toIndentedString(authorisationId)).append("\n");
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
