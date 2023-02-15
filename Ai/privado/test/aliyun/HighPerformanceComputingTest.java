

    package ai.privado.test.aliyun;

    import com.aliyun.hpc.HighPerformanceComputing;

    public class HighPerformanceComputingTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            HighPerformanceComputing highPerformanceComputing = new HighPerformanceComputing();
            highPerformanceComputing.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    