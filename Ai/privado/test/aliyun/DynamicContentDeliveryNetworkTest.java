

    package ai.privado.test.aliyun;

    import com.aliyun.dcdn.DynamicContentDeliveryNetwork;

    public class DynamicContentDeliveryNetworkTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            DynamicContentDeliveryNetwork dynamicContentDeliveryNetwork = new DynamicContentDeliveryNetwork();
            dynamicContentDeliveryNetwork.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    