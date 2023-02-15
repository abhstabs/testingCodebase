

    package ai.privado.test.aliyun;

    import com.aliyun.nlp.NaturalLanguageProcessing;

    public class NaturalLanguageProcessingTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            NaturalLanguageProcessing naturalLanguageProcessing = new NaturalLanguageProcessing();
            naturalLanguageProcessing.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    