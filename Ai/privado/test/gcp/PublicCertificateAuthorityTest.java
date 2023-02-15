

    package ai.privado.test.gcp;

    import com.google.cloud.security.publicca.PublicCertificateAuthority;

    public class PublicCertificateAuthorityTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            PublicCertificateAuthority publicCertificateAuthority = new PublicCertificateAuthority();
            publicCertificateAuthority.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    