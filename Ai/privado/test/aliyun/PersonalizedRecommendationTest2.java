

    package ai.privado.test.aliyun;

    import com.aliyun.pr.PersonalizedRecommendation;

    public class PersonalizedRecommendationTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            PersonalizedRecommendation personalizedRecommendation = new PersonalizedRecommendation();
            personalizedRecommendation.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    