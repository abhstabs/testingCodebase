

    package ai.privado.test.aliyun;

    import com.aliyun.cloudapi.CloudAPI;

    public class CloudAPITest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            CloudAPI cloudAPI = new CloudAPI();
            cloudAPI.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    