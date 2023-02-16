
package ai.privado.test.microsoft;

import com.microsoft.appcenter.AppCenter;

public class AppCenterTest {
    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Doe";
        String phoneNumber = "1234567890";
        String DOB = "01/01/2000";

        AppCenter appCenter = new AppCenter();
        appCenter.sendPersonalData(firstName, lastName, phoneNumber, DOB);
    }
}
