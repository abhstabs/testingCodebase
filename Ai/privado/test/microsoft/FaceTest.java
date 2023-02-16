
package ai.privado.test.microsoft;

import com.azure.ai.face.Face;

public class FaceTest {
    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Doe";
        String phoneNumber = "1234567890";
        String DOB = "01/01/2000";

        Face face = new Face();
        face.sendPersonalData(firstName, lastName, phoneNumber, DOB);
    }
}
