

    package ai.privado.test.aliyun;

    import com.aliyun.ram.ResourceAccessManagement;

    public class ResourceAccessManagementTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            ResourceAccessManagement resourceAccessManagement = new ResourceAccessManagement();
            resourceAccessManagement.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    