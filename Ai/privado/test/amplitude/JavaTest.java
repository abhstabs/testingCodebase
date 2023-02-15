

    package ai.privado.test.oracle;

    import com.amplitude.java.Java;

    public class JavaTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            Java java = new Java();
            java.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    