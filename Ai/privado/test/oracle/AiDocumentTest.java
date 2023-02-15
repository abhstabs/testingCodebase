

    package ai.privado.test.oracle;

    import com.oracle.bmc.aidocument.AiDocument;

    public class AiDocumentTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            AiDocument aiDocument = new AiDocument();
            aiDocument.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    