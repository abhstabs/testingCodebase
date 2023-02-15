

    package ai.privado.test.gcp;

    import com.google.cloud.retail.RetailAPI;

    public class RetailAPITest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            RetailAPI retailAPI = new RetailAPI();
            retailAPI.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    