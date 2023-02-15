

    package ai.privado.test.aliyun;

    import com.aliyun.oms.OpenMessagingService;

    public class OpenMessagingServiceTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            OpenMessagingService openMessagingService = new OpenMessagingService();
            openMessagingService.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    