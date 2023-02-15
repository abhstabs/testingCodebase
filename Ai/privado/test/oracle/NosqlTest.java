

    package ai.privado.test.oracle;

    import com.oracle.bmc.nosql.Nosql;

    public class NosqlTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            Nosql nosql = new Nosql();
            nosql.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    