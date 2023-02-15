

    package ai.privado.test.aliyun;

    import com.aliyun.cloudauth.CloudAuthService;

    public class CloudAuthServiceTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            CloudAuthService cloudAuthService = new CloudAuthService();
            cloudAuthService.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    