

    package ai.privado.test.oracle;

    import com.oracle.bmc.bastion.Bastion;

    public class BastionTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            Bastion bastion = new Bastion();
            bastion.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    