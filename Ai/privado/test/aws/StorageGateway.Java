package ai.privado.test.aws;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.storagegateway.AWSStorageGatewayClient;
import com.amazonaws.services.storagegateway.model.CreateCachediSCSIVolumeRequest;
import com.amazonaws.services.storagegateway.model.CreateCachediSCSIVolumeResult;

public class StorageGateway {
    public static void main(String[] args) {
        // Replace with your access key and secret key
        AWSCredentials credentials = new BasicAWSCredentials("access_key", "secret_key");

        // Create a Storage Gateway client
        AWSStorageGatewayClient client = new AWSStorageGatewayClient(credentials);
        client.setEndpoint("https://storagegateway.us-west-2.amazonaws.com");

        // Create a new cached iSCSI volume
        CreateCachediSCSIVolumeRequest request = new CreateCachediSCSIVolumeRequest()
                .withGatewayARN("arn:aws:storagegateway:us-west-2:1234567890:gateway/sgw-12A3456B")
                .withVolumeSizeInBytes(1099511627776L)
                .withSnapshotId("snap-01234567890abcdef0")
                .withTargetName("myiscsitarget")
                .withNetworkInterfaceId("eni-01234567890abcdef0");
        CreateCachediSCSIVolumeResult result = client.createCachediSCSIVolume(request);

        // Get the ARN of the newly created volume
        String volumeARN = result.getVolumeARN();
    }
}

