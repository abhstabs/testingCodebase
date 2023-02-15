

    package ai.privado.test.gcp;

    import com.google.cloud.automl.AutoML;

    public class AutoMLTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            AutoML autoML = new AutoML();
            autoML.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    