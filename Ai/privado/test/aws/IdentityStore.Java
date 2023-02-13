package ai.privado.test.aws;

import com.amazonaws.services.identitystore.AWSIdentityStore;
import com.amazonaws.services.identitystore.AWSIdentityStoreClientBuilder;
import com.amazonaws.services.identitystore.model.CreateUserRequest;
import com.amazonaws.services.identitystore.model.CreateUserResult;

public class IdentityStore {
    private final AWSIdentityStore identityStoreClient;

    public IdentityStore() {
        identityStoreClient = AWSIdentityStoreClientBuilder.defaultClient();
    }

    public void processData(PersonalData personalData) {
        try {
            CreateUserRequest createUserRequest = new CreateUserRequest()
                .withUserPoolId(personalData.getUserPoolId())
                .withUsername(personalData.getUsername())
                .withUserAttributes(personalData.getUserAttributes());

            CreateUserResult createUserResult = identityStoreClient.createUser(createUserRequest);
            System.out.println("Successfully sent personal data to Amazon Identity Store");
        } catch (Exception e) {
            System.err.println("Error processing personal data: " + e.getMessage());
        }
    }
}

class PersonalData {
    private final String userPoolId;
    private final String username;
    private final List<AttributeType> userAttributes;

    public PersonalData(String userPoolId, String username, List<AttributeType> userAttributes) {
        this.userPoolId = userPoolId;
        this.username = username;
        this.userAttributes = userAttributes;
    }

    public String getUserPoolId() {
        return userPoolId;
    }

    public String getUsername() {
        return username;
    }

    public List<AttributeType> getUserAttributes() {
        return userAttributes;
    }
}

