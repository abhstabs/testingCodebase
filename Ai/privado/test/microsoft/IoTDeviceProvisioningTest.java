
package ai.privado.test.microsoft;

import com.microsoft.azure.sdk.iot.provisioning.IoTDeviceProvisioning;

public class IoTDeviceProvisioningTest {
    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Doe";
        String phoneNumber = "1234567890";
        String DOB = "01/01/2000";

        IoTDeviceProvisioning ioTDeviceProvisioning = new IoTDeviceProvisioning();
        ioTDeviceProvisioning.sendPersonalData(firstName, lastName, phoneNumber, DOB);
    }
}
