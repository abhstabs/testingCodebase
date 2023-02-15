

    package ai.privado.test.aliyun;

    import com.aliyun.ocr.OpticalCharacterRecognition;

    public class OpticalCharacterRecognitionTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            OpticalCharacterRecognition opticalCharacterRecognition = new OpticalCharacterRecognition();
            opticalCharacterRecognition.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    