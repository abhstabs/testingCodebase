

    package ai.privado.test.aliyun;

    import com.aliyun.oss.ObjectStorageService;

    public class ObjectStorageServiceTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            ObjectStorageService objectStorageService = new ObjectStorageService();
            objectStorageService.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    