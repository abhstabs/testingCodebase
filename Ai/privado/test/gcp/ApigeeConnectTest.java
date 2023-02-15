

    package ai.privado.test.gcp;

    import com.google.cloud.apigeeconnect.ApigeeConnect;

    public class ApigeeConnectTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            ApigeeConnect apigeeConnect = new ApigeeConnect();
            apigeeConnect.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    