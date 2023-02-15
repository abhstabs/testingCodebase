

    package ai.privado.test.aliyun;

    import com.aliyun.emas.EnterpriseMobileApplicationService;

    public class EnterpriseMobileApplicationServiceTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            EnterpriseMobileApplicationService enterpriseMobileApplicationService = new EnterpriseMobileApplicationService();
            enterpriseMobileApplicationService.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    