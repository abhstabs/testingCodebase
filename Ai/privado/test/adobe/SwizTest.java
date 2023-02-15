

    package ai.privado.test.oracle;

    import com.adobe.swiz.Swiz;

    public class SwizTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            Swiz swiz = new Swiz();
            swiz.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    