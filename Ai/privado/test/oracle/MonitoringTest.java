

    package ai.privado.test.oracle;

    import com.oracle.bmc.monitoring.Monitoring;

    public class MonitoringTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            Monitoring monitoring = new Monitoring();
            monitoring.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    