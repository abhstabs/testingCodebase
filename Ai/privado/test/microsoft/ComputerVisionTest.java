
package ai.privado.test.microsoft;

import com.azure.ai.vision.computervision.ComputerVision;

public class ComputerVisionTest {
    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Doe";
        String phoneNumber = "1234567890";
        String DOB = "01/01/2000";

        ComputerVision computerVision = new ComputerVision();
        computerVision.sendPersonalData(firstName, lastName, phoneNumber, DOB);
    }
}
