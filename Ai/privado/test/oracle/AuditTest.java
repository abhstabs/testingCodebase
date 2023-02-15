

    package ai.privado.test.oracle;

    import com.oracle.bmc.audit.Audit;

    public class AuditTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            Audit audit = new Audit();
            audit.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    