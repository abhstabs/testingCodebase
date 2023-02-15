
package ai.privado.test.microsoft;

import com.microsoft.azure.sdk.iot.provisioning.security.IoTProvisioningSecurity;

public class IoTProvisioningSecurityTest {
    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Doe";
        String phoneNumber = "1234567890";
        String DOB = "01/01/2000";

        IoTProvisioningSecurity ioTProvisioningSecurity = new IoTProvisioningSecurity();
        ioTProvisioningSecurity.sendPersonalData(firstName, lastName, phoneNumber, DOB);
    }
}
