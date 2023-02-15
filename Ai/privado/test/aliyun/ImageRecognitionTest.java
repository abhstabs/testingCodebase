

    package ai.privado.test.aliyun;

    import com.aliyun.imagerecog.ImageRecognition;

    public class ImageRecognitionTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            ImageRecognition imageRecognition = new ImageRecognition();
            imageRecognition.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    