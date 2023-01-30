import com.amazonaws.services.pinpoint.AmazonPinpoint;
import com.amazonaws.services.pinpoint.AmazonPinpointClientBuilder;
import com.amazonaws.services.pinpoint.model.CreateCampaignRequest;

public class Example {

    public static void main(String[] args) {
        // Create a Pinpoint client
        AmazonPinpoint pinpoint = AmazonPinpointClientBuilder.defaultClient();

        // Create a new campaign
        CreateCampaignRequest request = new CreateCampaignRequest()
                .withApplicationId("YOUR_APP_ID")
                .withName("Example Campaign")
                .withDescription("This is an example campaign.");
        pinpoint.createCampaign(request);

        // Do other Pinpoint operations here
    }
}

