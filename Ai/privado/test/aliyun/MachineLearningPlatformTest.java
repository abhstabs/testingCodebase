

    package ai.privado.test.aliyun;

    import com.aliyun.pai.MachineLearningPlatform;

    public class MachineLearningPlatformTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            MachineLearningPlatform machineLearningPlatform = new MachineLearningPlatform();
            machineLearningPlatform.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    