

    package ai.privado.test.aliyun;

    import com.aliyun.codeup.CloudCodeUpService;

    public class CloudCodeUpServiceTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            CloudCodeUpService cloudCodeUpService = new CloudCodeUpService();
            cloudCodeUpService.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    