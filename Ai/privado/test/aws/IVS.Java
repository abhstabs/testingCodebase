package ai.privado.test.aws;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.ivs.AmazonIVS;
import com.amazonaws.services.ivs.AmazonIVSClientBuilder;
import com.amazonaws.services.ivs.model.BatchGetChannelRequest;
import com.amazonaws.services.ivs.model.BatchGetChannelResult;
import com.amazonaws.services.ivs.model.Channel;

import java.util.ArrayList;
import java.util.List;

public class IVS {

    private static final String AWS_ACCESS_KEY = "YourAccessKey";
    private static final String AWS_SECRET_KEY = "YourSecretKey";
    private static final String AWS_REGION = "us-west-2";

    public static void main(String[] args) {

        // Initialize the AWS credentials
        AWSCredentials credentials = new BasicAWSCredentials(AWS_ACCESS_KEY, AWS_SECRET_KEY);

        // Initialize the IVS Client
        AmazonIVS ivsClient = AmazonIVSClientBuilder.standard()
                .withCredentials(new AWSStaticCredentialsProvider(credentials))
                .withRegion(AWS_REGION)
                .build();

        // Get a list of all channels
        List<String> channelArns = new ArrayList<>();
        String nextToken = null;
        do {
            BatchGetChannelRequest batchGetChannelRequest = new BatchGetChannelRequest();
            batchGetChannelRequest.setArns(channelArns);
            batchGetChannelRequest.setNextToken(nextToken);
            BatchGetChannelResult batchGetChannelResult = ivsClient.batchGetChannel(batchGetChannelRequest);
            for (Channel channel : batchGetChannelResult.getChannels()) {
                // Check if the channel contains personal data
                if (channel.getName().contains("PersonalData")) {
                    // Process the personal data in the channel
                    // Add your code here to process the personal data
                    break;
                }
            }
            nextToken = batchGetChannelResult.getNextToken();
        } while (nextToken != null);

        // Clean up resources
        ivsClient.shutdown();
    }
}

