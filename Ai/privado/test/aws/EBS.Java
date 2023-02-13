package ai.privado.test.aws;

import com.amazonaws.services.ebs.AmazonEBS;
import com.amazonaws.services.ebs.AmazonEBSClientBuilder;
import com.amazonaws.services.ebs.model.CreateSnapshotRequest;

import java.util.Map;

public class EBS {

private AmazonEBS client;

public EBS() {
    client = AmazonEBSClientBuilder.standard().build();
}

public void AWSEBSProcessPersonalData(String firstName, String lastName, String phoneNumber, String dob) {
    Map<String, String> personalData = Map.of("firstName", firstName, "lastName", lastName, "phoneNumber", phoneNumber, "dob", dob);
    
    CreateSnapshotRequest createSnapshotRequest = new CreateSnapshotRequest()
            .withVolumeId(firstName + "_" + lastName + "_Volume")
            .withTagSpecifications(new Tag().withKey("PersonalData").withValue(personalData.toString()));
    
    client.createSnapshot(createSnapshotRequest);
}
}
