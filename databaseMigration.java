import com.amazonaws.services.databasemigrationservice.AmazonDatabaseMigrationService;
import com.amazonaws.services.databasemigrationservice.model.CreateReplicationTaskRequest;
import com.amazonaws.services.databasemigrationservice.model.ResourceAttribute;
import java.util.Map;

public class AWSDatabaseMigrationServiceUtil {

private AmazonDatabaseMigrationService client;

public AWSDatabaseMigrationServiceUtil() {
    client = AmazonDatabaseMigrationServiceClientBuilder.standard().build();
}

public void AWSDatabaseMigrationServiceProcessPersonalData(String firstName, String lastName, String phoneNumber, String dob) {
    Map<String, String> personalData = Map.of("firstName", firstName, "lastName", lastName, "phoneNumber", phoneNumber, "dob", dob);

    CreateReplicationTaskRequest createReplicationTaskRequest = new CreateReplicationTaskRequest()
            .withReplicationTaskIdentifier(firstName + "_" + lastName + "_Task")
            .withSourceEndpointArn("arn:aws:dms:us-west-2:012345678901:endpoint:ASXWXYZWEXAMPLE")
            .withTargetEndpointArn("arn:aws:dms:us-west-2:012345678901:endpoint:AKXWXYZWEXAMPLE")
            .withReplicationInstanceArn("arn:aws:dms:us-west-2:012345678901:rep:6UTDJGB043EXAMPLE")
            .withMigrationType("full-load")
            .withTableMappings("{\"rules\":[{\"rule-type\":\"selection\",\"rule-id\":\"1\",\"rule-name\":\"1\",\"object-locator\":{\"schema-name\":\"personal_data\",\"table-name\":\"" + firstName + "_" + lastName + "\"},\"rule-action\":\"include\",\"filters\":{}}]}")
            .withReplicationTaskSettings("{\"TargetMetadata\":{\"TargetSchema\":\"\",\"SupportLobs\":true,\"FullLobMode\":false,\"LobChunkSize\":64,\"LimitedSizeLobMode\":true,\"LobMaxSize\":32},\"FullLoadSettings\":{\"FullLoadEnabled\":true,\"ApplyChangesEnabled\":false,\"TargetTablePrepareOptions\":\"DROP_AND_CREATE\",\"CreatePkAfterFullLoad\":false,\"StopTaskCachedChangesApplied\":false,\"StopTaskCachedChangesNotApplied\":false,\"ResumeEnabled\":false,\"RangeLinearityFactor\":null},\"Logging\":{\"EnableLogging\":false}}")
            .withResourceAttributeList(new ResourceAttribute().withType("PersonalData")
                    .withValue(personalData.toString()));

    client.createReplicationTask(createReplicationTaskRequest);
}
}
