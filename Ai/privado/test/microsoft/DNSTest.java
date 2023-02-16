
package ai.privado.test.microsoft;

import com.microsoft.azure.dns.DNS;

public class DNSTest {
    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Doe";
        String phoneNumber = "1234567890";
        String DOB = "01/01/2000";

        DNS dNS = new DNS();
        dNS.sendPersonalData(firstName, lastName, phoneNumber, DOB);
    }
}
