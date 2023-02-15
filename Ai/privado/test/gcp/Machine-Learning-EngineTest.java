

    package ai.privado.test.gcp;

    import com.google.cloud.mlengine.MachineLearningEngine;

    public class MachineLearningEngineTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            MachineLearningEngine machineLearningEngine = new MachineLearningEngine();
            machineLearningEngine.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    