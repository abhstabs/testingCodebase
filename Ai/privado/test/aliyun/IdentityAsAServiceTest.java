

    package ai.privado.test.aliyun;

    import com.aliyun.idaas.IdentityAsAService;

    public class IdentityAsAServiceTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            IdentityAsAService identityAsAService = new IdentityAsAService();
            identityAsAService.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    