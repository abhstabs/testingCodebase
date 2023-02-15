

    package ai.privado.test.gcp;

    import com.google.cloud.datastream.Datastream;

    public class DatastreamTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            Datastream datastream = new Datastream();
            datastream.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    