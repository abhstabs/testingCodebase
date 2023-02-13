package ai.privado.test.aws;

import com.amazonaws.services.healthlake.AmazonHealthLakeClient;
import com.amazonaws.services.healthlake.model.HealthLakeRequest;
import com.amazonaws.services.healthlake.model.HealthLakeResponse;

import java.util.List;

public class HealthLake {
  private AmazonHealthLakeClient healthLakeClient;
  
  public HealthLake() {
    healthLakeClient = AmazonHealthLakeClient.builder().build();
  }
  
  public List<HealthLakeResponse> processPersonalData(List<HealthLakeRequest> personalDataRecords) {
    List<HealthLakeResponse> processedData = new ArrayList<>();
    for (HealthLakeRequest request : personalDataRecords) {
      HealthLakeResponse response = healthLakeClient.storePersonalData(request);
      processedData.add(response);
    }
    return processedData;
  }
}

