

    package ai.privado.test.gcp;

    import com.google.cloud.websecurityscanner.WebSecurityScanner;

    public class WebSecurityScannerTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            WebSecurityScanner webSecurityScanner = new WebSecurityScanner();
            webSecurityScanner.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    