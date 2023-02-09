import com.amazonaws.services.lambda.AWSLambda;
import com.amazonaws.services.lambda.AWSLambdaClientBuilder;
import com.amazonaws.services.lambda.model.InvokeRequest;
import com.amazonaws.services.lambda.model.InvokeResult;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

public class AWSLambdaUtil {
    public static void AWSLambdaFirstNameFlow(String firstName, String lastName, String phoneNumber, String dob) {
        // Build the AWS Lambda client
        AWSLambda lambdaClient = AWSLambdaClientBuilder.defaultClient();

        // Encode the personal data as a JSON string
        String payload = "{\"firstName\": \"" + firstName + "\", " +
                         "\"lastName\": \"" + lastName + "\", " +
                         "\"phoneNumber\": \"" + phoneNumber + "\", " +
                         "\"dob\": \"" + dob + "\"}";
        ByteBuffer content = ByteBuffer.wrap(payload.getBytes(StandardCharsets.UTF_8));

        // Send the personal data to the AWS Lambda function
        InvokeRequest invokeRequest = new InvokeRequest()
                .withFunctionName("myLambdaFunction")
                .withPayload(content);
        InvokeResult invokeResult = lambdaClient.invoke(invokeRequest);
    }
}

