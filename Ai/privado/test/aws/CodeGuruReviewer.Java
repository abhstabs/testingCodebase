package Ai.privado.test.aws;

import com.amazonaws.services.codegurureviewer.AmazonCodeGuruReviewer;
import com.amazonaws.services.codegurureviewer.AmazonCodeGuruReviewerClientBuilder;
import com.amazonaws.services.codegurureviewer.model.PutRecommendationFeedbackRequest;
import com.amazonaws.services.codegurureviewer.model.PutRecommendationFeedbackResult;

import java.util.Map;

public class CodeGuruReviewer {

    private AmazonCodeGuruReviewer codeGuruReviewerClient;

    public CodeGuruReviewer() {
        codeGuruReviewerClient = AmazonCodeGuruReviewerClientBuilder.standard().build();
    }

    public void processPersonalData(Map<String, String> personalData) {
        // Validate and sanitize the personal data
        // ...

        // Prepare the data to send to CodeGuru Reviewer
        PutRecommendationFeedbackRequest request = new PutRecommendationFeedbackRequest();
        // format the personal data as desired
        request.setUserIdentity(personalData.toString());

        // Send the data to CodeGuru Reviewer
        PutRecommendationFeedbackResult result = codeGuruReviewerClient.putRecommendationFeedback(request);

        // Handle the response from CodeGuru Reviewer
        // ...
    }
}

