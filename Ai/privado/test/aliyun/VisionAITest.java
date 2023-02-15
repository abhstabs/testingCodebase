

    package ai.privado.test.aliyun;

    import com.aliyun.visionai.VisionAI;

    public class VisionAITest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            VisionAI visionAI = new VisionAI();
            visionAI.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    