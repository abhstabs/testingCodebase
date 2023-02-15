

    package ai.privado.test.gcp;

    import com.google.cloud.trace.Trace;

    public class TraceTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            Trace trace = new Trace();
            trace.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    