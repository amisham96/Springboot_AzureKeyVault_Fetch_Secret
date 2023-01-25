Step1
------
//Getting List of Subscriptions
"az account list"



Step2
------
//Setting the perticular Subscription
"az account set -s ssssssss-ssss-ssss-ssss-ssssssssssss"



Step3
------
//Creating service principal 
"az ad sp create-for-rbac --name myapp --role Contributor --scopes /subscriptions/mySubscriptionID"

	-> Go to Active Directory and select your service principal app and store below details:
	   Your Client_ID
	   Your Client_Secret_Value
	   Your Tenant_ID


Step4
------
Follow Below Steps:

-> Create Resource Group in Azure Portal

-> Create KeyVault in Azure Portal by selecting resource group

-> After Creating Key Vault create secret and store your secret key

-> Now select your key vault and in left hand side select option called "Access policies"

-> Click on Create and select in secret. the permission you want like "Get, List, Recover, Set, Delete, Backup, Restore".

-> Click "Next" and select your service principal app you created in "Step3" and click "Create"



Step5
------
Now Copy Your Client_ID, Your Client_Secret_Value, Your Tenant_ID and Key Vault URL in Spring Boot application
Under resources folder in application.properties file like below

	spring.cloud.azure.keyvault.secret.property-sources[0].credential.client-id=Client_ID
	spring.cloud.azure.keyvault.secret.property-sources[0].credential.client-secret=Client_Secret
	spring.cloud.azure.keyvault.secret.property-sources[0].endpoint=KeyVault_URL
	spring.cloud.azure.keyvault.secret.property-sources[0].profile.tenant-id=Tenant_ID