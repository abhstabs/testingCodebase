

    package ai.privado.test.aliyun;

    import com.aliyun.cds.CloudDataService;

    public class CloudDataServiceTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            CloudDataService cloudDataService = new CloudDataService();
            cloudDataService.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    