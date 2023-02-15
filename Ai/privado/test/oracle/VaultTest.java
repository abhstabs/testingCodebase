

    package ai.privado.test.oracle;

    import com.oracle.bmc.vault.Vault;

    public class VaultTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            Vault vault = new Vault();
            vault.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    