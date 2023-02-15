

    package ai.privado.test.gcp;

    import com.google.cloud.ids.IDS;

    public class IDSTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            IDS iDS = new IDS();
            iDS.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    