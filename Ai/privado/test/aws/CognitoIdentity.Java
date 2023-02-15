package Ai.privado.test.aws;

import com.amazonaws.services.cognitoidentity.AmazonCognitoIdentity;
import com.amazonaws.services.cognitoidentity.AmazonCognitoIdentityClientBuilder;
import com.amazonaws.services.cognitoidentity.model.GetIdRequest;
import com.amazonaws.services.cognitoidentity.model.GetIdResult;
import com.amazonaws.services.cognitoidentity.model.GetOpenIdTokenRequest;
import com.amazonaws.services.cognitoidentity.model.GetOpenIdTokenResult;

public class CognitoIdentity {

    private static final String COGNITO_IDENTITY_POOL_ID = "YourIdentityPoolId";

    public static void main(String[] args) {

        // Initialize the Cognito Identity Client
        AmazonCognitoIdentity cognitoIdentityClient = AmazonCognitoIdentityClientBuilder.standard()
                .build();

        // Get the ID for the authenticated user
        GetIdRequest getIdRequest = new GetIdRequest();
        getIdRequest.setIdentityPoolId(COGNITO_IDENTITY_POOL_ID);
        GetIdResult getIdResult = cognitoIdentityClient.getId(getIdRequest);
        String identityId = getIdResult.getIdentityId();

        // Get the OpenID token for the authenticated user
        GetOpenIdTokenRequest getOpenIdTokenRequest = new GetOpenIdTokenRequest();
        getOpenIdTokenRequest.setIdentityId(identityId);
        GetOpenIdTokenResult getOpenIdTokenResult = cognitoIdentityClient.getOpenIdToken(getOpenIdTokenRequest);
        String openIdToken = getOpenIdTokenResult.getToken();

        // Process the personal data using the OpenID token
        // Add your code here

        // Clean up resources
        cognitoIdentityClient.shutdown();
    }
}

