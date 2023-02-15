

    package ai.privado.test.gcp;

    import com.google.cloud.security.privateca.PrivateCertificateAuthority;

    public class PrivateCertificateAuthorityTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            PrivateCertificateAuthority privateCertificateAuthority = new PrivateCertificateAuthority();
            privateCertificateAuthority.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    