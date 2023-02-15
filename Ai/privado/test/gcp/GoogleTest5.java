

    package ai.privado.test.gcp;

    import tagmanager.Google;

    public class GoogleTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            Google google = new Google();
            google.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    