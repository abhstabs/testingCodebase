

    package ai.privado.test.gcp;

    import com.google.cloud.datastore.Datastore;

    public class DatastoreTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            Datastore datastore = new Datastore();
            datastore.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    