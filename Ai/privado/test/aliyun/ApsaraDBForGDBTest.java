

    package ai.privado.test.aliyun;

    import com.aliyun.gdb.ApsaraDBForGDB;

    public class ApsaraDBForGDBTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            ApsaraDBForGDB apsaraDBForGDB = new ApsaraDBForGDB();
            apsaraDBForGDB.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    