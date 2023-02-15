

    package ai.privado.test.oracle;

    import com.adobe.cq.social.Social;

    public class SocialTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            Social social = new Social();
            social.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    