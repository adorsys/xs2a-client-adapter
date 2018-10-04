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
import de.adorsys.psd2.model.Amount;
import de.adorsys.psd2.model.ExchangeRateList;
import de.adorsys.psd2.model.PurposeCode;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Map;

/**
 * Transaction details
 */
@Schema(description = "Transaction details")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2018-10-04T10:10:17.188+02:00[Europe/Berlin]")public class TransactionDetails {

  @SerializedName("transactionId")
  private String transactionId = null;

  @SerializedName("entryReference")
  private String entryReference = null;

  @SerializedName("endToEndId")
  private String endToEndId = null;

  @SerializedName("mandateId")
  private String mandateId = null;

  @SerializedName("checkId")
  private String checkId = null;

  @SerializedName("creditorId")
  private String creditorId = null;

  @SerializedName("bookingDate")
  private LocalDate bookingDate = null;

  @SerializedName("valueDate")
  private LocalDate valueDate = null;

  @SerializedName("transactionAmount")
  private Amount transactionAmount = null;

  @SerializedName("exchangeRate")
  private ExchangeRateList exchangeRate = null;

  @SerializedName("creditorName")
  private String creditorName = null;

  @SerializedName("creditorAccount")
  private Object creditorAccount = null;

  @SerializedName("ultimateCreditor")
  private String ultimateCreditor = null;

  @SerializedName("debtorName")
  private String debtorName = null;

  @SerializedName("debtorAccount")
  private Object debtorAccount = null;

  @SerializedName("ultimateDebtor")
  private String ultimateDebtor = null;

  @SerializedName("remittanceInformationUnstructured")
  private String remittanceInformationUnstructured = null;

  @SerializedName("remittanceInformationStructured")
  private String remittanceInformationStructured = null;

  @SerializedName("purposeCode")
  private PurposeCode purposeCode = null;

  @SerializedName("bankTransactionCode")
  private String bankTransactionCode = null;

  @SerializedName("proprietaryBankTransactionCode")
  private String proprietaryBankTransactionCode = null;

  @SerializedName("_links")
  private Map _links = null;
  public TransactionDetails transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }

  

  /**
  * the Transaction Id can be used as access-ID in the API, where more details on an transaction is offered.  If this data attribute is provided this shows that the AIS can get access on more details about this  transaction using the GET Transaction Details Request  
  * @return transactionId
  **/
  @Schema(description = "the Transaction Id can be used as access-ID in the API, where more details on an transaction is offered.  If this data attribute is provided this shows that the AIS can get access on more details about this  transaction using the GET Transaction Details Request  ")
  public String getTransactionId() {
    return transactionId;
  }
  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }
  public TransactionDetails entryReference(String entryReference) {
    this.entryReference = entryReference;
    return this;
  }

  

  /**
  * Is the identification of the transaction as used e.g. for reference for deltafunction on application level.  The same identification as for example used within camt.05x messages. 
  * @return entryReference
  **/
  @Schema(description = "Is the identification of the transaction as used e.g. for reference for deltafunction on application level.  The same identification as for example used within camt.05x messages. ")
  public String getEntryReference() {
    return entryReference;
  }
  public void setEntryReference(String entryReference) {
    this.entryReference = entryReference;
  }
  public TransactionDetails endToEndId(String endToEndId) {
    this.endToEndId = endToEndId;
    return this;
  }

  

  /**
  * Unique end to end identity.
  * @return endToEndId
  **/
  @Schema(description = "Unique end to end identity.")
  public String getEndToEndId() {
    return endToEndId;
  }
  public void setEndToEndId(String endToEndId) {
    this.endToEndId = endToEndId;
  }
  public TransactionDetails mandateId(String mandateId) {
    this.mandateId = mandateId;
    return this;
  }

  

  /**
  * Identification of Mandates, e.g. a SEPA Mandate ID.
  * @return mandateId
  **/
  @Schema(description = "Identification of Mandates, e.g. a SEPA Mandate ID.")
  public String getMandateId() {
    return mandateId;
  }
  public void setMandateId(String mandateId) {
    this.mandateId = mandateId;
  }
  public TransactionDetails checkId(String checkId) {
    this.checkId = checkId;
    return this;
  }

  

  /**
  * Identification of a Cheque.
  * @return checkId
  **/
  @Schema(description = "Identification of a Cheque.")
  public String getCheckId() {
    return checkId;
  }
  public void setCheckId(String checkId) {
    this.checkId = checkId;
  }
  public TransactionDetails creditorId(String creditorId) {
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
  public TransactionDetails bookingDate(LocalDate bookingDate) {
    this.bookingDate = bookingDate;
    return this;
  }

  

  /**
  * Get bookingDate
  * @return bookingDate
  **/
  @Schema(description = "")
  public LocalDate getBookingDate() {
    return bookingDate;
  }
  public void setBookingDate(LocalDate bookingDate) {
    this.bookingDate = bookingDate;
  }
  public TransactionDetails valueDate(LocalDate valueDate) {
    this.valueDate = valueDate;
    return this;
  }

  

  /**
  * The Date at which assets become available to the account owner in case of a credit.
  * @return valueDate
  **/
  @Schema(description = "The Date at which assets become available to the account owner in case of a credit.")
  public LocalDate getValueDate() {
    return valueDate;
  }
  public void setValueDate(LocalDate valueDate) {
    this.valueDate = valueDate;
  }
  public TransactionDetails transactionAmount(Amount transactionAmount) {
    this.transactionAmount = transactionAmount;
    return this;
  }

  

  /**
  * Get transactionAmount
  * @return transactionAmount
  **/
  @Schema(required = true, description = "")
  public Amount getTransactionAmount() {
    return transactionAmount;
  }
  public void setTransactionAmount(Amount transactionAmount) {
    this.transactionAmount = transactionAmount;
  }
  public TransactionDetails exchangeRate(ExchangeRateList exchangeRate) {
    this.exchangeRate = exchangeRate;
    return this;
  }

  

  /**
  * Get exchangeRate
  * @return exchangeRate
  **/
  @Schema(description = "")
  public ExchangeRateList getExchangeRate() {
    return exchangeRate;
  }
  public void setExchangeRate(ExchangeRateList exchangeRate) {
    this.exchangeRate = exchangeRate;
  }
  public TransactionDetails creditorName(String creditorName) {
    this.creditorName = creditorName;
    return this;
  }

  

  /**
  * Get creditorName
  * @return creditorName
  **/
  @Schema(description = "")
  public String getCreditorName() {
    return creditorName;
  }
  public void setCreditorName(String creditorName) {
    this.creditorName = creditorName;
  }
  public TransactionDetails creditorAccount(Object creditorAccount) {
    this.creditorAccount = creditorAccount;
    return this;
  }

  

  /**
  * Get creditorAccount
  * @return creditorAccount
  **/
  @Schema(description = "")
  public Object getCreditorAccount() {
    return creditorAccount;
  }
  public void setCreditorAccount(Object creditorAccount) {
    this.creditorAccount = creditorAccount;
  }
  public TransactionDetails ultimateCreditor(String ultimateCreditor) {
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
  public TransactionDetails debtorName(String debtorName) {
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
  public TransactionDetails debtorAccount(Object debtorAccount) {
    this.debtorAccount = debtorAccount;
    return this;
  }

  

  /**
  * Get debtorAccount
  * @return debtorAccount
  **/
  @Schema(description = "")
  public Object getDebtorAccount() {
    return debtorAccount;
  }
  public void setDebtorAccount(Object debtorAccount) {
    this.debtorAccount = debtorAccount;
  }
  public TransactionDetails ultimateDebtor(String ultimateDebtor) {
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
  public TransactionDetails remittanceInformationUnstructured(String remittanceInformationUnstructured) {
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
  public TransactionDetails remittanceInformationStructured(String remittanceInformationStructured) {
    this.remittanceInformationStructured = remittanceInformationStructured;
    return this;
  }

  

  /**
  * Reference as contained in the structured remittance reference structure (without the surrounding XML structure).  Different from other places the content is containt in plain form not in form of a structered field. 
  * @return remittanceInformationStructured
  **/
  @Schema(description = "Reference as contained in the structured remittance reference structure (without the surrounding XML structure).  Different from other places the content is containt in plain form not in form of a structered field. ")
  public String getRemittanceInformationStructured() {
    return remittanceInformationStructured;
  }
  public void setRemittanceInformationStructured(String remittanceInformationStructured) {
    this.remittanceInformationStructured = remittanceInformationStructured;
  }
  public TransactionDetails purposeCode(PurposeCode purposeCode) {
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
  public TransactionDetails bankTransactionCode(String bankTransactionCode) {
    this.bankTransactionCode = bankTransactionCode;
    return this;
  }

  

  /**
  * Get bankTransactionCode
  * @return bankTransactionCode
  **/
  @Schema(description = "")
  public String getBankTransactionCode() {
    return bankTransactionCode;
  }
  public void setBankTransactionCode(String bankTransactionCode) {
    this.bankTransactionCode = bankTransactionCode;
  }
  public TransactionDetails proprietaryBankTransactionCode(String proprietaryBankTransactionCode) {
    this.proprietaryBankTransactionCode = proprietaryBankTransactionCode;
    return this;
  }

  

  /**
  * Get proprietaryBankTransactionCode
  * @return proprietaryBankTransactionCode
  **/
  @Schema(description = "")
  public String getProprietaryBankTransactionCode() {
    return proprietaryBankTransactionCode;
  }
  public void setProprietaryBankTransactionCode(String proprietaryBankTransactionCode) {
    this.proprietaryBankTransactionCode = proprietaryBankTransactionCode;
  }
  public TransactionDetails _links(Map _links) {
    this._links = _links;
    return this;
  }

  

  /**
  * Get _links
  * @return _links
  **/
  @Schema(description = "")
  public Map getLinks() {
    return _links;
  }
  public void setLinks(Map _links) {
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
    TransactionDetails transactionDetails = (TransactionDetails) o;
    return Objects.equals(this.transactionId, transactionDetails.transactionId) &&
        Objects.equals(this.entryReference, transactionDetails.entryReference) &&
        Objects.equals(this.endToEndId, transactionDetails.endToEndId) &&
        Objects.equals(this.mandateId, transactionDetails.mandateId) &&
        Objects.equals(this.checkId, transactionDetails.checkId) &&
        Objects.equals(this.creditorId, transactionDetails.creditorId) &&
        Objects.equals(this.bookingDate, transactionDetails.bookingDate) &&
        Objects.equals(this.valueDate, transactionDetails.valueDate) &&
        Objects.equals(this.transactionAmount, transactionDetails.transactionAmount) &&
        Objects.equals(this.exchangeRate, transactionDetails.exchangeRate) &&
        Objects.equals(this.creditorName, transactionDetails.creditorName) &&
        Objects.equals(this.creditorAccount, transactionDetails.creditorAccount) &&
        Objects.equals(this.ultimateCreditor, transactionDetails.ultimateCreditor) &&
        Objects.equals(this.debtorName, transactionDetails.debtorName) &&
        Objects.equals(this.debtorAccount, transactionDetails.debtorAccount) &&
        Objects.equals(this.ultimateDebtor, transactionDetails.ultimateDebtor) &&
        Objects.equals(this.remittanceInformationUnstructured, transactionDetails.remittanceInformationUnstructured) &&
        Objects.equals(this.remittanceInformationStructured, transactionDetails.remittanceInformationStructured) &&
        Objects.equals(this.purposeCode, transactionDetails.purposeCode) &&
        Objects.equals(this.bankTransactionCode, transactionDetails.bankTransactionCode) &&
        Objects.equals(this.proprietaryBankTransactionCode, transactionDetails.proprietaryBankTransactionCode) &&
        Objects.equals(this._links, transactionDetails._links);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(transactionId, entryReference, endToEndId, mandateId, checkId, creditorId, bookingDate, valueDate, transactionAmount, exchangeRate, creditorName, creditorAccount, ultimateCreditor, debtorName, debtorAccount, ultimateDebtor, remittanceInformationUnstructured, remittanceInformationStructured, purposeCode, bankTransactionCode, proprietaryBankTransactionCode, _links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionDetails {\n");
    
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    entryReference: ").append(toIndentedString(entryReference)).append("\n");
    sb.append("    endToEndId: ").append(toIndentedString(endToEndId)).append("\n");
    sb.append("    mandateId: ").append(toIndentedString(mandateId)).append("\n");
    sb.append("    checkId: ").append(toIndentedString(checkId)).append("\n");
    sb.append("    creditorId: ").append(toIndentedString(creditorId)).append("\n");
    sb.append("    bookingDate: ").append(toIndentedString(bookingDate)).append("\n");
    sb.append("    valueDate: ").append(toIndentedString(valueDate)).append("\n");
    sb.append("    transactionAmount: ").append(toIndentedString(transactionAmount)).append("\n");
    sb.append("    exchangeRate: ").append(toIndentedString(exchangeRate)).append("\n");
    sb.append("    creditorName: ").append(toIndentedString(creditorName)).append("\n");
    sb.append("    creditorAccount: ").append(toIndentedString(creditorAccount)).append("\n");
    sb.append("    ultimateCreditor: ").append(toIndentedString(ultimateCreditor)).append("\n");
    sb.append("    debtorName: ").append(toIndentedString(debtorName)).append("\n");
    sb.append("    debtorAccount: ").append(toIndentedString(debtorAccount)).append("\n");
    sb.append("    ultimateDebtor: ").append(toIndentedString(ultimateDebtor)).append("\n");
    sb.append("    remittanceInformationUnstructured: ").append(toIndentedString(remittanceInformationUnstructured)).append("\n");
    sb.append("    remittanceInformationStructured: ").append(toIndentedString(remittanceInformationStructured)).append("\n");
    sb.append("    purposeCode: ").append(toIndentedString(purposeCode)).append("\n");
    sb.append("    bankTransactionCode: ").append(toIndentedString(bankTransactionCode)).append("\n");
    sb.append("    proprietaryBankTransactionCode: ").append(toIndentedString(proprietaryBankTransactionCode)).append("\n");
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
