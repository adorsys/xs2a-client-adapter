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
import de.adorsys.psd2.client.model.AdditionalInformationStructured;
import de.adorsys.psd2.client.model.Amount;
import de.adorsys.psd2.client.model.Balance;
import de.adorsys.psd2.client.model.EntryDetails;
import de.adorsys.psd2.client.model.LinksTransactionDetails;
import de.adorsys.psd2.client.model.PurposeCode;
import de.adorsys.psd2.client.model.RemittanceInformationStructuredArray;
import de.adorsys.psd2.client.model.RemittanceInformationStructuredMax140;
import de.adorsys.psd2.client.model.RemittanceInformationUnstructuredArray;
import de.adorsys.psd2.client.model.ReportExchangeRateList;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.time.LocalDate;
/**
 * Transaction details.
 */
@Schema(description = "Transaction details.")

public class Transactions {
  @SerializedName("transactionId")
  private String transactionId = null;

  @SerializedName("entryReference")
  private String entryReference = null;

  @SerializedName("endToEndId")
  private String endToEndId = null;

  @SerializedName("batchIndicator")
  private Boolean batchIndicator = null;

  @SerializedName("batchNumberOfTransactions")
  private Integer batchNumberOfTransactions = null;

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

  @SerializedName("currencyExchange")
  private ReportExchangeRateList currencyExchange = null;

  @SerializedName("creditorName")
  private String creditorName = null;

  @SerializedName("creditorAccount")
  private AccountReference creditorAccount = null;

  @SerializedName("creditorAgent")
  private String creditorAgent = null;

  @SerializedName("ultimateCreditor")
  private String ultimateCreditor = null;

  @SerializedName("debtorName")
  private String debtorName = null;

  @SerializedName("debtorAccount")
  private AccountReference debtorAccount = null;

  @SerializedName("debtorAgent")
  private String debtorAgent = null;

  @SerializedName("ultimateDebtor")
  private String ultimateDebtor = null;

  @SerializedName("remittanceInformationUnstructured")
  private String remittanceInformationUnstructured = null;

  @SerializedName("remittanceInformationUnstructuredArray")
  private RemittanceInformationUnstructuredArray remittanceInformationUnstructuredArray = null;

  @SerializedName("remittanceInformationStructured")
  private RemittanceInformationStructuredMax140 remittanceInformationStructured = null;

  @SerializedName("remittanceInformationStructuredArray")
  private RemittanceInformationStructuredArray remittanceInformationStructuredArray = null;

  @SerializedName("entryDetails")
  private EntryDetails entryDetails = null;

  @SerializedName("additionalInformation")
  private String additionalInformation = null;

  @SerializedName("additionalInformationStructured")
  private AdditionalInformationStructured additionalInformationStructured = null;

  @SerializedName("purposeCode")
  private PurposeCode purposeCode = null;

  @SerializedName("bankTransactionCode")
  private String bankTransactionCode = null;

  @SerializedName("proprietaryBankTransactionCode")
  private String proprietaryBankTransactionCode = null;

  @SerializedName("balanceAfterTransaction")
  private Balance balanceAfterTransaction = null;

  @SerializedName("_links")
  private LinksTransactionDetails _links = null;

