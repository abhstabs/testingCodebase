package ai.privado.test.aws;

import com.amazonaws.services.appintegration.AWSAppIntegration;
import com.amazonaws.services.appintegration.AWSAppIntegrationClientBuilder;
import com.amazonaws.services.appintegration.model.CreateEventIntegrationRequest;
import com.amazonaws.services.appintegration.model.CreateEventIntegrationResult;

import java.util.HashMap;
import java.util.Map;

public class AppIntegration {

  private final AWSAppIntegration appIntegrationClient;

  public AppIntegration() {
    this.appIntegrationClient = AWSAppIntegrationClientBuilder.defaultClient();
  }

  public void processPersonalData(Map<String, String> personalData) {
    CreateEventIntegrationRequest request = new CreateEventIntegrationRequest();

    Map<String, String> metadata = new HashMap<>();
    metadata.put("personalData", personalData.toString());

    request.setMetadata(metadata);
    CreateEventIntegrationResult result = appIntegrationClient.createEventIntegration(request);

    System.out.println("Successfully processed personal data: " + result.getEventIntegrationArn());
  }
}

