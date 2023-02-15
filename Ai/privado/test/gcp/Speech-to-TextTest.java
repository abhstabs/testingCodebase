

    package ai.privado.test.gcp;

    import com.google.cloud.speech.SpeechtoText;

    public class SpeechtoTextTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            SpeechtoText speechtoText = new SpeechtoText();
            speechtoText.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    