
package ai.privado.test.microsoft;

import com.microsoft.azure.spatialanchors.SpatialAnchors;

public class SpatialAnchorsTest {
    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Doe";
        String phoneNumber = "1234567890";
        String DOB = "01/01/2000";

        SpatialAnchors spatialAnchors = new SpatialAnchors();
        spatialAnchors.sendPersonalData(firstName, lastName, phoneNumber, DOB);
    }
}
