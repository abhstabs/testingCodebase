

    package ai.privado.test.aliyun;

    import com.aliyun.stt.CloudSpeechToText;

    public class CloudSpeechToTextTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            CloudSpeechToText cloudSpeechToText = new CloudSpeechToText();
            cloudSpeechToText.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    