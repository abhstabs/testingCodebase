

    package ai.privado.test.oracle;

    import com.oracle.bmc.aispeech.AiSpeech;

    public class AiSpeechTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            AiSpeech aiSpeech = new AiSpeech();
            aiSpeech.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    