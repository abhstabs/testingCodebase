import com.amazonaws.services.opensearch.AmazonOpenSearchClient;
import com.amazonaws.services.opensearch.model.IndexDocumentsRequest;
import com.amazonaws.services.opensearch.model.IndexDocumentsResult;

import java.util.List;

public class AWSOpenSearchUtil {

public static void AWSOpenSearchFirstNameFlow(String firstName, String lastName, String phoneNumber, String dob) {
    
    AmazonOpenSearchClient client = AmazonOpenSearchClient.builder().build();
    
    IndexDocumentsRequest request = new IndexDocumentsRequest()
        .withDomainName(domainName)
        .withDocuments(documents);
    
    IndexDocumentsResult result = client.indexDocuments(request);
    
    List<String> statuses = result.getStatuses();
    System.out.println("Statuses: " + statuses);
}
}
