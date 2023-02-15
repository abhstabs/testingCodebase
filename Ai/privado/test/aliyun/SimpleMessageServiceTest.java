

    package ai.privado.test.aliyun;

    import com.aliyun.smc.SimpleMessageService;

    public class SimpleMessageServiceTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            SimpleMessageService simpleMessageService = new SimpleMessageService();
            simpleMessageService.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    