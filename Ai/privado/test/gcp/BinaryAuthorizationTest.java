

    package ai.privado.test.gcp;

    import com.google.cloud.binaryauthorization.BinaryAuthorization;

    public class BinaryAuthorizationTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            BinaryAuthorization binaryAuthorization = new BinaryAuthorization();
            binaryAuthorization.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    