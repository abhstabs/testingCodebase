

    package ai.privado.test.gcp;

    import com.google.cloud.recommender.Recommender;

    public class RecommenderTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            Recommender recommender = new Recommender();
            recommender.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    