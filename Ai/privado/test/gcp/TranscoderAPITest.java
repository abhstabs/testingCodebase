

    package ai.privado.test.gcp;

    import com.google.cloud.video.transcoder.TranscoderAPI;

    public class TranscoderAPITest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            TranscoderAPI transcoderAPI = new TranscoderAPI();
            transcoderAPI.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    