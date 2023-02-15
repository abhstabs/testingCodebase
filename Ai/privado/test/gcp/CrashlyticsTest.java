

    package ai.privado.test.gcp;

    import com.crashlytics.Crashlytics;

    public class CrashlyticsTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            Crashlytics crashlytics = new Crashlytics();
            crashlytics.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    