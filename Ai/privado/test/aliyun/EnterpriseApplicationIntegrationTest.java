

    package ai.privado.test.aliyun;

    import com.aliyun.eais.EnterpriseApplicationIntegration;

    public class EnterpriseApplicationIntegrationTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            EnterpriseApplicationIntegration enterpriseApplicationIntegration = new EnterpriseApplicationIntegration();
            enterpriseApplicationIntegration.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    