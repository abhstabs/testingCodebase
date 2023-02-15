

    package ai.privado.test.aliyun;

    import com.aliyun.xtrace.XTrace;

    public class XTraceTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            XTrace xTrace = new XTrace();
            xTrace.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    