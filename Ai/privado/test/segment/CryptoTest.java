

    package ai.privado.test.oracle;

    import com.segment.analytics.Crypto.Crypto;

    public class CryptoTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            Crypto crypto = new Crypto();
            crypto.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    