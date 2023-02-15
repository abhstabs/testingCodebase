

    package ai.privado.test.aliyun;

    import com.aliyun.retailcloud.RetailCloud;

    public class RetailCloudTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            RetailCloud retailCloud = new RetailCloud();
            retailCloud.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    