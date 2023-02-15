

    package ai.privado.test.oracle;

    import com.oracle.bmc.vnmonitoring.VnMonitoring;

    public class VnMonitoringTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            VnMonitoring vnMonitoring = new VnMonitoring();
            vnMonitoring.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    