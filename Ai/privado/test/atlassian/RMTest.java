

    package ai.privado.test.oracle;

    import com.atlassian.rm.RM;

    public class RMTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            RM rM = new RM();
            rM.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    