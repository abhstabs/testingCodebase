

    package ai.privado.test.oracle;

    import com.oracle.bmc.opensearch.Opensearch;

    public class OpensearchTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            Opensearch opensearch = new Opensearch();
            opensearch.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    