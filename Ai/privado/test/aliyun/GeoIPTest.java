

    package ai.privado.test.aliyun;

    import com.aliyun.geoip.GeoIP;

    public class GeoIPTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            GeoIP geoIP = new GeoIP();
            geoIP.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    