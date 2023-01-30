import com.amazonaws.services.comprehend.AmazonComprehend;
import com.amazonaws.services.comprehend.AmazonComprehendClientBuilder;
import com.amazonaws.services.comprehend.model.DetectSentimentRequest;
import com.amazonaws.services.comprehend.model.DetectSentimentResult;

public class ComprehendSink {
    public static void main(String[] args) {
        AmazonComprehend comprehendClient = AmazonComprehendClientBuilder.standard()
                .withRegion("us-west-2")
                .build();

        String text = "I am having a great time at the beach.";

        DetectSentimentRequest detectSentimentRequest = new DetectSentimentRequest()
                .withText(text)
                .withLanguageCode("en");

        DetectSentimentResult detectSentimentResult = comprehendClient.detectSentiment(detectSentimentRequest);
        System.out.println("Sentiment: " + detectSentimentResult.getSentiment());
    }
}

