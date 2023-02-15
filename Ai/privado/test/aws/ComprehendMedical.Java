package Ai.privado.test.aws;

import com.amazonaws.services.comprehendmedical.AmazonComprehendMedical;
import com.amazonaws.services.comprehendmedical.AmazonComprehendMedicalClientBuilder;
import com.amazonaws.services.comprehendmedical.model.DetectEntitiesRequest;
import com.amazonaws.services.comprehendmedical.model.DetectEntitiesResult;

public class ComprehendMedical {

    public static void main(String[] args) {
        AmazonComprehendMedical comprehendMedical = AmazonComprehendMedicalClientBuilder.standard().build();

        String text = "Patient has a history of heart disease and is currently taking lisinopril and aspirin.";

        DetectEntitiesRequest request = new DetectEntitiesRequest().withText(text);
        DetectEntitiesResult result = comprehendMedical.detectEntities(request);

        System.out.println("Entities found: " + result.getEntities());
    }
}
