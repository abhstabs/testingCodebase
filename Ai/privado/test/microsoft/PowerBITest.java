
package ai.privado.test.microsoft;

import com.azure.powerbi.PowerBI;

public class PowerBITest {
    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Doe";
        String phoneNumber = "1234567890";
        String DOB = "01/01/2000";

        PowerBI powerBI = new PowerBI();
        powerBI.sendPersonalData(firstName, lastName, phoneNumber, DOB);
    }
}
