

    package ai.privado.test.oracle;

    import com.hashicorp.packer.Packer;

    public class PackerTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            Packer packer = new Packer();
            packer.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    