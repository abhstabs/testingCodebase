package ai.privado.test.aws;

import com.amazonaws.services.kinesisfirehose.AmazonKinesisFirehose;
import com.amazonaws.services.kinesisfirehose.AmazonKinesisFirehoseClientBuilder;
import com.amazonaws.services.kinesisfirehose.model.CreateDeliveryStreamRequest;
import com.amazonaws.services.kinesisfirehose.model.CreateDeliveryStreamResult;

public class KinesisFirehose {

    public static void main(String[] args) {
        AmazonKinesisFirehose firehoseClient = AmazonKinesisFirehoseClientBuilder.defaultClient();

        CreateDeliveryStreamRequest createDeliveryStreamRequest = new CreateDeliveryStreamRequest();
        createDeliveryStreamRequest.setDeliveryStreamName("your-delivery-stream-name");
        createDeliveryStreamRequest.setS3DestinationConfiguration(
            // S3 configuration goes here
        );

        CreateDeliveryStreamResult createDeliveryStreamResult = firehoseClient.createDeliveryStream(createDeliveryStreamRequest);
        System.out.println("Delivery stream created with ARN: " + createDeliveryStreamResult.getDeliveryStreamARN());
    }
}

