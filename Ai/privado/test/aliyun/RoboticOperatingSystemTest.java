

    package ai.privado.test.aliyun;

    import com.aliyun.ros.RoboticOperatingSystem;

    public class RoboticOperatingSystemTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            RoboticOperatingSystem roboticOperatingSystem = new RoboticOperatingSystem();
            roboticOperatingSystem.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    