

    package ai.privado.test.oracle;

    import com.oracle.bmc.database.Database;

    public class DatabaseTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            Database database = new Database();
            database.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    