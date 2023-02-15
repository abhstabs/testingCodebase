
package ai.privado.test.microsoft;

import com.microsoft.azure.policy.Policy;

public class PolicyTest {
    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Doe";
        String phoneNumber = "1234567890";
        String DOB = "01/01/2000";

        Policy policy = new Policy();
        policy.sendPersonalData(firstName, lastName, phoneNumber, DOB);
    }
}
