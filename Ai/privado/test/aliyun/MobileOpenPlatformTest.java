

    package ai.privado.test.aliyun;

    import com.aliyun.mopen.MobileOpenPlatform;

    public class MobileOpenPlatformTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            MobileOpenPlatform mobileOpenPlatform = new MobileOpenPlatform();
            mobileOpenPlatform.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    