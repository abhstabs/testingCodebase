

    package ai.privado.test.oracle;

    import com.oracle.bmc.artifacts.Artifacts;

    public class ArtifactsTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            Artifacts artifacts = new Artifacts();
            artifacts.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    