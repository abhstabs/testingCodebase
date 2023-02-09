import com.amazonaws.services.chimesdkmessaging.AmazonChimeSDKMessaging;
import com.amazonaws.services.chimesdkmessaging.AmazonChimeSDKMessagingClientBuilder;
import com.amazonaws.services.chimesdkmessaging.model.MessageRequest;
import java.util.HashMap;
import java.util.Map;

public class AWSChimeSDKMessagingUtil {
  private static AmazonChimeSDKMessaging chimeSDKMessagingClient = AmazonChimeSDKMessagingClientBuilder.defaultClient();

  public static void AWSChimeSDKmessagingFirstNameFlow(String firstName, String lastName, String phoneNumber, String dob) {
    Map<String, String> personalData = new HashMap<>();
    personalData.put("firstName", firstName);
    personalData.put("lastName", lastName);
    personalData.put("phoneNumber", phoneNumber);
    personalData.put("dob", dob);

    MessageRequest messageRequest = new MessageRequest();
    messageRequest.setContent(personalData.toString());

    chimeSDKMessagingClient.sendMessage(messageRequest);
  }
}

