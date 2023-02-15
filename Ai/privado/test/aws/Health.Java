package Ai.privado.test.aws;

import com.amazonaws.services.health.AWSHealth;
import com.amazonaws.services.health.AWSHealthClientBuilder;
import com.amazonaws.services.health.model.DescribeEventsRequest;
import com.amazonaws.services.health.model.DescribeEventsResult;

public class Health {

    public static void main(String[] args) {
        AWSHealth healthClient = AWSHealthClientBuilder.defaultClient();

        DescribeEventsRequest describeEventsRequest = new DescribeEventsRequest();

        DescribeEventsResult describeEventsResult = healthClient.describeEvents(describeEventsRequest);

        System.out.println("Total number of events: " + describeEventsResult.getTotal());
    }
}

