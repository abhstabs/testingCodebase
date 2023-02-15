

    package ai.privado.test.aliyun;

    import com.aliyun.tts.CloudTextToSpeech;

    public class CloudTextToSpeechTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            CloudTextToSpeech cloudTextToSpeech = new CloudTextToSpeech();
            cloudTextToSpeech.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    