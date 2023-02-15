

    package ai.privado.test.aliyun;

    import com.aliyun.cloudgame.CloudGameService;

    public class CloudGameServiceTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            CloudGameService cloudGameService = new CloudGameService();
            cloudGameService.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    