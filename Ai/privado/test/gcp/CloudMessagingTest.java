

    package ai.privado.test.gcp;

    import com.google.android.gms.cloudmessaging.CloudMessaging;

    public class CloudMessagingTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            CloudMessaging cloudMessaging = new CloudMessaging();
            cloudMessaging.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    