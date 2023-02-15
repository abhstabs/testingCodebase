

    package ai.privado.test.aliyun;

    import com.aliyun.drds.DistributedRelationalDatabaseService;

    public class DistributedRelationalDatabaseServiceTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            DistributedRelationalDatabaseService distributedRelationalDatabaseService = new DistributedRelationalDatabaseService();
            distributedRelationalDatabaseService.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    