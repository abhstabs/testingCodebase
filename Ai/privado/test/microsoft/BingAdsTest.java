
package ai.privado.test.microsoft;

import com.microsoft.bingads.BingAds;

public class BingAdsTest {
    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Doe";
        String phoneNumber = "1234567890";
        String DOB = "01/01/2000";

        BingAds bingAds = new BingAds();
        bingAds.sendPersonalData(firstName, lastName, phoneNumber, DOB);
    }
}
