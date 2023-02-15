

    package ai.privado.test.aliyun;

    import com.aliyun.pcr.PersonalizedContentRecommendation;

    public class PersonalizedContentRecommendationTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            PersonalizedContentRecommendation personalizedContentRecommendation = new PersonalizedContentRecommendation();
            personalizedContentRecommendation.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    