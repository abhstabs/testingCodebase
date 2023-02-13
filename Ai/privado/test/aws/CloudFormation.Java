package ai.privado.test.aws;

import com.amazonaws.services.cloudformation.AmazonCloudFormation;
import com.amazonaws.services.cloudformation.AmazonCloudFormationClientBuilder;
import com.amazonaws.services.cloudformation.model.CreateStackRequest;
import com.amazonaws.services.cloudformation.model.Parameter;

public class CloudFormation {

    private AmazonCloudFormation cloudFormation;

    public CloudFormation() {
        cloudFormation = AmazonCloudFormationClientBuilder.defaultClient();
    }

    public void processPersonalData(Map<String,String> personalData) {
        List<Parameter> parameters = new ArrayList<>();
        for (Map.Entry<String, String> entry : personalData.entrySet()) {
            parameters.add(new Parameter().withParameterKey(entry.getKey()).withParameterValue(entry.getValue()));
        }

        CreateStackRequest request = new CreateStackRequest()
            .withStackName("PersonalDataStack")
            .withTemplateBody(getTemplate())
            .withParameters(parameters);

        cloudFormation.createStack(request);
    }

    private String getTemplate() {
        //return the cloud formation template as a string
    }
}

