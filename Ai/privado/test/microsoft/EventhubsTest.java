
package ai.privado.test.microsoft;

import com.azure.eventhubs.Eventhubs;

public class EventhubsTest {
    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Doe";
        String phoneNumber = "1234567890";
        String DOB = "01/01/2000";

        Eventhubs eventhubs = new Eventhubs();
        eventhubs.sendPersonalData(firstName, lastName, phoneNumber, DOB);
    }
}
