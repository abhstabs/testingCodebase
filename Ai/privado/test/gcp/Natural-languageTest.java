

    package ai.privado.test.gcp;

    import com.google.cloud.language.Naturallanguage;

    public class NaturallanguageTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            Naturallanguage naturallanguage = new Naturallanguage();
            naturallanguage.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    