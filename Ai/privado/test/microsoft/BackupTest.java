
package ai.privado.test.microsoft;

import com.microsoft.azure.recoveryservices.backup.Backup;

public class BackupTest {
    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Doe";
        String phoneNumber = "1234567890";
        String DOB = "01/01/2000";

        Backup backup = new Backup();
        backup.sendPersonalData(firstName, lastName, phoneNumber, DOB);
    }
}
