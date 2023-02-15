

    package ai.privado.test.aliyun;

    import com.aliyun.cdn.CloudCDN;

    public class CloudCDNTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            CloudCDN cloudCDN = new CloudCDN();
            cloudCDN.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    