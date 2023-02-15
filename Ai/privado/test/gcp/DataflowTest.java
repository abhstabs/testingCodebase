

    package ai.privado.test.gcp;

    import com.google.cloud.dataflow.Dataflow;

    public class DataflowTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            Dataflow dataflow = new Dataflow();
            dataflow.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    