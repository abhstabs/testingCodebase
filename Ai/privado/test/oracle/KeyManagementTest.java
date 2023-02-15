

    package ai.privado.test.oracle;

    import com.oracle.bmc.keymanagement.KeyManagement;

    public class KeyManagementTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            KeyManagement keyManagement = new KeyManagement();
            keyManagement.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    