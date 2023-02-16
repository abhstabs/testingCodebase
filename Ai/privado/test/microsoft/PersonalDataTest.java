
package ai.privado.test.microsoft;

import com.azure.personalization.PersonalData;

public class PersonalDataTest {
    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Doe";
        String phoneNumber = "1234567890";
        String DOB = "01/01/2000";

        PersonalData personalData = new PersonalData();
        personalData.sendPersonalData(firstName, lastName, phoneNumber, DOB);
    }
}
