package Ai.privado.test.aws;

import com.amazonaws.services.iam.AmazonIdentityManagement;
import com.amazonaws.services.iam.AmazonIdentityManagementClientBuilder;
import com.amazonaws.services.iam.model.GetUserRequest;
import com.amazonaws.services.iam.model.GetUserResult;

public class IAM {
    private AmazonIdentityManagement iamClient;

    public IAM() {
        iamClient = AmazonIdentityManagementClientBuilder.defaultClient();
    }

    public void processPersonalData(String userName) {
        GetUserRequest request = new GetUserRequest().withUserName(userName);
        GetUserResult result = iamClient.getUser(request);

        // Perform processing on the user information obtained from the IAM service
        // Ensure to handle any exceptions and follow best practices for secure processing of personal data

        // Example processing: print user information
        System.out.println("User information: " + result.getUser());
    }
}

