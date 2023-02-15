

    package ai.privado.test.gcp;

    import com.google.cloud.video.livestream.LiveStream;

    public class LiveStreamTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            LiveStream liveStream = new LiveStream();
            liveStream.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    