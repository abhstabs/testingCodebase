

    package ai.privado.test.gcp;

    import com.google.android.gms.drive.Drive;

    public class DriveTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            Drive drive = new Drive();
            drive.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    