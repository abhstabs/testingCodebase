

    package ai.privado.test.gcp;

    import com.google.cloud.datalab.Datalab;

    public class DatalabTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            Datalab datalab = new Datalab();
            datalab.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    