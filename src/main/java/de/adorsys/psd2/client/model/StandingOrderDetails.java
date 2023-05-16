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
import de.adorsys.psd2.client.model.DayOfExecution;
import de.adorsys.psd2.client.model.ExecutionRule;
import de.adorsys.psd2.client.model.FrequencyCode;
import de.adorsys.psd2.client.model.MonthsOfExecution;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.time.LocalDate;
/**
 * Details of underlying standing orders. 
 */
@Schema(description = "Details of underlying standing orders. ")

public class StandingOrderDetails {
  @SerializedName("startDate")
  private LocalDate startDate = null;

  @SerializedName("frequency")
  private FrequencyCode frequency = null;

  @SerializedName("endDate")
  private LocalDate endDate = null;

  @SerializedName("executionRule")
  private ExecutionRule executionRule = null;

  @SerializedName("withinAMonthFlag")
  private Boolean withinAMonthFlag = null;

  @SerializedName("monthsOfExecution")
  private MonthsOfExecution monthsOfExecution = null;

  @SerializedName("multiplicator")
  private Integer multiplicator = null;

  @SerializedName("dayOfExecution")
  private DayOfExecution dayOfExecution = null;

  @SerializedName("limitAmount")
  private Amount limitAmount = null;

  public StandingOrderDetails startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @Schema(required = true, description = "")
  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public StandingOrderDetails frequency(FrequencyCode frequency) {
    this.frequency = frequency;
    return this;
  }

   /**
   * Get frequency
   * @return frequency
  **/
  @Schema(required = true, description = "")
  public FrequencyCode getFrequency() {
    return frequency;
  }

  public void setFrequency(FrequencyCode frequency) {
    this.frequency = frequency;
  }

  public StandingOrderDetails endDate(LocalDate endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  @Schema(description = "")
  public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }

  public StandingOrderDetails executionRule(ExecutionRule executionRule) {
    this.executionRule = executionRule;
    return this;
  }

   /**
   * Get executionRule
   * @return executionRule
  **/
  @Schema(description = "")
  public ExecutionRule getExecutionRule() {
    return executionRule;
  }

  public void setExecutionRule(ExecutionRule executionRule) {
    this.executionRule = executionRule;
  }

  public StandingOrderDetails withinAMonthFlag(Boolean withinAMonthFlag) {
    this.withinAMonthFlag = withinAMonthFlag;
    return this;
  }

   /**
   * This element is only used in case of frequency equals \&quot;Monthly\&quot;.  If this element equals false it has no effect. If this element equals true, then the execution rule is overruled if the day of execution would fall into a different month using the execution rule.  Example: executionRule equals \&quot;preceding\&quot;, dayOfExecution equals \&quot;02\&quot; and the second of a month is a Sunday.  In this case, the transaction date would be on the last day of the month before.  This would be overruled if withinAMonthFlag equals true and the payment is processed on Monday the third of the Month. Remark: This attribute is rarely supported in the market. 
   * @return withinAMonthFlag
  **/
  @Schema(description = "This element is only used in case of frequency equals \"Monthly\".  If this element equals false it has no effect. If this element equals true, then the execution rule is overruled if the day of execution would fall into a different month using the execution rule.  Example: executionRule equals \"preceding\", dayOfExecution equals \"02\" and the second of a month is a Sunday.  In this case, the transaction date would be on the last day of the month before.  This would be overruled if withinAMonthFlag equals true and the payment is processed on Monday the third of the Month. Remark: This attribute is rarely supported in the market. ")
  public Boolean isWithinAMonthFlag() {
    return withinAMonthFlag;
  }

  public void setWithinAMonthFlag(Boolean withinAMonthFlag) {
    this.withinAMonthFlag = withinAMonthFlag;
  }

  public StandingOrderDetails monthsOfExecution(MonthsOfExecution monthsOfExecution) {
    this.monthsOfExecution = monthsOfExecution;
    return this;
  }

   /**
   * Get monthsOfExecution
   * @return monthsOfExecution
  **/
  @Schema(description = "")
  public MonthsOfExecution getMonthsOfExecution() {
    return monthsOfExecution;
  }

  public void setMonthsOfExecution(MonthsOfExecution monthsOfExecution) {
    this.monthsOfExecution = monthsOfExecution;
  }

  public StandingOrderDetails multiplicator(Integer multiplicator) {
    this.multiplicator = multiplicator;
    return this;
  }

   /**
   * This is multiplying the given frequency resulting the exact frequency, e.g. Frequency&#x3D;weekly and multiplicator&#x3D;3 means every 3 weeks. Remark: This attribute is rarely supported in the market. 
   * @return multiplicator
  **/
  @Schema(description = "This is multiplying the given frequency resulting the exact frequency, e.g. Frequency=weekly and multiplicator=3 means every 3 weeks. Remark: This attribute is rarely supported in the market. ")
  public Integer getMultiplicator() {
    return multiplicator;
  }

  public void setMultiplicator(Integer multiplicator) {
    this.multiplicator = multiplicator;
  }

  public StandingOrderDetails dayOfExecution(DayOfExecution dayOfExecution) {
    this.dayOfExecution = dayOfExecution;
    return this;
  }

   /**
   * Get dayOfExecution
   * @return dayOfExecution
  **/
  @Schema(description = "")
  public DayOfExecution getDayOfExecution() {
    return dayOfExecution;
  }

  public void setDayOfExecution(DayOfExecution dayOfExecution) {
    this.dayOfExecution = dayOfExecution;
  }

  public StandingOrderDetails limitAmount(Amount limitAmount) {
    this.limitAmount = limitAmount;
    return this;
  }

   /**
   * Get limitAmount
   * @return limitAmount
  **/
  @Schema(description = "")
  public Amount getLimitAmount() {
    return limitAmount;
  }

  public void setLimitAmount(Amount limitAmount) {
    this.limitAmount = limitAmount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StandingOrderDetails standingOrderDetails = (StandingOrderDetails) o;
    return Objects.equals(this.startDate, standingOrderDetails.startDate) &&
        Objects.equals(this.frequency, standingOrderDetails.frequency) &&
        Objects.equals(this.endDate, standingOrderDetails.endDate) &&
        Objects.equals(this.executionRule, standingOrderDetails.executionRule) &&
        Objects.equals(this.withinAMonthFlag, standingOrderDetails.withinAMonthFlag) &&
        Objects.equals(this.monthsOfExecution, standingOrderDetails.monthsOfExecution) &&
        Objects.equals(this.multiplicator, standingOrderDetails.multiplicator) &&
        Objects.equals(this.dayOfExecution, standingOrderDetails.dayOfExecution) &&
        Objects.equals(this.limitAmount, standingOrderDetails.limitAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, frequency, endDate, executionRule, withinAMonthFlag, monthsOfExecution, multiplicator, dayOfExecution, limitAmount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StandingOrderDetails {\n");
    
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    executionRule: ").append(toIndentedString(executionRule)).append("\n");
    sb.append("    withinAMonthFlag: ").append(toIndentedString(withinAMonthFlag)).append("\n");
    sb.append("    monthsOfExecution: ").append(toIndentedString(monthsOfExecution)).append("\n");
    sb.append("    multiplicator: ").append(toIndentedString(multiplicator)).append("\n");
    sb.append("    dayOfExecution: ").append(toIndentedString(dayOfExecution)).append("\n");
    sb.append("    limitAmount: ").append(toIndentedString(limitAmount)).append("\n");
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
