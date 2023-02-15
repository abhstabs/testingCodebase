

    package ai.privado.test.gcp;

    import com.google.cloud.kms.KeyManagementService;

    public class KeyManagementServiceTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            KeyManagementService keyManagementService = new KeyManagementService();
            keyManagementService.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    