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
import de.adorsys.psd2.client.model.AccountReference;
import de.adorsys.psd2.client.model.Address;
import de.adorsys.psd2.client.model.Amount;
import de.adorsys.psd2.client.model.ChargeBearer;
import de.adorsys.psd2.client.model.PurposeCode;
import de.adorsys.psd2.client.model.RemittanceInformationStructuredArray;
import de.adorsys.psd2.client.model.RemittanceInformationStructuredMax140;
import de.adorsys.psd2.client.model.TppMessageGeneric;
import de.adorsys.psd2.client.model.TransactionStatus;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
/**
 * Generic JSON response body consistion of the corresponding payment initiation JSON body together with an optional transaction status field. 
 */
@Schema(description = "Generic JSON response body consistion of the corresponding payment initiation JSON body together with an optional transaction status field. ")

public class PaymentInitiationWithStatusResponse {
  @SerializedName("endToEndIdentification")
  private String endToEndIdentification = null;

  @SerializedName("instructionIdentification")
  private String instructionIdentification = null;

  @SerializedName("debtorName")
  private String debtorName = null;

  @SerializedName("debtorAccount")
  private AccountReference debtorAccount = null;

  @SerializedName("ultimateDebtor")
  private String ultimateDebtor = null;

  @SerializedName("instructedAmount")
  private Amount instructedAmount = null;

  @SerializedName("creditorAccount")
  private AccountReference creditorAccount = null;

  @SerializedName("creditorAgent")
  private String creditorAgent = null;

  @SerializedName("creditorName")
  private String creditorName = null;

  @SerializedName("creditorAddress")
  private Address creditorAddress = null;

  @SerializedName("creditorId")
  private String creditorId = null;

  @SerializedName("ultimateCreditor")
  private String ultimateCreditor = null;

  @SerializedName("purposeCode")
  private PurposeCode purposeCode = null;

  @SerializedName("chargeBearer")
  private ChargeBearer chargeBearer = null;

  @SerializedName("remittanceInformationUnstructured")
  private String remittanceInformationUnstructured = null;

  @SerializedName("remittanceInformationStructured")
  private RemittanceInformationStructuredMax140 remittanceInformationStructured = null;

  @SerializedName("remittanceInformationStructuredArray")
  private RemittanceInformationStructuredArray remittanceInformationStructuredArray = null;

  @SerializedName("requestedExecutionDate")
  private LocalDate requestedExecutionDate = null;

  @SerializedName("transactionStatus")
  private TransactionStatus transactionStatus = null;

  @SerializedName("tppMessages")
  private List<TppMessageGeneric> tppMessages = null;

