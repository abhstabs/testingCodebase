

    package ai.privado.test.oracle;

    import com.oracle.bmc.waas.Waas;

    public class WaasTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            Waas waas = new Waas();
            waas.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    