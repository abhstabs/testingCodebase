

    package ai.privado.test.aliyun;

    import com.aliyun.dm.DirectMail;

    public class DirectMailTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            DirectMail directMail = new DirectMail();
            directMail.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    