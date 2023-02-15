

    package ai.privado.test.oracle;

    import com.oracle.bmc.email.Email;

    public class EmailTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            Email email = new Email();
            email.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    