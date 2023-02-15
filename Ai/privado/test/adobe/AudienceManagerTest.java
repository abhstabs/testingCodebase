

    package ai.privado.test.oracle;

    import com.adobe.marketing.mobile.audiencemanager.AudienceManager;

    public class AudienceManagerTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            AudienceManager audienceManager = new AudienceManager();
            audienceManager.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    