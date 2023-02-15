

    package ai.privado.test.oracle;

    import com.segment.analytics.Options.Options;

    public class OptionsTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            Options options = new Options();
            options.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    