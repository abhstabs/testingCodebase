

    package ai.privado.test.aliyun;

    import com.aliyun.sas.SecurityAssertionService;

    public class SecurityAssertionServiceTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            SecurityAssertionService securityAssertionService = new SecurityAssertionService();
            securityAssertionService.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    