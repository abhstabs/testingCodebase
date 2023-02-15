package Ai.privado.test.aws;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.ec2.AmazonEC2;
import com.amazonaws.services.ec2.AmazonEC2ClientBuilder;

import java.util.List;

public class EC2 {

    private AmazonEC2 client;

    public EC2(String accessKey, String secretKey) {
        BasicAWSCredentials credentials = new BasicAWSCredentials(accessKey, secretKey);
        this.client = AmazonEC2ClientBuilder.standard()
                .withCredentials(new AWSStaticCredentialsProvider(credentials))
                .build();
    }

    public void processData(List<String> data) {
        // Process the personal data records
        for (String record : data) {
            processRecord(record);
        }
    }

    private void processRecord(String record) {
        // process the personal data record
        // ...
    }
}

