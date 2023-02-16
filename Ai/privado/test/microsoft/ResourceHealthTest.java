
package ai.privado.test.microsoft;

import com.microsoft.azure.resourcehealth.ResourceHealth;

public class ResourceHealthTest {
    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Doe";
        String phoneNumber = "1234567890";
        String DOB = "01/01/2000";

        ResourceHealth resourceHealth = new ResourceHealth();
        resourceHealth.sendPersonalData(firstName, lastName, phoneNumber, DOB);
    }
}
