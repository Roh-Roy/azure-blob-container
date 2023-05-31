package org.example;

import com.azure.storage.blob.BlobClient;
import com.azure.storage.blob.BlobContainerClient;
import com.azure.storage.blob.BlobServiceClient;
import com.azure.storage.blob.BlobServiceClientBuilder;
import com.azure.storage.blob.models.BlockBlobItem;
import com.azure.storage.blob.specialized.BlockBlobClient;

import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        BlobServiceClient blobServiceClient = new BlobServiceClientBuilder()
                .endpoint("*********")
                .sasToken("***************")
                .buildClient();


        // Below code to copy a blob from one container to another
        BlobContainerClient destinationBlobClient = blobServiceClient.getBlobContainerClient("second-container");
        destinationBlobClient.getBlobClient("Copy from Code").beginCopy("*************", null);


        //Below code is to add metadata to any blob
        BlobContainerClient blobContainerClient = blobServiceClient.getBlobContainerClient("second-container");
        BlobClient blobClient = blobContainerClient.getBlobClient("Copy from Code");

        Map<String, String> metaData = new HashMap<>();
        metaData.put("Hello","World");
        blobClient.setMetadata(metaData);

    }
}
