package Ai.privado.test.aws;

import com.amazonaws.services.iot.*;
import com.amazonaws.services.iot.model.*;

public class IoT {
   public void AWSIoTFirstNameFlow(String firstName, String lastName, String phoneNumber, String DOB) {
      AmazonIot client = AmazonIotClientBuilder.standard().build();

      String topic = "your/iot/topic";
      String payload = "{\"firstName\": \"" + firstName + "\", \"lastName\": \"" + lastName + "\", \"phoneNumber\": \"" + phoneNumber + "\", \"DOB\": \"" + DOB + "\"}";

      PublishRequest request = new PublishRequest();
      request.setTopic(topic);
      request.setPayload(payload.getBytes());
      client.publish(request);
   }
}

