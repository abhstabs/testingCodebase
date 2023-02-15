

    package ai.privado.test.oracle;

    import com.adobe.robotlegs.Robotlegs;

    public class RobotlegsTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            Robotlegs robotlegs = new Robotlegs();
            robotlegs.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    