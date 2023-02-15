

    package ai.privado.test.aliyun;

    import com.aliyun.objectdet.ObjectDetectionService;

    public class ObjectDetectionServiceTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            ObjectDetectionService objectDetectionService = new ObjectDetectionService();
            objectDetectionService.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    