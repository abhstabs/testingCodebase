

    package ai.privado.test.gcp;

    import com.google.android.gms.pay.Pay;

    public class PayTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            Pay pay = new Pay();
            pay.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    