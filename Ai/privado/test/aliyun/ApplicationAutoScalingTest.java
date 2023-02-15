

    package ai.privado.test.aliyun;

    import com.aliyun.ahas.apenapi.ApplicationAutoScaling;

    public class ApplicationAutoScalingTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            ApplicationAutoScaling applicationAutoScaling = new ApplicationAutoScaling();
            applicationAutoScaling.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    