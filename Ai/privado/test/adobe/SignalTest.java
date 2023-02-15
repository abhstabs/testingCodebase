

    package ai.privado.test.oracle;

    import com.adobe.marketing.mobile.signal.Signal;

    public class SignalTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            Signal signal = new Signal();
            signal.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    