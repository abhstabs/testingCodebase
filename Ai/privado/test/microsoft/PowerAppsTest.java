
package ai.privado.test.microsoft;

import com.azure.powerapps.PowerApps;

public class PowerAppsTest {
    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Doe";
        String phoneNumber = "1234567890";
        String DOB = "01/01/2000";

        PowerApps powerApps = new PowerApps();
        powerApps.sendPersonalData(firstName, lastName, phoneNumber, DOB);
    }
}
