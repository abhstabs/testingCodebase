import com.amazonaws.services.healthlake.model.HealthLakeRequest;
import com.amazonaws.services.healthlake.model.HealthLakeResponse;
import com.amazonaws.services.healthlake.AmazonHealthLakeClient;
import java.util.List;

public class PersonalDataProcessor {
  private AmazonHealthLakeClient healthLakeClient;
  
  public PersonalDataProcessor() {
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

