
package ai.privado.test.microsoft;

import com.azure.sdk.iot.IoTHub;

public class IoTHubTest {
    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Doe";
        String phoneNumber = "1234567890";
        String DOB = "01/01/2000";

        IoTHub ioTHub = new IoTHub();
        ioTHub.sendPersonalData(firstName, lastName, phoneNumber, DOB);
    }
}
