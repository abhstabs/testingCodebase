package Ai.privado.test.aws;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.disasterrecovery.AWSDisasterRecovery;
import com.amazonaws.services.disasterrecovery.AWSDisasterRecoveryClientBuilder;
import com.amazonaws.services.disasterrecovery.model.CreateReplicationJobRequest;
import com.amazonaws.services.disasterrecovery.model.CreateReplicationJobResult;

public class DisasterRecoveryService {
    public static void main(String[] args) {
        // Replace with your access key and secret key
        AWSCredentials credentials = new BasicAWSCredentials("access_key", "secret_key");

        // Create a DRS client
        AWSDisasterRecovery disasterRecovery = AWSDisasterRecoveryClientBuilder.standard()
                .withCredentials(new AWSStaticCredentialsProvider(credentials))
                .withRegion("us-west-2")
                .build();

        // Create a new Replication Job
        CreateReplicationJobRequest createReplicationJobRequest = new CreateReplicationJobRequest()
                .withReplicationJobId("my-replication-job")
                .withFrequency(24)
                .withStartTimestamp(System.currentTimeMillis());
        CreateReplicationJobResult createReplicationJobResult = disasterRecovery.createReplicationJob(createReplicationJobRequest);

        // Get the ARN of the newly created Replication Job
        String replicationJobArn = createReplicationJobResult.getReplicationJobArn();
    }
}

