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


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.Consents;
import org.threeten.bp.LocalDate;
import java.util.UUID;

import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for AccountInformationServiceAisApi
 */
@Ignore
public class AccountInformationServiceAisApiTest {

    private final AccountInformationServiceAisApi api = new AccountInformationServiceAisApi();

    
    /**
     * Create consent
     *
     * This method create a consent resource, defining access rights to dedicated accounts of  a given PSU-ID. These accounts are addressed explicitly in the method as  parameters as a core function.  **Side Effects** When this Consent Request is a request where the \&quot;recurringIndicator\&quot; equals \&quot;true\&quot;,  and if it exists already a former consent for recurring access on account information  for the addressed PSU, then the former consent automatically expires as soon as the new  consent request is authorised by the PSU.  Optional Extension: As an option, an ASPSP might optionally accept a specific access right on the access on all psd2 related services for all available accounts.   As another option an ASPSP might optionally also accept a command, where only access rights are inserted without mentioning the addressed account.  The relation to accounts is then handled afterwards between PSU and ASPSP.  This option is supported only within the Decoupled, OAuth2 or Re-direct SCA Approach.  As a last option, an ASPSP might in addition accept a command with access rights   * to see the list of available payment accounts or   * to see the list of available payment accounts with balances. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createConsentTest() throws ApiException {
        
        UUID xRequestID = null;
        
        Consents body = null;
        
        String digest = null;
        
        String signature = null;
        
        byte[] tpPSignatureCertificate = null;
        
        String PSU_ID = null;
        
        String psUIDType = null;
        
        String psUCorporateID = null;
        
        String psUCorporateIDType = null;
        
        Boolean tpPRedirectPreferred = null;
        
        String tpPRedirectURI = null;
        
        String tpPNokRedirectURI = null;
        
        Boolean tpPExplicitAuthorisationPreferred = null;
        
        String psUIPAddress = null;
        
        Object psUIPPort = null;
        
        String psUAccept = null;
        
        String psUAcceptCharset = null;
        
        String psUAcceptEncoding = null;
        
        String psUAcceptLanguage = null;
        
        String psUUserAgent = null;
        
        String psUHttpMethod = null;
        
        UUID psUDeviceID = null;
        
        String psUGeoLocation = null;
        
        api.createConsent(xRequestID, body, digest, signature, tpPSignatureCertificate, PSU_ID, psUIDType, psUCorporateID, psUCorporateIDType, tpPRedirectPreferred, tpPRedirectURI, tpPNokRedirectURI, tpPExplicitAuthorisationPreferred, psUIPAddress, psUIPPort, psUAccept, psUAcceptCharset, psUAcceptEncoding, psUAcceptLanguage, psUUserAgent, psUHttpMethod, psUDeviceID, psUGeoLocation);

        // TODO: test validations
    }
    
    /**
     * Delete Consent
     *
     * The TPP can delete an account information consent object if needed.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteConsentTest() throws ApiException {
        
        String consentId = null;
        
        UUID xRequestID = null;
        
        String digest = null;
        
        String signature = null;
        
        byte[] tpPSignatureCertificate = null;
        
        String psUIPAddress = null;
        
        Object psUIPPort = null;
        
        String psUAccept = null;
        
        String psUAcceptCharset = null;
        
        String psUAcceptEncoding = null;
        
        String psUAcceptLanguage = null;
        
        String psUUserAgent = null;
        
        String psUHttpMethod = null;
        
        UUID psUDeviceID = null;
        
        String psUGeoLocation = null;
        
        api.deleteConsent(consentId, xRequestID, digest, signature, tpPSignatureCertificate, psUIPAddress, psUIPPort, psUAccept, psUAcceptCharset, psUAcceptEncoding, psUAcceptLanguage, psUUserAgent, psUHttpMethod, psUDeviceID, psUGeoLocation);

        // TODO: test validations
    }
    
    /**
     * Read Account List
     *
     * Read the identifiers of the available payment account together with  booking balance information, depending on the consent granted.  It is assumed that a consent of the PSU to this access is already given and stored on the ASPSP system.  The addressed list of accounts depends then on the PSU ID and the stored consent addressed by consentId,  respectively the OAuth2 access token.   Returns all identifiers of the accounts, to which an account access has been granted to through  the /consents endpoint by the PSU.  In addition, relevant information about the accounts and hyperlinks to corresponding account  information resources are provided if a related consent has been already granted.  Remark: Note that the /consents endpoint optionally offers to grant an access on all available  payment accounts of a PSU.  In this case, this endpoint will deliver the information about all available payment accounts  of the PSU at this ASPSP. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAccountListTest() throws ApiException {
        
        UUID xRequestID = null;
        
        String consentID = null;
        
        Boolean withBalance = null;
        
        String digest = null;
        
        String signature = null;
        
        byte[] tpPSignatureCertificate = null;
        
        String psUIPAddress = null;
        
        Object psUIPPort = null;
        
        String psUAccept = null;
        
        String psUAcceptCharset = null;
        
        String psUAcceptEncoding = null;
        
        String psUAcceptLanguage = null;
        
        String psUUserAgent = null;
        
        String psUHttpMethod = null;
        
        UUID psUDeviceID = null;
        
        String psUGeoLocation = null;
        
        api.getAccountList(xRequestID, consentID, withBalance, digest, signature, tpPSignatureCertificate, psUIPAddress, psUIPPort, psUAccept, psUAcceptCharset, psUAcceptEncoding, psUAcceptLanguage, psUUserAgent, psUHttpMethod, psUDeviceID, psUGeoLocation);

        // TODO: test validations
    }
    
    /**
     * Read Balance
     *
     * Reads account data from a given account addressed by \&quot;account-id\&quot;.   **Remark:** This account-id can be a tokenised identification due to data protection reason since the path  information might be logged on intermediary servers within the ASPSP sphere.  This account-id then can be retrieved by the \&quot;GET Account List\&quot; call.  The account-id is constant at least throughout the lifecycle of a given consent. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBalancesTest() throws ApiException {
        
        String accountId = null;
        
        UUID xRequestID = null;
        
        String consentID = null;
        
        String digest = null;
        
        String signature = null;
        
        byte[] tpPSignatureCertificate = null;
        
        String psUIPAddress = null;
        
        Object psUIPPort = null;
        
        String psUAccept = null;
        
        String psUAcceptCharset = null;
        
        String psUAcceptEncoding = null;
        
        String psUAcceptLanguage = null;
        
        String psUUserAgent = null;
        
        String psUHttpMethod = null;
        
        UUID psUDeviceID = null;
        
        String psUGeoLocation = null;
        
        api.getBalances(accountId, xRequestID, consentID, digest, signature, tpPSignatureCertificate, psUIPAddress, psUIPPort, psUAccept, psUAcceptCharset, psUAcceptEncoding, psUAcceptLanguage, psUUserAgent, psUHttpMethod, psUDeviceID, psUGeoLocation);

        // TODO: test validations
    }
    
    /**
     * Get Consent Request
     *
     * Returns the content of an account information consent object.  This is returning the data for the TPP especially in cases,  where the consent was directly managed between ASPSP and PSU e.g. in a re-direct SCA Approach. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getConsentInformationTest() throws ApiException {
        
        String consentId = null;
        
        UUID xRequestID = null;
        
        String digest = null;
        
        String signature = null;
        
        byte[] tpPSignatureCertificate = null;
        
        String psUIPAddress = null;
        
        Object psUIPPort = null;
        
        String psUAccept = null;
        
        String psUAcceptCharset = null;
        
        String psUAcceptEncoding = null;
        
        String psUAcceptLanguage = null;
        
        String psUUserAgent = null;
        
        String psUHttpMethod = null;
        
        UUID psUDeviceID = null;
        
        String psUGeoLocation = null;
        
        api.getConsentInformation(consentId, xRequestID, digest, signature, tpPSignatureCertificate, psUIPAddress, psUIPPort, psUAccept, psUAcceptCharset, psUAcceptEncoding, psUAcceptLanguage, psUUserAgent, psUHttpMethod, psUDeviceID, psUGeoLocation);

        // TODO: test validations
    }
    
    /**
     * Read the SCA status of the consent authorisation.
     *
     * This method returns the SCA status of a consent initiation&#x27;s authorisation sub-resource. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getConsentScaStatusTest() throws ApiException {
        
        String consentId = null;
        
        String authorisationId = null;
        
        UUID xRequestID = null;
        
        String digest = null;
        
        String signature = null;
        
        byte[] tpPSignatureCertificate = null;
        
        String psUIPAddress = null;
        
        Object psUIPPort = null;
        
        String psUAccept = null;
        
        String psUAcceptCharset = null;
        
        String psUAcceptEncoding = null;
        
        String psUAcceptLanguage = null;
        
        String psUUserAgent = null;
        
        String psUHttpMethod = null;
        
        UUID psUDeviceID = null;
        
        String psUGeoLocation = null;
        
        api.getConsentScaStatus(consentId, authorisationId, xRequestID, digest, signature, tpPSignatureCertificate, psUIPAddress, psUIPPort, psUAccept, psUAcceptCharset, psUAcceptEncoding, psUAcceptLanguage, psUUserAgent, psUHttpMethod, psUDeviceID, psUGeoLocation);

        // TODO: test validations
    }
    
    /**
     * Consent status request
     *
     * Read the status of an account information consent resource.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getConsentStatusTest() throws ApiException {
        
        String consentId = null;
        
        UUID xRequestID = null;
        
        String digest = null;
        
        String signature = null;
        
        byte[] tpPSignatureCertificate = null;
        
        String psUIPAddress = null;
        
        Object psUIPPort = null;
        
        String psUAccept = null;
        
        String psUAcceptCharset = null;
        
        String psUAcceptEncoding = null;
        
        String psUAcceptLanguage = null;
        
        String psUUserAgent = null;
        
        String psUHttpMethod = null;
        
        UUID psUDeviceID = null;
        
        String psUGeoLocation = null;
        
        api.getConsentStatus(consentId, xRequestID, digest, signature, tpPSignatureCertificate, psUIPAddress, psUIPPort, psUAccept, psUAcceptCharset, psUAcceptEncoding, psUAcceptLanguage, psUUserAgent, psUHttpMethod, psUDeviceID, psUGeoLocation);

        // TODO: test validations
    }
    
    /**
     * Read Transaction Details
     *
     * Reads transaction details from a given transaction addressed by \&quot;resourceId\&quot; on a given account addressed by \&quot;account-id\&quot;.  This call is only available on transactions as reported in a JSON format.  **Remark:** Please note that the PATH might be already given in detail by the corresponding entry of the response of the  \&quot;Read Transaction List\&quot; call within the _links subfield. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTransactionDetailsTest() throws ApiException {
        
        String accountId = null;
        
        String resourceId = null;
        
        UUID xRequestID = null;
        
        String consentID = null;
        
        String digest = null;
        
        String signature = null;
        
        byte[] tpPSignatureCertificate = null;
        
        String psUIPAddress = null;
        
        Object psUIPPort = null;
        
        String psUAccept = null;
        
        String psUAcceptCharset = null;
        
        String psUAcceptEncoding = null;
        
        String psUAcceptLanguage = null;
        
        String psUUserAgent = null;
        
        String psUHttpMethod = null;
        
        UUID psUDeviceID = null;
        
        String psUGeoLocation = null;
        
        api.getTransactionDetails(accountId, resourceId, xRequestID, consentID, digest, signature, tpPSignatureCertificate, psUIPAddress, psUIPPort, psUAccept, psUAcceptCharset, psUAcceptEncoding, psUAcceptLanguage, psUUserAgent, psUHttpMethod, psUDeviceID, psUGeoLocation);

        // TODO: test validations
    }
    
    /**
     * Read Transaction List
     *
     * Read transaction reports or transaction lists of a given account ddressed by \&quot;account-id\&quot;, depending on the steering parameter  \&quot;bookingStatus\&quot; together with balances.  For a given account, additional parameters are e.g. the attributes \&quot;dateFrom\&quot; and \&quot;dateTo\&quot;.  The ASPSP might add balance information, if transaction lists without balances are not supported. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTransactionListTest() throws ApiException {
        
        String accountId = null;
        
        String bookingStatus = null;
        
        UUID xRequestID = null;
        
        String consentID = null;
        
        LocalDate dateFrom = null;
        
        LocalDate dateTo = null;
        
        String entryReferenceFrom = null;
        
        Boolean deltaList = null;
        
        Boolean withBalance = null;
        
        String digest = null;
        
        String signature = null;
        
        byte[] tpPSignatureCertificate = null;
        
        String psUIPAddress = null;
        
        Object psUIPPort = null;
        
        String psUAccept = null;
        
        String psUAcceptCharset = null;
        
        String psUAcceptEncoding = null;
        
        String psUAcceptLanguage = null;
        
        String psUUserAgent = null;
        
        String psUHttpMethod = null;
        
        UUID psUDeviceID = null;
        
        String psUGeoLocation = null;
        
        api.getTransactionList(accountId, bookingStatus, xRequestID, consentID, dateFrom, dateTo, entryReferenceFrom, deltaList, withBalance, digest, signature, tpPSignatureCertificate, psUIPAddress, psUIPPort, psUAccept, psUAcceptCharset, psUAcceptEncoding, psUAcceptLanguage, psUUserAgent, psUHttpMethod, psUDeviceID, psUGeoLocation);

        // TODO: test validations
    }
    
    /**
     * Read Account Details
     *
     * Reads details about an account, with balances where required.  It is assumed that a consent of the PSU to  this access is already given and stored on the ASPSP system.  The addressed details of this account depends then on the stored consent addressed by consentId,  respectively the OAuth2 access token.  **NOTE:** The account-id can represent a multicurrency account.  In this case the currency code is set to \&quot;XXX\&quot;.  Give detailed information about the addressed account.  Give detailed information about the addressed account together with balance information 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void readAccountDetailsTest() throws ApiException {
        
        String accountId = null;
        
        UUID xRequestID = null;
        
        String consentID = null;
        
        Boolean withBalance = null;
        
        String digest = null;
        
        String signature = null;
        
        byte[] tpPSignatureCertificate = null;
        
        String psUIPAddress = null;
        
        Object psUIPPort = null;
        
        String psUAccept = null;
        
        String psUAcceptCharset = null;
        
        String psUAcceptEncoding = null;
        
        String psUAcceptLanguage = null;
        
        String psUUserAgent = null;
        
        String psUHttpMethod = null;
        
        UUID psUDeviceID = null;
        
        String psUGeoLocation = null;
        
        api.readAccountDetails(accountId, xRequestID, consentID, withBalance, digest, signature, tpPSignatureCertificate, psUIPAddress, psUIPPort, psUAccept, psUAcceptCharset, psUAcceptEncoding, psUAcceptLanguage, psUUserAgent, psUHttpMethod, psUDeviceID, psUGeoLocation);

        // TODO: test validations
    }
    
    /**
     * Start the authorisation process for a consent
     *
     * Create an authorisation sub-resource and start the authorisation process of a consent.  The message might in addition transmit authentication and authorisation related data.  his method is iterated n times for a n times SCA authorisation in a  corporate context, each creating an own authorisation sub-endpoint for  the corresponding PSU authorising the consent.  The ASPSP might make the usage of this access method unnecessary,  since the related authorisation resource will be automatically created by  the ASPSP after the submission of the consent data with the first POST consents call.  The start authorisation process is a process which is needed for creating a new authorisation  or cancellation sub-resource.   This applies in the following scenarios:    * The ASPSP has indicated with an &#x27;startAuthorisation&#x27; hyperlink in the preceeding Payment      Initiation Response that an explicit start of the authorisation process is needed by the TPP.      The &#x27;startAuthorisation&#x27; hyperlink can transport more information about data which needs to be      uploaded by using the extended forms.     * &#x27;startAuthorisationWithPsuIdentfication&#x27;,      * &#x27;startAuthorisationWithPsuAuthentication&#x27;     * &#x27;startAuthorisationWithAuthentciationMethodSelection&#x27;    * The related payment initiation cannot yet be executed since a multilevel SCA is mandated.   * The ASPSP has indicated with an &#x27;startAuthorisation&#x27; hyperlink in the preceeding      Payment Cancellation Response that an explicit start of the authorisation process is needed by the TPP.      The &#x27;startAuthorisation&#x27; hyperlink can transport more information about data which needs to be uploaded      by using the extended forms as indicated above.   * The related payment cancellation request cannot be applied yet since a multilevel SCA is mandate for      executing the cancellation.   * The signing basket needs to be authorised yet. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void startConsentAuthorisationTest() throws ApiException {
        
        String consentId = null;
        
        UUID xRequestID = null;
        
        String digest = null;
        
        String signature = null;
        
        byte[] tpPSignatureCertificate = null;
        
        String PSU_ID = null;
        
        String psUIDType = null;
        
        String psUCorporateID = null;
        
        String psUCorporateIDType = null;
        
        String psUIPAddress = null;
        
        Object psUIPPort = null;
        
        String psUAccept = null;
        
        String psUAcceptCharset = null;
        
        String psUAcceptEncoding = null;
        
        String psUAcceptLanguage = null;
        
        String psUUserAgent = null;
        
        String psUHttpMethod = null;
        
        UUID psUDeviceID = null;
        
        String psUGeoLocation = null;
        
        api.startConsentAuthorisation(consentId, xRequestID, digest, signature, tpPSignatureCertificate, PSU_ID, psUIDType, psUCorporateID, psUCorporateIDType, psUIPAddress, psUIPPort, psUAccept, psUAcceptCharset, psUAcceptEncoding, psUAcceptLanguage, psUUserAgent, psUHttpMethod, psUDeviceID, psUGeoLocation);

        // TODO: test validations
    }
    
    /**
     * Update PSU Data for consents
     *
     * This method update PSU data on the consents  resource if needed.  It may authorise a consent within the Embedded SCA Approach where needed.  Independently from the SCA Approach it supports e.g. the selection of  the authentication method and a non-SCA PSU authentication.  This methods updates PSU data on the cancellation authorisation resource if needed.   There are several possible Update PSU Data requests in the context of a consent request if needed,  which depends on the SCA approach:  * Redirect SCA Approach:   A specific Update PSU Data Request is applicable for      * the selection of authentication methods, before choosing the actual SCA approach. * Decoupled SCA Approach:   A specific Update PSU Data Request is only applicable for   * adding the PSU Identification, if not provided yet in the Payment Initiation Request or the Account Information Consent Request, or if no OAuth2 access token is used, or   * the selection of authentication methods. * Embedded SCA Approach:    The Update PSU Data Request might be used    * to add credentials as a first factor authentication data of the PSU and   * to select the authentication method and   * transaction authorisation.  The SCA Approach might depend on the chosen SCA method.  For that reason, the following possible Update PSU Data request can apply to all SCA approaches:  * Select an SCA method in case of several SCA methods are available for the customer.  There are the following request types on this access path:   * Update PSU Identification   * Update PSU Authentication   * Select PSU Autorization Method      WARNING: This method need a reduced header,      therefore many optional elements are not present.      Maybe in a later version the access path will change.   * Transaction Authorisation     WARNING: This method need a reduced header,      therefore many optional elements are not present.      Maybe in a later version the access path will change. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateConsentsPsuDataTest() throws ApiException {
        
        String consentId = null;
        
        String authorisationId = null;
        
        UUID xRequestID = null;
        
        Object body = null;
        
        String digest = null;
        
        String signature = null;
        
        byte[] tpPSignatureCertificate = null;
        
        String PSU_ID = null;
        
        String psUIDType = null;
        
        String psUCorporateID = null;
        
        String psUCorporateIDType = null;
        
        String psUIPAddress = null;
        
        Object psUIPPort = null;
        
        String psUAccept = null;
        
        String psUAcceptCharset = null;
        
        String psUAcceptEncoding = null;
        
        String psUAcceptLanguage = null;
        
        String psUUserAgent = null;
        
        String psUHttpMethod = null;
        
        UUID psUDeviceID = null;
        
        String psUGeoLocation = null;
        
        api.updateConsentsPsuData(consentId, authorisationId, xRequestID, body, digest, signature, tpPSignatureCertificate, PSU_ID, psUIDType, psUCorporateID, psUCorporateIDType, psUIPAddress, psUIPPort, psUAccept, psUAcceptCharset, psUAcceptEncoding, psUAcceptLanguage, psUUserAgent, psUHttpMethod, psUDeviceID, psUGeoLocation);

        // TODO: test validations
    }
    
}
