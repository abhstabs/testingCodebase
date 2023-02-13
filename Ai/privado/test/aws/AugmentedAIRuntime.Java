package ai.privado.test.aws;

import com.amazonaws.services.augmentedairuntime.AmazonAugmentedAIRuntime;
import com.amazonaws.services.augmentedairuntime.AmazonAugmentedAIRuntimeClientBuilder;
import com.amazonaws.services.augmentedairuntime.model.InvokeEndpointRequest;
import com.amazonaws.services.augmentedairuntime.model.InvokeEndpointResult;

public class AugmentedAIRuntime {
    public static void main(String[] args) {
        // Initialize the Amazon Augmented AI Runtime client
        AmazonAugmentedAIRuntime aiRuntimeClient = AmazonAugmentedAIRuntimeClientBuilder.defaultClient();
        
        // Define the endpoint ARN
        String endpointArn = "arn:aws:sagemaker:us-west-2:123456789012:endpoint/my-endpoint";
        
        // Define the input data
        String inputData = "{\"data\": [{\"text_input\": \"This is some text input.\"}]}";
        
        // Create the request to invoke the endpoint
        InvokeEndpointRequest invokeEndpointRequest = new InvokeEndpointRequest().withEndpointName(endpointArn).withBody(inputData);
        
        // Invoke the endpoint
        InvokeEndpointResult invokeEndpointResult = aiRuntimeClient.invokeEndpoint(invokeEndpointRequest);
        
        // Get the response
        String response = new String(invokeEndpointResult.getBody().array());
        
        // Print the response
        System.out.println("Endpoint response: " + response);
    }
}

