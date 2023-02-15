

    package ai.privado.test.aliyun;

    import com.aliyun.itaas.IntelligentTestingAsAService;

    public class IntelligentTestingAsAServiceTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            IntelligentTestingAsAService intelligentTestingAsAService = new IntelligentTestingAsAService();
            intelligentTestingAsAService.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    