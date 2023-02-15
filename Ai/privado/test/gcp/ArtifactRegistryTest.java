

    package ai.privado.test.gcp;

    import com.google.devtools.artifactregistry.ArtifactRegistry;

    public class ArtifactRegistryTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            ArtifactRegistry artifactRegistry = new ArtifactRegistry();
            artifactRegistry.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    