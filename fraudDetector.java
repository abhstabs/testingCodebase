import com.amazonaws.services.frauddetector.AWSFraudDetector;
import com.amazonaws.services.frauddetector.AWSFraudDetectorClientBuilder;
import com.amazonaws.services.frauddetector.model.CreateDetectorVersionRequest;
import com.amazonaws.services.frauddetector.model.CreateDetectorVersionResult;

public class FraudDetectorSink {
    public static void main(String[] args) {
        // Build the Fraud Detector client
        AWSFraudDetector fraudDetector = AWSFraudDetectorClientBuilder.standard()
                .withRegion("us-west-2")
                .build();

        // Create a detector version
        CreateDetectorVersionRequest request = new CreateDetectorVersionRequest()
                .withDetectorId("DETECTOR_ID")
                .withDescription("New detector version")
                .withExternalModelEndpoints(Arrays.asList("https://endpoint.example.com"));
        CreateDetectorVersionResult result = fraudDetector.createDetectorVersion(request);

        // Print the detector version ARN
        System.out.println("Detector version ARN: " + result.getDetectorVersionArn());
    }
}

