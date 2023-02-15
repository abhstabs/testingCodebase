

    package ai.privado.test.oracle;

    import com.oracle.bmc.apigateway.Apigateway;

    public class ApigatewayTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            Apigateway apigateway = new Apigateway();
            apigateway.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    