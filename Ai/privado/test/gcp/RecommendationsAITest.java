

    package ai.privado.test.gcp;

    import com.google.cloud.recommendationengine.RecommendationsAI;

    public class RecommendationsAITest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            RecommendationsAI recommendationsAI = new RecommendationsAI();
            recommendationsAI.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    