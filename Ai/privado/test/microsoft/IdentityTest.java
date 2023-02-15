
package ai.privado.test.microsoft;

import com.azure.identity.Identity;

public class IdentityTest {
    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Doe";
        String phoneNumber = "1234567890";
        String DOB = "01/01/2000";

        Identity identity = new Identity();
        identity.sendPersonalData(firstName, lastName, phoneNumber, DOB);
    }
}
