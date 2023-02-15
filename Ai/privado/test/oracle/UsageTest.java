

    package ai.privado.test.oracle;

    import com.oracle.bmc.usage.Usage;

    public class UsageTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            Usage usage = new Usage();
            usage.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    