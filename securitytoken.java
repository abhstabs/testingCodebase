import com.amazonaws.services.securitytoken.AWSSecurityTokenService;
import com.amazonaws.services.securitytoken.AWSSecurityTokenServiceClientBuilder;
import com.amazonaws.services.securitytoken.model.AssumeRoleRequest;
import com.amazonaws.services.securitytoken.model.AssumeRoleResult;

public class PersonalDataProcessor {
    private static final String ROLE_ARN = "arn:aws:iam::ACCOUNT_ID:role/ROLE_NAME";
    private static final String SESSION_NAME = "SESSION_NAME";

    public void processData() {
        AWSSecurityTokenService stsClient = AWSSecurityTokenServiceClientBuilder.defaultClient();

        AssumeRoleRequest assumeRoleRequest = new AssumeRoleRequest()
                .withRoleArn(ROLE_ARN)
                .withRoleSessionName(SESSION_NAME);

        AssumeRoleResult assumeRoleResult = stsClient.assumeRole(assumeRoleRequest);

        // Use the temporary security credentials to process personal data
        // ...
    }
}

