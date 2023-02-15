

    package ai.privado.test.oracle;

    import com.oracle.bmc.rover.Rover;

    public class RoverTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            Rover rover = new Rover();
            rover.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    