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
import de.adorsys.psd2.client.model.RemittanceInformationUnstructuredArray;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.time.LocalDate;
/**
 * Generic Body for a payment initiation via JSON.  This generic JSON body can be used to represent valid payment initiations for the following JSON based payment product,  which where defined in the Implementation Guidelines:    * sepa-credit-transfers   * instant-sepa-credit-transfers   * target-2-payments   * cross-border-credit-transfers  For the convenience of the implementer additional which are already predefined in the Implementation Guidelines  are included (but commented in source code), such that an ASPSP may add them easily.  Take care: Since the format is intended to fit for all payment products  there are additional conditions which are NOT covered by this specification. Please check the Implementation Guidelines for details.   The following data element are depending on the actual payment product available (in source code):             &lt;table style&#x3D;\&quot;width:100%\&quot;&gt;  &lt;tr&gt;&lt;th&gt;Data Element&lt;/th&gt;&lt;th&gt;SCT EU Core&lt;/th&gt;&lt;th&gt;SCT INST EU Core&lt;/th&gt;&lt;th&gt;Target2 Paym. Core&lt;/th&gt;&lt;th&gt;Cross Border CT Core&lt;/th&gt;&lt;/tr&gt;  &lt;tr&gt;&lt;td&gt;endToEndIdentification&lt;/td&gt;&lt;td&gt; optional&lt;/td&gt; &lt;td&gt;optional&lt;/td&gt; &lt;td&gt;optional&lt;/td&gt; &lt;td&gt;n.a.&lt;/td&gt; &lt;/tr&gt;  &lt;tr&gt;&lt;td&gt;instructionIdentification&lt;/td&gt; &lt;td&gt;n.a.&lt;/td&gt; &lt;td&gt;n.a.&lt;/td&gt; &lt;td&gt;n.a.&lt;/td&gt; &lt;td&gt;n.a.&lt;/td&gt; &lt;/tr&gt;  &lt;tr&gt;&lt;td&gt;debtorName&lt;/td&gt; &lt;td&gt;n.a.&lt;/td&gt; &lt;td&gt;n.a.&lt;/td&gt; &lt;td&gt;n.a.&lt;/td&gt; &lt;td&gt;n.a.&lt;/td&gt; &lt;/tr&gt;  &lt;tr&gt;&lt;td&gt;debtorAccount&lt;/td&gt; &lt;td&gt;mandatory&lt;/td&gt; &lt;td&gt;mandatory&lt;/td&gt; &lt;td&gt;mandatory&lt;/td&gt; &lt;td&gt;mandatory&lt;/td&gt; &lt;/tr&gt;  &lt;tr&gt;&lt;td&gt;debtorId&lt;/td&gt; &lt;td&gt;n.a.&lt;/td&gt; &lt;td&gt;n.a.&lt;/td&gt; &lt;td&gt;n.a.&lt;/td&gt; &lt;td&gt;n.a.&lt;/td&gt; &lt;/tr&gt;  &lt;tr&gt;&lt;td&gt;ultimateDebtor&lt;/td&gt; &lt;td&gt;n.a.&lt;/td&gt; &lt;td&gt;n.a.&lt;/td&gt; &lt;td&gt;n.a.&lt;/td&gt; &lt;td&gt;n.a.&lt;/td&gt; &lt;/tr&gt;  &lt;tr&gt;&lt;td&gt;instructedAmount&lt;/td&gt; &lt;td&gt;mandatory&lt;/td&gt; &lt;td&gt;mandatory&lt;/td&gt; &lt;td&gt;mandatory&lt;/td&gt; &lt;td&gt;mandatory&lt;/td&gt; &lt;/tr&gt;  &lt;tr&gt;&lt;td&gt;currencyOfTransfer&lt;/td&gt; &lt;td&gt;n.a.&lt;/td&gt; &lt;td&gt;n.a.&lt;/td&gt; &lt;td&gt;n.a.&lt;/td&gt; &lt;td&gt;n.a.&lt;/td&gt; &lt;/tr&gt;  &lt;tr&gt;&lt;td&gt;exchangeRateInformation&lt;/td&gt; &lt;td&gt;n.a.&lt;/td&gt; &lt;td&gt;n.a.&lt;/td&gt;&lt;td&gt;n.a.&lt;/td&gt; &lt;td&gt;n.a.&lt;/td&gt; &lt;/tr&gt;  &lt;tr&gt;&lt;td&gt;creditorAccount&lt;/td&gt; &lt;td&gt;mandatory&lt;/td&gt; &lt;td&gt;mandatory&lt;/td&gt; &lt;td&gt;mandatory&lt;/td&gt; &lt;td&gt;mandatory&lt;/td&gt; &lt;/tr&gt;  &lt;tr&gt;&lt;td&gt;creditorAgent&lt;/td&gt; &lt;td&gt;optional&lt;/td&gt; &lt;td&gt;optional&lt;/td&gt; &lt;td&gt;optional&lt;/td&gt; &lt;td&gt;conditional &lt;/td&gt; &lt;/tr&gt;  &lt;tr&gt;&lt;td&gt;creditorAgentName&lt;/td&gt; &lt;td&gt;n.a.&lt;/td&gt; &lt;td&gt;n.a.&lt;/td&gt; &lt;td&gt;n.a.&lt;/td&gt; &lt;td&gt;n.a.&lt;/td&gt; &lt;/tr&gt;  &lt;tr&gt;&lt;td&gt;creditorName&lt;/td&gt; &lt;td&gt;mandatory&lt;/td&gt; &lt;td&gt;mandatory&lt;/td&gt; &lt;td&gt;mandatory&lt;/td&gt; &lt;td&gt;mandatory&lt;/td&gt; &lt;/tr&gt;  &lt;tr&gt;&lt;td&gt;creditorId&lt;/td&gt; &lt;td&gt;n.a.&lt;/td&gt; &lt;td&gt;n.a.&lt;/td&gt; &lt;td&gt;n.a.&lt;/td&gt; &lt;td&gt;n.a.&lt;/td&gt; &lt;/tr&gt;  &lt;tr&gt;&lt;td&gt;creditorAddress&lt;/td&gt;optional&lt;/td&gt; &lt;td&gt;optional&lt;/td&gt; &lt;td&gt;optional&lt;/td&gt; &lt;td&gt;conditional &lt;/td&gt; &lt;/tr&gt;  &lt;tr&gt;&lt;td&gt;creditorNameAndAddress&lt;/td&gt; &lt;td&gt;n.a.&lt;/td&gt; &lt;td&gt;n.a.&lt;/td&gt; &lt;td&gt;n.a.&lt;/td&gt; &lt;td&gt;n.a.&lt;/td&gt; &lt;/tr&gt;  &lt;tr&gt;&lt;td&gt;ultimateCreditor&lt;/td&gt; &lt;td&gt;n.a.&lt;/td&gt; &lt;td&gt;n.a.&lt;/td&gt; &lt;td&gt;n.a.&lt;/td&gt; &lt;td&gt;n.a.&lt;/td&gt; &lt;/tr&gt;  &lt;tr&gt;&lt;td&gt;purposeCode&lt;/td&gt; &lt;td&gt;n.a.&lt;/td&gt; &lt;td&gt;n.a.&lt;/td&gt; &lt;td&gt;n.a.&lt;/td&gt; &lt;td&gt;n.a.&lt;/td&gt; &lt;/tr&gt;  &lt;tr&gt;&lt;td&gt;chargeBearer&lt;/td&gt; &lt;td&gt;n.a.&lt;/td&gt; &lt;td&gt;n.a.&lt;/td&gt; &lt;td&gt;optional&lt;/td&gt; &lt;td&gt;conditional &lt;/td&gt; &lt;/tr&gt;  &lt;tr&gt;&lt;td&gt;serviceLevel&lt;/td&gt; &lt;td&gt;n.a.&lt;/td&gt; &lt;td&gt;n.a.&lt;/td&gt; &lt;td&gt;n.a.&lt;/td&gt; &lt;td&gt;n.a. &lt;/td&gt; &lt;/tr&gt;  &lt;tr&gt;&lt;td&gt;remittanceInformationUnstructured&lt;/td&gt; &lt;td&gt;optional&lt;/td&gt; &lt;td&gt;optional&lt;/td&gt; &lt;td&gt; optional&lt;/td&gt; &lt;td&gt;optional&lt;/td&gt; &lt;/tr&gt;  &lt;tr&gt;&lt;td&gt;remittanceInformationUnstructuredArray&lt;/td&gt; &lt;td&gt;n.a.&lt;/td&gt; &lt;td&gt;n.a.&lt;/td&gt; &lt;td&gt;n.a.&lt;/td&gt; &lt;td&gt;n.a.&lt;/td&gt; &lt;/tr&gt;  &lt;tr&gt;&lt;td&gt;remittanceInformationStructured&lt;/td&gt; &lt;td&gt;n.a.&lt;/td&gt; &lt;td&gt;n.a.&lt;/td&gt; &lt;td&gt;n.a.&lt;/td&gt; &lt;td&gt;n.a.&lt;/td&gt; &lt;/tr&gt;  &lt;tr&gt;&lt;td&gt;remittanceInformationStructuredArray&lt;/td&gt; &lt;td&gt;n.a.&lt;/td&gt; &lt;td&gt;n.a.&lt;/td&gt; &lt;td&gt;n.a.&lt;/td&gt; &lt;td&gt;n.a.&lt;/td&gt; &lt;/tr&gt;  &lt;tr&gt;&lt;td&gt;requestedExecutionDate&lt;/td&gt; &lt;td&gt;n.a.&lt;/td&gt; &lt;td&gt;n.a.&lt;/td&gt; &lt;td&gt;n.a.&lt;/td&gt; &lt;td&gt;n.a.&lt;/td&gt; &lt;/tr&gt;  &lt;tr&gt;&lt;td&gt;requestedExecutionTime&lt;/td&gt; &lt;td&gt;n.a.&lt;/td&gt; &lt;td&gt;n.a.&lt;/td&gt; &lt;td&gt;n.a.&lt;/td&gt; &lt;td&gt;n.a.&lt;/td&gt; &lt;/tr&gt;     &lt;/td&gt;&lt;/tr&gt;   &lt;/table&gt;    IMPORTANT: In this API definition the following holds:   *  All data elements mentioned above are defined, but some of them are commented,      i.e. they are only visible in the source code and can be used by uncommenting them.   * Data elements which are mandatory in the table above for all payment products      are set to be mandatory in this specification.   * Data elements which are indicated in the table above as n.a. for all payment products are commented in the source code.   * Data elements which are indicated to be option, conditional or mandatory for at least one payment product      in the table above are set to be optional in the s specification except the case where all are defined to be mandatory.    * Data element which are indicated to be n.a. can be used by the ASPS if needed.      In this case uncomment the the related lines in the source code.   * If one uses this data types for some payment products he has to ensure that the used data type is      valid according to the underlying payment product, e.g. by some appropriate validations. 
 */
