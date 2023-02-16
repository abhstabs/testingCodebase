
package ai.privado.test.microsoft;

import com.microsoft.azure.applicationinsights.ApplicationInsights;

public class ApplicationInsightsTest {
    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Doe";
        String phoneNumber = "1234567890";
        String DOB = "01/01/2000";

        ApplicationInsights applicationInsights = new ApplicationInsights();
        applicationInsights.sendPersonalData(firstName, lastName, phoneNumber, DOB);
    }
}
