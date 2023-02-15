

    package ai.privado.test.aliyun;

    import com.aliyun.cms.CloudMonitorService;

    public class CloudMonitorServiceTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            CloudMonitorService cloudMonitorService = new CloudMonitorService();
            cloudMonitorService.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    