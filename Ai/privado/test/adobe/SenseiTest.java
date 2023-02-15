

    package ai.privado.test.oracle;

    import com.adobe.sensei.Sensei;

    public class SenseiTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            Sensei sensei = new Sensei();
            sensei.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    