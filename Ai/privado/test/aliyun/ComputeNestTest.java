

    package ai.privado.test.aliyun;

    import com.aliyun.computenest.ComputeNest;

    public class ComputeNestTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            ComputeNest computeNest = new ComputeNest();
            computeNest.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    