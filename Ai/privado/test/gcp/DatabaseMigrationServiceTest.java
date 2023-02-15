

    package ai.privado.test.gcp;

    import com.google.cloud.clouddms.DatabaseMigrationService;

    public class DatabaseMigrationServiceTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            DatabaseMigrationService databaseMigrationService = new DatabaseMigrationService();
            databaseMigrationService.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    