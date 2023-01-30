import com.amazonaws.services.efs.AmazonElasticFileSystem;
import com.amazonaws.services.efs.AmazonElasticFileSystemClientBuilder;
import com.amazonaws.services.efs.model.CreateFileSystemRequest;
import com.amazonaws.services.efs.model.CreateFileSystemResult;

public class EfsExample {

    public static void main(String[] args) {
        AmazonElasticFileSystem efsClient = AmazonElasticFileSystemClientBuilder.defaultClient();

        CreateFileSystemRequest request = new CreateFileSystemRequest()
            .withCreationToken("my-file-system");
        CreateFileSystemResult result = efsClient.createFileSystem(request);

        System.out.println("File system created with ID: " + result.getFileSystemId());
    }
}

