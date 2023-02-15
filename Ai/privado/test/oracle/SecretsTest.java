

    package ai.privado.test.oracle;

    import com.oracle.bmc.secrets.Secrets;

    public class SecretsTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            Secrets secrets = new Secrets();
            secrets.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    