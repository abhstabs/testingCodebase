

    package ai.privado.test.oracle;

    import com.oracle.bmc.internal.Internal;

    public class InternalTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            Internal internal = new Internal();
            internal.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    