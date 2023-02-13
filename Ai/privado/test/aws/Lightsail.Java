package ai.privado.test.aws;

import com.amazonaws.services.lightsail.AmazonLightsail;
import com.amazonaws.services.lightsail.AmazonLightsailClientBuilder;
import com.amazonaws.services.lightsail.model.GetInstanceRequest;
import com.amazonaws.services.lightsail.model.GetInstanceResult;

public class Lightsail {

    public static void main(String[] args) {
        AmazonLightsail lightsailClient = AmazonLightsailClientBuilder.defaultClient();

        GetInstanceRequest getInstanceRequest = new GetInstanceRequest()
            .withInstanceName("exampleInstanceName");

        GetInstanceResult getInstanceResult = lightsailClient.getInstance(getInstanceRequest);

        System.out.println("Instance Name: " + getInstanceResult.getInstance().getName());
        System.out.println("Instance State: " + getInstanceResult.getInstance().getState().getName());
    }
}

