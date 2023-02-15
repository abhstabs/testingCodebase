package Ai.privado.test.aws;

import com.amazonaws.services.organizations.AWSOrganizations;
import com.amazonaws.services.organizations.AWSOrganizationsClientBuilder;
import com.amazonaws.services.organizations.model.CreateAccountRequest;
import com.amazonaws.services.organizations.model.CreateAccountResult;

public class Organizations {

    private AWSOrganizations organizationsClient;

    public Organizations() {
        organizationsClient = AWSOrganizationsClientBuilder.defaultClient();
    }

    public void processPersonalData(Map<String,String> personalData) {
        // Create a new account in Amazon Organizations to store the personal data
        CreateAccountRequest createAccountRequest = new CreateAccountRequest()
            .withEmail(personalData.get("email"))
            .withAccountName(personalData.get("name"))
            .withRoleName("PERSONAL_DATA_ROLE");
        CreateAccountResult createAccountResult = organizationsClient.createAccount(createAccountRequest);
        String accountId = createAccountResult.getCreateAccountStatus().getAccountId();

        // Add the personal data as tags to the created account
        TagResourceRequest tagResourceRequest = new TagResourceRequest()
            .withResourceId(accountId)
            .withTags(personalData);
        organizationsClient.tagResource(tagResourceRequest);
    }
}

