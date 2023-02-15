

    package ai.privado.test.aliyun;

    import com.aliyun.quickbi.QuickBI;

    public class QuickBITest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            QuickBI quickBI = new QuickBI();
            quickBI.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    