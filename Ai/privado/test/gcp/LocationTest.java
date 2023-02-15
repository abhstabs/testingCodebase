

    package ai.privado.test.gcp;

    import com.google.android.gms.location.Location;

    public class LocationTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            Location location = new Location();
            location.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    