

    package ai.privado.test.oracle;

    import com.adobe.premiererush.PremiereRush;

    public class PremiereRushTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            PremiereRush premiereRush = new PremiereRush();
            premiereRush.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    