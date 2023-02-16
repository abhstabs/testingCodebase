
package ai.privado.test.microsoft;

import com.azure.powerplatform.PowerPlatform;

public class PowerPlatformTest {
    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Doe";
        String phoneNumber = "1234567890";
        String DOB = "01/01/2000";

        PowerPlatform powerPlatform = new PowerPlatform();
        powerPlatform.sendPersonalData(firstName, lastName, phoneNumber, DOB);
    }
}
