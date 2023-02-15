

    package ai.privado.test.gcp;

    import com.google.cloud.discoveryengine.DiscoveryEngine;

    public class DiscoveryEngineTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            DiscoveryEngine discoveryEngine = new DiscoveryEngine();
            discoveryEngine.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    