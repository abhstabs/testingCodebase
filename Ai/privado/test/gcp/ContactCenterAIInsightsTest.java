

    package ai.privado.test.gcp;

    import com.google.cloud.contactcenterinsights.ContactCenterAIInsights;

    public class ContactCenterAIInsightsTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            ContactCenterAIInsights contactCenterAIInsights = new ContactCenterAIInsights();
            contactCenterAIInsights.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    