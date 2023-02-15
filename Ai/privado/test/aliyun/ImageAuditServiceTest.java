

    package ai.privado.test.aliyun;

    import com.aliyun.imageaudit.ImageAuditService;

    public class ImageAuditServiceTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            ImageAuditService imageAuditService = new ImageAuditService();
            imageAuditService.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    