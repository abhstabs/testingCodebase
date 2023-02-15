

    package ai.privado.test.oracle;

    import com.amplitude.experiment.Experiment;

    public class ExperimentTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            Experiment experiment = new Experiment();
            experiment.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    