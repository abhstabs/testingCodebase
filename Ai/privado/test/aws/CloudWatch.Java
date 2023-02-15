package Ai.privado.test.aws;

import com.amazonaws.services.cloudwatch.AmazonCloudWatch;
import com.amazonaws.services.cloudwatch.AmazonCloudWatchClientBuilder;
import com.amazonaws.services.cloudwatch.model.Dimension;
import com.amazonaws.services.cloudwatch.model.MetricDatum;
import com.amazonaws.services.cloudwatch.model.PutMetricDataRequest;

public class CloudWatch {

    private AmazonCloudWatch cloudWatch;

    public CloudWatch() {
        cloudWatch = AmazonCloudWatchClientBuilder.defaultClient();
    }

    public void processPersonalData(Map<String,String> personalData) {
        MetricDatum datum = new MetricDatum()
            .withMetricName("personal_data_count")
            .withUnit("Count")
            .withValue(personalData.size())
            .withDimensions(new Dimension().withName("data_type").withValue("personal"));

        PutMetricDataRequest request = new PutMetricDataRequest()
            .withNamespace("PersonalData")
            .withMetricData(datum);

        cloudWatch.putMetricData(request);
    }
}

