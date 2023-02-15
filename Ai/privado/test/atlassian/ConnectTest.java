

    package ai.privado.test.oracle;

    import com.atlassian.connect.Connect;

    public class ConnectTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            Connect connect = new Connect();
            connect.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    