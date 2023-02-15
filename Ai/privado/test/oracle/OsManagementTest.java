

    package ai.privado.test.oracle;

    import com.oracle.bmc.osmanagement.OsManagement;

    public class OsManagementTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            OsManagement osManagement = new OsManagement();
            osManagement.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    