

    package ai.privado.test.aliyun;

    import com.aliyun.cloudmarketing.CloudMarketing;

    public class CloudMarketingTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            CloudMarketing cloudMarketing = new CloudMarketing();
            cloudMarketing.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    