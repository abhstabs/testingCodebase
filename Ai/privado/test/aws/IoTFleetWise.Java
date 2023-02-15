package Ai.privado.test.aws;

import com.amazonaws.services.iotfleetwise.AmazonIoTFleetwise;
import com.amazonaws.services.iotfleetwise.AmazonIoTFleetwiseClientBuilder;
import com.amazonaws.services.iotfleetwise.model.CreateTrackerRequest;
import com.amazonaws.services.iotfleetwise.model.CreateTrackerResult;

import java.util.Map;

public class IoTFleetWise {

private AmazonIoTFleetwise client;

public IoTFleetWise() {
client = AmazonIoTFleetwiseClientBuilder.standard().build();
}

public void AWSIoTFleetwiseProcessPersonalData(String firstName, String lastName, String phoneNumber, String dob) {
Map<String, String> personalData = Map.of("firstName", firstName, "lastName", lastName, "phoneNumber", phoneNumber, "dob", dob);

CreateTrackerRequest createTrackerRequest = new CreateTrackerRequest()
        .withTrackerName(firstName + "_" + lastName + "_Tracker")
        .withAttributePayload(personalData);

CreateTrackerResult result = client.createTracker(createTrackerRequest);
System.out.println("Tracker created with ID: " + result.getTrackerId());
}
}
