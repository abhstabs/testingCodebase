

    package ai.privado.test.aliyun;

    import com.aliyun.fc.FunctionCompute;

    public class FunctionComputeTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            FunctionCompute functionCompute = new FunctionCompute();
            functionCompute.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    