

    package ai.privado.test.oracle;

    import com.segment.analytics.WebhookIntegration.WebhookIntegration;

    public class WebhookIntegrationTest {
        public static void main(String[] args) {
            String firstName = "John";
            String lastName = "Doe";
            String phoneNumber = "1234567890";
            String DOB = "01/01/2000";

            WebhookIntegration webhookIntegration = new WebhookIntegration();
            webhookIntegration.sendPersonalData(firstName, lastName, phoneNumber, DOB);
        }
    }
    