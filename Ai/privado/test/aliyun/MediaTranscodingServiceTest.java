

    package ai.privado.test.aliyun;

    import com.aliyun.mts.MediaTranscodingService;

    public class MediaTranscodingServiceTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            MediaTranscodingService mediaTranscodingService = new MediaTranscodingService();
            mediaTranscodingService.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    