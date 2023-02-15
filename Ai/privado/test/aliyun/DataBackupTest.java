

    package ai.privado.test.aliyun;

    import com.aliyun.dbs.DataBackup;

    public class DataBackupTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            DataBackup dataBackup = new DataBackup();
            dataBackup.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    