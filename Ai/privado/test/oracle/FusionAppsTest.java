

    package ai.privado.test.oracle;

    import com.oracle.bmc.fusionapps.FusionApps;

    public class FusionAppsTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            FusionApps fusionApps = new FusionApps();
            fusionApps.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    