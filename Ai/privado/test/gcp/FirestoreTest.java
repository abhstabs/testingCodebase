

    package ai.privado.test.gcp;

    import com.google.cloud.firestore.Firestore;

    public class FirestoreTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            Firestore firestore = new Firestore();
            firestore.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    