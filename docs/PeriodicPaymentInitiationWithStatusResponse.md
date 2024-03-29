# PeriodicPaymentInitiationWithStatusResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**endToEndIdentification** | **String** |  |  [optional]
**debtorName** | **String** |  |  [optional]
**debtorAccount** | [**AccountReference**](AccountReference.md) |  | 
**ultimateDebtor** | **String** |  |  [optional]
**instructedAmount** | [**Amount**](Amount.md) |  | 
**creditorAccount** | [**AccountReference**](AccountReference.md) |  | 
**creditorAgent** | **String** |  |  [optional]
**creditorId** | **String** | Identification of Creditors, e.g. a SEPA Creditor ID. |  [optional]
**creditorName** | **String** |  | 
**creditorAddress** | [**Address**](Address.md) |  |  [optional]
**ultimateCreditor** | **String** |  |  [optional]
**purposeCode** | [**PurposeCode**](PurposeCode.md) |  |  [optional]
**remittanceInformationUnstructured** | **String** |  |  [optional]
**remittanceInformationStructured** | [**RemittanceInformationStructuredMax140**](RemittanceInformationStructuredMax140.md) |  |  [optional]
**startDate** | [**LocalDate**](LocalDate.md) |  | 
**endDate** | [**LocalDate**](LocalDate.md) |  |  [optional]
**executionRule** | [**ExecutionRule**](ExecutionRule.md) |  |  [optional]
**frequency** | [**FrequencyCode**](FrequencyCode.md) |  | 
**dayOfExecution** | [**DayOfExecution**](DayOfExecution.md) |  |  [optional]
**transactionStatus** | [**TransactionStatus**](TransactionStatus.md) |  |  [optional]
**tppMessages** | [**List&lt;TppMessageGeneric&gt;**](TppMessageGeneric.md) | Messages to the TPP on operational issues. |  [optional]
