

    package ai.privado.test.aliyun;

    import com.aliyun.rdc.RapidDevelopmentConsole;

    public class RapidDevelopmentConsoleTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            RapidDevelopmentConsole rapidDevelopmentConsole = new RapidDevelopmentConsole();
            rapidDevelopmentConsole.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    