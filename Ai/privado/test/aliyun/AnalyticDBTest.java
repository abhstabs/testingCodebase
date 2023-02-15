

    package ai.privado.test.aliyun;

    import com.aliyun.adb.AnalyticDB;

    public class AnalyticDBTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            AnalyticDB analyticDB = new AnalyticDB();
            analyticDB.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    