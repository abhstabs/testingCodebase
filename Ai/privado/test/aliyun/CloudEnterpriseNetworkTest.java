

    package ai.privado.test.aliyun;

    import com.aliyun.cbn.CloudEnterpriseNetwork;

    public class CloudEnterpriseNetworkTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            CloudEnterpriseNetwork cloudEnterpriseNetwork = new CloudEnterpriseNetwork();
            cloudEnterpriseNetwork.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    