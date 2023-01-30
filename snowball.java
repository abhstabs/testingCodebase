import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.snowball.AmazonSnowball;
import com.amazonaws.services.snowball.AmazonSnowballClientBuilder;
import com.amazonaws.services.snowball.model.CreateJobRequest;
import com.amazonaws.services.snowball.model.CreateJobResult;

public class SnowballExample {
    public static void main(String[] args) {
        // Replace with your access key and secret key
        AWSCredentials credentials = new BasicAWSCredentials("access_key", "secret_key");

        // Create a Snowball client
        AmazonSnowball snowball = AmazonSnowballClientBuilder.standard()
                .withCredentials(new AWSStaticCredentialsProvider(credentials))
                .withRegion("us-west-2")
                .build();

        // Create a new Snowball Job
        CreateJobRequest createJobRequest = new CreateJobRequest()
                .withJobType("IMPORT")
                .withResources(new JobResource()
                    .withS3Resources(new S3Resource()
                        .withBucketArn("arn:aws:s3:::my-bucket")
                        .withKeyRange(new S3KeyRange().withEndMarker("data/end"))
                    )
                )
                .withDescription("Importing data from S3 to Snowball")
                .withShippingOption("SECOND_DAY")
                .withAddressId("ADDRESS_ID");
        CreateJobResult createJobResult = snowball.createJob(createJobRequest);

        // Get the ID of the newly created Snowball Job
        String jobId = createJobResult.getJobId();
    }
}

