
package ai.privado.test.microsoft;

import com.azure.ai.cognitiveservices.speech.CognitiveServicesSpeech;

public class CognitiveServicesSpeechTest {
    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Doe";
        String phoneNumber = "1234567890";
        String DOB = "01/01/2000";

        CognitiveServicesSpeech cognitiveServicesSpeech = new CognitiveServicesSpeech();
        cognitiveServicesSpeech.sendPersonalData(firstName, lastName, phoneNumber, DOB);
    }
}
