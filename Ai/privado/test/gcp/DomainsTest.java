

    package ai.privado.test.gcp;

    import com.google.cloud.domains.Domains;

    public class DomainsTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            Domains domains = new Domains();
            domains.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    