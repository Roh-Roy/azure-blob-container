Sample Code to use Azure Blob SDK.


1- First code is to copy a blob from one container to another irrespective of storage account, subcriptions or tenant.


2- Second code is to add metadata to any blob


Note:- 

**Add the dependency as mentioned in pom.xml**

**While creating a BlobServiceClient using SAS token, make sure to give all access to service, container and blobs else permission issue might pop.**

**In the copy code, first parameter of beginCopy is sourceURL which should include/append the SAS token**


We can use Azure AD to replace SAS token, this is just one of the way to do things.
