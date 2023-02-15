

    package ai.privado.test.oracle;

    import com.oracle.bmc.optimizer.Optimizer;

    public class OptimizerTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            Optimizer optimizer = new Optimizer();
            optimizer.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    