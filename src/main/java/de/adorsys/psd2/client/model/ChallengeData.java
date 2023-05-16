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
import java.util.ArrayList;
import java.util.List;
/**
 * It is contained in addition to the data element &#x27;chosenScaMethod&#x27; if challenge data is needed for SCA. In rare cases this attribute is also used in the context of the &#x27;startAuthorisationWithPsuAuthentication&#x27; link. 
 */
@Schema(description = "It is contained in addition to the data element 'chosenScaMethod' if challenge data is needed for SCA. In rare cases this attribute is also used in the context of the 'startAuthorisationWithPsuAuthentication' link. ")

public class ChallengeData {
  @SerializedName("image")
  private byte[] image = null;

  @SerializedName("data")
  private List<String> data = null;

  @SerializedName("imageLink")
  private String imageLink = null;

  @SerializedName("otpMaxLength")
  private Integer otpMaxLength = null;

  /**
   * The format type of the OTP to be typed in. The admitted values are \&quot;characters\&quot; or \&quot;integer\&quot;.
   */
  @JsonAdapter(OtpFormatEnum.Adapter.class)
  public enum OtpFormatEnum {
    CHARACTERS("characters"),
    INTEGER("integer");

    private String value;

    OtpFormatEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static OtpFormatEnum fromValue(String text) {
      for (OtpFormatEnum b : OtpFormatEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<OtpFormatEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OtpFormatEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OtpFormatEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return OtpFormatEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("otpFormat")
  private OtpFormatEnum otpFormat = null;

  @SerializedName("additionalInformation")
  private String additionalInformation = null;

  public ChallengeData image(byte[] image) {
    this.image = image;
    return this;
  }

   /**
   * PNG data (max. 512 kilobyte) to be displayed to the PSU, Base64 encoding, cp. [RFC4648]. This attribute is used only, when PHOTO_OTP or CHIP_OTP is the selected SCA method. 
   * @return image
  **/
  @Schema(description = "PNG data (max. 512 kilobyte) to be displayed to the PSU, Base64 encoding, cp. [RFC4648]. This attribute is used only, when PHOTO_OTP or CHIP_OTP is the selected SCA method. ")
  public byte[] getImage() {
    return image;
  }

  public void setImage(byte[] image) {
    this.image = image;
  }

  public ChallengeData data(List<String> data) {
    this.data = data;
    return this;
  }

  public ChallengeData addDataItem(String dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * A collection of strings as challenge data.
   * @return data
  **/
  @Schema(description = "A collection of strings as challenge data.")
  public List<String> getData() {
    return data;
  }

  public void setData(List<String> data) {
    this.data = data;
  }

  public ChallengeData imageLink(String imageLink) {
    this.imageLink = imageLink;
    return this;
  }

   /**
   * A link where the ASPSP will provides the challenge image for the TPP.
   * @return imageLink
  **/
  @Schema(description = "A link where the ASPSP will provides the challenge image for the TPP.")
  public String getImageLink() {
    return imageLink;
  }

  public void setImageLink(String imageLink) {
    this.imageLink = imageLink;
  }

  public ChallengeData otpMaxLength(Integer otpMaxLength) {
    this.otpMaxLength = otpMaxLength;
    return this;
  }

   /**
   * The maximal length for the OTP to be typed in by the PSU.
   * @return otpMaxLength
  **/
  @Schema(description = "The maximal length for the OTP to be typed in by the PSU.")
  public Integer getOtpMaxLength() {
    return otpMaxLength;
  }

  public void setOtpMaxLength(Integer otpMaxLength) {
    this.otpMaxLength = otpMaxLength;
  }

  public ChallengeData otpFormat(OtpFormatEnum otpFormat) {
    this.otpFormat = otpFormat;
    return this;
  }

   /**
   * The format type of the OTP to be typed in. The admitted values are \&quot;characters\&quot; or \&quot;integer\&quot;.
   * @return otpFormat
  **/
  @Schema(description = "The format type of the OTP to be typed in. The admitted values are \"characters\" or \"integer\".")
  public OtpFormatEnum getOtpFormat() {
    return otpFormat;
  }

  public void setOtpFormat(OtpFormatEnum otpFormat) {
    this.otpFormat = otpFormat;
  }

  public ChallengeData additionalInformation(String additionalInformation) {
    this.additionalInformation = additionalInformation;
    return this;
  }

   /**
   * Additional explanation for the PSU to explain e.g. fallback mechanism for the chosen SCA method. The TPP is obliged to show this to the PSU. 
   * @return additionalInformation
  **/
  @Schema(description = "Additional explanation for the PSU to explain e.g. fallback mechanism for the chosen SCA method. The TPP is obliged to show this to the PSU. ")
  public String getAdditionalInformation() {
    return additionalInformation;
  }

  public void setAdditionalInformation(String additionalInformation) {
    this.additionalInformation = additionalInformation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChallengeData challengeData = (ChallengeData) o;
    return Arrays.equals(this.image, challengeData.image) &&
        Objects.equals(this.data, challengeData.data) &&
        Objects.equals(this.imageLink, challengeData.imageLink) &&
        Objects.equals(this.otpMaxLength, challengeData.otpMaxLength) &&
        Objects.equals(this.otpFormat, challengeData.otpFormat) &&
        Objects.equals(this.additionalInformation, challengeData.additionalInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(image), data, imageLink, otpMaxLength, otpFormat, additionalInformation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChallengeData {\n");
    
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    imageLink: ").append(toIndentedString(imageLink)).append("\n");
    sb.append("    otpMaxLength: ").append(toIndentedString(otpMaxLength)).append("\n");
    sb.append("    otpFormat: ").append(toIndentedString(otpFormat)).append("\n");
    sb.append("    additionalInformation: ").append(toIndentedString(additionalInformation)).append("\n");
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
