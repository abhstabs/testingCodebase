

    package ai.privado.test.oracle;

    import com.oracle.bmc.ailanguage.AiLanguage;

    public class AiLanguageTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            AiLanguage aiLanguage = new AiLanguage();
            aiLanguage.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    