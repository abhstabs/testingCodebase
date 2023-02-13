package ai.privado.test.aws;

import com.amazonaws.services.apigateway.AmazonApiGateway;
import com.amazonaws.services.apigateway.AmazonApiGatewayClientBuilder;
import com.amazonaws.services.apigateway.model.PostToConnectionRequest;

import java.util.HashMap;
import java.util.Map;

public class APIGateway {
public void AWSAPIGatewayFirstNameFlow(String firstName, String lastName, String phoneNumber, String DOB) {
AmazonApiGateway client = AmazonApiGatewayClientBuilder.standard().build();

swift
Copy code
  Map<String, String> headers = new HashMap<>();
  headers.put("Content-Type", "application/json");
  
  String body = "{\"firstName\": \"" + firstName + "\", \"lastName\": \"" + lastName + "\", \"phoneNumber\": \"" + phoneNumber + "\", \"DOB\": \"" + DOB + "\"}";
 
  PostToConnectionRequest request = new PostToConnectionRequest()
     .withConnectionId("connection-id")
     .withData(body.getBytes())
     .withHeaders(headers);
 
  client.postToConnection(request);
}
}

