

    package ai.privado.test.aliyun;

    import com.aliyun.nlu.NaturalLanguageUnderstanding;

    public class NaturalLanguageUnderstandingTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            NaturalLanguageUnderstanding naturalLanguageUnderstanding = new NaturalLanguageUnderstanding();
            naturalLanguageUnderstanding.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    