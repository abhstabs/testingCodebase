
package ai.privado.test.microsoft;

import com.microsoft.windowsazure.Windows;

public class WindowsTest {
    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Doe";
        String phoneNumber = "1234567890";
        String DOB = "01/01/2000";

        Windows windows = new Windows();
        windows.sendPersonalData(firstName, lastName, phoneNumber, DOB);
    }
}
