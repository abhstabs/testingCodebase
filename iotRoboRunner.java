import java.util.HashMap;
import java.util.Map;

import com.amazonaws.services.iotroborunner.AWSIoTRoboRunner;
import com.amazonaws.services.iotroborunner.AWSIoTRoboRunnerClientBuilder;
import com.amazonaws.services.iotroborunner.model.PutThingShadowRequest;
import com.amazonaws.services.iotroborunner.model.PutThingShadowResult;

public class AWSIoTRoboRunnerUtil {

    private static AWSIoTRoboRunner iotRoboRunnerClient = AWSIoTRoboRunnerClientBuilder.defaultClient();

    public static void AWSIoTRoboRunnerFirstNameFlow(String firstName, String lastName, String phoneNumber, String dob) {
        Map<String, Object> personalData = new HashMap<>();
        personalData.put("firstName", firstName);
        personalData.put("lastName", lastName);
        personalData.put("phoneNumber", phoneNumber);
        personalData.put("dob", dob);

        PutThingShadowRequest request = new PutThingShadowRequest()
                .withThingName("PersonalData")
                .withPayload(personalData);

        PutThingShadowResult result = iotRoboRunnerClient.putThingShadow(request);
        System.out.println("Data sent to AWS IoTRoboRunner successfully");
    }
}

