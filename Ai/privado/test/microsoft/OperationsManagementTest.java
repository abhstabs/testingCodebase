
package ai.privado.test.microsoft;

import com.microsoft.azure.operationsmanagement.OperationsManagement;

public class OperationsManagementTest {
    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Doe";
        String phoneNumber = "1234567890";
        String DOB = "01/01/2000";

        OperationsManagement operationsManagement = new OperationsManagement();
        operationsManagement.sendPersonalData(firstName, lastName, phoneNumber, DOB);
    }
}
