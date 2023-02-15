

    package ai.privado.test.gcp;

    import com.google.cloud.documentai.DocumentAI;

    public class DocumentAITest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            DocumentAI documentAI = new DocumentAI();
            documentAI.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    