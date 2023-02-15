
package ai.privado.test.microsoft;

import com.azure.security.keyvault.KeyVault;

public class KeyVaultTest {
    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Doe";
        String phoneNumber = "1234567890";
        String DOB = "01/01/2000";

        KeyVault keyVault = new KeyVault();
        keyVault.sendPersonalData(firstName, lastName, phoneNumber, DOB);
    }
}
