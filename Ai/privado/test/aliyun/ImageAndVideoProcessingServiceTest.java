

    package ai.privado.test.aliyun;

    import com.aliyun.ivpd.ImageAndVideoProcessingService;

    public class ImageAndVideoProcessingServiceTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            ImageAndVideoProcessingService imageAndVideoProcessingService = new ImageAndVideoProcessingService();
            imageAndVideoProcessingService.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    