

    package ai.privado.test.gcp;

    import com.google.cloud.os.OS;

    public class OSTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            OS oS = new OS();
            oS.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    