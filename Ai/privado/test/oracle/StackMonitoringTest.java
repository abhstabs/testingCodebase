

    package ai.privado.test.oracle;

    import com.oracle.bmc.stackmonitoring.StackMonitoring;

    public class StackMonitoringTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            StackMonitoring stackMonitoring = new StackMonitoring();
            stackMonitoring.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    