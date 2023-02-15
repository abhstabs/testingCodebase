

    package ai.privado.test.aliyun;

    import com.aliyun.ons.OpenNotificationService;

    public class OpenNotificationServiceTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            OpenNotificationService openNotificationService = new OpenNotificationService();
            openNotificationService.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    