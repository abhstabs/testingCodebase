

    package ai.privado.test.aliyun;

    import com.aliyun.appmallsservice.Appmallsservice;

    public class AppmallsserviceTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            Appmallsservice appmallsservice = new Appmallsservice();
            appmallsservice.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    