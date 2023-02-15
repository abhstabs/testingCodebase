

    package ai.privado.test.oracle;

    import com.rudderstack.android.amplitude.Rudderstack;

    public class RudderstackTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            Rudderstack rudderstack = new Rudderstack();
            rudderstack.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    