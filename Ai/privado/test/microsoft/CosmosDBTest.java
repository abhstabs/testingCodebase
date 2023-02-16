
package ai.privado.test.microsoft;

import com.azure.cosmos.CosmosDB;

public class CosmosDBTest {
    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Doe";
        String phoneNumber = "1234567890";
        String DOB = "01/01/2000";

        CosmosDB cosmosDB = new CosmosDB();
        cosmosDB.sendPersonalData(firstName, lastName, phoneNumber, DOB);
    }
}
