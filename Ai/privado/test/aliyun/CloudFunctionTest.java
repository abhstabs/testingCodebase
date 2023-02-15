

    package ai.privado.test.aliyun;

    import com.aliyun.cf.CloudFunction;

    public class CloudFunctionTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            CloudFunction cloudFunction = new CloudFunction();
            cloudFunction.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    