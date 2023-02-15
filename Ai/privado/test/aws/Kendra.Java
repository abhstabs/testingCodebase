package Ai.privado.test.aws;

import com.amazonaws.services.kendra.AWSKendra;
import com.amazonaws.services.kendra.AWSKendraClientBuilder;
import com.amazonaws.services.kendra.model.BatchPutDocumentRequest;
import com.amazonaws.services.kendra.model.BatchPutDocumentResponse;
import com.amazonaws.services.kendra.model.Document;
import com.amazonaws.services.kendra.model.DocumentAttributeValue;

import java.util.ArrayList;
import java.util.List;

public class Kendra {

    public static void main(String[] args) {
        // Create an instance of the Kendra client
        AWSKendra kendraClient = AWSKendraClientBuilder.defaultClient();

        // Create a list of documents to index
        List<Document> documents = new ArrayList<Document>();

        // Add a document to the list
        Document document = new Document()
            .withId("1")
            .withTitle("My first document")
            .withContent("This is the content of my first document.")
            .withAttributes(
                new DocumentAttributeValue()
                    .withKey("key1")
                    .withValue("value1"),
                new DocumentAttributeValue()
                    .withKey("key2")
                    .withValue("value2")
            );
        documents.add(document);

        // Create a request to index the documents
        BatchPutDocumentRequest request = new BatchPutDocumentRequest()
            .withIndexId("your-index-id")
            .withRoleArn("your-role-arn")
            .withDocuments(documents);

        // Send the request to index the documents
        BatchPutDocumentResponse response = kendraClient.batchPutDocument(request);
    }
}

