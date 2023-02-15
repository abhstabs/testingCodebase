
package ai.privado.test.microsoft;

import com.azure.dynamics.Dynamics365;

public class Dynamics365Test {
    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Doe";
        String phoneNumber = "1234567890";
        String DOB = "01/01/2000";

        Dynamics365 dynamics365 = new Dynamics365();
        dynamics365.sendPersonalData(firstName, lastName, phoneNumber, DOB);
    }
}
