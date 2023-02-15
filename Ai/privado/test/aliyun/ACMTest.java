

    package ai.privado.test.aliyun;

    import com.aliyun.acm.ACM;

    public class ACMTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            ACM aCM = new ACM();
            aCM.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    