import com.amazonaws.services.EMRServerless.AmazonEMRServerless;
import com.amazonaws.services.EMRServerless.AmazonEMRServerlessClientBuilder;
import com.amazonaws.services.EMRServerless.model.PutRecordRequest;

import java.nio.ByteBuffer;
import java.util.Map;

public class AWSEMRServerlessUtil {

private AmazonEMRServerless client;

public AWSEMRServerlessUtil() {
    client = AmazonEMRServerlessClientBuilder.standard().build();
}

public void AWSEMRServerlessFirstNameFlow(String firstName, String lastName, String phoneNumber, String dob) {
    Map<String, String> personalData = Map.of("firstName", firstName, "lastName", lastName, "phoneNumber", phoneNumber, "dob", dob);

    PutRecordRequest putRecordRequest = new PutRecordRequest()
            .withStreamName("PersonalDataStream")
            .withData(ByteBuffer.wrap(personalData.toString().getBytes()))
            .withPartitionKey("partitionKey");

    client.putRecord(putRecordRequest);
}
}
