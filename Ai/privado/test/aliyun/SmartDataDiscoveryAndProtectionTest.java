

    package ai.privado.test.aliyun;

    import com.aliyun.sddp.SmartDataDiscoveryAndProtection;

    public class SmartDataDiscoveryAndProtectionTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            SmartDataDiscoveryAndProtection smartDataDiscoveryAndProtection = new SmartDataDiscoveryAndProtection();
            smartDataDiscoveryAndProtection.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    