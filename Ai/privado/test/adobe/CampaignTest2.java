

    package ai.privado.test.oracle;

    import com.adobe.campaign.Campaign;

    public class CampaignTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            Campaign campaign = new Campaign();
            campaign.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    