@Schema(description = "Generic Body for a payment initiation via JSON.  This generic JSON body can be used to represent valid payment initiations for the following JSON based payment product,  which where defined in the Implementation Guidelines:    * sepa-credit-transfers   * instant-sepa-credit-transfers   * target-2-payments   * cross-border-credit-transfers  For the convenience of the implementer additional which are already predefined in the Implementation Guidelines  are included (but commented in source code), such that an ASPSP may add them easily.  Take care: Since the format is intended to fit for all payment products  there are additional conditions which are NOT covered by this specification. Please check the Implementation Guidelines for details.   The following data element are depending on the actual payment product available (in source code):             <table style=\"width:100%\">  <tr><th>Data Element</th><th>SCT EU Core</th><th>SCT INST EU Core</th><th>Target2 Paym. Core</th><th>Cross Border CT Core</th></tr>  <tr><td>endToEndIdentification</td><td> optional</td> <td>optional</td> <td>optional</td> <td>n.a.</td> </tr>  <tr><td>instructionIdentification</td> <td>n.a.</td> <td>n.a.</td> <td>n.a.</td> <td>n.a.</td> </tr>  <tr><td>debtorName</td> <td>n.a.</td> <td>n.a.</td> <td>n.a.</td> <td>n.a.</td> </tr>  <tr><td>debtorAccount</td> <td>mandatory</td> <td>mandatory</td> <td>mandatory</td> <td>mandatory</td> </tr>  <tr><td>debtorId</td> <td>n.a.</td> <td>n.a.</td> <td>n.a.</td> <td>n.a.</td> </tr>  <tr><td>ultimateDebtor</td> <td>n.a.</td> <td>n.a.</td> <td>n.a.</td> <td>n.a.</td> </tr>  <tr><td>instructedAmount</td> <td>mandatory</td> <td>mandatory</td> <td>mandatory</td> <td>mandatory</td> </tr>  <tr><td>currencyOfTransfer</td> <td>n.a.</td> <td>n.a.</td> <td>n.a.</td> <td>n.a.</td> </tr>  <tr><td>exchangeRateInformation</td> <td>n.a.</td> <td>n.a.</td><td>n.a.</td> <td>n.a.</td> </tr>  <tr><td>creditorAccount</td> <td>mandatory</td> <td>mandatory</td> <td>mandatory</td> <td>mandatory</td> </tr>  <tr><td>creditorAgent</td> <td>optional</td> <td>optional</td> <td>optional</td> <td>conditional </td> </tr>  <tr><td>creditorAgentName</td> <td>n.a.</td> <td>n.a.</td> <td>n.a.</td> <td>n.a.</td> </tr>  <tr><td>creditorName</td> <td>mandatory</td> <td>mandatory</td> <td>mandatory</td> <td>mandatory</td> </tr>  <tr><td>creditorId</td> <td>n.a.</td> <td>n.a.</td> <td>n.a.</td> <td>n.a.</td> </tr>  <tr><td>creditorAddress</td>optional</td> <td>optional</td> <td>optional</td> <td>conditional </td> </tr>  <tr><td>creditorNameAndAddress</td> <td>n.a.</td> <td>n.a.</td> <td>n.a.</td> <td>n.a.</td> </tr>  <tr><td>ultimateCreditor</td> <td>n.a.</td> <td>n.a.</td> <td>n.a.</td> <td>n.a.</td> </tr>  <tr><td>purposeCode</td> <td>n.a.</td> <td>n.a.</td> <td>n.a.</td> <td>n.a.</td> </tr>  <tr><td>chargeBearer</td> <td>n.a.</td> <td>n.a.</td> <td>optional</td> <td>conditional </td> </tr>  <tr><td>serviceLevel</td> <td>n.a.</td> <td>n.a.</td> <td>n.a.</td> <td>n.a. </td> </tr>  <tr><td>remittanceInformationUnstructured</td> <td>optional</td> <td>optional</td> <td> optional</td> <td>optional</td> </tr>  <tr><td>remittanceInformationUnstructuredArray</td> <td>n.a.</td> <td>n.a.</td> <td>n.a.</td> <td>n.a.</td> </tr>  <tr><td>remittanceInformationStructured</td> <td>n.a.</td> <td>n.a.</td> <td>n.a.</td> <td>n.a.</td> </tr>  <tr><td>remittanceInformationStructuredArray</td> <td>n.a.</td> <td>n.a.</td> <td>n.a.</td> <td>n.a.</td> </tr>  <tr><td>requestedExecutionDate</td> <td>n.a.</td> <td>n.a.</td> <td>n.a.</td> <td>n.a.</td> </tr>  <tr><td>requestedExecutionTime</td> <td>n.a.</td> <td>n.a.</td> <td>n.a.</td> <td>n.a.</td> </tr>     </td></tr>   </table>    IMPORTANT: In this API definition the following holds:   *  All data elements mentioned above are defined, but some of them are commented,      i.e. they are only visible in the source code and can be used by uncommenting them.   * Data elements which are mandatory in the table above for all payment products      are set to be mandatory in this specification.   * Data elements which are indicated in the table above as n.a. for all payment products are commented in the source code.   * Data elements which are indicated to be option, conditional or mandatory for at least one payment product      in the table above are set to be optional in the s specification except the case where all are defined to be mandatory.    * Data element which are indicated to be n.a. can be used by the ASPS if needed.      In this case uncomment the the related lines in the source code.   * If one uses this data types for some payment products he has to ensure that the used data type is      valid according to the underlying payment product, e.g. by some appropriate validations. ")