  public Transactions transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }

   /**
   * Get transactionId
   * @return transactionId
  **/
  @Schema(description = "")
  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  public Transactions entryReference(String entryReference) {
    this.entryReference = entryReference;
    return this;
  }

   /**
   * Get entryReference
   * @return entryReference
  **/
  @Schema(description = "")
  public String getEntryReference() {
    return entryReference;
  }

  public void setEntryReference(String entryReference) {
    this.entryReference = entryReference;
  }

  public Transactions endToEndId(String endToEndId) {
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

  public Transactions batchIndicator(Boolean batchIndicator) {
    this.batchIndicator = batchIndicator;
    return this;
  }

   /**
   * If this indicator equals true, then the related entry is a batch entry. 
   * @return batchIndicator
  **/
  @Schema(description = "If this indicator equals true, then the related entry is a batch entry. ")
  public Boolean isBatchIndicator() {
    return batchIndicator;
  }

  public void setBatchIndicator(Boolean batchIndicator) {
    this.batchIndicator = batchIndicator;
  }

  public Transactions batchNumberOfTransactions(Integer batchNumberOfTransactions) {
    this.batchNumberOfTransactions = batchNumberOfTransactions;
    return this;
  }

   /**
   * Shall be used if and only if the batchIndicator is contained and equals true. 
   * @return batchNumberOfTransactions
  **/
  @Schema(description = "Shall be used if and only if the batchIndicator is contained and equals true. ")
  public Integer getBatchNumberOfTransactions() {
    return batchNumberOfTransactions;
  }

  public void setBatchNumberOfTransactions(Integer batchNumberOfTransactions) {
    this.batchNumberOfTransactions = batchNumberOfTransactions;
  }

  public Transactions mandateId(String mandateId) {
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

  public Transactions checkId(String checkId) {
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

  public Transactions creditorId(String creditorId) {
    this.creditorId = creditorId;
    return this;
  }

   /**
   * Get creditorId
   * @return creditorId
  **/
  @Schema(description = "")
  public String getCreditorId() {
    return creditorId;
  }

  public void setCreditorId(String creditorId) {
    this.creditorId = creditorId;
  }

  public Transactions bookingDate(LocalDate bookingDate) {
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

  public Transactions valueDate(LocalDate valueDate) {
    this.valueDate = valueDate;
    return this;
  }

   /**
   * The Date at which assets become available to the account owner in case of a credit, or cease to be available to the account owner in case of a debit entry. **Usage:** If entry status is pending and value date is present, then the value date refers to an expected/requested value date.
   * @return valueDate
  **/
  @Schema(description = "The Date at which assets become available to the account owner in case of a credit, or cease to be available to the account owner in case of a debit entry. **Usage:** If entry status is pending and value date is present, then the value date refers to an expected/requested value date.")
  public LocalDate getValueDate() {
    return valueDate;
  }

  public void setValueDate(LocalDate valueDate) {
    this.valueDate = valueDate;
  }

  public Transactions transactionAmount(Amount transactionAmount) {
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

  public Transactions currencyExchange(ReportExchangeRateList currencyExchange) {
    this.currencyExchange = currencyExchange;
    return this;
  }

   /**
   * Get currencyExchange
   * @return currencyExchange
  **/
  @Schema(description = "")
  public ReportExchangeRateList getCurrencyExchange() {
    return currencyExchange;
  }

  public void setCurrencyExchange(ReportExchangeRateList currencyExchange) {
    this.currencyExchange = currencyExchange;
  }

  public Transactions creditorName(String creditorName) {
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

  public Transactions creditorAccount(AccountReference creditorAccount) {
    this.creditorAccount = creditorAccount;
    return this;
  }

   /**
   * Get creditorAccount
   * @return creditorAccount
  **/
  @Schema(description = "")
  public AccountReference getCreditorAccount() {
    return creditorAccount;
  }

  public void setCreditorAccount(AccountReference creditorAccount) {
    this.creditorAccount = creditorAccount;
  }

  public Transactions creditorAgent(String creditorAgent) {
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

  public Transactions ultimateCreditor(String ultimateCreditor) {
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

  public Transactions debtorName(String debtorName) {
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

  public Transactions debtorAccount(AccountReference debtorAccount) {
    this.debtorAccount = debtorAccount;
    return this;
  }

   /**
   * Get debtorAccount
   * @return debtorAccount
  **/
  @Schema(description = "")
  public AccountReference getDebtorAccount() {
    return debtorAccount;
  }

  public void setDebtorAccount(AccountReference debtorAccount) {
    this.debtorAccount = debtorAccount;
  }

  public Transactions debtorAgent(String debtorAgent) {
    this.debtorAgent = debtorAgent;
    return this;
  }

   /**
   * Get debtorAgent
   * @return debtorAgent
  **/
  @Schema(description = "")
  public String getDebtorAgent() {
    return debtorAgent;
  }

  public void setDebtorAgent(String debtorAgent) {
    this.debtorAgent = debtorAgent;
  }

  public Transactions ultimateDebtor(String ultimateDebtor) {
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

  public Transactions remittanceInformationUnstructured(String remittanceInformationUnstructured) {
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

  public Transactions remittanceInformationUnstructuredArray(RemittanceInformationUnstructuredArray remittanceInformationUnstructuredArray) {
    this.remittanceInformationUnstructuredArray = remittanceInformationUnstructuredArray;
    return this;
  }

   /**
   * Get remittanceInformationUnstructuredArray
   * @return remittanceInformationUnstructuredArray
  **/
  @Schema(description = "")
  public RemittanceInformationUnstructuredArray getRemittanceInformationUnstructuredArray() {
    return remittanceInformationUnstructuredArray;
  }

  public void setRemittanceInformationUnstructuredArray(RemittanceInformationUnstructuredArray remittanceInformationUnstructuredArray) {
    this.remittanceInformationUnstructuredArray = remittanceInformationUnstructuredArray;
  }

  public Transactions remittanceInformationStructured(RemittanceInformationStructuredMax140 remittanceInformationStructured) {
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

  public Transactions remittanceInformationStructuredArray(RemittanceInformationStructuredArray remittanceInformationStructuredArray) {
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

  public Transactions entryDetails(EntryDetails entryDetails) {
    this.entryDetails = entryDetails;
    return this;
  }

   /**
   * Get entryDetails
   * @return entryDetails
  **/
  @Schema(description = "")
  public EntryDetails getEntryDetails() {
    return entryDetails;
  }

  public void setEntryDetails(EntryDetails entryDetails) {
    this.entryDetails = entryDetails;
  }

  public Transactions additionalInformation(String additionalInformation) {
    this.additionalInformation = additionalInformation;
    return this;
  }

   /**
   * Get additionalInformation
   * @return additionalInformation
  **/
  @Schema(description = "")
  public String getAdditionalInformation() {
    return additionalInformation;
  }

  public void setAdditionalInformation(String additionalInformation) {
    this.additionalInformation = additionalInformation;
  }

  public Transactions additionalInformationStructured(AdditionalInformationStructured additionalInformationStructured) {
    this.additionalInformationStructured = additionalInformationStructured;
    return this;
  }

   /**
   * Get additionalInformationStructured
   * @return additionalInformationStructured
  **/
  @Schema(description = "")
  public AdditionalInformationStructured getAdditionalInformationStructured() {
    return additionalInformationStructured;
  }

  public void setAdditionalInformationStructured(AdditionalInformationStructured additionalInformationStructured) {
    this.additionalInformationStructured = additionalInformationStructured;
  }

  public Transactions purposeCode(PurposeCode purposeCode) {
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

  public Transactions bankTransactionCode(String bankTransactionCode) {
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

  public Transactions proprietaryBankTransactionCode(String proprietaryBankTransactionCode) {
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

  public Transactions balanceAfterTransaction(Balance balanceAfterTransaction) {
    this.balanceAfterTransaction = balanceAfterTransaction;
    return this;
  }

   /**
   * Get balanceAfterTransaction
   * @return balanceAfterTransaction
  **/
  @Schema(description = "")
  public Balance getBalanceAfterTransaction() {
    return balanceAfterTransaction;
  }

  public void setBalanceAfterTransaction(Balance balanceAfterTransaction) {
    this.balanceAfterTransaction = balanceAfterTransaction;
  }

  public Transactions _links(LinksTransactionDetails _links) {
    this._links = _links;
    return this;
  }

   /**
   * Get _links
   * @return _links
  **/
  @Schema(description = "")
  public LinksTransactionDetails getLinks() {
    return _links;
  }

  public void setLinks(LinksTransactionDetails _links) {
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
    Transactions transactions = (Transactions) o;
    return Objects.equals(this.transactionId, transactions.transactionId) &&
        Objects.equals(this.entryReference, transactions.entryReference) &&
        Objects.equals(this.endToEndId, transactions.endToEndId) &&
        Objects.equals(this.batchIndicator, transactions.batchIndicator) &&
        Objects.equals(this.batchNumberOfTransactions, transactions.batchNumberOfTransactions) &&
        Objects.equals(this.mandateId, transactions.mandateId) &&
        Objects.equals(this.checkId, transactions.checkId) &&
        Objects.equals(this.creditorId, transactions.creditorId) &&
        Objects.equals(this.bookingDate, transactions.bookingDate) &&
        Objects.equals(this.valueDate, transactions.valueDate) &&
        Objects.equals(this.transactionAmount, transactions.transactionAmount) &&
        Objects.equals(this.currencyExchange, transactions.currencyExchange) &&
        Objects.equals(this.creditorName, transactions.creditorName) &&
        Objects.equals(this.creditorAccount, transactions.creditorAccount) &&
        Objects.equals(this.creditorAgent, transactions.creditorAgent) &&
        Objects.equals(this.ultimateCreditor, transactions.ultimateCreditor) &&
        Objects.equals(this.debtorName, transactions.debtorName) &&
        Objects.equals(this.debtorAccount, transactions.debtorAccount) &&
        Objects.equals(this.debtorAgent, transactions.debtorAgent) &&
        Objects.equals(this.ultimateDebtor, transactions.ultimateDebtor) &&
        Objects.equals(this.remittanceInformationUnstructured, transactions.remittanceInformationUnstructured) &&
        Objects.equals(this.remittanceInformationUnstructuredArray, transactions.remittanceInformationUnstructuredArray) &&
        Objects.equals(this.remittanceInformationStructured, transactions.remittanceInformationStructured) &&
        Objects.equals(this.remittanceInformationStructuredArray, transactions.remittanceInformationStructuredArray) &&
        Objects.equals(this.entryDetails, transactions.entryDetails) &&
        Objects.equals(this.additionalInformation, transactions.additionalInformation) &&
        Objects.equals(this.additionalInformationStructured, transactions.additionalInformationStructured) &&
        Objects.equals(this.purposeCode, transactions.purposeCode) &&
        Objects.equals(this.bankTransactionCode, transactions.bankTransactionCode) &&
        Objects.equals(this.proprietaryBankTransactionCode, transactions.proprietaryBankTransactionCode) &&
        Objects.equals(this.balanceAfterTransaction, transactions.balanceAfterTransaction) &&
        Objects.equals(this._links, transactions._links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionId, entryReference, endToEndId, batchIndicator, batchNumberOfTransactions, mandateId, checkId, creditorId, bookingDate, valueDate, transactionAmount, currencyExchange, creditorName, creditorAccount, creditorAgent, ultimateCreditor, debtorName, debtorAccount, debtorAgent, ultimateDebtor, remittanceInformationUnstructured, remittanceInformationUnstructuredArray, remittanceInformationStructured, remittanceInformationStructuredArray, entryDetails, additionalInformation, additionalInformationStructured, purposeCode, bankTransactionCode, proprietaryBankTransactionCode, balanceAfterTransaction, _links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transactions {\n");
    
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    entryReference: ").append(toIndentedString(entryReference)).append("\n");
    sb.append("    endToEndId: ").append(toIndentedString(endToEndId)).append("\n");
    sb.append("    batchIndicator: ").append(toIndentedString(batchIndicator)).append("\n");
    sb.append("    batchNumberOfTransactions: ").append(toIndentedString(batchNumberOfTransactions)).append("\n");
    sb.append("    mandateId: ").append(toIndentedString(mandateId)).append("\n");
    sb.append("    checkId: ").append(toIndentedString(checkId)).append("\n");
    sb.append("    creditorId: ").append(toIndentedString(creditorId)).append("\n");
    sb.append("    bookingDate: ").append(toIndentedString(bookingDate)).append("\n");
    sb.append("    valueDate: ").append(toIndentedString(valueDate)).append("\n");
    sb.append("    transactionAmount: ").append(toIndentedString(transactionAmount)).append("\n");
    sb.append("    currencyExchange: ").append(toIndentedString(currencyExchange)).append("\n");
    sb.append("    creditorName: ").append(toIndentedString(creditorName)).append("\n");
    sb.append("    creditorAccount: ").append(toIndentedString(creditorAccount)).append("\n");
    sb.append("    creditorAgent: ").append(toIndentedString(creditorAgent)).append("\n");
    sb.append("    ultimateCreditor: ").append(toIndentedString(ultimateCreditor)).append("\n");
    sb.append("    debtorName: ").append(toIndentedString(debtorName)).append("\n");
    sb.append("    debtorAccount: ").append(toIndentedString(debtorAccount)).append("\n");
    sb.append("    debtorAgent: ").append(toIndentedString(debtorAgent)).append("\n");
    sb.append("    ultimateDebtor: ").append(toIndentedString(ultimateDebtor)).append("\n");
    sb.append("    remittanceInformationUnstructured: ").append(toIndentedString(remittanceInformationUnstructured)).append("\n");
    sb.append("    remittanceInformationUnstructuredArray: ").append(toIndentedString(remittanceInformationUnstructuredArray)).append("\n");
    sb.append("    remittanceInformationStructured: ").append(toIndentedString(remittanceInformationStructured)).append("\n");
    sb.append("    remittanceInformationStructuredArray: ").append(toIndentedString(remittanceInformationStructuredArray)).append("\n");
    sb.append("    entryDetails: ").append(toIndentedString(entryDetails)).append("\n");
    sb.append("    additionalInformation: ").append(toIndentedString(additionalInformation)).append("\n");
    sb.append("    additionalInformationStructured: ").append(toIndentedString(additionalInformationStructured)).append("\n");
    sb.append("    purposeCode: ").append(toIndentedString(purposeCode)).append("\n");
    sb.append("    bankTransactionCode: ").append(toIndentedString(bankTransactionCode)).append("\n");
    sb.append("    proprietaryBankTransactionCode: ").append(toIndentedString(proprietaryBankTransactionCode)).append("\n");
    sb.append("    balanceAfterTransaction: ").append(toIndentedString(balanceAfterTransaction)).append("\n");
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
