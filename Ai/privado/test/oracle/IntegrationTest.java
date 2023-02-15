

    package ai.privado.test.oracle;

    import com.oracle.bmc.integration.Integration;

    public class IntegrationTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            Integration integration = new Integration();
            integration.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    