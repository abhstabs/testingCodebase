

    package ai.privado.test.oracle;

    import com.oracle.bmc.functions.Functions;

    public class FunctionsTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            Functions functions = new Functions();
            functions.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    