package ai.privado.test.aws;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.fsx.AmazonFSx;
import com.amazonaws.services.fsx.AmazonFSxClientBuilder;
import com.amazonaws.services.fsx.model.CreateFileSystemRequest;
import com.amazonaws.services.fsx.model.CreateFileSystemResult;

public class FSx {
    public static void main(String[] args) {
        // Replace with your access key and secret key
        AWSCredentials credentials = new BasicAWSCredentials("access_key", "secret_key");

        // Create an FSx client
        AmazonFSx fsx = AmazonFSxClientBuilder.standard()
                .withCredentials(new AWSStaticCredentialsProvider(credentials))
                .withRegion("us-west-2")
                .build();

        // Create a new FSx file system
        CreateFileSystemRequest createFileSystemRequest = new CreateFileSystemRequest()
                .withStorageCapacity(100)
                .withFileSystemType("LUSTRE")
                .withSubnetIds("subnet-12345678");
        CreateFileSystemResult createFileSystemResult = fsx.createFileSystem(createFileSystemRequest);

        // Get the ID of the newly created FSx file system
        String fileSystemId = createFileSystemResult.getFileSystem().getFileSystemId();
    }
}

