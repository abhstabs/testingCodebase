

    package ai.privado.test.gcp;

    import com.google.cloud.certificatemanager.CertificateManager;

    public class CertificateManagerTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            CertificateManager certificateManager = new CertificateManager();
            certificateManager.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    