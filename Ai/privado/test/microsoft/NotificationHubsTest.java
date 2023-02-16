
package ai.privado.test.microsoft;

import com.azure.notificationhubs.NotificationHubs;

public class NotificationHubsTest {
    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Doe";
        String phoneNumber = "1234567890";
        String DOB = "01/01/2000";

        NotificationHubs notificationHubs = new NotificationHubs();
        notificationHubs.sendPersonalData(firstName, lastName, phoneNumber, DOB);
    }
}
