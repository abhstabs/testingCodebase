

    package ai.privado.test.oracle;

    import com.oracle.bmc.helper.Helper;

    public class HelperTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            Helper helper = new Helper();
            helper.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    