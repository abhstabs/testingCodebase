package ai.privado.test.aws;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.backup.AWSBackup;
import com.amazonaws.services.backup.AWSBackupClientBuilder;
import com.amazonaws.services.backup.model.CreateBackupVaultRequest;
import com.amazonaws.services.backup.model.CreateBackupVaultResult;

public class Backup {
    public static void main(String[] args) {
        // Replace with your access key and secret key
        AWSCredentials credentials = new BasicAWSCredentials("access_key", "secret_key");

        // Create an AWS Backup client
        AWSBackup backup = AWSBackupClientBuilder.standard()
                .withCredentials(new AWSStaticCredentialsProvider(credentials))
                .withRegion("us-west-2")
                .build();

        // Create a new Backup Vault
        CreateBackupVaultRequest createBackupVaultRequest = new CreateBackupVaultRequest()
                .withBackupVaultName("my-backup-vault");
        CreateBackupVaultResult createBackupVaultResult = backup.createBackupVault(createBackupVaultRequest);

        // Get the ARN of the newly created Backup Vault
        String backupVaultArn = createBackupVaultResult.getBackupVaultArn();
    }
}

