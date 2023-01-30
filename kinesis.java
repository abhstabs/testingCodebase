import com.amazonaws.services.kinesis.AmazonKinesis;
import com.amazonaws.services.kinesis.AmazonKinesisClientBuilder;
import com.amazonaws.services.kinesis.model.PutRecordRequest;
import com.amazonaws.services.kinesis.model.PutRecordResult;

public class KinesisSink {

    private static final String STREAM_NAME = "your-stream-name";
    private static final String REGION = "your-region";

    public static void main(String[] args) {
        AmazonKinesis kinesisClient = AmazonKinesisClientBuilder.standard()
                                        .withRegion(REGION)
                                        .build();

        byte[] data = "your-data".getBytes();
        PutRecordRequest putRecordRequest = new PutRecordRequest()
                                            .withStreamName(STREAM_NAME)
                                            .withData(ByteBuffer.wrap(data))
                                            .withPartitionKey("partition-key");
        PutRecordResult result = kinesisClient.putRecord(putRecordRequest);
        System.out.println("Successfully added data to Kinesis stream with shard ID: " + result.getShardId());
    }
}

