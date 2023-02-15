package Ai.privado.test.aws;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.docdb.AmazonDocDB;
import com.amazonaws.services.docdb.AmazonDocDBClientBuilder;
import com.amazonaws.services.docdb.model.AttributeValue;

public class DocumentDB {

    private AmazonDocDB docDBClient;

    public DocumentDB(String accessKey, String secretKey, String docDBEndpoint) {
        AWSCredentials credentials = new BasicAWSCredentials(accessKey, secretKey);
        docDBClient = AmazonDocDBClientBuilder.standard()
                .withCredentials(new AWSStaticCredentialsProvider(credentials))
                .withEndpointConfiguration(new EndpointConfiguration(docDBEndpoint, "us-west-2"))
                .build();
    }

    public void processData(String personalData) {
        Map<String, AttributeValue> item = new HashMap<>();
        item.put("personal_data", new AttributeValue(personalData));
        PutItemRequest putItemRequest = new PutItemRequest()
                .withTableName("personal_data_table")
                .withItem(item);
        docDBClient.putItem(putItemRequest);
    }
}

