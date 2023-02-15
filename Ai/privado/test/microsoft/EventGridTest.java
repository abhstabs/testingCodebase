
package ai.privado.test.microsoft;

import com.azure.eventgrid.EventGrid;

public class EventGridTest {
    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Doe";
        String phoneNumber = "1234567890";
        String DOB = "01/01/2000";

        EventGrid eventGrid = new EventGrid();
        eventGrid.sendPersonalData(firstName, lastName, phoneNumber, DOB);
    }
}
