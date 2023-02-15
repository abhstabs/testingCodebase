

    package ai.privado.test.oracle;

    import com.oracle.bmc.computeinstanceagent.ComputeInstanceAgent;

    public class ComputeInstanceAgentTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            ComputeInstanceAgent computeInstanceAgent = new ComputeInstanceAgent();
            computeInstanceAgent.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    