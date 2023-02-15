

    package ai.privado.test.aliyun;

    import com.aliyun.dds.DatabaseService;

    public class DatabaseServiceTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            DatabaseService databaseService = new DatabaseService();
            databaseService.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    