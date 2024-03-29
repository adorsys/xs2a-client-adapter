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
import de.adorsys.psd2.client.model.AccountOwner;
import de.adorsys.psd2.client.model.AccountStatus;
import de.adorsys.psd2.client.model.BalanceList;
import de.adorsys.psd2.client.model.LinksAccountDetails;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * The ASPSP shall give at least one of the account reference identifiers:   - iban   - bban   - pan   - maskedPan   - msisdn If the account is a multicurrency account currency code in \&quot;currency\&quot; is set to \&quot;XXX\&quot;. 
 */
@Schema(description = "The ASPSP shall give at least one of the account reference identifiers:   - iban   - bban   - pan   - maskedPan   - msisdn If the account is a multicurrency account currency code in \"currency\" is set to \"XXX\". ")

public class AccountDetails {
  @SerializedName("resourceId")
  private String resourceId = null;

  @SerializedName("iban")
  private String iban = null;

  @SerializedName("bban")
  private String bban = null;

  @SerializedName("msisdn")
  private String msisdn = null;

  @SerializedName("currency")
  private String currency = null;

  @SerializedName("ownerName")
  private String ownerName = null;

  @SerializedName("ownerNames")
  private List<AccountOwner> ownerNames = null;

  @SerializedName("psuName")
  private String psuName = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("displayName")
  private String displayName = null;

  @SerializedName("product")
  private String product = null;

  @SerializedName("cashAccountType")
  private String cashAccountType = null;

  @SerializedName("status")
  private AccountStatus status = null;

  @SerializedName("bic")
  private String bic = null;

  @SerializedName("linkedAccounts")
  private String linkedAccounts = null;

  /**
   * Specifies the usage of the account:   * PRIV: private personal account   * ORGA: professional account 
   */
  @JsonAdapter(UsageEnum.Adapter.class)
  public enum UsageEnum {
    PRIV("PRIV"),
    ORGA("ORGA");

    private String value;

    UsageEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static UsageEnum fromValue(String text) {
      for (UsageEnum b : UsageEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<UsageEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final UsageEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public UsageEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return UsageEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("usage")
  private UsageEnum usage = null;

  @SerializedName("details")
  private String details = null;

  @SerializedName("balances")
  private BalanceList balances = null;

  @SerializedName("_links")
  private LinksAccountDetails _links = null;

  public AccountDetails resourceId(String resourceId) {
    this.resourceId = resourceId;
    return this;
  }

   /**
   * This shall be filled, if addressable resource are created by the ASPSP on the /accounts or /card-accounts endpoint.
   * @return resourceId
  **/
  @Schema(description = "This shall be filled, if addressable resource are created by the ASPSP on the /accounts or /card-accounts endpoint.")
  public String getResourceId() {
    return resourceId;
  }

  public void setResourceId(String resourceId) {
    this.resourceId = resourceId;
  }

  public AccountDetails iban(String iban) {
    this.iban = iban;
    return this;
  }

   /**
   * Get iban
   * @return iban
  **/
  @Schema(description = "")
  public String getIban() {
    return iban;
  }

  public void setIban(String iban) {
    this.iban = iban;
  }

  public AccountDetails bban(String bban) {
    this.bban = bban;
    return this;
  }

   /**
   * Get bban
   * @return bban
  **/
  @Schema(description = "")
  public String getBban() {
    return bban;
  }

  public void setBban(String bban) {
    this.bban = bban;
  }

  public AccountDetails msisdn(String msisdn) {
    this.msisdn = msisdn;
    return this;
  }

   /**
   * Get msisdn
   * @return msisdn
  **/
  @Schema(description = "")
  public String getMsisdn() {
    return msisdn;
  }

  public void setMsisdn(String msisdn) {
    this.msisdn = msisdn;
  }

  public AccountDetails currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @Schema(required = true, description = "")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public AccountDetails ownerName(String ownerName) {
    this.ownerName = ownerName;
    return this;
  }

   /**
   * Get ownerName
   * @return ownerName
  **/
  @Schema(description = "")
  public String getOwnerName() {
    return ownerName;
  }

  public void setOwnerName(String ownerName) {
    this.ownerName = ownerName;
  }

  public AccountDetails ownerNames(List<AccountOwner> ownerNames) {
    this.ownerNames = ownerNames;
    return this;
  }

  public AccountDetails addOwnerNamesItem(AccountOwner ownerNamesItem) {
    if (this.ownerNames == null) {
      this.ownerNames = new ArrayList<>();
    }
    this.ownerNames.add(ownerNamesItem);
    return this;
  }

   /**
   * List of owner names. 
   * @return ownerNames
  **/
  @Schema(description = "List of owner names. ")
  public List<AccountOwner> getOwnerNames() {
    return ownerNames;
  }

  public void setOwnerNames(List<AccountOwner> ownerNames) {
    this.ownerNames = ownerNames;
  }

  public AccountDetails psuName(String psuName) {
    this.psuName = psuName;
    return this;
  }

   /**
   * Name of the PSU. In case of a corporate account, this might be the person acting on behalf of the corporate. 
   * @return psuName
  **/
  @Schema(description = "Name of the PSU. In case of a corporate account, this might be the person acting on behalf of the corporate. ")
  public String getPsuName() {
    return psuName;
  }

  public void setPsuName(String psuName) {
    this.psuName = psuName;
  }

  public AccountDetails name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the account, as assigned by the ASPSP, in agreement with the account owner in order to provide an additional means of identification of the account.
   * @return name
  **/
  @Schema(description = "Name of the account, as assigned by the ASPSP, in agreement with the account owner in order to provide an additional means of identification of the account.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AccountDetails displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @Schema(description = "")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public AccountDetails product(String product) {
    this.product = product;
    return this;
  }

   /**
   * Product name of the bank for this account, proprietary definition.
   * @return product
  **/
  @Schema(description = "Product name of the bank for this account, proprietary definition.")
  public String getProduct() {
    return product;
  }

  public void setProduct(String product) {
    this.product = product;
  }

  public AccountDetails cashAccountType(String cashAccountType) {
    this.cashAccountType = cashAccountType;
    return this;
  }

   /**
   * Get cashAccountType
   * @return cashAccountType
  **/
  @Schema(description = "")
  public String getCashAccountType() {
    return cashAccountType;
  }

  public void setCashAccountType(String cashAccountType) {
    this.cashAccountType = cashAccountType;
  }

  public AccountDetails status(AccountStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public AccountStatus getStatus() {
    return status;
  }

  public void setStatus(AccountStatus status) {
    this.status = status;
  }

  public AccountDetails bic(String bic) {
    this.bic = bic;
    return this;
  }

   /**
   * Get bic
   * @return bic
  **/
  @Schema(description = "")
  public String getBic() {
    return bic;
  }

  public void setBic(String bic) {
    this.bic = bic;
  }

  public AccountDetails linkedAccounts(String linkedAccounts) {
    this.linkedAccounts = linkedAccounts;
    return this;
  }

   /**
   * Case of a set of pending card transactions, the APSP will provide the relevant cash account the card is set up on.
   * @return linkedAccounts
  **/
  @Schema(description = "Case of a set of pending card transactions, the APSP will provide the relevant cash account the card is set up on.")
  public String getLinkedAccounts() {
    return linkedAccounts;
  }

  public void setLinkedAccounts(String linkedAccounts) {
    this.linkedAccounts = linkedAccounts;
  }

  public AccountDetails usage(UsageEnum usage) {
    this.usage = usage;
    return this;
  }

   /**
   * Specifies the usage of the account:   * PRIV: private personal account   * ORGA: professional account 
   * @return usage
  **/
  @Schema(description = "Specifies the usage of the account:   * PRIV: private personal account   * ORGA: professional account ")
  public UsageEnum getUsage() {
    return usage;
  }

  public void setUsage(UsageEnum usage) {
    this.usage = usage;
  }

  public AccountDetails details(String details) {
    this.details = details;
    return this;
  }

   /**
   * Specifications that might be provided by the ASPSP:   - characteristics of the account   - characteristics of the relevant card 
   * @return details
  **/
  @Schema(description = "Specifications that might be provided by the ASPSP:   - characteristics of the account   - characteristics of the relevant card ")
  public String getDetails() {
    return details;
  }

  public void setDetails(String details) {
    this.details = details;
  }

  public AccountDetails balances(BalanceList balances) {
    this.balances = balances;
    return this;
  }

   /**
   * Get balances
   * @return balances
  **/
  @Schema(description = "")
  public BalanceList getBalances() {
    return balances;
  }

  public void setBalances(BalanceList balances) {
    this.balances = balances;
  }

  public AccountDetails _links(LinksAccountDetails _links) {
    this._links = _links;
    return this;
  }

   /**
   * Get _links
   * @return _links
  **/
  @Schema(description = "")
  public LinksAccountDetails getLinks() {
    return _links;
  }

  public void setLinks(LinksAccountDetails _links) {
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
    AccountDetails accountDetails = (AccountDetails) o;
    return Objects.equals(this.resourceId, accountDetails.resourceId) &&
        Objects.equals(this.iban, accountDetails.iban) &&
        Objects.equals(this.bban, accountDetails.bban) &&
        Objects.equals(this.msisdn, accountDetails.msisdn) &&
        Objects.equals(this.currency, accountDetails.currency) &&
        Objects.equals(this.ownerName, accountDetails.ownerName) &&
        Objects.equals(this.ownerNames, accountDetails.ownerNames) &&
        Objects.equals(this.psuName, accountDetails.psuName) &&
        Objects.equals(this.name, accountDetails.name) &&
        Objects.equals(this.displayName, accountDetails.displayName) &&
        Objects.equals(this.product, accountDetails.product) &&
        Objects.equals(this.cashAccountType, accountDetails.cashAccountType) &&
        Objects.equals(this.status, accountDetails.status) &&
        Objects.equals(this.bic, accountDetails.bic) &&
        Objects.equals(this.linkedAccounts, accountDetails.linkedAccounts) &&
        Objects.equals(this.usage, accountDetails.usage) &&
        Objects.equals(this.details, accountDetails.details) &&
        Objects.equals(this.balances, accountDetails.balances) &&
        Objects.equals(this._links, accountDetails._links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceId, iban, bban, msisdn, currency, ownerName, ownerNames, psuName, name, displayName, product, cashAccountType, status, bic, linkedAccounts, usage, details, balances, _links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountDetails {\n");
    
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
    sb.append("    bban: ").append(toIndentedString(bban)).append("\n");
    sb.append("    msisdn: ").append(toIndentedString(msisdn)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    ownerName: ").append(toIndentedString(ownerName)).append("\n");
    sb.append("    ownerNames: ").append(toIndentedString(ownerNames)).append("\n");
    sb.append("    psuName: ").append(toIndentedString(psuName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    cashAccountType: ").append(toIndentedString(cashAccountType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    bic: ").append(toIndentedString(bic)).append("\n");
    sb.append("    linkedAccounts: ").append(toIndentedString(linkedAccounts)).append("\n");
    sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    balances: ").append(toIndentedString(balances)).append("\n");
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
