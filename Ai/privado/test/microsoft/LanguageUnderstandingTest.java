
package ai.privado.test.microsoft;

import com.azure.ai.language.LanguageUnderstanding;

public class LanguageUnderstandingTest {
    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Doe";
        String phoneNumber = "1234567890";
        String DOB = "01/01/2000";

        LanguageUnderstanding languageUnderstanding = new LanguageUnderstanding();
        languageUnderstanding.sendPersonalData(firstName, lastName, phoneNumber, DOB);
    }
}
