

    package ai.privado.test.gcp;

    import com.google.cloud.securitycenter.SecurityCommandCenter;

    public class SecurityCommandCenterTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            SecurityCommandCenter securityCommandCenter = new SecurityCommandCenter();
            securityCommandCenter.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    