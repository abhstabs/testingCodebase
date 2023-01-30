import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.ec2.AmazonEC2;
import com.amazonaws.services.ec2.AmazonEC2ClientBuilder;
import com.amazonaws.services.ec2.model.CreateVolumeRequest;
import com.amazonaws.services.ec2.model.CreateVolumeResult;

public class EBSExample {
    public static void main(String[] args) {
        // Replace with your access key and secret key
        AWSCredentials credentials = new BasicAWSCredentials("access_key", "secret_key");

        // Create an EC2 client
        AmazonEC2 ec2 = AmazonEC2ClientBuilder.standard()
                .withCredentials(new AWSStaticCredentialsProvider(credentials))
                .withRegion("us-west-2")
                .build();

        // Create a new EBS volume
        CreateVolumeRequest createVolumeRequest = new CreateVolumeRequest()
                .withAvailabilityZone("us-west-2a")
                .withSize(1)
                .withVolumeType("gp2");
        CreateVolumeResult createVolumeResult = ec2.createVolume(createVolumeRequest);

        // Get the ID of the newly created EBS volume
        String volumeId = createVolumeResult.getVolume().getVolumeId();
    }
}

