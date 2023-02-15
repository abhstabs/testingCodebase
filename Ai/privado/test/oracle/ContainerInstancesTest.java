

    package ai.privado.test.oracle;

    import com.oracle.bmc.containerinstances.ContainerInstances;

    public class ContainerInstancesTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            ContainerInstances containerInstances = new ContainerInstances();
            containerInstances.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    