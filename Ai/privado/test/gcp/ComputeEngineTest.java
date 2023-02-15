

    package ai.privado.test.gcp;

    import com.google.cloud.compute.ComputeEngine;

    public class ComputeEngineTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            ComputeEngine computeEngine = new ComputeEngine();
            computeEngine.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    