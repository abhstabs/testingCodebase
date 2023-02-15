

    package ai.privado.test.aliyun;

    import com.aliyun.oam.OpenAPIManagement;

    public class OpenAPIManagementTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            OpenAPIManagement openAPIManagement = new OpenAPIManagement();
            openAPIManagement.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    