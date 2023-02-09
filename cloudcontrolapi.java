import com.amazonaws.services.cloudcontrolapi.AWSCloudControlAPI;
import com.amazonaws.services.cloudcontrolapi.model.GetRightsizingRecommendationRequest;
import com.amazonaws.services.cloudcontrolapi.model.GetRightsizingRecommendationResult;

import java.util.HashMap;
import java.util.Map;

public class CloudControlAPIDemo {
    public static void main(String[] args) {
        AWSCloudControlAPI client = AWSCloudControlAPI.builder().build();

        GetRightsizingRecommendationRequest request = new GetRightsizingRecommendationRequest();

        // Add personal data to the request
        Map<String, String> personalData = new HashMap<>();
        personalData.put("first_name", "John");
        personalData.put("last_name", "Doe");
        personalData.put("email", "johndoe@example.com");
        personalData.put("phone_number", "555-555-1212");
        request.setPersonalData(personalData);

        GetRightsizingRecommendationResult result = client.getRightsizingRecommendation(request);
        System.out.println("Rightsizing recommendation: " + result.getRecommendation());
    }
}

