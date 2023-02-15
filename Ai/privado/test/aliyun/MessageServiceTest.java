

    package ai.privado.test.aliyun;

    import com.aliyun.mns.MessageService;

    public class MessageServiceTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            MessageService messageService = new MessageService();
            messageService.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    