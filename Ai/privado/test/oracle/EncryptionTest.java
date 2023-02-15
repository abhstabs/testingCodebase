

    package ai.privado.test.oracle;

    import com.oracle.bmc.encryption.Encryption;

    public class EncryptionTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            Encryption encryption = new Encryption();
            encryption.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    