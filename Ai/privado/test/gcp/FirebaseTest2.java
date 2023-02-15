

    package ai.privado.test.gcp;

    import com.google.android.gms.measurement.Firebase;

    public class FirebaseTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            Firebase firebase = new Firebase();
            firebase.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    