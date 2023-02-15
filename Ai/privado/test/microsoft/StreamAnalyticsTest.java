
package ai.privado.test.microsoft;

import com.azure.streamanalytics.StreamAnalytics;

public class StreamAnalyticsTest {
    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Doe";
        String phoneNumber = "1234567890";
        String DOB = "01/01/2000";

        StreamAnalytics streamAnalytics = new StreamAnalytics();
        streamAnalytics.sendPersonalData(firstName, lastName, phoneNumber, DOB);
    }
}
