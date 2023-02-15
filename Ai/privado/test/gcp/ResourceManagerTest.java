

    package ai.privado.test.gcp;

    import com.google.cloud.resourcemanager.ResourceManager;

    public class ResourceManagerTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            ResourceManager resourceManager = new ResourceManager();
            resourceManager.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    