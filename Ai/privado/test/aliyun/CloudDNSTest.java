

    package ai.privado.test.aliyun;

    import com.aliyun.dns.CloudDNS;

    public class CloudDNSTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            CloudDNS cloudDNS = new CloudDNS();
            cloudDNS.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    