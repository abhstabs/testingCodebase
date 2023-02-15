
package ai.privado.test.microsoft;

import com.azure.data.lake.analytics.DataLakeAnalytics;

public class DataLakeAnalyticsTest {
    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Doe";
        String phoneNumber = "1234567890";
        String DOB = "01/01/2000";

        DataLakeAnalytics dataLakeAnalytics = new DataLakeAnalytics();
        dataLakeAnalytics.sendPersonalData(firstName, lastName, phoneNumber, DOB);
    }
}
