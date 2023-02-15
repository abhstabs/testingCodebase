package Ai.privado.test.aws;

import com.amazonaws.services.elasticbeanstalk.AWSElasticBeanstalk;
import com.amazonaws.services.elasticbeanstalk.AWSElasticBeanstalkClientBuilder;
import com.amazonaws.services.elasticbeanstalk.model.CreateEnvironmentRequest;
import com.amazonaws.services.elasticbeanstalk.model.CreateEnvironmentResult;
import com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentsRequest;
import com.amazonaws.services.elasticbeanstalk.model.DescribeEnvironmentsResult;

import java.util.HashMap;
import java.util.Map;

public class ElasticBeanStalk {

    private AWSElasticBeanstalk elasticBeanstalkClient;

    public ElasticBeanStalk() {
        this.elasticBeanstalkClient = AWSElasticBeanstalkClientBuilder.defaultClient();
    }

    public void processPersonalData(String personalData) {
        // TODO: Implement processing personal data
        // e.g. storing it in an environment variable, creating an environment, etc.
    }

    public void createEnvironment(String environmentName) {
        CreateEnvironmentRequest createEnvironmentRequest = new CreateEnvironmentRequest();
        createEnvironmentRequest.setApplicationName(environmentName);
        createEnvironmentRequest.setEnvironmentName(environmentName);

        Map<String, String> environmentVariables = new HashMap<>();
        environmentVariables.put("PERSONAL_DATA", personalData);
        createEnvironmentRequest.setEnvironmentVariables(environmentVariables);

        CreateEnvironmentResult createEnvironmentResult =
                this.elasticBeanstalkClient.createEnvironment(createEnvironmentRequest);
    }

    public void describeEnvironments() {
        DescribeEnvironmentsRequest describeEnvironmentsRequest = new DescribeEnvironmentsRequest();
        DescribeEnvironmentsResult describeEnvironmentsResult =
                this.elasticBeanstalkClient.describeEnvironments(describeEnvironmentsRequest);

        describeEnvironmentsResult.getEnvironments().forEach(environment -> {
            System.out.println("Environment Name: " + environment.getEnvironmentName());
            System.out.println("Environment ID: " + environment.getEnvironmentId());
        });
    }
}

