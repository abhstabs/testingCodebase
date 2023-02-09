import com.amazonaws.services.apprunner.AWSAppRunner;
import com.amazonaws.services.apprunner.model.CreateAppRequest;
import com.amazonaws.services.apprunner.model.CreateAppResult;

public class PersonalDataProcessor {

  private AWSAppRunner appRunner;

  public PersonalDataProcessor() {
    this.appRunner = AWSAppRunner.builder().build();
  }

  public void processData(String personalData) {
    CreateAppRequest request = new CreateAppRequest()
      .withName("PersonalDataApp")
      .withSourceCodeUrl(personalData);

    CreateAppResult result = appRunner.createApp(request);
    System.out.println("App created: " + result.getApp().getName());
  }

}

