

    package ai.privado.test.oracle;

    import com.oracle.bmc.loganalytics.LogAnalytics;

    public class LogAnalyticsTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            LogAnalytics logAnalytics = new LogAnalytics();
            logAnalytics.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    