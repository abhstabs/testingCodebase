

    package ai.privado.test.oracle;

    import com.oracle.bmc.cloudguard.CloudGuard;

    public class CloudGuardTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            CloudGuard cloudGuard = new CloudGuard();
            cloudGuard.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    