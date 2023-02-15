

    package ai.privado.test.aliyun;

    import com.aliyun.cv.CloudVision;

    public class CloudVisionTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            CloudVision cloudVision = new CloudVision();
            cloudVision.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    