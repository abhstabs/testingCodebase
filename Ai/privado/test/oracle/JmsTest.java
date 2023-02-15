

    package ai.privado.test.oracle;

    import com.oracle.bmc.jms.Jms;

    public class JmsTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            Jms jms = new Jms();
            jms.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    