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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;



import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;


/**
 * This data element is containing information about the status of the SCA method applied.   The following codes are defined for this data type.    * &#x27;received&#x27;:     An authorisation or cancellation-authorisation resource has been created successfully.   * &#x27;psuIdentified&#x27;:     The PSU related to the authorisation or cancellation-authorisation resource has been identified.   * &#x27;psuAuthenticated&#x27;:     The PSU related to the authorisation or cancellation-authorisation resource has been identified and authenticated e.g. by a password or by an access token.   * &#x27;scaMethodSelected&#x27;:     The PSU/TPP has selected the related SCA routine.      If the SCA method is chosen implicitly since only one SCA method is available,      then this is the first status to be reported instead of &#x27;received&#x27;.   * &#x27;started&#x27;:     The addressed SCA routine has been started.   * &#x27;finalised&#x27;:     The SCA routine has been finalised successfully.   * &#x27;failed&#x27;:     The SCA routine failed   * &#x27;exempted&#x27;:     SCA was exempted for the related transaction, the related authorisation is successful. 
 */

@JsonAdapter(ScaStatus.Adapter.class)

public enum ScaStatus {
  
  RECEIVED("received"),
  
  PSUIDENTIFIED("psuIdentified"),
  
  PSUAUTHENTICATED("psuAuthenticated"),
  
  SCAMETHODSELECTED("scaMethodSelected"),
  
  STARTED("started"),
  
  FINALISED("finalised"),
  
  FAILED("failed"),
  
  EXEMPTED("exempted");

  private String value;

  ScaStatus(String value) {
    this.value = value;
  }


  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }


  public static ScaStatus fromValue(String text) {
    for (ScaStatus b : ScaStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }


  public static class Adapter extends TypeAdapter<ScaStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final ScaStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ScaStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ScaStatus.fromValue(String.valueOf(value));
    }
  }

}



