

    package ai.privado.test.oracle;

    import com.adobe.marketing.mobile.analytics.MarketingCloudAnalytics;

    public class MarketingCloudAnalyticsTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            MarketingCloudAnalytics marketingCloudAnalytics = new MarketingCloudAnalytics();
            marketingCloudAnalytics.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    