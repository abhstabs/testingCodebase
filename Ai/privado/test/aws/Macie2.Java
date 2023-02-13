package ai.privado.test.aws;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.macie2.AmazonMacie2;
import com.amazonaws.services.macie2.AmazonMacie2ClientBuilder;
import com.amazonaws.services.macie2.model.*;

public class Macie2 {

    private static final String AWS_ACCESS_KEY = "YourAccessKey";
    private static final String AWS_SECRET_KEY = "YourSecretKey";
    private static final String AWS_REGION = "us-west-2";

    public static void main(String[] args) {

        // Initialize the AWS credentials
        AWSCredentials credentials = new BasicAWSCredentials(AWS_ACCESS_KEY, AWS_SECRET_KEY);

        // Initialize the Macie2 Client
        AmazonMacie2 macie2Client = AmazonMacie2ClientBuilder.standard()
                .withCredentials(new AWSStaticCredentialsProvider(credentials))
                .withRegion(AWS_REGION)
                .build();

        // List all custom data identifiers
        ListCustomDataIdentifiersRequest listCustomDataIdentifiersRequest = new ListCustomDataIdentifiersRequest();
        ListCustomDataIdentifiersResult listCustomDataIdentifiersResult = macie2Client.listCustomDataIdentifiers(listCustomDataIdentifiersRequest);
        for (CustomDataIdentifierUpdate customDataIdentifier : listCustomDataIdentifiersResult.getCustomDataIdentifiers()) {
            // Check if the custom data identifier is for personal data
            if (customDataIdentifier.getName().equals("PersonalDataIdentifier")) {
                // Update the custom data identifier to process personal data
                UpdateCustomDataIdentifierRequest updateCustomDataIdentifierRequest = new UpdateCustomDataIdentifierRequest();
                updateCustomDataIdentifierRequest.setId(customDataIdentifier.getId());
                ClassificationTypeUpdate classificationTypeUpdate = new ClassificationTypeUpdate();
                classificationTypeUpdate.setOneTime(ClassificationTypeUpdate.OneTime.FALSE);
                updateCustomDataIdentifierRequest.setClassificationTypes(classificationTypeUpdate);
                macie2Client.updateCustomDataIdentifier(updateCustomDataIdentifierRequest);
                break;
            }
        }

        // Clean up resources
        macie2Client.shutdown();
    }
}

