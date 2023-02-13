package ai.privado.test.aws;

import com.amazonaws.services.opsworks.AWSOpsWorks;
import com.amazonaws.services.opsworks.AWSOpsWorksClientBuilder;
import com.amazonaws.services.opsworks.model.DescribeStackSummariesRequest;
import com.amazonaws.services.opsworks.model.DescribeStackSummariesResult;

public class OpsWorks {

    public static void main(String[] args) {
        AWSOpsWorks opsWorksClient = AWSOpsWorksClientBuilder.defaultClient();

        DescribeStackSummariesRequest describeStackSummariesRequest = new DescribeStackSummariesRequest();

        DescribeStackSummariesResult describeStackSummariesResult = opsWorksClient.describeStackSummaries(describeStackSummariesRequest);

        System.out.println("Number of Stacks: " + describeStackSummariesResult.getStackSummaries().size());
    }
}

