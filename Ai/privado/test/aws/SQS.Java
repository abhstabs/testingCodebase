package ai.privado.test.aws;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.sqs.AmazonSQS;
import com.amazonaws.services.sqs.AmazonSQSClientBuilder;
import com.amazonaws.services.sqs.model.SendMessageRequest;

public class SQS {

    private static final String ACCESS_KEY = "YOUR_ACCESS_KEY";
    private static final String SECRET_KEY = "YOUR_SECRET_KEY";
    private static final String QUEUE_URL = "YOUR_QUEUE_URL";

    public static void main(String[] args) {

        // Set up your credentials
        AWSCredentials credentials = new BasicAWSCredentials(ACCESS_KEY, SECRET_KEY);

        // Create an SQS client
        AmazonSQS sqs = AmazonSQSClientBuilder.standard()
                .withCredentials(new AWSStaticCredentialsProvider(credentials))
                .withRegion(Regions.US_EAST_1)
                .build();

        // Create a message to send
        String messageBody = "Hello, SQS!";

        // Send the message
        SendMessageRequest sendMessageRequest = new SendMessageRequest(QUEUE_URL, messageBody);
        sqs.sendMessage(sendMessageRequest);
    }
}

