

    package ai.privado.test.gcp;

    import com.google.cloud.deploy.Deploy;

    public class DeployTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            Deploy deploy = new Deploy();
            deploy.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    