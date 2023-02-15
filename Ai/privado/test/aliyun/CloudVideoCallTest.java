

    package ai.privado.test.aliyun;

    import com.aliyun.aliyuncvc.CloudVideoCall;

    public class CloudVideoCallTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            CloudVideoCall cloudVideoCall = new CloudVideoCall();
            cloudVideoCall.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    