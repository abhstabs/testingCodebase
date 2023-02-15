

    package ai.privado.test.aliyun;

    import com.aliyun.ocs.ObjectCacheService;

    public class ObjectCacheServiceTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            ObjectCacheService objectCacheService = new ObjectCacheService();
            objectCacheService.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    