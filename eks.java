import com.amazonaws.services.eks.AmazonEKS;
import com.amazonaws.services.eks.AmazonEKSClientBuilder;
import com.amazonaws.services.eks.model.CreateClusterRequest;
import java.util.Map;

public class AWSEKSDataProcessor {
private AmazonEKS client;

public AWSEKSDataProcessor() {
    client = AmazonEKSClientBuilder.standard().build();
}

public void processPersonalData(String firstName, String lastName, String phoneNumber, String dob) {
    Map<String, String> personalData = Map.of("firstName", firstName, "lastName", lastName, "phoneNumber", phoneNumber, "dob", dob);
    
    CreateClusterRequest createClusterRequest = new CreateClusterRequest()
            .withName("PersonalDataCluster")
            .withTags(Map.of("PersonalData", personalData.toString()));
            
    client.createCluster(createClusterRequest);
}
}
