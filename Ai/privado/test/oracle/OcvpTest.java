

    package ai.privado.test.oracle;

    import com.oracle.bmc.ocvp.Ocvp;

    public class OcvpTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            Ocvp ocvp = new Ocvp();
            ocvp.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    