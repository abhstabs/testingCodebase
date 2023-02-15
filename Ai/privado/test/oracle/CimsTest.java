

    package ai.privado.test.oracle;

    import com.oracle.bmc.cims.Cims;

    public class CimsTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            Cims cims = new Cims();
            cims.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    