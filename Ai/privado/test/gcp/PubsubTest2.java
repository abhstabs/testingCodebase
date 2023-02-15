

    package ai.privado.test.gcp;

    import com.google.api.client.Pubsub;

    public class PubsubTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            Pubsub pubsub = new Pubsub();
            pubsub.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    