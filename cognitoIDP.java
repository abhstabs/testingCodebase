import com.amazonaws.services.cognitoidp.AWSCognitoIdentityProvider;
import com.amazonaws.services.cognitoidp.AWSCognitoIdentityProviderClientBuilder;
import com.amazonaws.services.cognitoidp.model.AdminCreateUserRequest;
import com.amazonaws.services.cognitoidp.model.AdminCreateUserResult;
import com.amazonaws.services.cognitoidp.model.AttributeType;

import java.util.ArrayList;
import java.util.List;

public class AWSCognitoIDPUtil {
    private static final String USER_POOL_ID = "your_user_pool_id";
    private static final String CLIENT_ID = "your_client_id";
    private static final String REGION = "your_region";

    public static void AWSCognitoIDPFirstNameFlow(String firstName, String lastName, String phoneNumber, String dob) {
        // Create an instance of the Cognito Identity Provider client
        AWSCognitoIdentityProvider cognitoIdpClient =
                AWSCognitoIdentityProviderClientBuilder.standard()
                        .withRegion(REGION)
                        .build();

        // Define the user's personal data
        List<AttributeType> userAttributes = new ArrayList<>();
        userAttributes.add(new AttributeType().withName("given_name").withValue(firstName));
        userAttributes.add(new AttributeType().withName("family_name").withValue(lastName));
        userAttributes.add(new AttributeType().withName("phone_number").withValue(phoneNumber));
        userAttributes.add(new AttributeType().withName("birthdate").withValue(dob));

        // Create the request to create the user
        AdminCreateUserRequest createUserRequest = new AdminCreateUserRequest()
                .withUserPoolId(USER_POOL_ID)
                .withUsername(firstName + lastName)
                .withUserAttributes(userAttributes);

        // Send the request to create the user
        AdminCreateUserResult createUserResult = cognitoIdpClient.adminCreateUser(createUserRequest);

        // Get the user's unique identifier
        String userId = createUserResult.getUser().getUsername();

        System.out.println("Successfully created user with ID: " + userId);
    }
}

