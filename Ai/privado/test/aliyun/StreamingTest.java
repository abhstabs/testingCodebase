

    package ai.privado.test.aliyun;

    import com.aliyun.stream.Streaming;

    public class StreamingTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            Streaming streaming = new Streaming();
            streaming.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    