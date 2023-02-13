package ai.privado.test.aws;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.sns.AmazonSNS;
import com.amazonaws.services.sns.AmazonSNSClientBuilder;

public class SNS {

    private AmazonSNS snsClient;

    public SNS() {
        // Replace with your own access key and secret key
        AWSCredentials credentials = new BasicAWSCredentials("access_key", "secret_key");
        snsClient = AmazonSNSClientBuilder.standard()
                .withCredentials(new AWSStaticCredentialsProvider(credentials))
                .withRegion(Regions.US_EAST_1)
                .build();
    }

    public void sendMessage(String topicArn, String message) {
        snsClient.publish(topicArn, message);
        System.out.println("Sent message: " + message);
    }

    public static void main(String[] args) {
        ai.privado.test.aws.SNS sns = new ai.privado.test.aws.SNS();
        sns.sendMessage("arn:aws:sns:us-east-1:1234567890:MyTopic", "Hello, World!");
    }
}

