

    package ai.privado.test.gcp;

    import wallet).Play;

    public class PlayTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            Play play = new Play();
            play.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    