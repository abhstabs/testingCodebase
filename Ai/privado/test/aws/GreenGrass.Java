package ai.privado.test.aws;

import com.amazonaws.services.greengrass.AWSGreengrass;
import com.amazonaws.services.greengrass.model.CreateFunctionDefinitionRequest;
import com.amazonaws.services.greengrass.model.CreateFunctionDefinitionResult;

public class GreenGrass {
    private static final String FUNCTION_NAME = "com.personal.data.processing";

    public static void main(String[] args) {
        // Initialize the Amazon AWS Greengrass client
        AWSGreengrass client = AWSGreengrassClientBuilder.defaultClient();

        // Create the personal data processing function
        CreateFunctionDefinitionRequest request = new CreateFunctionDefinitionRequest()
            .withName(FUNCTION_NAME);
        CreateFunctionDefinitionResult result = client.createFunctionDefinition(request);

        // Print the ARN of the created function
        System.out.println("Function ARN: " + result.getArn());
    }
}

