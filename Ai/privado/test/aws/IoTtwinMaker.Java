package ai.privado.test.aws;

import com.amazonaws.services.iottwinmaker.AWSIoTTwinMaker;
import com.amazonaws.services.iottwinmaker.AWSIoTTwinMakerClientBuilder;
import com.amazonaws.services.iottwinmaker.model.*;

public class IoTtwinMaker {
    private static AWSIoTTwinMaker iotTwinMakerClient = AWSIoTTwinMakerClientBuilder.defaultClient();

    public void processPersonalData(String thingName) {
        // Get the thing shadow
        GetThingShadowRequest getThingShadowRequest = new GetThingShadowRequest().withThingName(thingName);
        GetThingShadowResult getThingShadowResult = iotTwinMakerClient.getThingShadow(getThingShadowRequest);

        // Update the thing shadow
        UpdateThingShadowRequest updateThingShadowRequest = new UpdateThingShadowRequest()
            .withThingName(thingName)
            .withPayload(getThingShadowResult.getPayload());
        UpdateThingShadowResult updateThingShadowResult = iotTwinMakerClient.updateThingShadow(updateThingShadowRequest);

        // Delete the thing shadow
        DeleteThingShadowRequest deleteThingShadowRequest = new DeleteThingShadowRequest().withThingName(thingName);
        DeleteThingShadowResult deleteThingShadowResult = iotTwinMakerClient.deleteThingShadow(deleteThingShadowRequest);

        // Describe the thing
        DescribeThingRequest describeThingRequest = new DescribeThingRequest().withThingName(thingName);
        DescribeThingResult describeThingResult = iotTwinMakerClient.describeThing(describeThingRequest);

        // Publish to a topic
        PublishRequest publishRequest = new PublishRequest().withTopic("topic").withPayload(describeThingResult.toString());
        PublishResult publishResult = iotTwinMakerClient.publish(publishRequest);
    }
}

