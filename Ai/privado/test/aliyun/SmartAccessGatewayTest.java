

    package ai.privado.test.aliyun;

    import com.aliyun.smartag.SmartAccessGateway;

    public class SmartAccessGatewayTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            SmartAccessGateway smartAccessGateway = new SmartAccessGateway();
            smartAccessGateway.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    