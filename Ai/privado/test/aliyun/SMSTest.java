

    package ai.privado.test.aliyun;

    import com.aliyun.dysmsapi.SMS;

    public class SMSTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            SMS sMS = new SMS();
            sMS.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    