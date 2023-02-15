
package ai.privado.test.microsoft;

import com.azure.ai.personalizer.Personalizer;

public class PersonalizerTest {
    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Doe";
        String phoneNumber = "1234567890";
        String DOB = "01/01/2000";

        Personalizer personalizer = new Personalizer();
        personalizer.sendPersonalData(firstName, lastName, phoneNumber, DOB);
    }
}
