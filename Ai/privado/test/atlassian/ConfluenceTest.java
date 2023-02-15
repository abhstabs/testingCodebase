

    package ai.privado.test.oracle;

    import com.atlassian.confluence.Confluence;

    public class ConfluenceTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            Confluence confluence = new Confluence();
            confluence.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    