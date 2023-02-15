

    package ai.privado.test.aliyun;

    import com.aliyun.sls.SimpleLogService;

    public class SimpleLogServiceTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            SimpleLogService simpleLogService = new SimpleLogService();
            simpleLogService.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    