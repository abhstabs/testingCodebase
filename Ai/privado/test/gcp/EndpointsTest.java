

    package ai.privado.test.gcp;

    import com.google.cloud.endpoints.Endpoints;

    public class EndpointsTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            Endpoints endpoints = new Endpoints();
            endpoints.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    