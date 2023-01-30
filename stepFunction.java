import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.stepfunctions.AWSStepFunctions;
import com.amazonaws.services.stepfunctions.AWSStepFunctionsClientBuilder;
import com.amazonaws.services.stepfunctions.model.StartExecutionRequest;
import com.amazonaws.services.stepfunctions.model.StartExecutionResult;

public class StepFunctionsExample {
    private static final String ACCESS_KEY = "YOUR_ACCESS_KEY";
    private static final String SECRET_KEY = "YOUR_SECRET_KEY";
    private static final String STATE_MACHINE_ARN = "YOUR_STATE_MACHINE_ARN";

    public static void main(String[] args) {
        // Set up your credentials
        AWSCredentials credentials = new BasicAWSCredentials(ACCESS_KEY, SECRET_KEY);

        // Create a Step Functions client
        AWSStepFunctions stepFunctions = AWSStepFunctionsClientBuilder.standard()
                .withCredentials(new AWSStaticCredentialsProvider(credentials))
                .withRegion(Regions.US_EAST_1)
                .build();

        // Create a StartExecutionRequest object with input
        String input = "{\"example_key\":\"example_value\"}";
        StartExecutionRequest startExecutionRequest = new StartExecutionRequest()
                .withStateMachineArn(STATE_MACHINE_ARN)
                .withInput(input);

        // Start the execution
        StartExecutionResult startExecutionResult = stepFunctions.startExecution(startExecutionRequest);
        System.out.println("Execution ARN: " + startExecutionResult.getExecutionArn());
    }
}

