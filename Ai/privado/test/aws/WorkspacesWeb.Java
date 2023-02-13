package ai.privado.test.aws;

import com.amazonaws.services.workspacesweb.AWSWorkspacesWeb;
import com.amazonaws.services.workspacesweb.model.CreateUserRequest;

public class WorkspacesWeb {
    public static void AWSWorkspaceswebFirstNameFlow(String firstName, String lastName, String phoneNumber, String DOB) {
        AWSWorkspacesWeb workspacesWebClient = AWSWorkspacesWebClientBuilder.standard().build();
        CreateUserRequest request = new CreateUserRequest()
                .withFirstName(firstName)
                .withLastName(lastName)
                .withPhoneNumber(phoneNumber)
                .withBirthDate(DOB);
        workspacesWebClient.createUser(request);
    }
}

