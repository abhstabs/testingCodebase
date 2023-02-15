
package ai.privado.test.microsoft;

import com.azure.cognitiveservices.CognitiveServices;

public class CognitiveServicesTest {
    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Doe";
        String phoneNumber = "1234567890";
        String DOB = "01/01/2000";

        CognitiveServices cognitiveServices = new CognitiveServices();
        cognitiveServices.sendPersonalData(firstName, lastName, phoneNumber, DOB);
    }
}
