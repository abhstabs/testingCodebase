
package ai.privado.test.microsoft;

import com.azure.datafactory.DataFactory;

public class DataFactoryTest {
    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Doe";
        String phoneNumber = "1234567890";
        String DOB = "01/01/2000";

        DataFactory dataFactory = new DataFactory();
        dataFactory.sendPersonalData(firstName, lastName, phoneNumber, DOB);
    }
}
