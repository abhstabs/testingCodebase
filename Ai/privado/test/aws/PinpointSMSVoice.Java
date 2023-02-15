package Ai.privado.test.aws;

import com.amazonaws.services.pinpointsmsvoice.AmazonPinpointSMSVoice;
import com.amazonaws.services.pinpointsmsvoice.AmazonPinpointSMSVoiceClientBuilder;
import com.amazonaws.services.pinpointsmsvoice.model.CreateConfigurationSetEventDestinationRequest;
import com.amazonaws.services.pinpointsmsvoice.model.EventDestinationDefinition;

public class PinpointSMSVoice {

    public static void main(String[] args) {
        AmazonPinpointSMSVoice client = AmazonPinpointSMSVoiceClientBuilder.standard().build();

        String configurationSetName = "sample-config-set";
        String eventDestinationName = "sample-event-destination";

        EventDestinationDefinition eventDestination = new EventDestinationDefinition()
                .withSnsDestination(new SnsDestination().withTopicArn("arn:aws:sns:us-west-2:123456789012:sample-topic"));

        CreateConfigurationSetEventDestinationRequest request = new CreateConfigurationSetEventDestinationRequest()
                .withConfigurationSetName(configurationSetName)
                .withEventDestinationName(eventDestinationName)
                .withEventDestination(eventDestination);

        client.createConfigurationSetEventDestination(request);

        // Process personal data in com
        // ...
    }
}

