
package ai.privado.test.microsoft;

import com.microsoft.azure.appservice.AppService;

public class AppServiceTest {
    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Doe";
        String phoneNumber = "1234567890";
        String DOB = "01/01/2000";

        AppService appService = new AppService();
        appService.sendPersonalData(firstName, lastName, phoneNumber, DOB);
    }
}
