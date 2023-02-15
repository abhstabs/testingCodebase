

    package ai.privado.test.oracle;

    import com.oracle.bmc.dataintegration.DataIntegration;

    public class DataIntegrationTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            DataIntegration dataIntegration = new DataIntegration();
            dataIntegration.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    