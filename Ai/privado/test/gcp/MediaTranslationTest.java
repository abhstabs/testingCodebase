

    package ai.privado.test.gcp;

    import com.google.cloud.mediatranslation.MediaTranslation;

    public class MediaTranslationTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            MediaTranslation mediaTranslation = new MediaTranslation();
            mediaTranslation.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    