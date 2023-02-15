

    package ai.privado.test.aliyun;

    import com.aliyun.afs.AntiFraudService;

    public class AntiFraudServiceTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            AntiFraudService antiFraudService = new AntiFraudService();
            antiFraudService.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    