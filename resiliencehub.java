import com.amazonaws.services.resiliencehub.ResilienceHubClient;
import com.amazonaws.services.resiliencehub.model.ResilienceHubException;

public class PersonalDataProcessor {
  private ResilienceHubClient resilienceHubClient;
  
  public PersonalDataProcessor() {
    this.resilienceHubClient = ResilienceHubClient.builder().build();
  }
  
  public void processData(String personalData) {
    try {
      resilienceHubClient.processData(personalData);
      System.out.println("Personal data processing successful");
    } catch (ResilienceHubException e) {
      System.err.println("Error processing personal data: " + e.getMessage());
    }
  }
  
  public static void main(String[] args) {
    PersonalDataProcessor processor = new PersonalDataProcessor();
    String personalData = "John Doe, 123 Main St, Anytown USA 12345, john.doe@email.com";
    processor.processData(personalData);
  }
}

