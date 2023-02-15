

    package ai.privado.test.oracle;

    import com.oracle.bmc.oce.Oce;

    public class OceTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            Oce oce = new Oce();
            oce.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    