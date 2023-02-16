
package ai.privado.test.microsoft;

import com.azure.ai.speech.Speech;

public class SpeechTest {
    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Doe";
        String phoneNumber = "1234567890";
        String DOB = "01/01/2000";

        Speech speech = new Speech();
        speech.sendPersonalData(firstName, lastName, phoneNumber, DOB);
    }
}
