

    package ai.privado.test.oracle;

    import com.oracle.bmc.certificates.Certificates;

    public class CertificatesTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            Certificates certificates = new Certificates();
            certificates.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    