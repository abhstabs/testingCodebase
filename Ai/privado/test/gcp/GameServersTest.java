

    package ai.privado.test.gcp;

    import com.google.cloud.gaming.GameServers;

    public class GameServersTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            GameServers gameServers = new GameServers();
            gameServers.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    