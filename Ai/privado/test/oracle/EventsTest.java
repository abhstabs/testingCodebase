

    package ai.privado.test.oracle;

    import com.oracle.bmc.events.Events;

    public class EventsTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            Events events = new Events();
            events.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    