

    package ai.privado.test.gcp;

    import com.google.cloud.video.stitcher.VideoStitcher;

    public class VideoStitcherTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            VideoStitcher videoStitcher = new VideoStitcher();
            videoStitcher.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    