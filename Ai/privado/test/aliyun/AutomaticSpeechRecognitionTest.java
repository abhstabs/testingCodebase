

    package ai.privado.test.aliyun;

    import com.aliyun.asr.AutomaticSpeechRecognition;

    public class AutomaticSpeechRecognitionTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            AutomaticSpeechRecognition automaticSpeechRecognition = new AutomaticSpeechRecognition();
            automaticSpeechRecognition.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    