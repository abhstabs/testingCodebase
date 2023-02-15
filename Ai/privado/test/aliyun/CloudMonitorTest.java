

    package ai.privado.test.aliyun;

    import com.aliyun.monitor.CloudMonitor;

    public class CloudMonitorTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            CloudMonitor cloudMonitor = new CloudMonitor();
            cloudMonitor.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    