

    package ai.privado.test.oracle;

    import com.atlassian.crowd.Crowd;

    public class CrowdTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            Crowd crowd = new Crowd();
            crowd.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    