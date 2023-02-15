

    package ai.privado.test.gcp;

    import com.google.cloud.orchestration.airflow.service.Composer;

    public class ComposerTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            Composer composer = new Composer();
            composer.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    