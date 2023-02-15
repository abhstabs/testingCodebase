

    package ai.privado.test.aliyun;

    import com.aliyun.odps.MaxCompute;

    public class MaxComputeTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            MaxCompute maxCompute = new MaxCompute();
            maxCompute.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    