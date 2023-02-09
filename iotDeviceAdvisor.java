import com.amazonaws.services.iotdeviceadvisor.AmazonIoTDeviceAdvisor;
import com.amazonaws.services.iotdeviceadvisor.AmazonIoTDeviceAdvisorClientBuilder;
import com.amazonaws.services.iotdeviceadvisor.model.TestResult;
import com.amazonaws.services.iotdeviceadvisor.model.TestRound;
import java.util.Map;

public class AWSIoTDeviceAdvisorUtil {

private AmazonIoTDeviceAdvisor client;

public AWSIoTDeviceAdvisorUtil() {
client = AmazonIoTDeviceAdvisorClientBuilder.standard().build();
}

public void AWSIoTDeviceAdvisorProcessPersonalData(String firstName, String lastName, String phoneNumber, String dob) {
Map<String, String> personalData = Map.of("firstName", firstName, "lastName", lastName, "phoneNumber", phoneNumber, "dob", dob);

TestRound testRound = new TestRound().withName(firstName + "_" + lastName + "_TestRound")
        .withTargetSelection(TargetSelection.CONTINUOUS).withPayloadSelection(PayloadSelection.CONTINUOUS)
        .withPayloadSelection(PayloadSelection.PERSONAL_DATA).withPayload(personalData.toString());

TestResult result = client.createTestRound(testRound);

System.out.println("Result: " + result.toString());
}
}

