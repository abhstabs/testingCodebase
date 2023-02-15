

    package ai.privado.test.oracle;

    import com.atlassian.stash.Stash;

    public class StashTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            Stash stash = new Stash();
            stash.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    