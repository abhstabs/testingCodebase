package Ai.privado.test.aws;

import com.amazonaws.services.costandusagereport.AWSCostAndUsageReport;
import com.amazonaws.services.costandusagereport.AWSCostAndUsageReportClientBuilder;
import com.amazonaws.services.costandusagereport.model.CreateReportDefinitionRequest;
import com.amazonaws.services.costandusagereport.model.CreateReportDefinitionResult;

public class CostAndUsageReport {

    private static final String REPORT_NAME = "personal-data-report";
    private static final String S3_BUCKET = "personal-data-bucket";

    public static void main(String[] args) {
        AWSCostAndUsageReport costAndUsageReportClient = AWSCostAndUsageReportClientBuilder.defaultClient();

        CreateReportDefinitionRequest createReportDefinitionRequest = new CreateReportDefinitionRequest()
                .withReportName(REPORT_NAME)
                .withS3Bucket(S3_BUCKET);

        CreateReportDefinitionResult createReportDefinitionResult = costAndUsageReportClient.createReportDefinition(createReportDefinitionRequest);

        System.out.println("Report definition Id: " + createReportDefinitionResult.getReportDefinitionId());
    }
}

