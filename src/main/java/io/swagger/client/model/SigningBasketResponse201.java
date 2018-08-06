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
import io.swagger.client.model.ChallengeData;
import io.swagger.client.model.ChosenScaMethod;
import io.swagger.client.model.LinksSigningBasket;
import io.swagger.client.model.ScaMethods;
import io.swagger.client.model.TppMessages;
import io.swagger.client.model.TransactionStatus;
import java.io.IOException;

/**
 * Body of the JSON response for a successful create signing basket request.
 */@ApiModel(description = "Body of the JSON response for a successful create signing basket request.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaClientCodegen", date = "2018-08-06T07:52:19.666Z[GMT]")
public class SigningBasketResponse201 {

  @SerializedName("transactionStatus")
  private TransactionStatus transactionStatus = null;
  
  @SerializedName("basketId")
  private String basketId = null;
  
  @SerializedName("scaMethods")
  private ScaMethods scaMethods = null;
  
  @SerializedName("chosenScaMethod")
  private ChosenScaMethod chosenScaMethod = null;
  
  @SerializedName("challengeData")
  private ChallengeData challengeData = null;
  
  @SerializedName("_links")
  private LinksSigningBasket _links = null;
  
  @SerializedName("psuMessage")
  private String psuMessage = null;
  
  @SerializedName("tppMessages")
  private TppMessages tppMessages = null;
  
  public SigningBasketResponse201 transactionStatus(TransactionStatus transactionStatus) {
    this.transactionStatus = transactionStatus;
    return this;
  }

  
  /**
  * Get transactionStatus
  * @return transactionStatus
  **/
  @ApiModelProperty(required = true, value = "")
  public TransactionStatus getTransactionStatus() {
    return transactionStatus;
  }
  public void setTransactionStatus(TransactionStatus transactionStatus) {
    this.transactionStatus = transactionStatus;
  }
  
  public SigningBasketResponse201 basketId(String basketId) {
    this.basketId = basketId;
    return this;
  }

  
  /**
  * Get basketId
  * @return basketId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getBasketId() {
    return basketId;
  }
  public void setBasketId(String basketId) {
    this.basketId = basketId;
  }
  
  public SigningBasketResponse201 scaMethods(ScaMethods scaMethods) {
    this.scaMethods = scaMethods;
    return this;
  }

  
  /**
  * Get scaMethods
  * @return scaMethods
  **/
  @ApiModelProperty(value = "")
  public ScaMethods getScaMethods() {
    return scaMethods;
  }
  public void setScaMethods(ScaMethods scaMethods) {
    this.scaMethods = scaMethods;
  }
  
  public SigningBasketResponse201 chosenScaMethod(ChosenScaMethod chosenScaMethod) {
    this.chosenScaMethod = chosenScaMethod;
    return this;
  }

  
  /**
  * Get chosenScaMethod
  * @return chosenScaMethod
  **/
  @ApiModelProperty(value = "")
  public ChosenScaMethod getChosenScaMethod() {
    return chosenScaMethod;
  }
  public void setChosenScaMethod(ChosenScaMethod chosenScaMethod) {
    this.chosenScaMethod = chosenScaMethod;
  }
  
  public SigningBasketResponse201 challengeData(ChallengeData challengeData) {
    this.challengeData = challengeData;
    return this;
  }

  
  /**
  * Get challengeData
  * @return challengeData
  **/
  @ApiModelProperty(value = "")
  public ChallengeData getChallengeData() {
    return challengeData;
  }
  public void setChallengeData(ChallengeData challengeData) {
    this.challengeData = challengeData;
  }
  
  public SigningBasketResponse201 _links(LinksSigningBasket _links) {
    this._links = _links;
    return this;
  }

  
  /**
  * Get _links
  * @return _links
  **/
  @ApiModelProperty(required = true, value = "")
  public LinksSigningBasket getLinks() {
    return _links;
  }
  public void setLinks(LinksSigningBasket _links) {
    this._links = _links;
  }
  
  public SigningBasketResponse201 psuMessage(String psuMessage) {
    this.psuMessage = psuMessage;
    return this;
  }

  
  /**
  * Get psuMessage
  * @return psuMessage
  **/
  @ApiModelProperty(value = "")
  public String getPsuMessage() {
    return psuMessage;
  }
  public void setPsuMessage(String psuMessage) {
    this.psuMessage = psuMessage;
  }
  
  public SigningBasketResponse201 tppMessages(TppMessages tppMessages) {
    this.tppMessages = tppMessages;
    return this;
  }

  
  /**
  * Get tppMessages
  * @return tppMessages
  **/
  @ApiModelProperty(value = "")
  public TppMessages getTppMessages() {
    return tppMessages;
  }
  public void setTppMessages(TppMessages tppMessages) {
    this.tppMessages = tppMessages;
  }
  
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SigningBasketResponse201 signingBasketResponse201 = (SigningBasketResponse201) o;
    return Objects.equals(this.transactionStatus, signingBasketResponse201.transactionStatus) &&
        Objects.equals(this.basketId, signingBasketResponse201.basketId) &&
        Objects.equals(this.scaMethods, signingBasketResponse201.scaMethods) &&
        Objects.equals(this.chosenScaMethod, signingBasketResponse201.chosenScaMethod) &&
        Objects.equals(this.challengeData, signingBasketResponse201.challengeData) &&
        Objects.equals(this._links, signingBasketResponse201._links) &&
        Objects.equals(this.psuMessage, signingBasketResponse201.psuMessage) &&
        Objects.equals(this.tppMessages, signingBasketResponse201.tppMessages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionStatus, basketId, scaMethods, chosenScaMethod, challengeData, _links, psuMessage, tppMessages);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SigningBasketResponse201 {\n");
    
    sb.append("    transactionStatus: ").append(toIndentedString(transactionStatus)).append("\n");
    sb.append("    basketId: ").append(toIndentedString(basketId)).append("\n");
    sb.append("    scaMethods: ").append(toIndentedString(scaMethods)).append("\n");
    sb.append("    chosenScaMethod: ").append(toIndentedString(chosenScaMethod)).append("\n");
    sb.append("    challengeData: ").append(toIndentedString(challengeData)).append("\n");
    sb.append("    _links: ").append(toIndentedString(_links)).append("\n");
    sb.append("    psuMessage: ").append(toIndentedString(psuMessage)).append("\n");
    sb.append("    tppMessages: ").append(toIndentedString(tppMessages)).append("\n");
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



