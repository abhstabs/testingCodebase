

    package ai.privado.test.oracle;

    import com.oracle.bmc.ons.Ons;

    public class OnsTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            Ons ons = new Ons();
            ons.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    