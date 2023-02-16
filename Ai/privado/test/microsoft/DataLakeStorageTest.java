
package ai.privado.test.microsoft;

import com.azure.data.lake.store.DataLakeStorage;

public class DataLakeStorageTest {
    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Doe";
        String phoneNumber = "1234567890";
        String DOB = "01/01/2000";

        DataLakeStorage dataLakeStorage = new DataLakeStorage();
        dataLakeStorage.sendPersonalData(firstName, lastName, phoneNumber, DOB);
    }
}
