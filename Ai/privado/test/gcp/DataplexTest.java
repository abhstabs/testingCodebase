

    package ai.privado.test.gcp;

    import com.google.cloud.dataplex.Dataplex;

    public class DataplexTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            Dataplex dataplex = new Dataplex();
            dataplex.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    