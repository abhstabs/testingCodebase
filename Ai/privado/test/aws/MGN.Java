package Ai.privado.test.aws;

import com.amazonaws.services.mgn.AmazonMGNClient;
import com.amazonaws.services.mgn.model.IndexDocumentRequest;

import java.util.HashMap;
import java.util.Map;

public class MGN {

  public static void AWSMGNFirstNameFlow(String firstName, String lastName, String phoneNumber, String DOB) {
    AmazonMGNClient mgnClient = AmazonMGNClient.builder().build();
    
    Map<String, String> personalData = new HashMap<>();
    personalData.put("firstName", firstName);
    personalData.put("lastName", lastName);
    personalData.put("phoneNumber", phoneNumber);
    personalData.put("DOB", DOB);
    
    IndexDocumentRequest indexDocumentRequest = new IndexDocumentRequest()
        .withIndexName("personal-data")
        .withId(firstName + lastName)
        .withSource(personalData);
    
    mgnClient.indexDocument(indexDocumentRequest);
  }
}

