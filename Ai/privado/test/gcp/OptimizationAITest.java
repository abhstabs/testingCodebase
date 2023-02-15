

    package ai.privado.test.gcp;

    import com.google.cloud.optimization.OptimizationAI;

    public class OptimizationAITest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            OptimizationAI optimizationAI = new OptimizationAI();
            optimizationAI.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    