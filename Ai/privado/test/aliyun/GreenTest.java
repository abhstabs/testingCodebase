

    package ai.privado.test.aliyun;

    import com.aliyun.aligreen.Green;

    public class GreenTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            Green green = new Green();
            green.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    