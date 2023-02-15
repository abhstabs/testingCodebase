package Ai.privado.test.aws;

import com.amazonaws.services.migrationhub.AmazonMigrationHub;
import com.amazonaws.services.migrationhub.model.ImportMigrationTaskRequest;
import com.amazonaws.services.migrationhub.model.ResourceAttribute;

import java.util.Map;

public class MigrationHub {

private AmazonMigrationHub client;

public MigrationHub() {
    client = AmazonMigrationHubClientBuilder.standard().build();
}

public void AWSMigrationHubProcessPersonalData(String firstName, String lastName, String phoneNumber, String dob) {
    Map<String, String> personalData = Map.of("firstName", firstName, "lastName", lastName, "phoneNumber", phoneNumber, "dob", dob);

    ImportMigrationTaskRequest importMigrationTaskRequest = new ImportMigrationTaskRequest()
            .withMigrationTaskName(firstName + "_" + lastName)
            .withProgressUpdateStream(firstName + "_" + lastName + "_Stream")
            .withResourceAttributeList(new ResourceAttribute().withType("PersonalData")
                    .withValue(personalData.toString()));

    client.importMigrationTask(importMigrationTaskRequest);
}
}
