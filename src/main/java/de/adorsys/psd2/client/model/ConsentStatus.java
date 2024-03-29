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
import io.swagger.v3.oas.annotations.media.Schema;
import com.google.gson.annotations.SerializedName;
import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * This is the overall lifecycle status of the consent.  Valid values are:   - &#x27;received&#x27;: The consent data have been received and are technically correct.      The data is not authorised yet.   - &#x27;rejected&#x27;: The consent data have been rejected e.g. since no successful authorisation has taken place.   - &#x27;valid&#x27;: The consent is accepted and valid for GET account data calls and others as specified in the consent object.   - &#x27;revokedByPsu&#x27;: The consent has been revoked by the PSU towards the ASPSP.   - &#x27;expired&#x27;: The consent expired.   - &#x27;terminatedByTpp&#x27;: The corresponding TPP has terminated the consent by applying the DELETE method to the consent resource.   - &#x27;partiallyAuthorised&#x27;: The consent is due to a multi-level authorisation, some but not all mandated authorisations have been performed yet.  The ASPSP might add further codes. These codes then shall be contained in the ASPSP&#x27;s documentation of the XS2A interface  and has to be added to this API definition as well. 
 */
@JsonAdapter(ConsentStatus.Adapter.class)
public enum ConsentStatus {
  RECEIVED("received"),
  REJECTED("rejected"),
  VALID("valid"),
  REVOKEDBYPSU("revokedByPsu"),
  EXPIRED("expired"),
  TERMINATEDBYTPP("terminatedByTpp"),
  PARTIALLYAUTHORISED("partiallyAuthorised");

  private String value;

  ConsentStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ConsentStatus fromValue(String text) {
    for (ConsentStatus b : ConsentStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ConsentStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final ConsentStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ConsentStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ConsentStatus.fromValue(String.valueOf(value));
    }
  }
}
