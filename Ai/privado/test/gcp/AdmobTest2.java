

    package ai.privado.test.gcp;

    import com.google.android.gms.ads.Admob;

    public class AdmobTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            Admob admob = new Admob();
            admob.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    