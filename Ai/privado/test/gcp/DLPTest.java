

    package ai.privado.test.gcp;

    import com.google.privacy.dlp.DLP;

    public class DLPTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            DLP dLP = new DLP();
            dLP.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    