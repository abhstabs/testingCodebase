

    package ai.privado.test.gcp;

    import com.google.cloud.dialogflow.Dialogflow;

    public class DialogflowTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            Dialogflow dialogflow = new Dialogflow();
            dialogflow.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    