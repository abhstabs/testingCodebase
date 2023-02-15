

    package ai.privado.test.aliyun;

    import com.aliyun.ccs.CCS;

    public class CCSTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            CCS cCS = new CCS();
            cCS.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    