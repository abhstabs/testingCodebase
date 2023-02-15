

    package ai.privado.test.aliyun;

    import com.aliyun.tts.TextToSpeech;

    public class TextToSpeechTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            TextToSpeech textToSpeech = new TextToSpeech();
            textToSpeech.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    