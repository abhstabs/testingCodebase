

    package ai.privado.test.aliyun;

    import com.aliyun.das.DataAnalytics;

    public class DataAnalyticsTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            DataAnalytics dataAnalytics = new DataAnalytics();
            dataAnalytics.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    