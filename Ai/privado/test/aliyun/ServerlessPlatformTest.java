

    package ai.privado.test.aliyun;

    import com.aliyun.mpserverless.ServerlessPlatform;

    public class ServerlessPlatformTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            ServerlessPlatform serverlessPlatform = new ServerlessPlatform();
            serverlessPlatform.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    