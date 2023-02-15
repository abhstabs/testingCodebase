package Ai.privado.test.aws;

import com.amazonaws.services.amplifybackend.AmplifyBackend;
import com.amazonaws.services.amplifybackend.model.*;

public class AmplifyBackend {

    private final AmplifyBackend backendClient;

    public AmplifyBackend() {
        backendClient = new AmplifyBackendClientBuilder().build();
    }

    public void processPersonalData(String userId, String email, String name) {
        // Create an identity pool for the user
        CreateBackendAuthIdentityPoolRequest poolRequest = new CreateBackendAuthIdentityPoolRequest()
                .withIdentityPoolName("UserIdentityPool")
                .withUserId(userId)
                .withUsername(email)
                .withPassword(name);
        CreateBackendAuthIdentityPoolResult poolResult = backendClient.createBackendAuthIdentityPool(poolRequest);

        // Create the user in the backend
        CreateBackendAuthUserRequest userRequest = new CreateBackendAuthUserRequest()
                .withUserId(userId)
                .withUsername(email)
                .withPassword(name);
        CreateBackendAuthUserResult userResult = backendClient.createBackendAuthUser(userRequest);

        // Update the user's personal information
        UpdateBackendAuthUserRequest updateRequest = new UpdateBackendAuthUserRequest()
                .withUserId(userId)
                .withEmail(email)
                .withName(name);
        UpdateBackendAuthUserResult updateResult = backendClient.updateBackendAuthUser(updateRequest);
    }
}


