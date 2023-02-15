
package ai.privado.test.microsoft;

import com.microsoft.azure.sdk.iot.deps.IoT;

public class IoTTest {
    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Doe";
        String phoneNumber = "1234567890";
        String DOB = "01/01/2000";

        IoT ioT = new IoT();
        ioT.sendPersonalData(firstName, lastName, phoneNumber, DOB);
    }
}
