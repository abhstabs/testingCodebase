package Ai.privado.test.aws;

import com.amazonaws.services.xray.AWSXRay;
import com.amazonaws.services.xray.AWSXRayClientBuilder;
import com.amazonaws.services.xray.model.GetTraceSummariesRequest;
import com.amazonaws.services.xray.model.GetTraceSummariesResult;

public class XRay {

    public static void main(String[] args) {
        AWSXRay xRayClient = AWSXRayClientBuilder.defaultClient();

        GetTraceSummariesRequest getTraceSummariesRequest = new GetTraceSummariesRequest();

        GetTraceSummariesResult getTraceSummariesResult = xRayClient.getTraceSummaries(getTraceSummariesRequest);

        System.out.println("Number of Traces: " + getTraceSummariesResult.getTraceSummaries().size());
    }
}

