

    package ai.privado.test.gcp;

    import com.google.cloud.batch.Batch;

    public class BatchTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            Batch batch = new Batch();
            batch.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    