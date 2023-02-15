

    package ai.privado.test.gcp;

    import com.google.cloud.eventarc.Eventarc;

    public class EventarcTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            Eventarc eventarc = new Eventarc();
            eventarc.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    