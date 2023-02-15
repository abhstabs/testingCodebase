

    package ai.privado.test.aliyun;

    import com.aliyun.paistudio.PAIStudioService;

    public class PAIStudioServiceTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            PAIStudioService pAIStudioService = new PAIStudioService();
            pAIStudioService.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    