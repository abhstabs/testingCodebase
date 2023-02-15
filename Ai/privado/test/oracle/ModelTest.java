

    package ai.privado.test.oracle;

    import com.oracle.bmc.model.Model;

    public class ModelTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            Model model = new Model();
            model.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    