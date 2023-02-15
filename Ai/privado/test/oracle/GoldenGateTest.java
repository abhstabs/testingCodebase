

    package ai.privado.test.oracle;

    import com.oracle.bmc.goldengate.GoldenGate;

    public class GoldenGateTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            GoldenGate goldenGate = new GoldenGate();
            goldenGate.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    