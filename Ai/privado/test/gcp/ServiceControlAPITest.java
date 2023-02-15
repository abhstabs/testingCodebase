

    package ai.privado.test.gcp;

    import com.google.cloud.servicecontrol.ServiceControlAPI;

    public class ServiceControlAPITest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            ServiceControlAPI serviceControlAPI = new ServiceControlAPI();
            serviceControlAPI.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    