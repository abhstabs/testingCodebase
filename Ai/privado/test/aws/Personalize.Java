package Ai.privado.test.aws;

import com.amazonaws.services.personalize.AmazonPersonalize;
import com.amazonaws.services.personalize.AmazonPersonalizeClientBuilder;
import com.amazonaws.services.personalize.model.CreateDatasetRequest;
import com.amazonaws.services.personalize.model.CreateDatasetResult;

public class Personalize {

    public static void main(String[] args) {
        // Build the Amazon Personalize client
        AmazonPersonalize personalize = AmazonPersonalizeClientBuilder.defaultClient();

        // Create a new dataset
        CreateDatasetRequest request = new CreateDatasetRequest()
            .withDatasetType("USER")
            .withSchemaArn("arn:aws:personalize:us-west-2:123456789012:schema/MovieLens");
        CreateDatasetResult result = personalize.createDataset(request);

        // Print the dataset ARN
        System.out.println(result.getDatasetArn());
    }
}

