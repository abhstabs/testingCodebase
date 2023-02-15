

    package ai.privado.test.oracle;

    import com.oracle.bmc.analytics.Analytics;

    public class AnalyticsTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            Analytics analytics = new Analytics();
            analytics.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    