public class PaymentInitiationJson {
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

  @SerializedName("creditorAgentName")
  private String creditorAgentName = null;

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

  @SerializedName("remittanceInformationUnstructuredArray")
  private RemittanceInformationUnstructuredArray remittanceInformationUnstructuredArray = null;

  @SerializedName("remittanceInformationStructured")
  private RemittanceInformationStructuredMax140 remittanceInformationStructured = null;

  @SerializedName("remittanceInformationStructuredArray")
  private RemittanceInformationStructuredArray remittanceInformationStructuredArray = null;

  @SerializedName("requestedExecutionDate")
  private LocalDate requestedExecutionDate = null;

  public PaymentInitiationJson endToEndIdentification(String endToEndIdentification) {
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

  public PaymentInitiationJson instructionIdentification(String instructionIdentification) {
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

  public PaymentInitiationJson debtorName(String debtorName) {
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

  public PaymentInitiationJson debtorAccount(AccountReference debtorAccount) {
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

  public PaymentInitiationJson ultimateDebtor(String ultimateDebtor) {
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

  public PaymentInitiationJson instructedAmount(Amount instructedAmount) {
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

  public PaymentInitiationJson creditorAccount(AccountReference creditorAccount) {
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

  public PaymentInitiationJson creditorAgent(String creditorAgent) {
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

  public PaymentInitiationJson creditorAgentName(String creditorAgentName) {
    this.creditorAgentName = creditorAgentName;
    return this;
  }

   /**
   * Get creditorAgentName
   * @return creditorAgentName
  **/
  @Schema(description = "")
  public String getCreditorAgentName() {
    return creditorAgentName;
  }

  public void setCreditorAgentName(String creditorAgentName) {
    this.creditorAgentName = creditorAgentName;
  }

  public PaymentInitiationJson creditorName(String creditorName) {
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

  public PaymentInitiationJson creditorAddress(Address creditorAddress) {
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

  public PaymentInitiationJson creditorId(String creditorId) {
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

  public PaymentInitiationJson ultimateCreditor(String ultimateCreditor) {
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

  public PaymentInitiationJson purposeCode(PurposeCode purposeCode) {
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

  public PaymentInitiationJson chargeBearer(ChargeBearer chargeBearer) {
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

  public PaymentInitiationJson remittanceInformationUnstructured(String remittanceInformationUnstructured) {
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

  public PaymentInitiationJson remittanceInformationUnstructuredArray(RemittanceInformationUnstructuredArray remittanceInformationUnstructuredArray) {
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

  public PaymentInitiationJson remittanceInformationStructured(RemittanceInformationStructuredMax140 remittanceInformationStructured) {
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

  public PaymentInitiationJson remittanceInformationStructuredArray(RemittanceInformationStructuredArray remittanceInformationStructuredArray) {
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

  public PaymentInitiationJson requestedExecutionDate(LocalDate requestedExecutionDate) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentInitiationJson paymentInitiationJson = (PaymentInitiationJson) o;
    return Objects.equals(this.endToEndIdentification, paymentInitiationJson.endToEndIdentification) &&
        Objects.equals(this.instructionIdentification, paymentInitiationJson.instructionIdentification) &&
        Objects.equals(this.debtorName, paymentInitiationJson.debtorName) &&
        Objects.equals(this.debtorAccount, paymentInitiationJson.debtorAccount) &&
        Objects.equals(this.ultimateDebtor, paymentInitiationJson.ultimateDebtor) &&
        Objects.equals(this.instructedAmount, paymentInitiationJson.instructedAmount) &&
        Objects.equals(this.creditorAccount, paymentInitiationJson.creditorAccount) &&
        Objects.equals(this.creditorAgent, paymentInitiationJson.creditorAgent) &&
        Objects.equals(this.creditorAgentName, paymentInitiationJson.creditorAgentName) &&
        Objects.equals(this.creditorName, paymentInitiationJson.creditorName) &&
        Objects.equals(this.creditorAddress, paymentInitiationJson.creditorAddress) &&
        Objects.equals(this.creditorId, paymentInitiationJson.creditorId) &&
        Objects.equals(this.ultimateCreditor, paymentInitiationJson.ultimateCreditor) &&
        Objects.equals(this.purposeCode, paymentInitiationJson.purposeCode) &&
        Objects.equals(this.chargeBearer, paymentInitiationJson.chargeBearer) &&
        Objects.equals(this.remittanceInformationUnstructured, paymentInitiationJson.remittanceInformationUnstructured) &&
        Objects.equals(this.remittanceInformationUnstructuredArray, paymentInitiationJson.remittanceInformationUnstructuredArray) &&
        Objects.equals(this.remittanceInformationStructured, paymentInitiationJson.remittanceInformationStructured) &&
        Objects.equals(this.remittanceInformationStructuredArray, paymentInitiationJson.remittanceInformationStructuredArray) &&
        Objects.equals(this.requestedExecutionDate, paymentInitiationJson.requestedExecutionDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endToEndIdentification, instructionIdentification, debtorName, debtorAccount, ultimateDebtor, instructedAmount, creditorAccount, creditorAgent, creditorAgentName, creditorName, creditorAddress, creditorId, ultimateCreditor, purposeCode, chargeBearer, remittanceInformationUnstructured, remittanceInformationUnstructuredArray, remittanceInformationStructured, remittanceInformationStructuredArray, requestedExecutionDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentInitiationJson {\n");
    
    sb.append("    endToEndIdentification: ").append(toIndentedString(endToEndIdentification)).append("\n");
    sb.append("    instructionIdentification: ").append(toIndentedString(instructionIdentification)).append("\n");
    sb.append("    debtorName: ").append(toIndentedString(debtorName)).append("\n");
    sb.append("    debtorAccount: ").append(toIndentedString(debtorAccount)).append("\n");
    sb.append("    ultimateDebtor: ").append(toIndentedString(ultimateDebtor)).append("\n");
    sb.append("    instructedAmount: ").append(toIndentedString(instructedAmount)).append("\n");
    sb.append("    creditorAccount: ").append(toIndentedString(creditorAccount)).append("\n");
    sb.append("    creditorAgent: ").append(toIndentedString(creditorAgent)).append("\n");
    sb.append("    creditorAgentName: ").append(toIndentedString(creditorAgentName)).append("\n");
    sb.append("    creditorName: ").append(toIndentedString(creditorName)).append("\n");
    sb.append("    creditorAddress: ").append(toIndentedString(creditorAddress)).append("\n");
    sb.append("    creditorId: ").append(toIndentedString(creditorId)).append("\n");
    sb.append("    ultimateCreditor: ").append(toIndentedString(ultimateCreditor)).append("\n");
    sb.append("    purposeCode: ").append(toIndentedString(purposeCode)).append("\n");
    sb.append("    chargeBearer: ").append(toIndentedString(chargeBearer)).append("\n");
    sb.append("    remittanceInformationUnstructured: ").append(toIndentedString(remittanceInformationUnstructured)).append("\n");
    sb.append("    remittanceInformationUnstructuredArray: ").append(toIndentedString(remittanceInformationUnstructuredArray)).append("\n");
    sb.append("    remittanceInformationStructured: ").append(toIndentedString(remittanceInformationStructured)).append("\n");
    sb.append("    remittanceInformationStructuredArray: ").append(toIndentedString(remittanceInformationStructuredArray)).append("\n");
    sb.append("    requestedExecutionDate: ").append(toIndentedString(requestedExecutionDate)).append("\n");
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
