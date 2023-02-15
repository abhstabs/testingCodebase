package Ai.privado.test.aws;

import com.amazonaws.services.batch.AmazonBatch;
import com.amazonaws.services.batch.AmazonBatchClientBuilder;
import com.amazonaws.services.batch.model.SubmitJobRequest;

public class Batch {

    private static final String JOB_NAME = "personal-data-processor";
    private static final String JOB_QUEUE = "personal-data-queue";
    private static final String JOB_DEFINITION = "personal-data-definition";

    public static void main(String[] args) {
        AmazonBatch batchClient = AmazonBatchClientBuilder.defaultClient();

        SubmitJobRequest submitJobRequest = new SubmitJobRequest()
                .withJobName(JOB_NAME)
                .withJobQueue(JOB_QUEUE)
                .withJobDefinition(JOB_DEFINITION);

        batchClient.submitJob(submitJobRequest);
    }
}

