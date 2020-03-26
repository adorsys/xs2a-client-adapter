/*
 * NextGenPSD2 XS2A Framework
 * # Summary The **NextGenPSD2** *Framework Version 1.3.4* offers a modern, open, harmonised and interoperable set of Application Programming Interfaces (APIs) as the safest and most efficient way to provide data securely. The NextGenPSD2 Framework reduces XS2A complexity and costs, addresses the problem of multiple competing standards in Europe and, aligned with the goals of the Euro Retail Payments Board, enables European banking customers to benefit from innovative products and services ('Banking as a Service') by granting TPPs safe and secure (authenticated and authorised) access to their bank accounts and financial data.  The possible Approaches are:   * Redirect SCA Approach   * OAuth SCA Approach   * Decoupled SCA Approach   * Embedded SCA Approach without SCA method   * Embedded SCA Approach with only one SCA method available   * Embedded SCA Approach with Selection of a SCA method    Not every message defined in this API definition is necessary for all approaches.   Furthermore this API definition does not differ between methods which are mandatory, conditional, or optional.   Therefore for a particular implementation of a Berlin Group PSD2 compliant API it is only necessary to support   a certain subset of the methods defined in this API definition.    **Please have a look at the implementation guidelines if you are not sure   which message has to be used for the approach you are going to use.**  ## Some General Remarks Related to this version of the OpenAPI Specification: * **This API definition is based on the Implementation Guidelines of the Berlin Group PSD2 API.**   It is not a replacement in any sense.   The main specification is (at the moment) always the Implementation Guidelines of the Berlin Group PSD2 API. * **This API definition contains the REST-API for requests from the PISP to the ASPSP.** * **This API definition contains the messages for all different approaches defined in the Implementation Guidelines.** * According to the OpenAPI-Specification [https://github.com/OAI/OpenAPI-Specification/blob/master/versions/3.0.1.md]      \"If in is \"header\" and the name field is \"Accept\", \"Content-Type\" or \"Authorization\", the parameter definition SHALL be ignored.\"    The element \"Accept\" will not be defined in this file at any place.    The elements \"Content-Type\" and \"Authorization\" are implicitly defined by the OpenApi tags \"content\" and \"security\".  * There are several predefined types which might occur in payment initiation messages,   but are not used in the standard JSON messages in the Implementation Guidelines.   Therefore they are not used in the corresponding messages in this file either.   We added them for the convenience of the user.   If there is a payment product, which need these fields, one can easily use the predefined types.   But the ASPSP need not to accept them in general.  * **We omit the definition of all standard HTTP header elements (mandatory/optional/conditional)   except they are mention in the Implementation Guidelines.**   Therefore the implementer might add these in his own realisation of a PSD2 comlient API in addition to the elements define in this file.  ## General Remarks on Data Types  The Berlin Group definition of UTF-8 strings in context of the PSD2 API has to support at least the following characters  a b c d e f g h i j k l m n o p q r s t u v w x y z  A B C D E F G H I J K L M N O P Q R S T U V W X Y Z  0 1 2 3 4 5 6 7 8 9  / - ? : ( ) . , ' +  Space 
 *
 * OpenAPI spec version: 1.3.4_2019-07-17v1
 * Contact: info@berlin-group.org
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package de.adorsys.psd2.client.model;

import java.util.Objects;
import java.util.Arrays;
import de.adorsys.psd2.client.model.HrefType;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.HashMap;
import java.util.Map;
/**
 * A list of hyperlinks to be recognised by the TPP. The actual hyperlinks used in the response depend on the dynamical decisions of the ASPSP when processing the request.  **Remark:** All links can be relative or full links, to be decided by the ASPSP.  **Remark:** This method can be applied before or after PSU identification. This leads to many possible hyperlink responses. Type of links admitted in this response, (further links might be added for ASPSP defined extensions):  - &#x27;scaRedirect&#x27;:   In case of an SCA Redirect Approach, the ASPSP is transmitting the link to which to   redirect the PSU browser. - &#x27;scaOAuth&#x27;:   In case of a SCA OAuth2 Approach, the ASPSP is transmitting the URI where the   configuration of the Authorisation Server can be retrieved.   The configuration follows the OAuth 2.0 Authorisation Server Metadata specification. - &#x27;updatePsuIdentification&#x27;:   The link to the authorisation or cancellation authorisation sub-resource,   where PSU identification data needs to be uploaded. - &#x27;updatePsuAuthentication&#x27;:   The link to the authorisation or cancellation authorisation sub-resource,   where PSU authentication data needs to be uploaded.   - &#x27;updateEncryptedPsuAuthentication&#x27;:   The link to the authorisation or cancellation authorisation sub-resource,   where PSU authentication encrypted data needs to be uploaded. - &#x27;updateAdditionalPsuAuthentication&#x27;:     The link to the payment initiation or account information resource,     which needs to be updated by an additional PSU password. - &#x27;updateAdditionalEncryptedPsuAuthentication&#x27;:     The link to the payment initiation or account information resource,     which needs to be updated by an additional encrypted PSU password. - &#x27;authoriseTransaction&#x27;:   The link to the authorisation or cancellation authorisation sub-resource,   where the authorisation data has to be uploaded, e.g. the TOP received by SMS. - &#x27;scaStatus&#x27;:   The link to retrieve the scaStatus of the corresponding authorisation sub-resource. 
 */
@Schema(description = "A list of hyperlinks to be recognised by the TPP. The actual hyperlinks used in the response depend on the dynamical decisions of the ASPSP when processing the request.  **Remark:** All links can be relative or full links, to be decided by the ASPSP.  **Remark:** This method can be applied before or after PSU identification. This leads to many possible hyperlink responses. Type of links admitted in this response, (further links might be added for ASPSP defined extensions):  - 'scaRedirect':   In case of an SCA Redirect Approach, the ASPSP is transmitting the link to which to   redirect the PSU browser. - 'scaOAuth':   In case of a SCA OAuth2 Approach, the ASPSP is transmitting the URI where the   configuration of the Authorisation Server can be retrieved.   The configuration follows the OAuth 2.0 Authorisation Server Metadata specification. - 'updatePsuIdentification':   The link to the authorisation or cancellation authorisation sub-resource,   where PSU identification data needs to be uploaded. - 'updatePsuAuthentication':   The link to the authorisation or cancellation authorisation sub-resource,   where PSU authentication data needs to be uploaded.   - 'updateEncryptedPsuAuthentication':   The link to the authorisation or cancellation authorisation sub-resource,   where PSU authentication encrypted data needs to be uploaded. - 'updateAdditionalPsuAuthentication':     The link to the payment initiation or account information resource,     which needs to be updated by an additional PSU password. - 'updateAdditionalEncryptedPsuAuthentication':     The link to the payment initiation or account information resource,     which needs to be updated by an additional encrypted PSU password. - 'authoriseTransaction':   The link to the authorisation or cancellation authorisation sub-resource,   where the authorisation data has to be uploaded, e.g. the TOP received by SMS. - 'scaStatus':   The link to retrieve the scaStatus of the corresponding authorisation sub-resource. ")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-26T15:17:13.106+01:00[Europe/Berlin]")
public class LinksSelectPsuAuthenticationMethod extends HashMap<String, HrefType> {

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinksSelectPsuAuthenticationMethod {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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
