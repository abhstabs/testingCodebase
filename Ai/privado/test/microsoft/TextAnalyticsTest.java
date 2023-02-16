
package ai.privado.test.microsoft;

import com.azure.ai.textanalytics.TextAnalytics;

public class TextAnalyticsTest {
    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Doe";
        String phoneNumber = "1234567890";
        String DOB = "01/01/2000";

        TextAnalytics textAnalytics = new TextAnalytics();
        textAnalytics.sendPersonalData(firstName, lastName, phoneNumber, DOB);
    }
}
