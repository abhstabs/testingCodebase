

    package ai.privado.test.aliyun;

    import com.aliyun.cas.CloudBase;

    public class CloudBaseTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            CloudBase cloudBase = new CloudBase();
            cloudBase.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    