
package ai.privado.test.microsoft;

import com.microsoft.azure.network.Network;

public class NetworkTest {
    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Doe";
        String phoneNumber = "1234567890";
        String DOB = "01/01/2000";

        Network network = new Network();
        network.sendPersonalData(firstName, lastName, phoneNumber, DOB);
    }
}
