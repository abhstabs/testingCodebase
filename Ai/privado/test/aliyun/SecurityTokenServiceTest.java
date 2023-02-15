

    package ai.privado.test.aliyun;

    import com.aliyun.sts.SecurityTokenService;

    public class SecurityTokenServiceTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            SecurityTokenService securityTokenService = new SecurityTokenService();
            securityTokenService.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    