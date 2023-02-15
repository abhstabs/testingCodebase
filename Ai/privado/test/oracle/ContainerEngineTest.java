

    package ai.privado.test.oracle;

    import com.oracle.bmc.containerengine.ContainerEngine;

    public class ContainerEngineTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            ContainerEngine containerEngine = new ContainerEngine();
            containerEngine.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    