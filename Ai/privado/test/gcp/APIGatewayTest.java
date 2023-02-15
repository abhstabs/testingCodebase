

    package ai.privado.test.gcp;

    import com.google.cloud.apigateway.APIGateway;

    public class APIGatewayTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            APIGateway aPIGateway = new APIGateway();
            aPIGateway.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    