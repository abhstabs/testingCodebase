package ai.privado.test.aws;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.PutObjectResult;
import com.amazonaws.services.sso.AmazonSSO;
import com.amazonaws.services.sso.AmazonSSOClientBuilder;
import com.amazonaws.services.sso.model.GetRoleCredentialsRequest;
import com.amazonaws.services.sso.model.GetRoleCredentialsResult;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Map;

public class SSO {
    private final AmazonSSO ssoClient;
    private final AmazonS3 s3Client;

    public SSO() {
        ssoClient = AmazonSSOClientBuilder.defaultClient();
        s3Client = AmazonS3ClientBuilder.defaultClient();
    }

    public void processPersonalData(String personalData) {
        // 1. Obtain role credentials for the user
        GetRoleCredentialsRequest roleCredentialsRequest = new GetRoleCredentialsRequest()
            .withAccessToken("access-token")
            .withAccountId("account-id")
            .withRoleName("role-name");
        GetRoleCredentialsResult roleCredentialsResult = ssoClient.getRoleCredentials(roleCredentialsRequest);
        Map<String, String> credentials = roleCredentialsResult.getRoleCredentials();

        // 2. Use the obtained credentials to access personal data in S3
        InputStream personalDataStream = new ByteArrayInputStream(personalData.getBytes(StandardCharsets.UTF_8));
        PutObjectRequest putObjectRequest = new PutObjectRequest("bucket-name", "personal-data.txt", personalDataStream, null);
        PutObjectResult putObjectResult = s3Client.putObject(putObjectRequest);
    }
}

