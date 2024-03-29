# AccountInformationServiceAisApi

All URIs are relative to *https://api.testbank.com/psd2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createConsent**](AccountInformationServiceAisApi.md#createConsent) | **POST** /v1/consents | Create consent
[**deleteConsent**](AccountInformationServiceAisApi.md#deleteConsent) | **DELETE** /v1/consents/{consentId} | Delete consent
[**getAccountList**](AccountInformationServiceAisApi.md#getAccountList) | **GET** /v1/accounts | Read account list
[**getBalances**](AccountInformationServiceAisApi.md#getBalances) | **GET** /v1/accounts/{account-id}/balances | Read balance
[**getCardAccountBalances**](AccountInformationServiceAisApi.md#getCardAccountBalances) | **GET** /v1/card-accounts/{account-id}/balances | Read card account balances
[**getCardAccountList**](AccountInformationServiceAisApi.md#getCardAccountList) | **GET** /v1/card-accounts | Read a list of card accounts
[**getCardAccountTransactionList**](AccountInformationServiceAisApi.md#getCardAccountTransactionList) | **GET** /v1/card-accounts/{account-id}/transactions | Read transaction list of an account
[**getConsentAuthorisation**](AccountInformationServiceAisApi.md#getConsentAuthorisation) | **GET** /v1/consents/{consentId}/authorisations | Get consent authorisation sub-resources request
[**getConsentInformation**](AccountInformationServiceAisApi.md#getConsentInformation) | **GET** /v1/consents/{consentId} | Get consent request
[**getConsentScaStatus**](AccountInformationServiceAisApi.md#getConsentScaStatus) | **GET** /v1/consents/{consentId}/authorisations/{authorisationId} | Read the SCA status of the consent authorisation
[**getConsentStatus**](AccountInformationServiceAisApi.md#getConsentStatus) | **GET** /v1/consents/{consentId}/status | Consent status request
[**getTransactionDetails**](AccountInformationServiceAisApi.md#getTransactionDetails) | **GET** /v1/accounts/{account-id}/transactions/{transactionId} | Read transaction details
[**getTransactionList**](AccountInformationServiceAisApi.md#getTransactionList) | **GET** /v1/accounts/{account-id}/transactions | Read transaction list of an account
[**readAccountDetails**](AccountInformationServiceAisApi.md#readAccountDetails) | **GET** /v1/accounts/{account-id} | Read account details
[**readCardAccountDetails**](AccountInformationServiceAisApi.md#readCardAccountDetails) | **GET** /v1/card-accounts/{account-id} | Read details about a card account
[**startConsentAuthorisation**](AccountInformationServiceAisApi.md#startConsentAuthorisation) | **POST** /v1/consents/{consentId}/authorisations | Start the authorisation process for a consent
[**updateConsentsPsuData**](AccountInformationServiceAisApi.md#updateConsentsPsuData) | **PUT** /v1/consents/{consentId}/authorisations/{authorisationId} | Update PSU Data for consents

<a name="createConsent"></a>
# **createConsent**
> ConsentsResponse201 createConsent(xRequestID, psUIPAddress, body, digest, signature, tpPSignatureCertificate, PSU_ID, psUIDType, psUCorporateID, psUCorporateIDType, tpPRedirectPreferred, tpPDecoupledPreferred, tpPRedirectURI, tpPNokRedirectURI, tpPExplicitAuthorisationPreferred, tpPBrandLoggingInformation, tpPNotificationURI, tpPNotificationContentPreferred, psUIPPort, psUAccept, psUAcceptCharset, psUAcceptEncoding, psUAcceptLanguage, psUUserAgent, psUHttpMethod, psUDeviceID, psUGeoLocation)

Create consent

This method create a consent resource, defining access rights to dedicated accounts of  a given PSU-ID. These accounts are addressed explicitly in the method as  parameters as a core function.  **Side Effects** When this consent request is a request where the \&quot;recurringIndicator\&quot; equals \&quot;true\&quot;, and if it exists already a former consent for recurring access on account information  for the addressed PSU, then the former consent automatically expires as soon as the new  consent request is authorised by the PSU.  Optional Extension: As an option, an ASPSP might optionally accept a specific access right on the access on all PSD2 related services for all available accounts.  As another option an ASPSP might optionally also accept a command, where only access rights are inserted without mentioning the addressed account.  The relation to accounts is then handled afterwards between PSU and ASPSP.  This option is not supported for the Embedded SCA Approach.  As a last option, an ASPSP might in addition accept a command with access rights   * to see the list of available payment accounts or   * to see the list of available payment accounts with balances. 

### Example
```java
// Import classes:
//import de.adorsys.psd2.client.ApiClient;
//import de.adorsys.psd2.client.ApiException;
//import de.adorsys.psd2.client.Configuration;
//import de.adorsys.psd2.client.auth.*;
//import de.adorsys.psd2.client.api.AccountInformationServiceAisApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AccountInformationServiceAisApi apiInstance = new AccountInformationServiceAisApi();
UUID xRequestID = new UUID(); // UUID | ID of the request, unique to the call, as determined by the initiating party.
String psUIPAddress = "psUIPAddress_example"; // String | The forwarded IP Address header field consists of the corresponding http request IP Address field between PSU and TPP. If not available, the TPP shall use the IP Address used by the TPP when submitting this request. 
Consents body = new Consents(); // Consents | Request body for a consents request.

String digest = "digest_example"; // String | Is contained if and only if the \"Signature\" element is contained in the header of the request.
String signature = "signature_example"; // String | A signature of the request by the TPP on application level. This might be mandated by ASPSP. 
byte[] tpPSignatureCertificate = B; // byte[] | The certificate used for signing the request, in base64 encoding.  Must be contained if a signature is contained. 
String PSU_ID = "PSU_ID_example"; // String | Client ID of the PSU in the ASPSP client interface.   Might be mandated in the ASPSP's documentation.  It might be contained even if an OAuth2 based authentication was performed in a pre-step or an OAuth2 based SCA was performed in an preceding AIS service in the same session. In this case the ASPSP might check whether PSU-ID and token match,  according to ASPSP documentation. 
String psUIDType = "psUIDType_example"; // String | Type of the PSU-ID, needed in scenarios where PSUs have several PSU-IDs as access possibility.  In this case, the mean and use are then defined in the ASPSP’s documentation. 
String psUCorporateID = "psUCorporateID_example"; // String | Might be mandated in the ASPSP's documentation. Only used in a corporate context. 
String psUCorporateIDType = "psUCorporateIDType_example"; // String | Might be mandated in the ASPSP's documentation. Only used in a corporate context. 
Boolean tpPRedirectPreferred = true; // Boolean | If it equals \"true\", the TPP prefers a redirect over an embedded SCA approach. If it equals \"false\", the TPP prefers not to be redirected for SCA. The ASPSP will then choose between the Embedded or the Decoupled SCA approach, depending on the parameter TPP-Decoupled-Preferred and the choice of the SCA procedure by the TPP/PSU. If the parameter is not used, the ASPSP will choose the SCA approach to be applied depending on the SCA method chosen by the TPP/PSU. 
Boolean tpPDecoupledPreferred = true; // Boolean | If it equals \"true\", the TPP prefers a decoupled SCA approach.  If it equals \"false\", the TPP prefers not to use the decoupled approach for SCA. The ASPSP will then choose between the embedded or the redirect SCA approach, depending on the choice of the SCA procedure by the TPP/PSU.  If the parameter is not used, the ASPSP will choose the SCA approach to be applied depending on the parameter TPP-Redirect-Preferred and the SCA method chosen by the TPP/PSU.  The parameter might be ignored by the ASPSP. If both parameters TPP-Redirect-Preferred and TPP-Decoupled-Preferred are present and true, the request is still not rejected, but it is up to the ASPSP, which approach will actually be used.  **Remark for Future:**  TPP-Redirect-Preferred and TPP-Decoupled-Preferred will be revised in future versions, maybe merged. Currently kept separate for downward compatibility. 
String tpPRedirectURI = "tpPRedirectURI_example"; // String | URI of the TPP, where the transaction flow shall be redirected to after a Redirect.  Mandated for the Redirect SCA Approach, specifically  when TPP-Redirect-Preferred equals \"true\". It is recommended to always use this header field.  **Remark for Future:**  This field might be changed to mandatory in the next version of the specification. 
String tpPNokRedirectURI = "tpPNokRedirectURI_example"; // String | If this URI is contained, the TPP is asking to redirect the transaction flow to this address instead of the TPP-Redirect-URI in case of a negative result of the redirect SCA method. This might be ignored by the ASPSP. 
Boolean tpPExplicitAuthorisationPreferred = true; // Boolean | If it equals \"true\", the TPP prefers to start the authorisation process separately,  e.g. because of the usage of a signing basket.  This preference might be ignored by the ASPSP, if a signing basket is not supported as functionality.  If it equals \"false\" or if the parameter is not used, there is no preference of the TPP.  This especially indicates that the TPP assumes a direct authorisation of the transaction in the next step,  without using a signing basket. 
String tpPBrandLoggingInformation = "tpPBrandLoggingInformation_example"; // String | This header might be used by TPPs to inform the ASPSP about the brand used by the TPP towards the PSU.  This information is meant for logging entries to enhance communication between ASPSP and PSU or ASPSP and TPP.  This header might be ignored by the ASPSP. 
String tpPNotificationURI = "tpPNotificationURI_example"; // String | URI for the Endpoint of the TPP-API to which the status of the payment initiation should be sent. This header field may by ignored by the ASPSP.  For security reasons, it shall be ensured that the TPP-Notification-URI as introduced above is secured by the TPP eIDAS QWAC used for identification of the TPP. The following applies:  URIs which are provided by TPPs in TPP-Notification-URI shall comply with the domain secured by the eIDAS QWAC certificate of the TPP in the field CN or SubjectAltName of the certificate. Please note that in case of example-TPP.com as certificate entry TPP- Notification-URI like www.example-TPP.com/xs2a-client/v1/ASPSPidentifcation/mytransaction- id/notifications or notifications.example-TPP.com/xs2a-client/v1/ASPSPidentifcation/mytransaction- id/notifications would be compliant.  Wildcard definitions shall be taken into account for compliance checks by the ASPSP.  ASPSPs may respond with ASPSP-Notification-Support set to false, if the provided URIs do not comply. 
String tpPNotificationContentPreferred = "tpPNotificationContentPreferred_example"; // String | The string has the form   status=X1, ..., Xn  where Xi is one of the constants SCA, PROCESS, LAST and where constants are not repeated. The usage of the constants supports the of following semantics:    SCA: A notification on every change of the scaStatus attribute for all related authorisation processes is preferred by the TPP.    PROCESS: A notification on all changes of consentStatus or transactionStatus attributes is preferred by the TPP.   LAST: Only a notification on the last consentStatus or transactionStatus as available in the XS2A interface is preferred by the TPP.  This header field may be ignored, if the ASPSP does not support resource notification services for the related TPP. 
String psUIPPort = "psUIPPort_example"; // String | The forwarded IP Port header field consists of the corresponding HTTP request IP Port field between PSU and TPP, if available. 
String psUAccept = "psUAccept_example"; // String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
String psUAcceptCharset = "psUAcceptCharset_example"; // String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
String psUAcceptEncoding = "psUAcceptEncoding_example"; // String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
String psUAcceptLanguage = "psUAcceptLanguage_example"; // String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
String psUUserAgent = "psUUserAgent_example"; // String | The forwarded Agent header field of the HTTP request between PSU and TPP, if available. 
String psUHttpMethod = "psUHttpMethod_example"; // String | HTTP method used at the PSU ? TPP interface, if available. Valid values are: * GET * POST * PUT * PATCH * DELETE 
UUID psUDeviceID = new UUID(); // UUID | UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available. UUID identifies either a device or a device dependant application installation. In case of an installation identification this ID needs to be unaltered until removal from device. 
String psUGeoLocation = "psUGeoLocation_example"; // String | The forwarded Geo Location of the corresponding http request between PSU and TPP if available. 
try {
    ConsentsResponse201 result = apiInstance.createConsent(xRequestID, psUIPAddress, body, digest, signature, tpPSignatureCertificate, PSU_ID, psUIDType, psUCorporateID, psUCorporateIDType, tpPRedirectPreferred, tpPDecoupledPreferred, tpPRedirectURI, tpPNokRedirectURI, tpPExplicitAuthorisationPreferred, tpPBrandLoggingInformation, tpPNotificationURI, tpPNotificationContentPreferred, psUIPPort, psUAccept, psUAcceptCharset, psUAcceptEncoding, psUAcceptLanguage, psUUserAgent, psUHttpMethod, psUDeviceID, psUGeoLocation);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountInformationServiceAisApi#createConsent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xRequestID** | [**UUID**](.md)| ID of the request, unique to the call, as determined by the initiating party. |
 **psUIPAddress** | **String**| The forwarded IP Address header field consists of the corresponding http request IP Address field between PSU and TPP. If not available, the TPP shall use the IP Address used by the TPP when submitting this request.  |
 **body** | [**Consents**](Consents.md)| Request body for a consents request.
 | [optional]
 **digest** | **String**| Is contained if and only if the \&quot;Signature\&quot; element is contained in the header of the request. | [optional]
 **signature** | **String**| A signature of the request by the TPP on application level. This might be mandated by ASPSP.  | [optional]
 **tpPSignatureCertificate** | **byte[]**| The certificate used for signing the request, in base64 encoding.  Must be contained if a signature is contained.  | [optional]
 **PSU_ID** | **String**| Client ID of the PSU in the ASPSP client interface.   Might be mandated in the ASPSP&#x27;s documentation.  It might be contained even if an OAuth2 based authentication was performed in a pre-step or an OAuth2 based SCA was performed in an preceding AIS service in the same session. In this case the ASPSP might check whether PSU-ID and token match,  according to ASPSP documentation.  | [optional]
 **psUIDType** | **String**| Type of the PSU-ID, needed in scenarios where PSUs have several PSU-IDs as access possibility.  In this case, the mean and use are then defined in the ASPSP’s documentation.  | [optional]
 **psUCorporateID** | **String**| Might be mandated in the ASPSP&#x27;s documentation. Only used in a corporate context.  | [optional]
 **psUCorporateIDType** | **String**| Might be mandated in the ASPSP&#x27;s documentation. Only used in a corporate context.  | [optional]
 **tpPRedirectPreferred** | **Boolean**| If it equals \&quot;true\&quot;, the TPP prefers a redirect over an embedded SCA approach. If it equals \&quot;false\&quot;, the TPP prefers not to be redirected for SCA. The ASPSP will then choose between the Embedded or the Decoupled SCA approach, depending on the parameter TPP-Decoupled-Preferred and the choice of the SCA procedure by the TPP/PSU. If the parameter is not used, the ASPSP will choose the SCA approach to be applied depending on the SCA method chosen by the TPP/PSU.  | [optional]
 **tpPDecoupledPreferred** | **Boolean**| If it equals \&quot;true\&quot;, the TPP prefers a decoupled SCA approach.  If it equals \&quot;false\&quot;, the TPP prefers not to use the decoupled approach for SCA. The ASPSP will then choose between the embedded or the redirect SCA approach, depending on the choice of the SCA procedure by the TPP/PSU.  If the parameter is not used, the ASPSP will choose the SCA approach to be applied depending on the parameter TPP-Redirect-Preferred and the SCA method chosen by the TPP/PSU.  The parameter might be ignored by the ASPSP. If both parameters TPP-Redirect-Preferred and TPP-Decoupled-Preferred are present and true, the request is still not rejected, but it is up to the ASPSP, which approach will actually be used.  **Remark for Future:**  TPP-Redirect-Preferred and TPP-Decoupled-Preferred will be revised in future versions, maybe merged. Currently kept separate for downward compatibility.  | [optional]
 **tpPRedirectURI** | **String**| URI of the TPP, where the transaction flow shall be redirected to after a Redirect.  Mandated for the Redirect SCA Approach, specifically  when TPP-Redirect-Preferred equals \&quot;true\&quot;. It is recommended to always use this header field.  **Remark for Future:**  This field might be changed to mandatory in the next version of the specification.  | [optional]
 **tpPNokRedirectURI** | **String**| If this URI is contained, the TPP is asking to redirect the transaction flow to this address instead of the TPP-Redirect-URI in case of a negative result of the redirect SCA method. This might be ignored by the ASPSP.  | [optional]
 **tpPExplicitAuthorisationPreferred** | **Boolean**| If it equals \&quot;true\&quot;, the TPP prefers to start the authorisation process separately,  e.g. because of the usage of a signing basket.  This preference might be ignored by the ASPSP, if a signing basket is not supported as functionality.  If it equals \&quot;false\&quot; or if the parameter is not used, there is no preference of the TPP.  This especially indicates that the TPP assumes a direct authorisation of the transaction in the next step,  without using a signing basket.  | [optional]
 **tpPBrandLoggingInformation** | **String**| This header might be used by TPPs to inform the ASPSP about the brand used by the TPP towards the PSU.  This information is meant for logging entries to enhance communication between ASPSP and PSU or ASPSP and TPP.  This header might be ignored by the ASPSP.  | [optional]
 **tpPNotificationURI** | **String**| URI for the Endpoint of the TPP-API to which the status of the payment initiation should be sent. This header field may by ignored by the ASPSP.  For security reasons, it shall be ensured that the TPP-Notification-URI as introduced above is secured by the TPP eIDAS QWAC used for identification of the TPP. The following applies:  URIs which are provided by TPPs in TPP-Notification-URI shall comply with the domain secured by the eIDAS QWAC certificate of the TPP in the field CN or SubjectAltName of the certificate. Please note that in case of example-TPP.com as certificate entry TPP- Notification-URI like www.example-TPP.com/xs2a-client/v1/ASPSPidentifcation/mytransaction- id/notifications or notifications.example-TPP.com/xs2a-client/v1/ASPSPidentifcation/mytransaction- id/notifications would be compliant.  Wildcard definitions shall be taken into account for compliance checks by the ASPSP.  ASPSPs may respond with ASPSP-Notification-Support set to false, if the provided URIs do not comply.  | [optional]
 **tpPNotificationContentPreferred** | **String**| The string has the form   status&#x3D;X1, ..., Xn  where Xi is one of the constants SCA, PROCESS, LAST and where constants are not repeated. The usage of the constants supports the of following semantics:    SCA: A notification on every change of the scaStatus attribute for all related authorisation processes is preferred by the TPP.    PROCESS: A notification on all changes of consentStatus or transactionStatus attributes is preferred by the TPP.   LAST: Only a notification on the last consentStatus or transactionStatus as available in the XS2A interface is preferred by the TPP.  This header field may be ignored, if the ASPSP does not support resource notification services for the related TPP.  | [optional]
 **psUIPPort** | **String**| The forwarded IP Port header field consists of the corresponding HTTP request IP Port field between PSU and TPP, if available.  | [optional]
 **psUAccept** | **String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUAcceptCharset** | **String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUAcceptEncoding** | **String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUAcceptLanguage** | **String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUUserAgent** | **String**| The forwarded Agent header field of the HTTP request between PSU and TPP, if available.  | [optional]
 **psUHttpMethod** | **String**| HTTP method used at the PSU ? TPP interface, if available. Valid values are: * GET * POST * PUT * PATCH * DELETE  | [optional] [enum: GET, POST, PUT, PATCH, DELETE]
 **psUDeviceID** | [**UUID**](.md)| UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available. UUID identifies either a device or a device dependant application installation. In case of an installation identification this ID needs to be unaltered until removal from device.  | [optional]
 **psUGeoLocation** | **String**| The forwarded Geo Location of the corresponding http request between PSU and TPP if available.  | [optional]

### Return type

[**ConsentsResponse201**](ConsentsResponse201.md)

### Authorization

[BearerAuthOAuth](../README.md#BearerAuthOAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

<a name="deleteConsent"></a>
# **deleteConsent**
> deleteConsent(consentId, xRequestID, digest, signature, tpPSignatureCertificate, psUIPAddress, psUIPPort, psUAccept, psUAcceptCharset, psUAcceptEncoding, psUAcceptLanguage, psUUserAgent, psUHttpMethod, psUDeviceID, psUGeoLocation)

Delete consent

The TPP can delete an account information consent object if needed.

### Example
```java
// Import classes:
//import de.adorsys.psd2.client.ApiClient;
//import de.adorsys.psd2.client.ApiException;
//import de.adorsys.psd2.client.Configuration;
//import de.adorsys.psd2.client.auth.*;
//import de.adorsys.psd2.client.api.AccountInformationServiceAisApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AccountInformationServiceAisApi apiInstance = new AccountInformationServiceAisApi();
String consentId = "consentId_example"; // String | ID of the corresponding consent object as returned by an account information consent request. 
UUID xRequestID = new UUID(); // UUID | ID of the request, unique to the call, as determined by the initiating party.
String digest = "digest_example"; // String | Is contained if and only if the \"Signature\" element is contained in the header of the request.
String signature = "signature_example"; // String | A signature of the request by the TPP on application level. This might be mandated by ASPSP. 
byte[] tpPSignatureCertificate = B; // byte[] | The certificate used for signing the request, in base64 encoding.  Must be contained if a signature is contained. 
String psUIPAddress = "psUIPAddress_example"; // String | The forwarded IP Address header field consists of the corresponding HTTP request  IP Address field between PSU and TPP.  It shall be contained if and only if this request was actively initiated by the PSU. 
String psUIPPort = "psUIPPort_example"; // String | The forwarded IP Port header field consists of the corresponding HTTP request IP Port field between PSU and TPP, if available. 
String psUAccept = "psUAccept_example"; // String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
String psUAcceptCharset = "psUAcceptCharset_example"; // String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
String psUAcceptEncoding = "psUAcceptEncoding_example"; // String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
String psUAcceptLanguage = "psUAcceptLanguage_example"; // String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
String psUUserAgent = "psUUserAgent_example"; // String | The forwarded Agent header field of the HTTP request between PSU and TPP, if available. 
String psUHttpMethod = "psUHttpMethod_example"; // String | HTTP method used at the PSU ? TPP interface, if available. Valid values are: * GET * POST * PUT * PATCH * DELETE 
UUID psUDeviceID = new UUID(); // UUID | UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available. UUID identifies either a device or a device dependant application installation. In case of an installation identification this ID needs to be unaltered until removal from device. 
String psUGeoLocation = "psUGeoLocation_example"; // String | The forwarded Geo Location of the corresponding http request between PSU and TPP if available. 
try {
    apiInstance.deleteConsent(consentId, xRequestID, digest, signature, tpPSignatureCertificate, psUIPAddress, psUIPPort, psUAccept, psUAcceptCharset, psUAcceptEncoding, psUAcceptLanguage, psUUserAgent, psUHttpMethod, psUDeviceID, psUGeoLocation);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountInformationServiceAisApi#deleteConsent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consentId** | [**String**](.md)| ID of the corresponding consent object as returned by an account information consent request.  |
 **xRequestID** | [**UUID**](.md)| ID of the request, unique to the call, as determined by the initiating party. |
 **digest** | **String**| Is contained if and only if the \&quot;Signature\&quot; element is contained in the header of the request. | [optional]
 **signature** | **String**| A signature of the request by the TPP on application level. This might be mandated by ASPSP.  | [optional]
 **tpPSignatureCertificate** | **byte[]**| The certificate used for signing the request, in base64 encoding.  Must be contained if a signature is contained.  | [optional]
 **psUIPAddress** | **String**| The forwarded IP Address header field consists of the corresponding HTTP request  IP Address field between PSU and TPP.  It shall be contained if and only if this request was actively initiated by the PSU.  | [optional]
 **psUIPPort** | **String**| The forwarded IP Port header field consists of the corresponding HTTP request IP Port field between PSU and TPP, if available.  | [optional]
 **psUAccept** | **String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUAcceptCharset** | **String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUAcceptEncoding** | **String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUAcceptLanguage** | **String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUUserAgent** | **String**| The forwarded Agent header field of the HTTP request between PSU and TPP, if available.  | [optional]
 **psUHttpMethod** | **String**| HTTP method used at the PSU ? TPP interface, if available. Valid values are: * GET * POST * PUT * PATCH * DELETE  | [optional] [enum: GET, POST, PUT, PATCH, DELETE]
 **psUDeviceID** | [**UUID**](.md)| UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available. UUID identifies either a device or a device dependant application installation. In case of an installation identification this ID needs to be unaltered until removal from device.  | [optional]
 **psUGeoLocation** | **String**| The forwarded Geo Location of the corresponding http request between PSU and TPP if available.  | [optional]

### Return type

null (empty response body)

### Authorization

[BearerAuthOAuth](../README.md#BearerAuthOAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a name="getAccountList"></a>
# **getAccountList**
> AccountList getAccountList(xRequestID, consentID, withBalance, digest, signature, tpPSignatureCertificate, psUIPAddress, psUIPPort, psUAccept, psUAcceptCharset, psUAcceptEncoding, psUAcceptLanguage, psUUserAgent, psUHttpMethod, psUDeviceID, psUGeoLocation)

Read account list

Read the identifiers of the available payment account together with  booking balance information, depending on the consent granted.  It is assumed that a consent of the PSU to this access is already given and stored on the ASPSP system.  The addressed list of accounts depends then on the PSU ID and the stored consent addressed by consentId,  respectively the OAuth2 access token.   Returns all identifiers of the accounts, to which an account access has been granted to through  the /consents endpoint by the PSU.  In addition, relevant information about the accounts and hyperlinks to corresponding account  information resources are provided if a related consent has been already granted.  Remark: Note that the /consents endpoint optionally offers to grant an access on all available  payment accounts of a PSU.  In this case, this endpoint will deliver the information about all available payment accounts  of the PSU at this ASPSP. 

### Example
```java
// Import classes:
//import de.adorsys.psd2.client.ApiClient;
//import de.adorsys.psd2.client.ApiException;
//import de.adorsys.psd2.client.Configuration;
//import de.adorsys.psd2.client.auth.*;
//import de.adorsys.psd2.client.api.AccountInformationServiceAisApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AccountInformationServiceAisApi apiInstance = new AccountInformationServiceAisApi();
UUID xRequestID = new UUID(); // UUID | ID of the request, unique to the call, as determined by the initiating party.
String consentID = "consentID_example"; // String | This then contains the consentId of the related AIS consent, which was performed prior to this payment initiation. 
Boolean withBalance = true; // Boolean | If contained, this function reads the list of accessible payment accounts including the booking balance,  if granted by the PSU in the related consent and available by the ASPSP.  This parameter might be ignored by the ASPSP.  
String digest = "digest_example"; // String | Is contained if and only if the \"Signature\" element is contained in the header of the request.
String signature = "signature_example"; // String | A signature of the request by the TPP on application level. This might be mandated by ASPSP. 
byte[] tpPSignatureCertificate = B; // byte[] | The certificate used for signing the request, in base64 encoding.  Must be contained if a signature is contained. 
String psUIPAddress = "psUIPAddress_example"; // String | The forwarded IP Address header field consists of the corresponding HTTP request  IP Address field between PSU and TPP.  It shall be contained if and only if this request was actively initiated by the PSU. 
String psUIPPort = "psUIPPort_example"; // String | The forwarded IP Port header field consists of the corresponding HTTP request IP Port field between PSU and TPP, if available. 
String psUAccept = "psUAccept_example"; // String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
String psUAcceptCharset = "psUAcceptCharset_example"; // String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
String psUAcceptEncoding = "psUAcceptEncoding_example"; // String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
String psUAcceptLanguage = "psUAcceptLanguage_example"; // String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
String psUUserAgent = "psUUserAgent_example"; // String | The forwarded Agent header field of the HTTP request between PSU and TPP, if available. 
String psUHttpMethod = "psUHttpMethod_example"; // String | HTTP method used at the PSU ? TPP interface, if available. Valid values are: * GET * POST * PUT * PATCH * DELETE 
UUID psUDeviceID = new UUID(); // UUID | UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available. UUID identifies either a device or a device dependant application installation. In case of an installation identification this ID needs to be unaltered until removal from device. 
String psUGeoLocation = "psUGeoLocation_example"; // String | The forwarded Geo Location of the corresponding http request between PSU and TPP if available. 
try {
    AccountList result = apiInstance.getAccountList(xRequestID, consentID, withBalance, digest, signature, tpPSignatureCertificate, psUIPAddress, psUIPPort, psUAccept, psUAcceptCharset, psUAcceptEncoding, psUAcceptLanguage, psUUserAgent, psUHttpMethod, psUDeviceID, psUGeoLocation);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountInformationServiceAisApi#getAccountList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xRequestID** | [**UUID**](.md)| ID of the request, unique to the call, as determined by the initiating party. |
 **consentID** | [**String**](.md)| This then contains the consentId of the related AIS consent, which was performed prior to this payment initiation.  |
 **withBalance** | **Boolean**| If contained, this function reads the list of accessible payment accounts including the booking balance,  if granted by the PSU in the related consent and available by the ASPSP.  This parameter might be ignored by the ASPSP.   | [optional]
 **digest** | **String**| Is contained if and only if the \&quot;Signature\&quot; element is contained in the header of the request. | [optional]
 **signature** | **String**| A signature of the request by the TPP on application level. This might be mandated by ASPSP.  | [optional]
 **tpPSignatureCertificate** | **byte[]**| The certificate used for signing the request, in base64 encoding.  Must be contained if a signature is contained.  | [optional]
 **psUIPAddress** | **String**| The forwarded IP Address header field consists of the corresponding HTTP request  IP Address field between PSU and TPP.  It shall be contained if and only if this request was actively initiated by the PSU.  | [optional]
 **psUIPPort** | **String**| The forwarded IP Port header field consists of the corresponding HTTP request IP Port field between PSU and TPP, if available.  | [optional]
 **psUAccept** | **String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUAcceptCharset** | **String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUAcceptEncoding** | **String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUAcceptLanguage** | **String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUUserAgent** | **String**| The forwarded Agent header field of the HTTP request between PSU and TPP, if available.  | [optional]
 **psUHttpMethod** | **String**| HTTP method used at the PSU ? TPP interface, if available. Valid values are: * GET * POST * PUT * PATCH * DELETE  | [optional] [enum: GET, POST, PUT, PATCH, DELETE]
 **psUDeviceID** | [**UUID**](.md)| UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available. UUID identifies either a device or a device dependant application installation. In case of an installation identification this ID needs to be unaltered until removal from device.  | [optional]
 **psUGeoLocation** | **String**| The forwarded Geo Location of the corresponding http request between PSU and TPP if available.  | [optional]

### Return type

[**AccountList**](AccountList.md)

### Authorization

[BearerAuthOAuth](../README.md#BearerAuthOAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a name="getBalances"></a>
# **getBalances**
> ReadAccountBalanceResponse200 getBalances(accountId, xRequestID, consentID, digest, signature, tpPSignatureCertificate, psUIPAddress, psUIPPort, psUAccept, psUAcceptCharset, psUAcceptEncoding, psUAcceptLanguage, psUUserAgent, psUHttpMethod, psUDeviceID, psUGeoLocation)

Read balance

Reads account data from a given account addressed by \&quot;account-id\&quot;.   **Remark:** This account-id can be a tokenised identification due to data protection reason since the path  information might be logged on intermediary servers within the ASPSP sphere.  This account-id then can be retrieved by the \&quot;Get account list\&quot; call.  The account-id is constant at least throughout the lifecycle of a given consent. 

### Example
```java
// Import classes:
//import de.adorsys.psd2.client.ApiClient;
//import de.adorsys.psd2.client.ApiException;
//import de.adorsys.psd2.client.Configuration;
//import de.adorsys.psd2.client.auth.*;
//import de.adorsys.psd2.client.api.AccountInformationServiceAisApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AccountInformationServiceAisApi apiInstance = new AccountInformationServiceAisApi();
String accountId = "accountId_example"; // String | This identification is denoting the addressed (card) account.  The account-id is retrieved by using a \"Read Account List\" or \"Read Card Account list\" call.  The account-id is the \"resourceId\" attribute of the account structure.  Its value is constant at least throughout the lifecycle of a given consent. 
UUID xRequestID = new UUID(); // UUID | ID of the request, unique to the call, as determined by the initiating party.
String consentID = "consentID_example"; // String | This then contains the consentId of the related AIS consent, which was performed prior to this payment initiation. 
String digest = "digest_example"; // String | Is contained if and only if the \"Signature\" element is contained in the header of the request.
String signature = "signature_example"; // String | A signature of the request by the TPP on application level. This might be mandated by ASPSP. 
byte[] tpPSignatureCertificate = B; // byte[] | The certificate used for signing the request, in base64 encoding.  Must be contained if a signature is contained. 
String psUIPAddress = "psUIPAddress_example"; // String | The forwarded IP Address header field consists of the corresponding HTTP request  IP Address field between PSU and TPP.  It shall be contained if and only if this request was actively initiated by the PSU. 
String psUIPPort = "psUIPPort_example"; // String | The forwarded IP Port header field consists of the corresponding HTTP request IP Port field between PSU and TPP, if available. 
String psUAccept = "psUAccept_example"; // String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
String psUAcceptCharset = "psUAcceptCharset_example"; // String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
String psUAcceptEncoding = "psUAcceptEncoding_example"; // String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
String psUAcceptLanguage = "psUAcceptLanguage_example"; // String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
String psUUserAgent = "psUUserAgent_example"; // String | The forwarded Agent header field of the HTTP request between PSU and TPP, if available. 
String psUHttpMethod = "psUHttpMethod_example"; // String | HTTP method used at the PSU ? TPP interface, if available. Valid values are: * GET * POST * PUT * PATCH * DELETE 
UUID psUDeviceID = new UUID(); // UUID | UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available. UUID identifies either a device or a device dependant application installation. In case of an installation identification this ID needs to be unaltered until removal from device. 
String psUGeoLocation = "psUGeoLocation_example"; // String | The forwarded Geo Location of the corresponding http request between PSU and TPP if available. 
try {
    ReadAccountBalanceResponse200 result = apiInstance.getBalances(accountId, xRequestID, consentID, digest, signature, tpPSignatureCertificate, psUIPAddress, psUIPPort, psUAccept, psUAcceptCharset, psUAcceptEncoding, psUAcceptLanguage, psUUserAgent, psUHttpMethod, psUDeviceID, psUGeoLocation);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountInformationServiceAisApi#getBalances");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | [**String**](.md)| This identification is denoting the addressed (card) account.  The account-id is retrieved by using a \&quot;Read Account List\&quot; or \&quot;Read Card Account list\&quot; call.  The account-id is the \&quot;resourceId\&quot; attribute of the account structure.  Its value is constant at least throughout the lifecycle of a given consent.  |
 **xRequestID** | [**UUID**](.md)| ID of the request, unique to the call, as determined by the initiating party. |
 **consentID** | [**String**](.md)| This then contains the consentId of the related AIS consent, which was performed prior to this payment initiation.  |
 **digest** | **String**| Is contained if and only if the \&quot;Signature\&quot; element is contained in the header of the request. | [optional]
 **signature** | **String**| A signature of the request by the TPP on application level. This might be mandated by ASPSP.  | [optional]
 **tpPSignatureCertificate** | **byte[]**| The certificate used for signing the request, in base64 encoding.  Must be contained if a signature is contained.  | [optional]
 **psUIPAddress** | **String**| The forwarded IP Address header field consists of the corresponding HTTP request  IP Address field between PSU and TPP.  It shall be contained if and only if this request was actively initiated by the PSU.  | [optional]
 **psUIPPort** | **String**| The forwarded IP Port header field consists of the corresponding HTTP request IP Port field between PSU and TPP, if available.  | [optional]
 **psUAccept** | **String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUAcceptCharset** | **String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUAcceptEncoding** | **String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUAcceptLanguage** | **String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUUserAgent** | **String**| The forwarded Agent header field of the HTTP request between PSU and TPP, if available.  | [optional]
 **psUHttpMethod** | **String**| HTTP method used at the PSU ? TPP interface, if available. Valid values are: * GET * POST * PUT * PATCH * DELETE  | [optional] [enum: GET, POST, PUT, PATCH, DELETE]
 **psUDeviceID** | [**UUID**](.md)| UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available. UUID identifies either a device or a device dependant application installation. In case of an installation identification this ID needs to be unaltered until removal from device.  | [optional]
 **psUGeoLocation** | **String**| The forwarded Geo Location of the corresponding http request between PSU and TPP if available.  | [optional]

### Return type

[**ReadAccountBalanceResponse200**](ReadAccountBalanceResponse200.md)

### Authorization

[BearerAuthOAuth](../README.md#BearerAuthOAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a name="getCardAccountBalances"></a>
# **getCardAccountBalances**
> ReadCardAccountBalanceResponse200 getCardAccountBalances(accountId, xRequestID, consentID, digest, signature, tpPSignatureCertificate, psUIPAddress, psUIPPort, psUAccept, psUAcceptCharset, psUAcceptEncoding, psUAcceptLanguage, psUUserAgent, psUHttpMethod, psUDeviceID, psUGeoLocation)

Read card account balances

Reads balance data from a given card account addressed by  \&quot;account-id\&quot;.   Remark: This account-id can be a tokenised identification due  to data protection reason since the path information might be  logged on intermediary servers within the ASPSP sphere.  This account-id then can be retrieved by the  \&quot;Get card account list\&quot; call. 

### Example
```java
// Import classes:
//import de.adorsys.psd2.client.ApiClient;
//import de.adorsys.psd2.client.ApiException;
//import de.adorsys.psd2.client.Configuration;
//import de.adorsys.psd2.client.auth.*;
//import de.adorsys.psd2.client.api.AccountInformationServiceAisApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AccountInformationServiceAisApi apiInstance = new AccountInformationServiceAisApi();
String accountId = "accountId_example"; // String | This identification is denoting the addressed (card) account.  The account-id is retrieved by using a \"Read Account List\" or \"Read Card Account list\" call.  The account-id is the \"resourceId\" attribute of the account structure.  Its value is constant at least throughout the lifecycle of a given consent. 
UUID xRequestID = new UUID(); // UUID | ID of the request, unique to the call, as determined by the initiating party.
String consentID = "consentID_example"; // String | This then contains the consentId of the related AIS consent, which was performed prior to this payment initiation. 
String digest = "digest_example"; // String | Is contained if and only if the \"Signature\" element is contained in the header of the request.
String signature = "signature_example"; // String | A signature of the request by the TPP on application level. This might be mandated by ASPSP. 
byte[] tpPSignatureCertificate = B; // byte[] | The certificate used for signing the request, in base64 encoding.  Must be contained if a signature is contained. 
String psUIPAddress = "psUIPAddress_example"; // String | The forwarded IP Address header field consists of the corresponding HTTP request  IP Address field between PSU and TPP.  It shall be contained if and only if this request was actively initiated by the PSU. 
String psUIPPort = "psUIPPort_example"; // String | The forwarded IP Port header field consists of the corresponding HTTP request IP Port field between PSU and TPP, if available. 
String psUAccept = "psUAccept_example"; // String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
String psUAcceptCharset = "psUAcceptCharset_example"; // String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
String psUAcceptEncoding = "psUAcceptEncoding_example"; // String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
String psUAcceptLanguage = "psUAcceptLanguage_example"; // String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
String psUUserAgent = "psUUserAgent_example"; // String | The forwarded Agent header field of the HTTP request between PSU and TPP, if available. 
String psUHttpMethod = "psUHttpMethod_example"; // String | HTTP method used at the PSU ? TPP interface, if available. Valid values are: * GET * POST * PUT * PATCH * DELETE 
UUID psUDeviceID = new UUID(); // UUID | UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available. UUID identifies either a device or a device dependant application installation. In case of an installation identification this ID needs to be unaltered until removal from device. 
String psUGeoLocation = "psUGeoLocation_example"; // String | The forwarded Geo Location of the corresponding http request between PSU and TPP if available. 
try {
    ReadCardAccountBalanceResponse200 result = apiInstance.getCardAccountBalances(accountId, xRequestID, consentID, digest, signature, tpPSignatureCertificate, psUIPAddress, psUIPPort, psUAccept, psUAcceptCharset, psUAcceptEncoding, psUAcceptLanguage, psUUserAgent, psUHttpMethod, psUDeviceID, psUGeoLocation);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountInformationServiceAisApi#getCardAccountBalances");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | [**String**](.md)| This identification is denoting the addressed (card) account.  The account-id is retrieved by using a \&quot;Read Account List\&quot; or \&quot;Read Card Account list\&quot; call.  The account-id is the \&quot;resourceId\&quot; attribute of the account structure.  Its value is constant at least throughout the lifecycle of a given consent.  |
 **xRequestID** | [**UUID**](.md)| ID of the request, unique to the call, as determined by the initiating party. |
 **consentID** | [**String**](.md)| This then contains the consentId of the related AIS consent, which was performed prior to this payment initiation.  |
 **digest** | **String**| Is contained if and only if the \&quot;Signature\&quot; element is contained in the header of the request. | [optional]
 **signature** | **String**| A signature of the request by the TPP on application level. This might be mandated by ASPSP.  | [optional]
 **tpPSignatureCertificate** | **byte[]**| The certificate used for signing the request, in base64 encoding.  Must be contained if a signature is contained.  | [optional]
 **psUIPAddress** | **String**| The forwarded IP Address header field consists of the corresponding HTTP request  IP Address field between PSU and TPP.  It shall be contained if and only if this request was actively initiated by the PSU.  | [optional]
 **psUIPPort** | **String**| The forwarded IP Port header field consists of the corresponding HTTP request IP Port field between PSU and TPP, if available.  | [optional]
 **psUAccept** | **String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUAcceptCharset** | **String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUAcceptEncoding** | **String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUAcceptLanguage** | **String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUUserAgent** | **String**| The forwarded Agent header field of the HTTP request between PSU and TPP, if available.  | [optional]
 **psUHttpMethod** | **String**| HTTP method used at the PSU ? TPP interface, if available. Valid values are: * GET * POST * PUT * PATCH * DELETE  | [optional] [enum: GET, POST, PUT, PATCH, DELETE]
 **psUDeviceID** | [**UUID**](.md)| UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available. UUID identifies either a device or a device dependant application installation. In case of an installation identification this ID needs to be unaltered until removal from device.  | [optional]
 **psUGeoLocation** | **String**| The forwarded Geo Location of the corresponding http request between PSU and TPP if available.  | [optional]

### Return type

[**ReadCardAccountBalanceResponse200**](ReadCardAccountBalanceResponse200.md)

### Authorization

[BearerAuthOAuth](../README.md#BearerAuthOAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a name="getCardAccountList"></a>
# **getCardAccountList**
> CardAccountList getCardAccountList(xRequestID, consentID, digest, signature, tpPSignatureCertificate, psUIPAddress, psUIPPort, psUAccept, psUAcceptCharset, psUAcceptEncoding, psUAcceptLanguage, psUUserAgent, psUHttpMethod, psUDeviceID, psUGeoLocation)

Read a list of card accounts

Reads a list of card accounts with additional information, e.g. balance information.  It is assumed that a consent of the PSU to this access is already given and stored on the ASPSP system.  The addressed list of card accounts depends then on the PSU ID and the stored consent addressed by consentId,  respectively the OAuth2 access token.  

### Example
```java
// Import classes:
//import de.adorsys.psd2.client.ApiClient;
//import de.adorsys.psd2.client.ApiException;
//import de.adorsys.psd2.client.Configuration;
//import de.adorsys.psd2.client.auth.*;
//import de.adorsys.psd2.client.api.AccountInformationServiceAisApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AccountInformationServiceAisApi apiInstance = new AccountInformationServiceAisApi();
UUID xRequestID = new UUID(); // UUID | ID of the request, unique to the call, as determined by the initiating party.
String consentID = "consentID_example"; // String | This then contains the consentId of the related AIS consent, which was performed prior to this payment initiation. 
String digest = "digest_example"; // String | Is contained if and only if the \"Signature\" element is contained in the header of the request.
String signature = "signature_example"; // String | A signature of the request by the TPP on application level. This might be mandated by ASPSP. 
byte[] tpPSignatureCertificate = B; // byte[] | The certificate used for signing the request, in base64 encoding.  Must be contained if a signature is contained. 
String psUIPAddress = "psUIPAddress_example"; // String | The forwarded IP Address header field consists of the corresponding HTTP request  IP Address field between PSU and TPP.  It shall be contained if and only if this request was actively initiated by the PSU. 
String psUIPPort = "psUIPPort_example"; // String | The forwarded IP Port header field consists of the corresponding HTTP request IP Port field between PSU and TPP, if available. 
String psUAccept = "psUAccept_example"; // String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
String psUAcceptCharset = "psUAcceptCharset_example"; // String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
String psUAcceptEncoding = "psUAcceptEncoding_example"; // String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
String psUAcceptLanguage = "psUAcceptLanguage_example"; // String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
String psUUserAgent = "psUUserAgent_example"; // String | The forwarded Agent header field of the HTTP request between PSU and TPP, if available. 
String psUHttpMethod = "psUHttpMethod_example"; // String | HTTP method used at the PSU ? TPP interface, if available. Valid values are: * GET * POST * PUT * PATCH * DELETE 
UUID psUDeviceID = new UUID(); // UUID | UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available. UUID identifies either a device or a device dependant application installation. In case of an installation identification this ID needs to be unaltered until removal from device. 
String psUGeoLocation = "psUGeoLocation_example"; // String | The forwarded Geo Location of the corresponding http request between PSU and TPP if available. 
try {
    CardAccountList result = apiInstance.getCardAccountList(xRequestID, consentID, digest, signature, tpPSignatureCertificate, psUIPAddress, psUIPPort, psUAccept, psUAcceptCharset, psUAcceptEncoding, psUAcceptLanguage, psUUserAgent, psUHttpMethod, psUDeviceID, psUGeoLocation);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountInformationServiceAisApi#getCardAccountList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xRequestID** | [**UUID**](.md)| ID of the request, unique to the call, as determined by the initiating party. |
 **consentID** | [**String**](.md)| This then contains the consentId of the related AIS consent, which was performed prior to this payment initiation.  |
 **digest** | **String**| Is contained if and only if the \&quot;Signature\&quot; element is contained in the header of the request. | [optional]
 **signature** | **String**| A signature of the request by the TPP on application level. This might be mandated by ASPSP.  | [optional]
 **tpPSignatureCertificate** | **byte[]**| The certificate used for signing the request, in base64 encoding.  Must be contained if a signature is contained.  | [optional]
 **psUIPAddress** | **String**| The forwarded IP Address header field consists of the corresponding HTTP request  IP Address field between PSU and TPP.  It shall be contained if and only if this request was actively initiated by the PSU.  | [optional]
 **psUIPPort** | **String**| The forwarded IP Port header field consists of the corresponding HTTP request IP Port field between PSU and TPP, if available.  | [optional]
 **psUAccept** | **String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUAcceptCharset** | **String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUAcceptEncoding** | **String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUAcceptLanguage** | **String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUUserAgent** | **String**| The forwarded Agent header field of the HTTP request between PSU and TPP, if available.  | [optional]
 **psUHttpMethod** | **String**| HTTP method used at the PSU ? TPP interface, if available. Valid values are: * GET * POST * PUT * PATCH * DELETE  | [optional] [enum: GET, POST, PUT, PATCH, DELETE]
 **psUDeviceID** | [**UUID**](.md)| UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available. UUID identifies either a device or a device dependant application installation. In case of an installation identification this ID needs to be unaltered until removal from device.  | [optional]
 **psUGeoLocation** | **String**| The forwarded Geo Location of the corresponding http request between PSU and TPP if available.  | [optional]

### Return type

[**CardAccountList**](CardAccountList.md)

### Authorization

[BearerAuthOAuth](../README.md#BearerAuthOAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a name="getCardAccountTransactionList"></a>
# **getCardAccountTransactionList**
> CardAccountsTransactionsResponse200 getCardAccountTransactionList(accountId, bookingStatus, xRequestID, consentID, dateFrom, dateTo, entryReferenceFrom, deltaList, digest, signature, tpPSignatureCertificate, psUIPAddress, psUIPPort, psUAccept, psUAcceptCharset, psUAcceptEncoding, psUAcceptLanguage, psUUserAgent, psUHttpMethod, psUDeviceID, psUGeoLocation)

Read transaction list of an account

Reads account data from a given card account addressed by \&quot;account-id\&quot;. 

### Example
```java
// Import classes:
//import de.adorsys.psd2.client.ApiClient;
//import de.adorsys.psd2.client.ApiException;
//import de.adorsys.psd2.client.Configuration;
//import de.adorsys.psd2.client.auth.*;
//import de.adorsys.psd2.client.api.AccountInformationServiceAisApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AccountInformationServiceAisApi apiInstance = new AccountInformationServiceAisApi();
String accountId = "accountId_example"; // String | This identification is denoting the addressed (card) account.  The account-id is retrieved by using a \"Read Account List\" or \"Read Card Account list\" call.  The account-id is the \"resourceId\" attribute of the account structure.  Its value is constant at least throughout the lifecycle of a given consent. 
String bookingStatus = "bookingStatus_example"; // String | Permitted codes are    * \"booked\",   * \"pending\",     * \"both\", \"booked\" shall be supported by the ASPSP. To support the \"pending\" and \"both\" feature is optional for the ASPSP,  Error code if not supported in the online banking frontend. If supported, \"both\" means to request transaction reports of transaction of bookingStatus either \"pending\" or \"booked\". 
UUID xRequestID = new UUID(); // UUID | ID of the request, unique to the call, as determined by the initiating party.
String consentID = "consentID_example"; // String | This then contains the consentId of the related AIS consent, which was performed prior to this payment initiation. 
LocalDate dateFrom = new LocalDate(); // LocalDate | Conditional: Starting date (inclusive the date dateFrom) of the transaction list, mandated if no delta access is required and if bookingStatus does not equal \"information\".  For booked transactions, the relevant date is the booking date.   For pending transactions, the relevant date is the entry date, which may not be transparent  neither in this API nor other channels of the ASPSP. 
LocalDate dateTo = new LocalDate(); // LocalDate | End date (inclusive the data dateTo) of the transaction list, default is \"now\" if not given.   Might be ignored if a delta function is used.  For booked transactions, the relevant date is the booking date.   For pending transactions, the relevant date is the entry date, which may not be transparent  neither in this API nor other channels of the ASPSP. 
String entryReferenceFrom = "entryReferenceFrom_example"; // String | This data attribute is indicating that the AISP is in favour to get all transactions after  the transaction with identification entryReferenceFrom alternatively to the above defined period.  This is a implementation of a delta access.  If this data element is contained, the entries \"dateFrom\" and \"dateTo\" might be ignored by the ASPSP  if a delta report is supported.  Optional if supported by API provider. 
Boolean deltaList = true; // Boolean | This data attribute is indicating that the AISP is in favour to get all transactions after the last report access for this PSU on the addressed account. This is another implementation of a delta access-report. This delta indicator might be rejected by the ASPSP if this function is not supported. Optional if supported by API provider
String digest = "digest_example"; // String | Is contained if and only if the \"Signature\" element is contained in the header of the request.
String signature = "signature_example"; // String | A signature of the request by the TPP on application level. This might be mandated by ASPSP. 
byte[] tpPSignatureCertificate = B; // byte[] | The certificate used for signing the request, in base64 encoding.  Must be contained if a signature is contained. 
String psUIPAddress = "psUIPAddress_example"; // String | The forwarded IP Address header field consists of the corresponding HTTP request  IP Address field between PSU and TPP.  It shall be contained if and only if this request was actively initiated by the PSU. 
String psUIPPort = "psUIPPort_example"; // String | The forwarded IP Port header field consists of the corresponding HTTP request IP Port field between PSU and TPP, if available. 
String psUAccept = "psUAccept_example"; // String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
String psUAcceptCharset = "psUAcceptCharset_example"; // String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
String psUAcceptEncoding = "psUAcceptEncoding_example"; // String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
String psUAcceptLanguage = "psUAcceptLanguage_example"; // String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
String psUUserAgent = "psUUserAgent_example"; // String | The forwarded Agent header field of the HTTP request between PSU and TPP, if available. 
String psUHttpMethod = "psUHttpMethod_example"; // String | HTTP method used at the PSU ? TPP interface, if available. Valid values are: * GET * POST * PUT * PATCH * DELETE 
UUID psUDeviceID = new UUID(); // UUID | UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available. UUID identifies either a device or a device dependant application installation. In case of an installation identification this ID needs to be unaltered until removal from device. 
String psUGeoLocation = "psUGeoLocation_example"; // String | The forwarded Geo Location of the corresponding http request between PSU and TPP if available. 
try {
    CardAccountsTransactionsResponse200 result = apiInstance.getCardAccountTransactionList(accountId, bookingStatus, xRequestID, consentID, dateFrom, dateTo, entryReferenceFrom, deltaList, digest, signature, tpPSignatureCertificate, psUIPAddress, psUIPPort, psUAccept, psUAcceptCharset, psUAcceptEncoding, psUAcceptLanguage, psUUserAgent, psUHttpMethod, psUDeviceID, psUGeoLocation);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountInformationServiceAisApi#getCardAccountTransactionList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | [**String**](.md)| This identification is denoting the addressed (card) account.  The account-id is retrieved by using a \&quot;Read Account List\&quot; or \&quot;Read Card Account list\&quot; call.  The account-id is the \&quot;resourceId\&quot; attribute of the account structure.  Its value is constant at least throughout the lifecycle of a given consent.  |
 **bookingStatus** | **String**| Permitted codes are    * \&quot;booked\&quot;,   * \&quot;pending\&quot;,     * \&quot;both\&quot;, \&quot;booked\&quot; shall be supported by the ASPSP. To support the \&quot;pending\&quot; and \&quot;both\&quot; feature is optional for the ASPSP,  Error code if not supported in the online banking frontend. If supported, \&quot;both\&quot; means to request transaction reports of transaction of bookingStatus either \&quot;pending\&quot; or \&quot;booked\&quot;.  | [enum: booked, pending, both]
 **xRequestID** | [**UUID**](.md)| ID of the request, unique to the call, as determined by the initiating party. |
 **consentID** | [**String**](.md)| This then contains the consentId of the related AIS consent, which was performed prior to this payment initiation.  |
 **dateFrom** | **LocalDate**| Conditional: Starting date (inclusive the date dateFrom) of the transaction list, mandated if no delta access is required and if bookingStatus does not equal \&quot;information\&quot;.  For booked transactions, the relevant date is the booking date.   For pending transactions, the relevant date is the entry date, which may not be transparent  neither in this API nor other channels of the ASPSP.  | [optional]
 **dateTo** | **LocalDate**| End date (inclusive the data dateTo) of the transaction list, default is \&quot;now\&quot; if not given.   Might be ignored if a delta function is used.  For booked transactions, the relevant date is the booking date.   For pending transactions, the relevant date is the entry date, which may not be transparent  neither in this API nor other channels of the ASPSP.  | [optional]
 **entryReferenceFrom** | **String**| This data attribute is indicating that the AISP is in favour to get all transactions after  the transaction with identification entryReferenceFrom alternatively to the above defined period.  This is a implementation of a delta access.  If this data element is contained, the entries \&quot;dateFrom\&quot; and \&quot;dateTo\&quot; might be ignored by the ASPSP  if a delta report is supported.  Optional if supported by API provider.  | [optional]
 **deltaList** | **Boolean**| This data attribute is indicating that the AISP is in favour to get all transactions after the last report access for this PSU on the addressed account. This is another implementation of a delta access-report. This delta indicator might be rejected by the ASPSP if this function is not supported. Optional if supported by API provider | [optional]
 **digest** | **String**| Is contained if and only if the \&quot;Signature\&quot; element is contained in the header of the request. | [optional]
 **signature** | **String**| A signature of the request by the TPP on application level. This might be mandated by ASPSP.  | [optional]
 **tpPSignatureCertificate** | **byte[]**| The certificate used for signing the request, in base64 encoding.  Must be contained if a signature is contained.  | [optional]
 **psUIPAddress** | **String**| The forwarded IP Address header field consists of the corresponding HTTP request  IP Address field between PSU and TPP.  It shall be contained if and only if this request was actively initiated by the PSU.  | [optional]
 **psUIPPort** | **String**| The forwarded IP Port header field consists of the corresponding HTTP request IP Port field between PSU and TPP, if available.  | [optional]
 **psUAccept** | **String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUAcceptCharset** | **String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUAcceptEncoding** | **String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUAcceptLanguage** | **String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUUserAgent** | **String**| The forwarded Agent header field of the HTTP request between PSU and TPP, if available.  | [optional]
 **psUHttpMethod** | **String**| HTTP method used at the PSU ? TPP interface, if available. Valid values are: * GET * POST * PUT * PATCH * DELETE  | [optional] [enum: GET, POST, PUT, PATCH, DELETE]
 **psUDeviceID** | [**UUID**](.md)| UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available. UUID identifies either a device or a device dependant application installation. In case of an installation identification this ID needs to be unaltered until removal from device.  | [optional]
 **psUGeoLocation** | **String**| The forwarded Geo Location of the corresponding http request between PSU and TPP if available.  | [optional]

### Return type

[**CardAccountsTransactionsResponse200**](CardAccountsTransactionsResponse200.md)

### Authorization

[BearerAuthOAuth](../README.md#BearerAuthOAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a name="getConsentAuthorisation"></a>
# **getConsentAuthorisation**
> Authorisations getConsentAuthorisation(consentId, xRequestID, digest, signature, tpPSignatureCertificate, psUIPAddress, psUIPPort, psUAccept, psUAcceptCharset, psUAcceptEncoding, psUAcceptLanguage, psUUserAgent, psUHttpMethod, psUDeviceID, psUGeoLocation)

Get consent authorisation sub-resources request

Return a list of all authorisation subresources IDs which have been created.  This function returns an array of hyperlinks to all generated authorisation sub-resources. 

### Example
```java
// Import classes:
//import de.adorsys.psd2.client.ApiClient;
//import de.adorsys.psd2.client.ApiException;
//import de.adorsys.psd2.client.Configuration;
//import de.adorsys.psd2.client.auth.*;
//import de.adorsys.psd2.client.api.AccountInformationServiceAisApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AccountInformationServiceAisApi apiInstance = new AccountInformationServiceAisApi();
String consentId = "consentId_example"; // String | ID of the corresponding consent object as returned by an account information consent request. 
UUID xRequestID = new UUID(); // UUID | ID of the request, unique to the call, as determined by the initiating party.
String digest = "digest_example"; // String | Is contained if and only if the \"Signature\" element is contained in the header of the request.
String signature = "signature_example"; // String | A signature of the request by the TPP on application level. This might be mandated by ASPSP. 
byte[] tpPSignatureCertificate = B; // byte[] | The certificate used for signing the request, in base64 encoding.  Must be contained if a signature is contained. 
String psUIPAddress = "psUIPAddress_example"; // String | The forwarded IP Address header field consists of the corresponding HTTP request  IP Address field between PSU and TPP.  It shall be contained if and only if this request was actively initiated by the PSU. 
String psUIPPort = "psUIPPort_example"; // String | The forwarded IP Port header field consists of the corresponding HTTP request IP Port field between PSU and TPP, if available. 
String psUAccept = "psUAccept_example"; // String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
String psUAcceptCharset = "psUAcceptCharset_example"; // String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
String psUAcceptEncoding = "psUAcceptEncoding_example"; // String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
String psUAcceptLanguage = "psUAcceptLanguage_example"; // String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
String psUUserAgent = "psUUserAgent_example"; // String | The forwarded Agent header field of the HTTP request between PSU and TPP, if available. 
String psUHttpMethod = "psUHttpMethod_example"; // String | HTTP method used at the PSU ? TPP interface, if available. Valid values are: * GET * POST * PUT * PATCH * DELETE 
UUID psUDeviceID = new UUID(); // UUID | UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available. UUID identifies either a device or a device dependant application installation. In case of an installation identification this ID needs to be unaltered until removal from device. 
String psUGeoLocation = "psUGeoLocation_example"; // String | The forwarded Geo Location of the corresponding http request between PSU and TPP if available. 
try {
    Authorisations result = apiInstance.getConsentAuthorisation(consentId, xRequestID, digest, signature, tpPSignatureCertificate, psUIPAddress, psUIPPort, psUAccept, psUAcceptCharset, psUAcceptEncoding, psUAcceptLanguage, psUUserAgent, psUHttpMethod, psUDeviceID, psUGeoLocation);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountInformationServiceAisApi#getConsentAuthorisation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consentId** | [**String**](.md)| ID of the corresponding consent object as returned by an account information consent request.  |
 **xRequestID** | [**UUID**](.md)| ID of the request, unique to the call, as determined by the initiating party. |
 **digest** | **String**| Is contained if and only if the \&quot;Signature\&quot; element is contained in the header of the request. | [optional]
 **signature** | **String**| A signature of the request by the TPP on application level. This might be mandated by ASPSP.  | [optional]
 **tpPSignatureCertificate** | **byte[]**| The certificate used for signing the request, in base64 encoding.  Must be contained if a signature is contained.  | [optional]
 **psUIPAddress** | **String**| The forwarded IP Address header field consists of the corresponding HTTP request  IP Address field between PSU and TPP.  It shall be contained if and only if this request was actively initiated by the PSU.  | [optional]
 **psUIPPort** | **String**| The forwarded IP Port header field consists of the corresponding HTTP request IP Port field between PSU and TPP, if available.  | [optional]
 **psUAccept** | **String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUAcceptCharset** | **String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUAcceptEncoding** | **String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUAcceptLanguage** | **String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUUserAgent** | **String**| The forwarded Agent header field of the HTTP request between PSU and TPP, if available.  | [optional]
 **psUHttpMethod** | **String**| HTTP method used at the PSU ? TPP interface, if available. Valid values are: * GET * POST * PUT * PATCH * DELETE  | [optional] [enum: GET, POST, PUT, PATCH, DELETE]
 **psUDeviceID** | [**UUID**](.md)| UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available. UUID identifies either a device or a device dependant application installation. In case of an installation identification this ID needs to be unaltered until removal from device.  | [optional]
 **psUGeoLocation** | **String**| The forwarded Geo Location of the corresponding http request between PSU and TPP if available.  | [optional]

### Return type

[**Authorisations**](Authorisations.md)

### Authorization

[BearerAuthOAuth](../README.md#BearerAuthOAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a name="getConsentInformation"></a>
# **getConsentInformation**
> ConsentInformationResponse200Json getConsentInformation(consentId, xRequestID, digest, signature, tpPSignatureCertificate, psUIPAddress, psUIPPort, psUAccept, psUAcceptCharset, psUAcceptEncoding, psUAcceptLanguage, psUUserAgent, psUHttpMethod, psUDeviceID, psUGeoLocation)

Get consent request

Returns the content of an account information consent object.  This is returning the data for the TPP especially in cases,  where the consent was directly managed between ASPSP and PSU e.g. in a redirect SCA Approach. 

### Example
```java
// Import classes:
//import de.adorsys.psd2.client.ApiClient;
//import de.adorsys.psd2.client.ApiException;
//import de.adorsys.psd2.client.Configuration;
//import de.adorsys.psd2.client.auth.*;
//import de.adorsys.psd2.client.api.AccountInformationServiceAisApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AccountInformationServiceAisApi apiInstance = new AccountInformationServiceAisApi();
String consentId = "consentId_example"; // String | ID of the corresponding consent object as returned by an account information consent request. 
UUID xRequestID = new UUID(); // UUID | ID of the request, unique to the call, as determined by the initiating party.
String digest = "digest_example"; // String | Is contained if and only if the \"Signature\" element is contained in the header of the request.
String signature = "signature_example"; // String | A signature of the request by the TPP on application level. This might be mandated by ASPSP. 
byte[] tpPSignatureCertificate = B; // byte[] | The certificate used for signing the request, in base64 encoding.  Must be contained if a signature is contained. 
String psUIPAddress = "psUIPAddress_example"; // String | The forwarded IP Address header field consists of the corresponding HTTP request  IP Address field between PSU and TPP.  It shall be contained if and only if this request was actively initiated by the PSU. 
String psUIPPort = "psUIPPort_example"; // String | The forwarded IP Port header field consists of the corresponding HTTP request IP Port field between PSU and TPP, if available. 
String psUAccept = "psUAccept_example"; // String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
String psUAcceptCharset = "psUAcceptCharset_example"; // String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
String psUAcceptEncoding = "psUAcceptEncoding_example"; // String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
String psUAcceptLanguage = "psUAcceptLanguage_example"; // String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
String psUUserAgent = "psUUserAgent_example"; // String | The forwarded Agent header field of the HTTP request between PSU and TPP, if available. 
String psUHttpMethod = "psUHttpMethod_example"; // String | HTTP method used at the PSU ? TPP interface, if available. Valid values are: * GET * POST * PUT * PATCH * DELETE 
UUID psUDeviceID = new UUID(); // UUID | UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available. UUID identifies either a device or a device dependant application installation. In case of an installation identification this ID needs to be unaltered until removal from device. 
String psUGeoLocation = "psUGeoLocation_example"; // String | The forwarded Geo Location of the corresponding http request between PSU and TPP if available. 
try {
    ConsentInformationResponse200Json result = apiInstance.getConsentInformation(consentId, xRequestID, digest, signature, tpPSignatureCertificate, psUIPAddress, psUIPPort, psUAccept, psUAcceptCharset, psUAcceptEncoding, psUAcceptLanguage, psUUserAgent, psUHttpMethod, psUDeviceID, psUGeoLocation);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountInformationServiceAisApi#getConsentInformation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consentId** | [**String**](.md)| ID of the corresponding consent object as returned by an account information consent request.  |
 **xRequestID** | [**UUID**](.md)| ID of the request, unique to the call, as determined by the initiating party. |
 **digest** | **String**| Is contained if and only if the \&quot;Signature\&quot; element is contained in the header of the request. | [optional]
 **signature** | **String**| A signature of the request by the TPP on application level. This might be mandated by ASPSP.  | [optional]
 **tpPSignatureCertificate** | **byte[]**| The certificate used for signing the request, in base64 encoding.  Must be contained if a signature is contained.  | [optional]
 **psUIPAddress** | **String**| The forwarded IP Address header field consists of the corresponding HTTP request  IP Address field between PSU and TPP.  It shall be contained if and only if this request was actively initiated by the PSU.  | [optional]
 **psUIPPort** | **String**| The forwarded IP Port header field consists of the corresponding HTTP request IP Port field between PSU and TPP, if available.  | [optional]
 **psUAccept** | **String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUAcceptCharset** | **String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUAcceptEncoding** | **String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUAcceptLanguage** | **String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUUserAgent** | **String**| The forwarded Agent header field of the HTTP request between PSU and TPP, if available.  | [optional]
 **psUHttpMethod** | **String**| HTTP method used at the PSU ? TPP interface, if available. Valid values are: * GET * POST * PUT * PATCH * DELETE  | [optional] [enum: GET, POST, PUT, PATCH, DELETE]
 **psUDeviceID** | [**UUID**](.md)| UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available. UUID identifies either a device or a device dependant application installation. In case of an installation identification this ID needs to be unaltered until removal from device.  | [optional]
 **psUGeoLocation** | **String**| The forwarded Geo Location of the corresponding http request between PSU and TPP if available.  | [optional]

### Return type

[**ConsentInformationResponse200Json**](ConsentInformationResponse200Json.md)

### Authorization

[BearerAuthOAuth](../README.md#BearerAuthOAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a name="getConsentScaStatus"></a>
# **getConsentScaStatus**
> ScaStatusResponse getConsentScaStatus(consentId, authorisationId, xRequestID, digest, signature, tpPSignatureCertificate, psUIPAddress, psUIPPort, psUAccept, psUAcceptCharset, psUAcceptEncoding, psUAcceptLanguage, psUUserAgent, psUHttpMethod, psUDeviceID, psUGeoLocation)

Read the SCA status of the consent authorisation

This method returns the SCA status of a consent initiation&#x27;s authorisation sub-resource. 

### Example
```java
// Import classes:
//import de.adorsys.psd2.client.ApiClient;
//import de.adorsys.psd2.client.ApiException;
//import de.adorsys.psd2.client.Configuration;
//import de.adorsys.psd2.client.auth.*;
//import de.adorsys.psd2.client.api.AccountInformationServiceAisApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AccountInformationServiceAisApi apiInstance = new AccountInformationServiceAisApi();
String consentId = "consentId_example"; // String | ID of the corresponding consent object as returned by an account information consent request. 
String authorisationId = "authorisationId_example"; // String | Resource identification of the related SCA.
UUID xRequestID = new UUID(); // UUID | ID of the request, unique to the call, as determined by the initiating party.
String digest = "digest_example"; // String | Is contained if and only if the \"Signature\" element is contained in the header of the request.
String signature = "signature_example"; // String | A signature of the request by the TPP on application level. This might be mandated by ASPSP. 
byte[] tpPSignatureCertificate = B; // byte[] | The certificate used for signing the request, in base64 encoding.  Must be contained if a signature is contained. 
String psUIPAddress = "psUIPAddress_example"; // String | The forwarded IP Address header field consists of the corresponding HTTP request  IP Address field between PSU and TPP.  It shall be contained if and only if this request was actively initiated by the PSU. 
String psUIPPort = "psUIPPort_example"; // String | The forwarded IP Port header field consists of the corresponding HTTP request IP Port field between PSU and TPP, if available. 
String psUAccept = "psUAccept_example"; // String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
String psUAcceptCharset = "psUAcceptCharset_example"; // String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
String psUAcceptEncoding = "psUAcceptEncoding_example"; // String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
String psUAcceptLanguage = "psUAcceptLanguage_example"; // String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
String psUUserAgent = "psUUserAgent_example"; // String | The forwarded Agent header field of the HTTP request between PSU and TPP, if available. 
String psUHttpMethod = "psUHttpMethod_example"; // String | HTTP method used at the PSU ? TPP interface, if available. Valid values are: * GET * POST * PUT * PATCH * DELETE 
UUID psUDeviceID = new UUID(); // UUID | UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available. UUID identifies either a device or a device dependant application installation. In case of an installation identification this ID needs to be unaltered until removal from device. 
String psUGeoLocation = "psUGeoLocation_example"; // String | The forwarded Geo Location of the corresponding http request between PSU and TPP if available. 
try {
    ScaStatusResponse result = apiInstance.getConsentScaStatus(consentId, authorisationId, xRequestID, digest, signature, tpPSignatureCertificate, psUIPAddress, psUIPPort, psUAccept, psUAcceptCharset, psUAcceptEncoding, psUAcceptLanguage, psUUserAgent, psUHttpMethod, psUDeviceID, psUGeoLocation);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountInformationServiceAisApi#getConsentScaStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consentId** | [**String**](.md)| ID of the corresponding consent object as returned by an account information consent request.  |
 **authorisationId** | [**String**](.md)| Resource identification of the related SCA. |
 **xRequestID** | [**UUID**](.md)| ID of the request, unique to the call, as determined by the initiating party. |
 **digest** | **String**| Is contained if and only if the \&quot;Signature\&quot; element is contained in the header of the request. | [optional]
 **signature** | **String**| A signature of the request by the TPP on application level. This might be mandated by ASPSP.  | [optional]
 **tpPSignatureCertificate** | **byte[]**| The certificate used for signing the request, in base64 encoding.  Must be contained if a signature is contained.  | [optional]
 **psUIPAddress** | **String**| The forwarded IP Address header field consists of the corresponding HTTP request  IP Address field between PSU and TPP.  It shall be contained if and only if this request was actively initiated by the PSU.  | [optional]
 **psUIPPort** | **String**| The forwarded IP Port header field consists of the corresponding HTTP request IP Port field between PSU and TPP, if available.  | [optional]
 **psUAccept** | **String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUAcceptCharset** | **String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUAcceptEncoding** | **String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUAcceptLanguage** | **String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUUserAgent** | **String**| The forwarded Agent header field of the HTTP request between PSU and TPP, if available.  | [optional]
 **psUHttpMethod** | **String**| HTTP method used at the PSU ? TPP interface, if available. Valid values are: * GET * POST * PUT * PATCH * DELETE  | [optional] [enum: GET, POST, PUT, PATCH, DELETE]
 **psUDeviceID** | [**UUID**](.md)| UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available. UUID identifies either a device or a device dependant application installation. In case of an installation identification this ID needs to be unaltered until removal from device.  | [optional]
 **psUGeoLocation** | **String**| The forwarded Geo Location of the corresponding http request between PSU and TPP if available.  | [optional]

### Return type

[**ScaStatusResponse**](ScaStatusResponse.md)

### Authorization

[BearerAuthOAuth](../README.md#BearerAuthOAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a name="getConsentStatus"></a>
# **getConsentStatus**
> ConsentStatusResponse200 getConsentStatus(consentId, xRequestID, digest, signature, tpPSignatureCertificate, psUIPAddress, psUIPPort, psUAccept, psUAcceptCharset, psUAcceptEncoding, psUAcceptLanguage, psUUserAgent, psUHttpMethod, psUDeviceID, psUGeoLocation)

Consent status request

Read the status of an account information consent resource.

### Example
```java
// Import classes:
//import de.adorsys.psd2.client.ApiClient;
//import de.adorsys.psd2.client.ApiException;
//import de.adorsys.psd2.client.Configuration;
//import de.adorsys.psd2.client.auth.*;
//import de.adorsys.psd2.client.api.AccountInformationServiceAisApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AccountInformationServiceAisApi apiInstance = new AccountInformationServiceAisApi();
String consentId = "consentId_example"; // String | ID of the corresponding consent object as returned by an account information consent request. 
UUID xRequestID = new UUID(); // UUID | ID of the request, unique to the call, as determined by the initiating party.
String digest = "digest_example"; // String | Is contained if and only if the \"Signature\" element is contained in the header of the request.
String signature = "signature_example"; // String | A signature of the request by the TPP on application level. This might be mandated by ASPSP. 
byte[] tpPSignatureCertificate = B; // byte[] | The certificate used for signing the request, in base64 encoding.  Must be contained if a signature is contained. 
String psUIPAddress = "psUIPAddress_example"; // String | The forwarded IP Address header field consists of the corresponding HTTP request  IP Address field between PSU and TPP.  It shall be contained if and only if this request was actively initiated by the PSU. 
String psUIPPort = "psUIPPort_example"; // String | The forwarded IP Port header field consists of the corresponding HTTP request IP Port field between PSU and TPP, if available. 
String psUAccept = "psUAccept_example"; // String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
String psUAcceptCharset = "psUAcceptCharset_example"; // String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
String psUAcceptEncoding = "psUAcceptEncoding_example"; // String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
String psUAcceptLanguage = "psUAcceptLanguage_example"; // String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
String psUUserAgent = "psUUserAgent_example"; // String | The forwarded Agent header field of the HTTP request between PSU and TPP, if available. 
String psUHttpMethod = "psUHttpMethod_example"; // String | HTTP method used at the PSU ? TPP interface, if available. Valid values are: * GET * POST * PUT * PATCH * DELETE 
UUID psUDeviceID = new UUID(); // UUID | UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available. UUID identifies either a device or a device dependant application installation. In case of an installation identification this ID needs to be unaltered until removal from device. 
String psUGeoLocation = "psUGeoLocation_example"; // String | The forwarded Geo Location of the corresponding http request between PSU and TPP if available. 
try {
    ConsentStatusResponse200 result = apiInstance.getConsentStatus(consentId, xRequestID, digest, signature, tpPSignatureCertificate, psUIPAddress, psUIPPort, psUAccept, psUAcceptCharset, psUAcceptEncoding, psUAcceptLanguage, psUUserAgent, psUHttpMethod, psUDeviceID, psUGeoLocation);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountInformationServiceAisApi#getConsentStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consentId** | [**String**](.md)| ID of the corresponding consent object as returned by an account information consent request.  |
 **xRequestID** | [**UUID**](.md)| ID of the request, unique to the call, as determined by the initiating party. |
 **digest** | **String**| Is contained if and only if the \&quot;Signature\&quot; element is contained in the header of the request. | [optional]
 **signature** | **String**| A signature of the request by the TPP on application level. This might be mandated by ASPSP.  | [optional]
 **tpPSignatureCertificate** | **byte[]**| The certificate used for signing the request, in base64 encoding.  Must be contained if a signature is contained.  | [optional]
 **psUIPAddress** | **String**| The forwarded IP Address header field consists of the corresponding HTTP request  IP Address field between PSU and TPP.  It shall be contained if and only if this request was actively initiated by the PSU.  | [optional]
 **psUIPPort** | **String**| The forwarded IP Port header field consists of the corresponding HTTP request IP Port field between PSU and TPP, if available.  | [optional]
 **psUAccept** | **String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUAcceptCharset** | **String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUAcceptEncoding** | **String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUAcceptLanguage** | **String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUUserAgent** | **String**| The forwarded Agent header field of the HTTP request between PSU and TPP, if available.  | [optional]
 **psUHttpMethod** | **String**| HTTP method used at the PSU ? TPP interface, if available. Valid values are: * GET * POST * PUT * PATCH * DELETE  | [optional] [enum: GET, POST, PUT, PATCH, DELETE]
 **psUDeviceID** | [**UUID**](.md)| UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available. UUID identifies either a device or a device dependant application installation. In case of an installation identification this ID needs to be unaltered until removal from device.  | [optional]
 **psUGeoLocation** | **String**| The forwarded Geo Location of the corresponding http request between PSU and TPP if available.  | [optional]

### Return type

[**ConsentStatusResponse200**](ConsentStatusResponse200.md)

### Authorization

[BearerAuthOAuth](../README.md#BearerAuthOAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a name="getTransactionDetails"></a>
# **getTransactionDetails**
> InlineResponse2001 getTransactionDetails(accountId, transactionId, xRequestID, consentID, digest, signature, tpPSignatureCertificate, psUIPAddress, psUIPPort, psUAccept, psUAcceptCharset, psUAcceptEncoding, psUAcceptLanguage, psUUserAgent, psUHttpMethod, psUDeviceID, psUGeoLocation)

Read transaction details

Reads transaction details from a given transaction addressed by \&quot;transactionId\&quot; on a given account addressed by \&quot;account-id\&quot;.  This call is only available on transactions as reported in a JSON format.  **Remark:** Please note that the PATH might be already given in detail by the corresponding entry of the response of the  \&quot;Read Transaction List\&quot; call within the _links subfield. 

### Example
```java
// Import classes:
//import de.adorsys.psd2.client.ApiClient;
//import de.adorsys.psd2.client.ApiException;
//import de.adorsys.psd2.client.Configuration;
//import de.adorsys.psd2.client.auth.*;
//import de.adorsys.psd2.client.api.AccountInformationServiceAisApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AccountInformationServiceAisApi apiInstance = new AccountInformationServiceAisApi();
String accountId = "accountId_example"; // String | This identification is denoting the addressed (card) account.  The account-id is retrieved by using a \"Read Account List\" or \"Read Card Account list\" call.  The account-id is the \"resourceId\" attribute of the account structure.  Its value is constant at least throughout the lifecycle of a given consent. 
String transactionId = "transactionId_example"; // String | This identification is given by the attribute transactionId of the corresponding entry of a transaction list. 
UUID xRequestID = new UUID(); // UUID | ID of the request, unique to the call, as determined by the initiating party.
String consentID = "consentID_example"; // String | This then contains the consentId of the related AIS consent, which was performed prior to this payment initiation. 
String digest = "digest_example"; // String | Is contained if and only if the \"Signature\" element is contained in the header of the request.
String signature = "signature_example"; // String | A signature of the request by the TPP on application level. This might be mandated by ASPSP. 
byte[] tpPSignatureCertificate = B; // byte[] | The certificate used for signing the request, in base64 encoding.  Must be contained if a signature is contained. 
String psUIPAddress = "psUIPAddress_example"; // String | The forwarded IP Address header field consists of the corresponding HTTP request  IP Address field between PSU and TPP.  It shall be contained if and only if this request was actively initiated by the PSU. 
String psUIPPort = "psUIPPort_example"; // String | The forwarded IP Port header field consists of the corresponding HTTP request IP Port field between PSU and TPP, if available. 
String psUAccept = "psUAccept_example"; // String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
String psUAcceptCharset = "psUAcceptCharset_example"; // String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
String psUAcceptEncoding = "psUAcceptEncoding_example"; // String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
String psUAcceptLanguage = "psUAcceptLanguage_example"; // String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
String psUUserAgent = "psUUserAgent_example"; // String | The forwarded Agent header field of the HTTP request between PSU and TPP, if available. 
String psUHttpMethod = "psUHttpMethod_example"; // String | HTTP method used at the PSU ? TPP interface, if available. Valid values are: * GET * POST * PUT * PATCH * DELETE 
UUID psUDeviceID = new UUID(); // UUID | UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available. UUID identifies either a device or a device dependant application installation. In case of an installation identification this ID needs to be unaltered until removal from device. 
String psUGeoLocation = "psUGeoLocation_example"; // String | The forwarded Geo Location of the corresponding http request between PSU and TPP if available. 
try {
    InlineResponse2001 result = apiInstance.getTransactionDetails(accountId, transactionId, xRequestID, consentID, digest, signature, tpPSignatureCertificate, psUIPAddress, psUIPPort, psUAccept, psUAcceptCharset, psUAcceptEncoding, psUAcceptLanguage, psUUserAgent, psUHttpMethod, psUDeviceID, psUGeoLocation);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountInformationServiceAisApi#getTransactionDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | [**String**](.md)| This identification is denoting the addressed (card) account.  The account-id is retrieved by using a \&quot;Read Account List\&quot; or \&quot;Read Card Account list\&quot; call.  The account-id is the \&quot;resourceId\&quot; attribute of the account structure.  Its value is constant at least throughout the lifecycle of a given consent.  |
 **transactionId** | [**String**](.md)| This identification is given by the attribute transactionId of the corresponding entry of a transaction list.  |
 **xRequestID** | [**UUID**](.md)| ID of the request, unique to the call, as determined by the initiating party. |
 **consentID** | [**String**](.md)| This then contains the consentId of the related AIS consent, which was performed prior to this payment initiation.  |
 **digest** | **String**| Is contained if and only if the \&quot;Signature\&quot; element is contained in the header of the request. | [optional]
 **signature** | **String**| A signature of the request by the TPP on application level. This might be mandated by ASPSP.  | [optional]
 **tpPSignatureCertificate** | **byte[]**| The certificate used for signing the request, in base64 encoding.  Must be contained if a signature is contained.  | [optional]
 **psUIPAddress** | **String**| The forwarded IP Address header field consists of the corresponding HTTP request  IP Address field between PSU and TPP.  It shall be contained if and only if this request was actively initiated by the PSU.  | [optional]
 **psUIPPort** | **String**| The forwarded IP Port header field consists of the corresponding HTTP request IP Port field between PSU and TPP, if available.  | [optional]
 **psUAccept** | **String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUAcceptCharset** | **String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUAcceptEncoding** | **String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUAcceptLanguage** | **String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUUserAgent** | **String**| The forwarded Agent header field of the HTTP request between PSU and TPP, if available.  | [optional]
 **psUHttpMethod** | **String**| HTTP method used at the PSU ? TPP interface, if available. Valid values are: * GET * POST * PUT * PATCH * DELETE  | [optional] [enum: GET, POST, PUT, PATCH, DELETE]
 **psUDeviceID** | [**UUID**](.md)| UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available. UUID identifies either a device or a device dependant application installation. In case of an installation identification this ID needs to be unaltered until removal from device.  | [optional]
 **psUGeoLocation** | **String**| The forwarded Geo Location of the corresponding http request between PSU and TPP if available.  | [optional]

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[BearerAuthOAuth](../README.md#BearerAuthOAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a name="getTransactionList"></a>
# **getTransactionList**
> TransactionsResponse200Json getTransactionList(accountId, bookingStatus, xRequestID, consentID, dateFrom, dateTo, entryReferenceFrom, deltaList, withBalance, pageIndex, itemsPerPage, digest, signature, tpPSignatureCertificate, psUIPAddress, psUIPPort, psUAccept, psUAcceptCharset, psUAcceptEncoding, psUAcceptLanguage, psUUserAgent, psUHttpMethod, psUDeviceID, psUGeoLocation)

Read transaction list of an account

Read transaction reports or transaction lists of a given account addressed by \&quot;account-id\&quot;, depending on the steering parameter  \&quot;bookingStatus\&quot; together with balances.  For a given account, additional parameters are e.g. the attributes \&quot;dateFrom\&quot; and \&quot;dateTo\&quot;.  The ASPSP might add balance information, if transaction lists without balances are not supported. 

### Example
```java
// Import classes:
//import de.adorsys.psd2.client.ApiClient;
//import de.adorsys.psd2.client.ApiException;
//import de.adorsys.psd2.client.Configuration;
//import de.adorsys.psd2.client.auth.*;
//import de.adorsys.psd2.client.api.AccountInformationServiceAisApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AccountInformationServiceAisApi apiInstance = new AccountInformationServiceAisApi();
String accountId = "accountId_example"; // String | This identification is denoting the addressed (card) account.  The account-id is retrieved by using a \"Read Account List\" or \"Read Card Account list\" call.  The account-id is the \"resourceId\" attribute of the account structure.  Its value is constant at least throughout the lifecycle of a given consent. 
String bookingStatus = "bookingStatus_example"; // String | Permitted codes are    * \"booked\",   * \"pending\",     * \"both\",   * \"information\" and   * \"all\" \"booked\" shall be supported by the ASPSP. To support the \"information\", \"pending\" and \"both\" feature is optional for the ASPSP, Error code if not supported in the online banking frontend. If supported, \"both\" means to request transaction reports of transaction of bookingStatus either \"pending\" or \"booked\". To support the \"information\" feature is optional for the ASPSP. Currently the booking status “information” only covers standing orders. Error code if not supported. To support the \"all\" feature is optional for the ASPSP, Error code if not supported. If supported, \"all\" means to request transaction reports of transaction of any bookingStatus (\"pending\", \"booked\" or \"information\"). 
UUID xRequestID = new UUID(); // UUID | ID of the request, unique to the call, as determined by the initiating party.
String consentID = "consentID_example"; // String | This then contains the consentId of the related AIS consent, which was performed prior to this payment initiation. 
LocalDate dateFrom = new LocalDate(); // LocalDate | Conditional: Starting date (inclusive the date dateFrom) of the transaction list, mandated if no delta access is required and if bookingStatus does not equal \"information\".  For booked transactions, the relevant date is the booking date.   For pending transactions, the relevant date is the entry date, which may not be transparent  neither in this API nor other channels of the ASPSP. 
LocalDate dateTo = new LocalDate(); // LocalDate | End date (inclusive the data dateTo) of the transaction list, default is \"now\" if not given.   Might be ignored if a delta function is used.  For booked transactions, the relevant date is the booking date.   For pending transactions, the relevant date is the entry date, which may not be transparent  neither in this API nor other channels of the ASPSP. 
String entryReferenceFrom = "entryReferenceFrom_example"; // String | This data attribute is indicating that the AISP is in favour to get all transactions after  the transaction with identification entryReferenceFrom alternatively to the above defined period.  This is a implementation of a delta access.  If this data element is contained, the entries \"dateFrom\" and \"dateTo\" might be ignored by the ASPSP  if a delta report is supported.  Optional if supported by API provider. 
Boolean deltaList = true; // Boolean | This data attribute is indicating that the AISP is in favour to get all transactions after the last report access for this PSU on the addressed account. This is another implementation of a delta access-report. This delta indicator might be rejected by the ASPSP if this function is not supported. Optional if supported by API provider
Boolean withBalance = true; // Boolean | If contained, this function reads the list of accessible payment accounts including the booking balance,  if granted by the PSU in the related consent and available by the ASPSP.  This parameter might be ignored by the ASPSP.  
Integer pageIndex = 56; // Integer | This data attribute is indicating current transaction page.  Optional if supported by API provider. 
Integer itemsPerPage = 56; // Integer | This data attribute is indicating current transaction items on one page.  Optional if supported by API provider. 
String digest = "digest_example"; // String | Is contained if and only if the \"Signature\" element is contained in the header of the request.
String signature = "signature_example"; // String | A signature of the request by the TPP on application level. This might be mandated by ASPSP. 
byte[] tpPSignatureCertificate = B; // byte[] | The certificate used for signing the request, in base64 encoding.  Must be contained if a signature is contained. 
String psUIPAddress = "psUIPAddress_example"; // String | The forwarded IP Address header field consists of the corresponding HTTP request  IP Address field between PSU and TPP.  It shall be contained if and only if this request was actively initiated by the PSU. 
String psUIPPort = "psUIPPort_example"; // String | The forwarded IP Port header field consists of the corresponding HTTP request IP Port field between PSU and TPP, if available. 
String psUAccept = "psUAccept_example"; // String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
String psUAcceptCharset = "psUAcceptCharset_example"; // String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
String psUAcceptEncoding = "psUAcceptEncoding_example"; // String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
String psUAcceptLanguage = "psUAcceptLanguage_example"; // String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
String psUUserAgent = "psUUserAgent_example"; // String | The forwarded Agent header field of the HTTP request between PSU and TPP, if available. 
String psUHttpMethod = "psUHttpMethod_example"; // String | HTTP method used at the PSU ? TPP interface, if available. Valid values are: * GET * POST * PUT * PATCH * DELETE 
UUID psUDeviceID = new UUID(); // UUID | UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available. UUID identifies either a device or a device dependant application installation. In case of an installation identification this ID needs to be unaltered until removal from device. 
String psUGeoLocation = "psUGeoLocation_example"; // String | The forwarded Geo Location of the corresponding http request between PSU and TPP if available. 
try {
    TransactionsResponse200Json result = apiInstance.getTransactionList(accountId, bookingStatus, xRequestID, consentID, dateFrom, dateTo, entryReferenceFrom, deltaList, withBalance, pageIndex, itemsPerPage, digest, signature, tpPSignatureCertificate, psUIPAddress, psUIPPort, psUAccept, psUAcceptCharset, psUAcceptEncoding, psUAcceptLanguage, psUUserAgent, psUHttpMethod, psUDeviceID, psUGeoLocation);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountInformationServiceAisApi#getTransactionList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | [**String**](.md)| This identification is denoting the addressed (card) account.  The account-id is retrieved by using a \&quot;Read Account List\&quot; or \&quot;Read Card Account list\&quot; call.  The account-id is the \&quot;resourceId\&quot; attribute of the account structure.  Its value is constant at least throughout the lifecycle of a given consent.  |
 **bookingStatus** | **String**| Permitted codes are    * \&quot;booked\&quot;,   * \&quot;pending\&quot;,     * \&quot;both\&quot;,   * \&quot;information\&quot; and   * \&quot;all\&quot; \&quot;booked\&quot; shall be supported by the ASPSP. To support the \&quot;information\&quot;, \&quot;pending\&quot; and \&quot;both\&quot; feature is optional for the ASPSP, Error code if not supported in the online banking frontend. If supported, \&quot;both\&quot; means to request transaction reports of transaction of bookingStatus either \&quot;pending\&quot; or \&quot;booked\&quot;. To support the \&quot;information\&quot; feature is optional for the ASPSP. Currently the booking status “information” only covers standing orders. Error code if not supported. To support the \&quot;all\&quot; feature is optional for the ASPSP, Error code if not supported. If supported, \&quot;all\&quot; means to request transaction reports of transaction of any bookingStatus (\&quot;pending\&quot;, \&quot;booked\&quot; or \&quot;information\&quot;).  | [enum: information, booked, pending, both, all]
 **xRequestID** | [**UUID**](.md)| ID of the request, unique to the call, as determined by the initiating party. |
 **consentID** | [**String**](.md)| This then contains the consentId of the related AIS consent, which was performed prior to this payment initiation.  |
 **dateFrom** | **LocalDate**| Conditional: Starting date (inclusive the date dateFrom) of the transaction list, mandated if no delta access is required and if bookingStatus does not equal \&quot;information\&quot;.  For booked transactions, the relevant date is the booking date.   For pending transactions, the relevant date is the entry date, which may not be transparent  neither in this API nor other channels of the ASPSP.  | [optional]
 **dateTo** | **LocalDate**| End date (inclusive the data dateTo) of the transaction list, default is \&quot;now\&quot; if not given.   Might be ignored if a delta function is used.  For booked transactions, the relevant date is the booking date.   For pending transactions, the relevant date is the entry date, which may not be transparent  neither in this API nor other channels of the ASPSP.  | [optional]
 **entryReferenceFrom** | **String**| This data attribute is indicating that the AISP is in favour to get all transactions after  the transaction with identification entryReferenceFrom alternatively to the above defined period.  This is a implementation of a delta access.  If this data element is contained, the entries \&quot;dateFrom\&quot; and \&quot;dateTo\&quot; might be ignored by the ASPSP  if a delta report is supported.  Optional if supported by API provider.  | [optional]
 **deltaList** | **Boolean**| This data attribute is indicating that the AISP is in favour to get all transactions after the last report access for this PSU on the addressed account. This is another implementation of a delta access-report. This delta indicator might be rejected by the ASPSP if this function is not supported. Optional if supported by API provider | [optional]
 **withBalance** | **Boolean**| If contained, this function reads the list of accessible payment accounts including the booking balance,  if granted by the PSU in the related consent and available by the ASPSP.  This parameter might be ignored by the ASPSP.   | [optional]
 **pageIndex** | **Integer**| This data attribute is indicating current transaction page.  Optional if supported by API provider.  | [optional]
 **itemsPerPage** | **Integer**| This data attribute is indicating current transaction items on one page.  Optional if supported by API provider.  | [optional]
 **digest** | **String**| Is contained if and only if the \&quot;Signature\&quot; element is contained in the header of the request. | [optional]
 **signature** | **String**| A signature of the request by the TPP on application level. This might be mandated by ASPSP.  | [optional]
 **tpPSignatureCertificate** | **byte[]**| The certificate used for signing the request, in base64 encoding.  Must be contained if a signature is contained.  | [optional]
 **psUIPAddress** | **String**| The forwarded IP Address header field consists of the corresponding HTTP request  IP Address field between PSU and TPP.  It shall be contained if and only if this request was actively initiated by the PSU.  | [optional]
 **psUIPPort** | **String**| The forwarded IP Port header field consists of the corresponding HTTP request IP Port field between PSU and TPP, if available.  | [optional]
 **psUAccept** | **String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUAcceptCharset** | **String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUAcceptEncoding** | **String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUAcceptLanguage** | **String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUUserAgent** | **String**| The forwarded Agent header field of the HTTP request between PSU and TPP, if available.  | [optional]
 **psUHttpMethod** | **String**| HTTP method used at the PSU ? TPP interface, if available. Valid values are: * GET * POST * PUT * PATCH * DELETE  | [optional] [enum: GET, POST, PUT, PATCH, DELETE]
 **psUDeviceID** | [**UUID**](.md)| UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available. UUID identifies either a device or a device dependant application installation. In case of an installation identification this ID needs to be unaltered until removal from device.  | [optional]
 **psUGeoLocation** | **String**| The forwarded Geo Location of the corresponding http request between PSU and TPP if available.  | [optional]

### Return type

[**TransactionsResponse200Json**](TransactionsResponse200Json.md)

### Authorization

[BearerAuthOAuth](../README.md#BearerAuthOAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml, text/plain, application/problem+json

<a name="readAccountDetails"></a>
# **readAccountDetails**
> InlineResponse200 readAccountDetails(accountId, xRequestID, consentID, withBalance, digest, signature, tpPSignatureCertificate, psUIPAddress, psUIPPort, psUAccept, psUAcceptCharset, psUAcceptEncoding, psUAcceptLanguage, psUUserAgent, psUHttpMethod, psUDeviceID, psUGeoLocation)

Read account details

Reads details about an account, with balances where required.  It is assumed that a consent of the PSU to  this access is already given and stored on the ASPSP system.  The addressed details of this account depends then on the stored consent addressed by consentId,  respectively the OAuth2 access token.  **NOTE:** The account-id can represent a multicurrency account.  In this case the currency code is set to \&quot;XXX\&quot;.  Give detailed information about the addressed account.  Give detailed information about the addressed account together with balance information 

### Example
```java
// Import classes:
//import de.adorsys.psd2.client.ApiClient;
//import de.adorsys.psd2.client.ApiException;
//import de.adorsys.psd2.client.Configuration;
//import de.adorsys.psd2.client.auth.*;
//import de.adorsys.psd2.client.api.AccountInformationServiceAisApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AccountInformationServiceAisApi apiInstance = new AccountInformationServiceAisApi();
String accountId = "accountId_example"; // String | This identification is denoting the addressed (card) account.  The account-id is retrieved by using a \"Read Account List\" or \"Read Card Account list\" call.  The account-id is the \"resourceId\" attribute of the account structure.  Its value is constant at least throughout the lifecycle of a given consent. 
UUID xRequestID = new UUID(); // UUID | ID of the request, unique to the call, as determined by the initiating party.
String consentID = "consentID_example"; // String | This then contains the consentId of the related AIS consent, which was performed prior to this payment initiation. 
Boolean withBalance = true; // Boolean | If contained, this function reads the list of accessible payment accounts including the booking balance,  if granted by the PSU in the related consent and available by the ASPSP.  This parameter might be ignored by the ASPSP.  
String digest = "digest_example"; // String | Is contained if and only if the \"Signature\" element is contained in the header of the request.
String signature = "signature_example"; // String | A signature of the request by the TPP on application level. This might be mandated by ASPSP. 
byte[] tpPSignatureCertificate = B; // byte[] | The certificate used for signing the request, in base64 encoding.  Must be contained if a signature is contained. 
String psUIPAddress = "psUIPAddress_example"; // String | The forwarded IP Address header field consists of the corresponding HTTP request  IP Address field between PSU and TPP.  It shall be contained if and only if this request was actively initiated by the PSU. 
String psUIPPort = "psUIPPort_example"; // String | The forwarded IP Port header field consists of the corresponding HTTP request IP Port field between PSU and TPP, if available. 
String psUAccept = "psUAccept_example"; // String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
String psUAcceptCharset = "psUAcceptCharset_example"; // String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
String psUAcceptEncoding = "psUAcceptEncoding_example"; // String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
String psUAcceptLanguage = "psUAcceptLanguage_example"; // String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
String psUUserAgent = "psUUserAgent_example"; // String | The forwarded Agent header field of the HTTP request between PSU and TPP, if available. 
String psUHttpMethod = "psUHttpMethod_example"; // String | HTTP method used at the PSU ? TPP interface, if available. Valid values are: * GET * POST * PUT * PATCH * DELETE 
UUID psUDeviceID = new UUID(); // UUID | UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available. UUID identifies either a device or a device dependant application installation. In case of an installation identification this ID needs to be unaltered until removal from device. 
String psUGeoLocation = "psUGeoLocation_example"; // String | The forwarded Geo Location of the corresponding http request between PSU and TPP if available. 
try {
    InlineResponse200 result = apiInstance.readAccountDetails(accountId, xRequestID, consentID, withBalance, digest, signature, tpPSignatureCertificate, psUIPAddress, psUIPPort, psUAccept, psUAcceptCharset, psUAcceptEncoding, psUAcceptLanguage, psUUserAgent, psUHttpMethod, psUDeviceID, psUGeoLocation);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountInformationServiceAisApi#readAccountDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | [**String**](.md)| This identification is denoting the addressed (card) account.  The account-id is retrieved by using a \&quot;Read Account List\&quot; or \&quot;Read Card Account list\&quot; call.  The account-id is the \&quot;resourceId\&quot; attribute of the account structure.  Its value is constant at least throughout the lifecycle of a given consent.  |
 **xRequestID** | [**UUID**](.md)| ID of the request, unique to the call, as determined by the initiating party. |
 **consentID** | [**String**](.md)| This then contains the consentId of the related AIS consent, which was performed prior to this payment initiation.  |
 **withBalance** | **Boolean**| If contained, this function reads the list of accessible payment accounts including the booking balance,  if granted by the PSU in the related consent and available by the ASPSP.  This parameter might be ignored by the ASPSP.   | [optional]
 **digest** | **String**| Is contained if and only if the \&quot;Signature\&quot; element is contained in the header of the request. | [optional]
 **signature** | **String**| A signature of the request by the TPP on application level. This might be mandated by ASPSP.  | [optional]
 **tpPSignatureCertificate** | **byte[]**| The certificate used for signing the request, in base64 encoding.  Must be contained if a signature is contained.  | [optional]
 **psUIPAddress** | **String**| The forwarded IP Address header field consists of the corresponding HTTP request  IP Address field between PSU and TPP.  It shall be contained if and only if this request was actively initiated by the PSU.  | [optional]
 **psUIPPort** | **String**| The forwarded IP Port header field consists of the corresponding HTTP request IP Port field between PSU and TPP, if available.  | [optional]
 **psUAccept** | **String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUAcceptCharset** | **String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUAcceptEncoding** | **String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUAcceptLanguage** | **String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUUserAgent** | **String**| The forwarded Agent header field of the HTTP request between PSU and TPP, if available.  | [optional]
 **psUHttpMethod** | **String**| HTTP method used at the PSU ? TPP interface, if available. Valid values are: * GET * POST * PUT * PATCH * DELETE  | [optional] [enum: GET, POST, PUT, PATCH, DELETE]
 **psUDeviceID** | [**UUID**](.md)| UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available. UUID identifies either a device or a device dependant application installation. In case of an installation identification this ID needs to be unaltered until removal from device.  | [optional]
 **psUGeoLocation** | **String**| The forwarded Geo Location of the corresponding http request between PSU and TPP if available.  | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[BearerAuthOAuth](../README.md#BearerAuthOAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a name="readCardAccountDetails"></a>
# **readCardAccountDetails**
> InlineResponse2002 readCardAccountDetails(accountId, xRequestID, consentID, digest, signature, tpPSignatureCertificate, psUIPAddress, psUIPPort, psUAccept, psUAcceptCharset, psUAcceptEncoding, psUAcceptLanguage, psUUserAgent, psUHttpMethod, psUDeviceID, psUGeoLocation)

Read details about a card account

Reads details about a card account.  It is assumed that a consent of the PSU to this access is already given  and stored on the ASPSP system. The addressed details of this account depends  then on the stored consent addressed by consentId, respectively the OAuth2  access token. 

### Example
```java
// Import classes:
//import de.adorsys.psd2.client.ApiClient;
//import de.adorsys.psd2.client.ApiException;
//import de.adorsys.psd2.client.Configuration;
//import de.adorsys.psd2.client.auth.*;
//import de.adorsys.psd2.client.api.AccountInformationServiceAisApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AccountInformationServiceAisApi apiInstance = new AccountInformationServiceAisApi();
String accountId = "accountId_example"; // String | This identification is denoting the addressed (card) account.  The account-id is retrieved by using a \"Read Account List\" or \"Read Card Account list\" call.  The account-id is the \"resourceId\" attribute of the account structure.  Its value is constant at least throughout the lifecycle of a given consent. 
UUID xRequestID = new UUID(); // UUID | ID of the request, unique to the call, as determined by the initiating party.
String consentID = "consentID_example"; // String | This then contains the consentId of the related AIS consent, which was performed prior to this payment initiation. 
String digest = "digest_example"; // String | Is contained if and only if the \"Signature\" element is contained in the header of the request.
String signature = "signature_example"; // String | A signature of the request by the TPP on application level. This might be mandated by ASPSP. 
byte[] tpPSignatureCertificate = B; // byte[] | The certificate used for signing the request, in base64 encoding.  Must be contained if a signature is contained. 
String psUIPAddress = "psUIPAddress_example"; // String | The forwarded IP Address header field consists of the corresponding HTTP request  IP Address field between PSU and TPP.  It shall be contained if and only if this request was actively initiated by the PSU. 
String psUIPPort = "psUIPPort_example"; // String | The forwarded IP Port header field consists of the corresponding HTTP request IP Port field between PSU and TPP, if available. 
String psUAccept = "psUAccept_example"; // String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
String psUAcceptCharset = "psUAcceptCharset_example"; // String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
String psUAcceptEncoding = "psUAcceptEncoding_example"; // String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
String psUAcceptLanguage = "psUAcceptLanguage_example"; // String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
String psUUserAgent = "psUUserAgent_example"; // String | The forwarded Agent header field of the HTTP request between PSU and TPP, if available. 
String psUHttpMethod = "psUHttpMethod_example"; // String | HTTP method used at the PSU ? TPP interface, if available. Valid values are: * GET * POST * PUT * PATCH * DELETE 
UUID psUDeviceID = new UUID(); // UUID | UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available. UUID identifies either a device or a device dependant application installation. In case of an installation identification this ID needs to be unaltered until removal from device. 
String psUGeoLocation = "psUGeoLocation_example"; // String | The forwarded Geo Location of the corresponding http request between PSU and TPP if available. 
try {
    InlineResponse2002 result = apiInstance.readCardAccountDetails(accountId, xRequestID, consentID, digest, signature, tpPSignatureCertificate, psUIPAddress, psUIPPort, psUAccept, psUAcceptCharset, psUAcceptEncoding, psUAcceptLanguage, psUUserAgent, psUHttpMethod, psUDeviceID, psUGeoLocation);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountInformationServiceAisApi#readCardAccountDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | [**String**](.md)| This identification is denoting the addressed (card) account.  The account-id is retrieved by using a \&quot;Read Account List\&quot; or \&quot;Read Card Account list\&quot; call.  The account-id is the \&quot;resourceId\&quot; attribute of the account structure.  Its value is constant at least throughout the lifecycle of a given consent.  |
 **xRequestID** | [**UUID**](.md)| ID of the request, unique to the call, as determined by the initiating party. |
 **consentID** | [**String**](.md)| This then contains the consentId of the related AIS consent, which was performed prior to this payment initiation.  |
 **digest** | **String**| Is contained if and only if the \&quot;Signature\&quot; element is contained in the header of the request. | [optional]
 **signature** | **String**| A signature of the request by the TPP on application level. This might be mandated by ASPSP.  | [optional]
 **tpPSignatureCertificate** | **byte[]**| The certificate used for signing the request, in base64 encoding.  Must be contained if a signature is contained.  | [optional]
 **psUIPAddress** | **String**| The forwarded IP Address header field consists of the corresponding HTTP request  IP Address field between PSU and TPP.  It shall be contained if and only if this request was actively initiated by the PSU.  | [optional]
 **psUIPPort** | **String**| The forwarded IP Port header field consists of the corresponding HTTP request IP Port field between PSU and TPP, if available.  | [optional]
 **psUAccept** | **String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUAcceptCharset** | **String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUAcceptEncoding** | **String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUAcceptLanguage** | **String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUUserAgent** | **String**| The forwarded Agent header field of the HTTP request between PSU and TPP, if available.  | [optional]
 **psUHttpMethod** | **String**| HTTP method used at the PSU ? TPP interface, if available. Valid values are: * GET * POST * PUT * PATCH * DELETE  | [optional] [enum: GET, POST, PUT, PATCH, DELETE]
 **psUDeviceID** | [**UUID**](.md)| UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available. UUID identifies either a device or a device dependant application installation. In case of an installation identification this ID needs to be unaltered until removal from device.  | [optional]
 **psUGeoLocation** | **String**| The forwarded Geo Location of the corresponding http request between PSU and TPP if available.  | [optional]

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

[BearerAuthOAuth](../README.md#BearerAuthOAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a name="startConsentAuthorisation"></a>
# **startConsentAuthorisation**
> StartScaprocessResponse startConsentAuthorisation(xRequestID, consentId, body, digest, signature, tpPSignatureCertificate, PSU_ID, psUIDType, psUCorporateID, psUCorporateIDType, tpPRedirectPreferred, tpPDecoupledPreferred, tpPRedirectURI, tpPNokRedirectURI, tpPNotificationURI, tpPNotificationContentPreferred, psUIPAddress, psUIPPort, psUAccept, psUAcceptCharset, psUAcceptEncoding, psUAcceptLanguage, psUUserAgent, psUHttpMethod, psUDeviceID, psUGeoLocation)

Start the authorisation process for a consent

Create an authorisation sub-resource and start the authorisation process of a consent.  The message might in addition transmit authentication and authorisation related data.  his method is iterated n times for a n times SCA authorisation in a  corporate context, each creating an own authorisation sub-endpoint for  the corresponding PSU authorising the consent.  The ASPSP might make the usage of this access method unnecessary,  since the related authorisation resource will be automatically created by  the ASPSP after the submission of the consent data with the first POST consents call.  The start authorisation process is a process which is needed for creating a new authorisation  or cancellation sub-resource.   This applies in the following scenarios:    * The ASPSP has indicated with an &#x27;startAuthorisation&#x27; hyperlink in the preceding Payment      initiation response that an explicit start of the authorisation process is needed by the TPP.      The &#x27;startAuthorisation&#x27; hyperlink can transport more information about data which needs to be      uploaded by using the extended forms:     * &#x27;startAuthorisationWithPsuIdentification&#x27;,      * &#x27;startAuthorisationWithPsuAuthentication&#x27;      * &#x27;startAuthorisationWithEncryptedPsuAuthentication&#x27;     * &#x27;startAuthorisationWithAuthentciationMethodSelection&#x27;    * The related payment initiation cannot yet be executed since a multilevel SCA is mandated.   * The ASPSP has indicated with an &#x27;startAuthorisation&#x27; hyperlink in the preceding      payment cancellation response that an explicit start of the authorisation process is needed by the TPP.      The &#x27;startAuthorisation&#x27; hyperlink can transport more information about data which needs to be uploaded      by using the extended forms as indicated above.   * The related payment cancellation request cannot be applied yet since a multilevel SCA is mandate for      executing the cancellation.   * The signing basket needs to be authorised yet. 

### Example
```java
// Import classes:
//import de.adorsys.psd2.client.ApiClient;
//import de.adorsys.psd2.client.ApiException;
//import de.adorsys.psd2.client.Configuration;
//import de.adorsys.psd2.client.auth.*;
//import de.adorsys.psd2.client.api.AccountInformationServiceAisApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AccountInformationServiceAisApi apiInstance = new AccountInformationServiceAisApi();
UUID xRequestID = new UUID(); // UUID | ID of the request, unique to the call, as determined by the initiating party.
String consentId = "consentId_example"; // String | ID of the corresponding consent object as returned by an account information consent request. 
Object body = null; // Object | 
String digest = "digest_example"; // String | Is contained if and only if the \"Signature\" element is contained in the header of the request.
String signature = "signature_example"; // String | A signature of the request by the TPP on application level. This might be mandated by ASPSP. 
byte[] tpPSignatureCertificate = B; // byte[] | The certificate used for signing the request, in base64 encoding.  Must be contained if a signature is contained. 
String PSU_ID = "PSU_ID_example"; // String | Client ID of the PSU in the ASPSP client interface.   Might be mandated in the ASPSP's documentation.  It might be contained even if an OAuth2 based authentication was performed in a pre-step or an OAuth2 based SCA was performed in an preceding AIS service in the same session. In this case the ASPSP might check whether PSU-ID and token match,  according to ASPSP documentation. 
String psUIDType = "psUIDType_example"; // String | Type of the PSU-ID, needed in scenarios where PSUs have several PSU-IDs as access possibility.  In this case, the mean and use are then defined in the ASPSP’s documentation. 
String psUCorporateID = "psUCorporateID_example"; // String | Might be mandated in the ASPSP's documentation. Only used in a corporate context. 
String psUCorporateIDType = "psUCorporateIDType_example"; // String | Might be mandated in the ASPSP's documentation. Only used in a corporate context. 
Boolean tpPRedirectPreferred = true; // Boolean | If it equals \"true\", the TPP prefers a redirect over an embedded SCA approach. If it equals \"false\", the TPP prefers not to be redirected for SCA. The ASPSP will then choose between the Embedded or the Decoupled SCA approach, depending on the parameter TPP-Decoupled-Preferred and the choice of the SCA procedure by the TPP/PSU. If the parameter is not used, the ASPSP will choose the SCA approach to be applied depending on the SCA method chosen by the TPP/PSU. 
Boolean tpPDecoupledPreferred = true; // Boolean | If it equals \"true\", the TPP prefers a decoupled SCA approach.  If it equals \"false\", the TPP prefers not to use the decoupled approach for SCA. The ASPSP will then choose between the embedded or the redirect SCA approach, depending on the choice of the SCA procedure by the TPP/PSU.  If the parameter is not used, the ASPSP will choose the SCA approach to be applied depending on the parameter TPP-Redirect-Preferred and the SCA method chosen by the TPP/PSU.  The parameter might be ignored by the ASPSP. If both parameters TPP-Redirect-Preferred and TPP-Decoupled-Preferred are present and true, the request is still not rejected, but it is up to the ASPSP, which approach will actually be used.  **Remark for Future:**  TPP-Redirect-Preferred and TPP-Decoupled-Preferred will be revised in future versions, maybe merged. Currently kept separate for downward compatibility. 
String tpPRedirectURI = "tpPRedirectURI_example"; // String | URI of the TPP, where the transaction flow shall be redirected to after a Redirect.  Mandated for the Redirect SCA Approach, specifically  when TPP-Redirect-Preferred equals \"true\". It is recommended to always use this header field.  **Remark for Future:**  This field might be changed to mandatory in the next version of the specification. 
String tpPNokRedirectURI = "tpPNokRedirectURI_example"; // String | If this URI is contained, the TPP is asking to redirect the transaction flow to this address instead of the TPP-Redirect-URI in case of a negative result of the redirect SCA method. This might be ignored by the ASPSP. 
String tpPNotificationURI = "tpPNotificationURI_example"; // String | URI for the Endpoint of the TPP-API to which the status of the payment initiation should be sent. This header field may by ignored by the ASPSP.  For security reasons, it shall be ensured that the TPP-Notification-URI as introduced above is secured by the TPP eIDAS QWAC used for identification of the TPP. The following applies:  URIs which are provided by TPPs in TPP-Notification-URI shall comply with the domain secured by the eIDAS QWAC certificate of the TPP in the field CN or SubjectAltName of the certificate. Please note that in case of example-TPP.com as certificate entry TPP- Notification-URI like www.example-TPP.com/xs2a-client/v1/ASPSPidentifcation/mytransaction- id/notifications or notifications.example-TPP.com/xs2a-client/v1/ASPSPidentifcation/mytransaction- id/notifications would be compliant.  Wildcard definitions shall be taken into account for compliance checks by the ASPSP.  ASPSPs may respond with ASPSP-Notification-Support set to false, if the provided URIs do not comply. 
String tpPNotificationContentPreferred = "tpPNotificationContentPreferred_example"; // String | The string has the form   status=X1, ..., Xn  where Xi is one of the constants SCA, PROCESS, LAST and where constants are not repeated. The usage of the constants supports the of following semantics:    SCA: A notification on every change of the scaStatus attribute for all related authorisation processes is preferred by the TPP.    PROCESS: A notification on all changes of consentStatus or transactionStatus attributes is preferred by the TPP.   LAST: Only a notification on the last consentStatus or transactionStatus as available in the XS2A interface is preferred by the TPP.  This header field may be ignored, if the ASPSP does not support resource notification services for the related TPP. 
String psUIPAddress = "psUIPAddress_example"; // String | The forwarded IP Address header field consists of the corresponding HTTP request  IP Address field between PSU and TPP.  It shall be contained if and only if this request was actively initiated by the PSU. 
String psUIPPort = "psUIPPort_example"; // String | The forwarded IP Port header field consists of the corresponding HTTP request IP Port field between PSU and TPP, if available. 
String psUAccept = "psUAccept_example"; // String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
String psUAcceptCharset = "psUAcceptCharset_example"; // String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
String psUAcceptEncoding = "psUAcceptEncoding_example"; // String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
String psUAcceptLanguage = "psUAcceptLanguage_example"; // String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
String psUUserAgent = "psUUserAgent_example"; // String | The forwarded Agent header field of the HTTP request between PSU and TPP, if available. 
String psUHttpMethod = "psUHttpMethod_example"; // String | HTTP method used at the PSU ? TPP interface, if available. Valid values are: * GET * POST * PUT * PATCH * DELETE 
UUID psUDeviceID = new UUID(); // UUID | UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available. UUID identifies either a device or a device dependant application installation. In case of an installation identification this ID needs to be unaltered until removal from device. 
String psUGeoLocation = "psUGeoLocation_example"; // String | The forwarded Geo Location of the corresponding http request between PSU and TPP if available. 
try {
    StartScaprocessResponse result = apiInstance.startConsentAuthorisation(xRequestID, consentId, body, digest, signature, tpPSignatureCertificate, PSU_ID, psUIDType, psUCorporateID, psUCorporateIDType, tpPRedirectPreferred, tpPDecoupledPreferred, tpPRedirectURI, tpPNokRedirectURI, tpPNotificationURI, tpPNotificationContentPreferred, psUIPAddress, psUIPPort, psUAccept, psUAcceptCharset, psUAcceptEncoding, psUAcceptLanguage, psUUserAgent, psUHttpMethod, psUDeviceID, psUGeoLocation);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountInformationServiceAisApi#startConsentAuthorisation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xRequestID** | [**UUID**](.md)| ID of the request, unique to the call, as determined by the initiating party. |
 **consentId** | [**String**](.md)| ID of the corresponding consent object as returned by an account information consent request.  |
 **body** | [**Object**](Object.md)|  | [optional]
 **digest** | **String**| Is contained if and only if the \&quot;Signature\&quot; element is contained in the header of the request. | [optional]
 **signature** | **String**| A signature of the request by the TPP on application level. This might be mandated by ASPSP.  | [optional]
 **tpPSignatureCertificate** | **byte[]**| The certificate used for signing the request, in base64 encoding.  Must be contained if a signature is contained.  | [optional]
 **PSU_ID** | **String**| Client ID of the PSU in the ASPSP client interface.   Might be mandated in the ASPSP&#x27;s documentation.  It might be contained even if an OAuth2 based authentication was performed in a pre-step or an OAuth2 based SCA was performed in an preceding AIS service in the same session. In this case the ASPSP might check whether PSU-ID and token match,  according to ASPSP documentation.  | [optional]
 **psUIDType** | **String**| Type of the PSU-ID, needed in scenarios where PSUs have several PSU-IDs as access possibility.  In this case, the mean and use are then defined in the ASPSP’s documentation.  | [optional]
 **psUCorporateID** | **String**| Might be mandated in the ASPSP&#x27;s documentation. Only used in a corporate context.  | [optional]
 **psUCorporateIDType** | **String**| Might be mandated in the ASPSP&#x27;s documentation. Only used in a corporate context.  | [optional]
 **tpPRedirectPreferred** | **Boolean**| If it equals \&quot;true\&quot;, the TPP prefers a redirect over an embedded SCA approach. If it equals \&quot;false\&quot;, the TPP prefers not to be redirected for SCA. The ASPSP will then choose between the Embedded or the Decoupled SCA approach, depending on the parameter TPP-Decoupled-Preferred and the choice of the SCA procedure by the TPP/PSU. If the parameter is not used, the ASPSP will choose the SCA approach to be applied depending on the SCA method chosen by the TPP/PSU.  | [optional]
 **tpPDecoupledPreferred** | **Boolean**| If it equals \&quot;true\&quot;, the TPP prefers a decoupled SCA approach.  If it equals \&quot;false\&quot;, the TPP prefers not to use the decoupled approach for SCA. The ASPSP will then choose between the embedded or the redirect SCA approach, depending on the choice of the SCA procedure by the TPP/PSU.  If the parameter is not used, the ASPSP will choose the SCA approach to be applied depending on the parameter TPP-Redirect-Preferred and the SCA method chosen by the TPP/PSU.  The parameter might be ignored by the ASPSP. If both parameters TPP-Redirect-Preferred and TPP-Decoupled-Preferred are present and true, the request is still not rejected, but it is up to the ASPSP, which approach will actually be used.  **Remark for Future:**  TPP-Redirect-Preferred and TPP-Decoupled-Preferred will be revised in future versions, maybe merged. Currently kept separate for downward compatibility.  | [optional]
 **tpPRedirectURI** | **String**| URI of the TPP, where the transaction flow shall be redirected to after a Redirect.  Mandated for the Redirect SCA Approach, specifically  when TPP-Redirect-Preferred equals \&quot;true\&quot;. It is recommended to always use this header field.  **Remark for Future:**  This field might be changed to mandatory in the next version of the specification.  | [optional]
 **tpPNokRedirectURI** | **String**| If this URI is contained, the TPP is asking to redirect the transaction flow to this address instead of the TPP-Redirect-URI in case of a negative result of the redirect SCA method. This might be ignored by the ASPSP.  | [optional]
 **tpPNotificationURI** | **String**| URI for the Endpoint of the TPP-API to which the status of the payment initiation should be sent. This header field may by ignored by the ASPSP.  For security reasons, it shall be ensured that the TPP-Notification-URI as introduced above is secured by the TPP eIDAS QWAC used for identification of the TPP. The following applies:  URIs which are provided by TPPs in TPP-Notification-URI shall comply with the domain secured by the eIDAS QWAC certificate of the TPP in the field CN or SubjectAltName of the certificate. Please note that in case of example-TPP.com as certificate entry TPP- Notification-URI like www.example-TPP.com/xs2a-client/v1/ASPSPidentifcation/mytransaction- id/notifications or notifications.example-TPP.com/xs2a-client/v1/ASPSPidentifcation/mytransaction- id/notifications would be compliant.  Wildcard definitions shall be taken into account for compliance checks by the ASPSP.  ASPSPs may respond with ASPSP-Notification-Support set to false, if the provided URIs do not comply.  | [optional]
 **tpPNotificationContentPreferred** | **String**| The string has the form   status&#x3D;X1, ..., Xn  where Xi is one of the constants SCA, PROCESS, LAST and where constants are not repeated. The usage of the constants supports the of following semantics:    SCA: A notification on every change of the scaStatus attribute for all related authorisation processes is preferred by the TPP.    PROCESS: A notification on all changes of consentStatus or transactionStatus attributes is preferred by the TPP.   LAST: Only a notification on the last consentStatus or transactionStatus as available in the XS2A interface is preferred by the TPP.  This header field may be ignored, if the ASPSP does not support resource notification services for the related TPP.  | [optional]
 **psUIPAddress** | **String**| The forwarded IP Address header field consists of the corresponding HTTP request  IP Address field between PSU and TPP.  It shall be contained if and only if this request was actively initiated by the PSU.  | [optional]
 **psUIPPort** | **String**| The forwarded IP Port header field consists of the corresponding HTTP request IP Port field between PSU and TPP, if available.  | [optional]
 **psUAccept** | **String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUAcceptCharset** | **String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUAcceptEncoding** | **String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUAcceptLanguage** | **String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUUserAgent** | **String**| The forwarded Agent header field of the HTTP request between PSU and TPP, if available.  | [optional]
 **psUHttpMethod** | **String**| HTTP method used at the PSU ? TPP interface, if available. Valid values are: * GET * POST * PUT * PATCH * DELETE  | [optional] [enum: GET, POST, PUT, PATCH, DELETE]
 **psUDeviceID** | [**UUID**](.md)| UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available. UUID identifies either a device or a device dependant application installation. In case of an installation identification this ID needs to be unaltered until removal from device.  | [optional]
 **psUGeoLocation** | **String**| The forwarded Geo Location of the corresponding http request between PSU and TPP if available.  | [optional]

### Return type

[**StartScaprocessResponse**](StartScaprocessResponse.md)

### Authorization

[BearerAuthOAuth](../README.md#BearerAuthOAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

<a name="updateConsentsPsuData"></a>
# **updateConsentsPsuData**
> Object updateConsentsPsuData(xRequestID, consentId, authorisationId, body, digest, signature, tpPSignatureCertificate, PSU_ID, psUIDType, psUCorporateID, psUCorporateIDType, psUIPAddress, psUIPPort, psUAccept, psUAcceptCharset, psUAcceptEncoding, psUAcceptLanguage, psUUserAgent, psUHttpMethod, psUDeviceID, psUGeoLocation)

Update PSU Data for consents

This method update PSU data on the consents  resource if needed.  It may authorise a consent within the Embedded SCA Approach where needed.  Independently from the SCA Approach it supports e.g. the selection of  the authentication method and a non-SCA PSU authentication.  This methods updates PSU data on the cancellation authorisation resource if needed.   There are several possible update PSU data requests in the context of a consent request if needed,  which depends on the SCA approach:  * Redirect SCA Approach:   A specific Update PSU data request is applicable for      * the selection of authentication methods, before choosing the actual SCA approach. * Decoupled SCA Approach:   A specific update PSU data request is only applicable for   * adding the PSU Identification, if not provided yet in the payment initiation request or the Account Information Consent Request, or if no OAuth2 access token is used, or   * the selection of authentication methods. * Embedded SCA Approach:    The Update PSU data request might be used    * to add credentials as a first factor authentication data of the PSU and   * to select the authentication method and   * transaction authorisation.  The SCA Approach might depend on the chosen SCA method.  For that reason, the following possible update PSU data request can apply to all SCA approaches:  * Select an SCA method in case of several SCA methods are available for the customer.  There are the following request types on this access path:   * Update PSU identification   * Update PSU authentication   * Select PSU authorization method      WARNING: This method needs a reduced header,      therefore many optional elements are not present.      Maybe in a later version the access path will change.   * Transaction Authorisation     WARNING: This method needs a reduced header,      therefore many optional elements are not present.      Maybe in a later version the access path will change. 

### Example
```java
// Import classes:
//import de.adorsys.psd2.client.ApiClient;
//import de.adorsys.psd2.client.ApiException;
//import de.adorsys.psd2.client.Configuration;
//import de.adorsys.psd2.client.auth.*;
//import de.adorsys.psd2.client.api.AccountInformationServiceAisApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AccountInformationServiceAisApi apiInstance = new AccountInformationServiceAisApi();
UUID xRequestID = new UUID(); // UUID | ID of the request, unique to the call, as determined by the initiating party.
String consentId = "consentId_example"; // String | ID of the corresponding consent object as returned by an account information consent request. 
String authorisationId = "authorisationId_example"; // String | Resource identification of the related SCA.
Object body = {
  "value" : { }
}; // Object | 
String digest = "digest_example"; // String | Is contained if and only if the \"Signature\" element is contained in the header of the request.
String signature = "signature_example"; // String | A signature of the request by the TPP on application level. This might be mandated by ASPSP. 
byte[] tpPSignatureCertificate = B; // byte[] | The certificate used for signing the request, in base64 encoding.  Must be contained if a signature is contained. 
String PSU_ID = "PSU_ID_example"; // String | Client ID of the PSU in the ASPSP client interface.   Might be mandated in the ASPSP's documentation.  It might be contained even if an OAuth2 based authentication was performed in a pre-step or an OAuth2 based SCA was performed in an preceding AIS service in the same session. In this case the ASPSP might check whether PSU-ID and token match,  according to ASPSP documentation. 
String psUIDType = "psUIDType_example"; // String | Type of the PSU-ID, needed in scenarios where PSUs have several PSU-IDs as access possibility.  In this case, the mean and use are then defined in the ASPSP’s documentation. 
String psUCorporateID = "psUCorporateID_example"; // String | Might be mandated in the ASPSP's documentation. Only used in a corporate context. 
String psUCorporateIDType = "psUCorporateIDType_example"; // String | Might be mandated in the ASPSP's documentation. Only used in a corporate context. 
String psUIPAddress = "psUIPAddress_example"; // String | The forwarded IP Address header field consists of the corresponding HTTP request  IP Address field between PSU and TPP.  It shall be contained if and only if this request was actively initiated by the PSU. 
String psUIPPort = "psUIPPort_example"; // String | The forwarded IP Port header field consists of the corresponding HTTP request IP Port field between PSU and TPP, if available. 
String psUAccept = "psUAccept_example"; // String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
String psUAcceptCharset = "psUAcceptCharset_example"; // String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
String psUAcceptEncoding = "psUAcceptEncoding_example"; // String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
String psUAcceptLanguage = "psUAcceptLanguage_example"; // String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. 
String psUUserAgent = "psUUserAgent_example"; // String | The forwarded Agent header field of the HTTP request between PSU and TPP, if available. 
String psUHttpMethod = "psUHttpMethod_example"; // String | HTTP method used at the PSU ? TPP interface, if available. Valid values are: * GET * POST * PUT * PATCH * DELETE 
UUID psUDeviceID = new UUID(); // UUID | UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available. UUID identifies either a device or a device dependant application installation. In case of an installation identification this ID needs to be unaltered until removal from device. 
String psUGeoLocation = "psUGeoLocation_example"; // String | The forwarded Geo Location of the corresponding http request between PSU and TPP if available. 
try {
    Object result = apiInstance.updateConsentsPsuData(xRequestID, consentId, authorisationId, body, digest, signature, tpPSignatureCertificate, PSU_ID, psUIDType, psUCorporateID, psUCorporateIDType, psUIPAddress, psUIPPort, psUAccept, psUAcceptCharset, psUAcceptEncoding, psUAcceptLanguage, psUUserAgent, psUHttpMethod, psUDeviceID, psUGeoLocation);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountInformationServiceAisApi#updateConsentsPsuData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xRequestID** | [**UUID**](.md)| ID of the request, unique to the call, as determined by the initiating party. |
 **consentId** | [**String**](.md)| ID of the corresponding consent object as returned by an account information consent request.  |
 **authorisationId** | [**String**](.md)| Resource identification of the related SCA. |
 **body** | [**Object**](Object.md)|  | [optional]
 **digest** | **String**| Is contained if and only if the \&quot;Signature\&quot; element is contained in the header of the request. | [optional]
 **signature** | **String**| A signature of the request by the TPP on application level. This might be mandated by ASPSP.  | [optional]
 **tpPSignatureCertificate** | **byte[]**| The certificate used for signing the request, in base64 encoding.  Must be contained if a signature is contained.  | [optional]
 **PSU_ID** | **String**| Client ID of the PSU in the ASPSP client interface.   Might be mandated in the ASPSP&#x27;s documentation.  It might be contained even if an OAuth2 based authentication was performed in a pre-step or an OAuth2 based SCA was performed in an preceding AIS service in the same session. In this case the ASPSP might check whether PSU-ID and token match,  according to ASPSP documentation.  | [optional]
 **psUIDType** | **String**| Type of the PSU-ID, needed in scenarios where PSUs have several PSU-IDs as access possibility.  In this case, the mean and use are then defined in the ASPSP’s documentation.  | [optional]
 **psUCorporateID** | **String**| Might be mandated in the ASPSP&#x27;s documentation. Only used in a corporate context.  | [optional]
 **psUCorporateIDType** | **String**| Might be mandated in the ASPSP&#x27;s documentation. Only used in a corporate context.  | [optional]
 **psUIPAddress** | **String**| The forwarded IP Address header field consists of the corresponding HTTP request  IP Address field between PSU and TPP.  It shall be contained if and only if this request was actively initiated by the PSU.  | [optional]
 **psUIPPort** | **String**| The forwarded IP Port header field consists of the corresponding HTTP request IP Port field between PSU and TPP, if available.  | [optional]
 **psUAccept** | **String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUAcceptCharset** | **String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUAcceptEncoding** | **String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUAcceptLanguage** | **String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.  | [optional]
 **psUUserAgent** | **String**| The forwarded Agent header field of the HTTP request between PSU and TPP, if available.  | [optional]
 **psUHttpMethod** | **String**| HTTP method used at the PSU ? TPP interface, if available. Valid values are: * GET * POST * PUT * PATCH * DELETE  | [optional] [enum: GET, POST, PUT, PATCH, DELETE]
 **psUDeviceID** | [**UUID**](.md)| UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available. UUID identifies either a device or a device dependant application installation. In case of an installation identification this ID needs to be unaltered until removal from device.  | [optional]
 **psUGeoLocation** | **String**| The forwarded Geo Location of the corresponding http request between PSU and TPP if available.  | [optional]

### Return type

**Object**

### Authorization

[BearerAuthOAuth](../README.md#BearerAuthOAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