  public PaymentInitiationWithStatusResponse endToEndIdentification(String endToEndIdentification) {
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

  public PaymentInitiationWithStatusResponse instructionIdentification(String instructionIdentification) {
    this.instructionIdentification = instructionIdentification;
    return this;
  }

   /**
   * Get instructionIdentification
   * @return instructionIdentification
  **/
  @Schema(description = "")
  public String getInstructionIdentification() {
    return instructionIdentification;
  }

  public void setInstructionIdentification(String instructionIdentification) {
    this.instructionIdentification = instructionIdentification;
  }

  public PaymentInitiationWithStatusResponse debtorName(String debtorName) {
    this.debtorName = debtorName;
    return this;
  }

   /**
   * Get debtorName
   * @return debtorName
  **/
  @Schema(description = "")
  public String getDebtorName() {
    return debtorName;
  }

  public void setDebtorName(String debtorName) {
    this.debtorName = debtorName;
  }

  public PaymentInitiationWithStatusResponse debtorAccount(AccountReference debtorAccount) {
    this.debtorAccount = debtorAccount;
    return this;
  }

   /**
   * Get debtorAccount
   * @return debtorAccount
  **/
  @Schema(required = true, description = "")
  public AccountReference getDebtorAccount() {
    return debtorAccount;
  }

  public void setDebtorAccount(AccountReference debtorAccount) {
    this.debtorAccount = debtorAccount;
  }

  public PaymentInitiationWithStatusResponse ultimateDebtor(String ultimateDebtor) {
    this.ultimateDebtor = ultimateDebtor;
    return this;
  }

   /**
   * Get ultimateDebtor
   * @return ultimateDebtor
  **/
  @Schema(description = "")
  public String getUltimateDebtor() {
    return ultimateDebtor;
  }

  public void setUltimateDebtor(String ultimateDebtor) {
    this.ultimateDebtor = ultimateDebtor;
  }

  public PaymentInitiationWithStatusResponse instructedAmount(Amount instructedAmount) {
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

  public PaymentInitiationWithStatusResponse creditorAccount(AccountReference creditorAccount) {
    this.creditorAccount = creditorAccount;
    return this;
  }

   /**
   * Get creditorAccount
   * @return creditorAccount
  **/
  @Schema(required = true, description = "")
  public AccountReference getCreditorAccount() {
    return creditorAccount;
  }

  public void setCreditorAccount(AccountReference creditorAccount) {
    this.creditorAccount = creditorAccount;
  }

  public PaymentInitiationWithStatusResponse creditorAgent(String creditorAgent) {
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

  public PaymentInitiationWithStatusResponse creditorName(String creditorName) {
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

  public PaymentInitiationWithStatusResponse creditorAddress(Address creditorAddress) {
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

  public PaymentInitiationWithStatusResponse creditorId(String creditorId) {
    this.creditorId = creditorId;
    return this;
  }

   /**
   * Identification of Creditors, e.g. a SEPA Creditor ID.
   * @return creditorId
  **/
  @Schema(description = "Identification of Creditors, e.g. a SEPA Creditor ID.")
  public String getCreditorId() {
    return creditorId;
  }

  public void setCreditorId(String creditorId) {
    this.creditorId = creditorId;
  }

  public PaymentInitiationWithStatusResponse ultimateCreditor(String ultimateCreditor) {
    this.ultimateCreditor = ultimateCreditor;
    return this;
  }

   /**
   * Get ultimateCreditor
   * @return ultimateCreditor
  **/
  @Schema(description = "")
  public String getUltimateCreditor() {
    return ultimateCreditor;
  }

  public void setUltimateCreditor(String ultimateCreditor) {
    this.ultimateCreditor = ultimateCreditor;
  }

  public PaymentInitiationWithStatusResponse purposeCode(PurposeCode purposeCode) {
    this.purposeCode = purposeCode;
    return this;
  }

   /**
   * Get purposeCode
   * @return purposeCode
  **/
  @Schema(description = "")
  public PurposeCode getPurposeCode() {
    return purposeCode;
  }

  public void setPurposeCode(PurposeCode purposeCode) {
    this.purposeCode = purposeCode;
  }

  public PaymentInitiationWithStatusResponse chargeBearer(ChargeBearer chargeBearer) {
    this.chargeBearer = chargeBearer;
    return this;
  }

   /**
   * Get chargeBearer
   * @return chargeBearer
  **/
  @Schema(description = "")
  public ChargeBearer getChargeBearer() {
    return chargeBearer;
  }

  public void setChargeBearer(ChargeBearer chargeBearer) {
    this.chargeBearer = chargeBearer;
  }

  public PaymentInitiationWithStatusResponse remittanceInformationUnstructured(String remittanceInformationUnstructured) {
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

  public PaymentInitiationWithStatusResponse remittanceInformationStructured(RemittanceInformationStructuredMax140 remittanceInformationStructured) {
    this.remittanceInformationStructured = remittanceInformationStructured;
    return this;
  }

   /**
   * Get remittanceInformationStructured
   * @return remittanceInformationStructured
  **/
  @Schema(description = "")
  public RemittanceInformationStructuredMax140 getRemittanceInformationStructured() {
    return remittanceInformationStructured;
  }

  public void setRemittanceInformationStructured(RemittanceInformationStructuredMax140 remittanceInformationStructured) {
    this.remittanceInformationStructured = remittanceInformationStructured;
  }

  public PaymentInitiationWithStatusResponse remittanceInformationStructuredArray(RemittanceInformationStructuredArray remittanceInformationStructuredArray) {
    this.remittanceInformationStructuredArray = remittanceInformationStructuredArray;
    return this;
  }

   /**
   * Get remittanceInformationStructuredArray
   * @return remittanceInformationStructuredArray
  **/
  @Schema(description = "")
  public RemittanceInformationStructuredArray getRemittanceInformationStructuredArray() {
    return remittanceInformationStructuredArray;
  }

  public void setRemittanceInformationStructuredArray(RemittanceInformationStructuredArray remittanceInformationStructuredArray) {
    this.remittanceInformationStructuredArray = remittanceInformationStructuredArray;
  }

  public PaymentInitiationWithStatusResponse requestedExecutionDate(LocalDate requestedExecutionDate) {
    this.requestedExecutionDate = requestedExecutionDate;
    return this;
  }

   /**
   * Get requestedExecutionDate
   * @return requestedExecutionDate
  **/
  @Schema(description = "")
  public LocalDate getRequestedExecutionDate() {
    return requestedExecutionDate;
  }

  public void setRequestedExecutionDate(LocalDate requestedExecutionDate) {
    this.requestedExecutionDate = requestedExecutionDate;
  }

  public PaymentInitiationWithStatusResponse transactionStatus(TransactionStatus transactionStatus) {
    this.transactionStatus = transactionStatus;
    return this;
  }

   /**
   * Get transactionStatus
   * @return transactionStatus
  **/
  @Schema(description = "")
  public TransactionStatus getTransactionStatus() {
    return transactionStatus;
  }

  public void setTransactionStatus(TransactionStatus transactionStatus) {
    this.transactionStatus = transactionStatus;
  }

  public PaymentInitiationWithStatusResponse tppMessages(List<TppMessageGeneric> tppMessages) {
    this.tppMessages = tppMessages;
    return this;
  }

  public PaymentInitiationWithStatusResponse addTppMessagesItem(TppMessageGeneric tppMessagesItem) {
    if (this.tppMessages == null) {
      this.tppMessages = new ArrayList<>();
    }
    this.tppMessages.add(tppMessagesItem);
    return this;
  }

   /**
   * Messages to the TPP on operational issues.
   * @return tppMessages
  **/
  @Schema(description = "Messages to the TPP on operational issues.")
  public List<TppMessageGeneric> getTppMessages() {
    return tppMessages;
  }

  public void setTppMessages(List<TppMessageGeneric> tppMessages) {
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
    PaymentInitiationWithStatusResponse paymentInitiationWithStatusResponse = (PaymentInitiationWithStatusResponse) o;
    return Objects.equals(this.endToEndIdentification, paymentInitiationWithStatusResponse.endToEndIdentification) &&
        Objects.equals(this.instructionIdentification, paymentInitiationWithStatusResponse.instructionIdentification) &&
        Objects.equals(this.debtorName, paymentInitiationWithStatusResponse.debtorName) &&
        Objects.equals(this.debtorAccount, paymentInitiationWithStatusResponse.debtorAccount) &&
        Objects.equals(this.ultimateDebtor, paymentInitiationWithStatusResponse.ultimateDebtor) &&
        Objects.equals(this.instructedAmount, paymentInitiationWithStatusResponse.instructedAmount) &&
        Objects.equals(this.creditorAccount, paymentInitiationWithStatusResponse.creditorAccount) &&
        Objects.equals(this.creditorAgent, paymentInitiationWithStatusResponse.creditorAgent) &&
        Objects.equals(this.creditorName, paymentInitiationWithStatusResponse.creditorName) &&
        Objects.equals(this.creditorAddress, paymentInitiationWithStatusResponse.creditorAddress) &&
        Objects.equals(this.creditorId, paymentInitiationWithStatusResponse.creditorId) &&
        Objects.equals(this.ultimateCreditor, paymentInitiationWithStatusResponse.ultimateCreditor) &&
        Objects.equals(this.purposeCode, paymentInitiationWithStatusResponse.purposeCode) &&
        Objects.equals(this.chargeBearer, paymentInitiationWithStatusResponse.chargeBearer) &&
        Objects.equals(this.remittanceInformationUnstructured, paymentInitiationWithStatusResponse.remittanceInformationUnstructured) &&
        Objects.equals(this.remittanceInformationStructured, paymentInitiationWithStatusResponse.remittanceInformationStructured) &&
        Objects.equals(this.remittanceInformationStructuredArray, paymentInitiationWithStatusResponse.remittanceInformationStructuredArray) &&
        Objects.equals(this.requestedExecutionDate, paymentInitiationWithStatusResponse.requestedExecutionDate) &&
        Objects.equals(this.transactionStatus, paymentInitiationWithStatusResponse.transactionStatus) &&
        Objects.equals(this.tppMessages, paymentInitiationWithStatusResponse.tppMessages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endToEndIdentification, instructionIdentification, debtorName, debtorAccount, ultimateDebtor, instructedAmount, creditorAccount, creditorAgent, creditorName, creditorAddress, creditorId, ultimateCreditor, purposeCode, chargeBearer, remittanceInformationUnstructured, remittanceInformationStructured, remittanceInformationStructuredArray, requestedExecutionDate, transactionStatus, tppMessages);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentInitiationWithStatusResponse {\n");
    
    sb.append("    endToEndIdentification: ").append(toIndentedString(endToEndIdentification)).append("\n");
    sb.append("    instructionIdentification: ").append(toIndentedString(instructionIdentification)).append("\n");
    sb.append("    debtorName: ").append(toIndentedString(debtorName)).append("\n");
    sb.append("    debtorAccount: ").append(toIndentedString(debtorAccount)).append("\n");
    sb.append("    ultimateDebtor: ").append(toIndentedString(ultimateDebtor)).append("\n");
    sb.append("    instructedAmount: ").append(toIndentedString(instructedAmount)).append("\n");
    sb.append("    creditorAccount: ").append(toIndentedString(creditorAccount)).append("\n");
    sb.append("    creditorAgent: ").append(toIndentedString(creditorAgent)).append("\n");
    sb.append("    creditorName: ").append(toIndentedString(creditorName)).append("\n");
    sb.append("    creditorAddress: ").append(toIndentedString(creditorAddress)).append("\n");
    sb.append("    creditorId: ").append(toIndentedString(creditorId)).append("\n");
    sb.append("    ultimateCreditor: ").append(toIndentedString(ultimateCreditor)).append("\n");
    sb.append("    purposeCode: ").append(toIndentedString(purposeCode)).append("\n");
    sb.append("    chargeBearer: ").append(toIndentedString(chargeBearer)).append("\n");
    sb.append("    remittanceInformationUnstructured: ").append(toIndentedString(remittanceInformationUnstructured)).append("\n");
    sb.append("    remittanceInformationStructured: ").append(toIndentedString(remittanceInformationStructured)).append("\n");
    sb.append("    remittanceInformationStructuredArray: ").append(toIndentedString(remittanceInformationStructuredArray)).append("\n");
    sb.append("    requestedExecutionDate: ").append(toIndentedString(requestedExecutionDate)).append("\n");
    sb.append("    transactionStatus: ").append(toIndentedString(transactionStatus)).append("\n");
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
