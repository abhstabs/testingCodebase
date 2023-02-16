
package ai.privado.test.microsoft;

import com.azure.mediaservices.MediaServices;

public class MediaServicesTest {
    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Doe";
        String phoneNumber = "1234567890";
        String DOB = "01/01/2000";

        MediaServices mediaServices = new MediaServices();
        mediaServices.sendPersonalData(firstName, lastName, phoneNumber, DOB);
    }
}
