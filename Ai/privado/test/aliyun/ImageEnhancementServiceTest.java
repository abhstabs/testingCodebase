

    package ai.privado.test.aliyun;

    import com.aliyun.imageenhan.ImageEnhancementService;

    public class ImageEnhancementServiceTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            ImageEnhancementService imageEnhancementService = new ImageEnhancementService();
            imageEnhancementService.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    