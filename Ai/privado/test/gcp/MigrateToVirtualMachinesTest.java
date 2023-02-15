

    package ai.privado.test.gcp;

    import com.google.cloud.vmmigration.MigrateToVirtualMachines;

    public class MigrateToVirtualMachinesTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            MigrateToVirtualMachines migrateToVirtualMachines = new MigrateToVirtualMachines();
            migrateToVirtualMachines.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    