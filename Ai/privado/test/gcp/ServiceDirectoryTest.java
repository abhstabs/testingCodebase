

    package ai.privado.test.gcp;

    import com.google.cloud.servicedirectory.ServiceDirectory;

    public class ServiceDirectoryTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            ServiceDirectory serviceDirectory = new ServiceDirectory();
            serviceDirectory.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    