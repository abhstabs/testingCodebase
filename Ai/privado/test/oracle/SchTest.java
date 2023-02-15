

    package ai.privado.test.oracle;

    import com.oracle.bmc.sch.Sch;

    public class SchTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            Sch sch = new Sch();
            sch.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    