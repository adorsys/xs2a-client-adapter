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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * In cases where the specifically defined criteria (IBAN, BBAN, MSISDN) are not provided to identify an instance of the respective account type (e.g. a savings account), the ASPSP shall include a proprietary ID of the respective account that uniquely identifies the account for this ASPSP.
 */
@Schema(description = "In cases where the specifically defined criteria (IBAN, BBAN, MSISDN) are not provided to identify an instance of the respective account type (e.g. a savings account), the ASPSP shall include a proprietary ID of the respective account that uniquely identifies the account for this ASPSP.")

public class OtherType {
  @SerializedName("identification")
  private String identification = null;

  @SerializedName("schemeNameCode")
  private String schemeNameCode = null;

  @SerializedName("schemeNameProprietary")
  private String schemeNameProprietary = null;

  @SerializedName("issuer")
  private String issuer = null;

  public OtherType identification(String identification) {
    this.identification = identification;
    return this;
  }

   /**
   * Proprietary identification of the account.
   * @return identification
  **/
  @Schema(required = true, description = "Proprietary identification of the account.")
  public String getIdentification() {
    return identification;
  }

  public void setIdentification(String identification) {
    this.identification = identification;
  }

  public OtherType schemeNameCode(String schemeNameCode) {
    this.schemeNameCode = schemeNameCode;
    return this;
  }

   /**
   * An entry provided by an external ISO code list.
   * @return schemeNameCode
  **/
  @Schema(description = "An entry provided by an external ISO code list.")
  public String getSchemeNameCode() {
    return schemeNameCode;
  }

  public void setSchemeNameCode(String schemeNameCode) {
    this.schemeNameCode = schemeNameCode;
  }

  public OtherType schemeNameProprietary(String schemeNameProprietary) {
    this.schemeNameProprietary = schemeNameProprietary;
    return this;
  }

   /**
   * A scheme name defined in a proprietary way.
   * @return schemeNameProprietary
  **/
  @Schema(description = "A scheme name defined in a proprietary way.")
  public String getSchemeNameProprietary() {
    return schemeNameProprietary;
  }

  public void setSchemeNameProprietary(String schemeNameProprietary) {
    this.schemeNameProprietary = schemeNameProprietary;
  }

  public OtherType issuer(String issuer) {
    this.issuer = issuer;
    return this;
  }

   /**
   * Issuer of the identification.
   * @return issuer
  **/
  @Schema(description = "Issuer of the identification.")
  public String getIssuer() {
    return issuer;
  }

  public void setIssuer(String issuer) {
    this.issuer = issuer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OtherType otherType = (OtherType) o;
    return Objects.equals(this.identification, otherType.identification) &&
        Objects.equals(this.schemeNameCode, otherType.schemeNameCode) &&
        Objects.equals(this.schemeNameProprietary, otherType.schemeNameProprietary) &&
        Objects.equals(this.issuer, otherType.issuer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identification, schemeNameCode, schemeNameProprietary, issuer);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OtherType {\n");
    
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    schemeNameCode: ").append(toIndentedString(schemeNameCode)).append("\n");
    sb.append("    schemeNameProprietary: ").append(toIndentedString(schemeNameProprietary)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
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
