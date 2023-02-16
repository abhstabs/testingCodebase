
package ai.privado.test.microsoft;

import com.azure.communication.CommunicationServices;

public class CommunicationServicesTest {
    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Doe";
        String phoneNumber = "1234567890";
        String DOB = "01/01/2000";

        CommunicationServices communicationServices = new CommunicationServices();
        communicationServices.sendPersonalData(firstName, lastName, phoneNumber, DOB);
    }
}
