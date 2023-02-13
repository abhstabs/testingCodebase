package ai.privado.test.aws;

import com.amazonaws.services.simpleemail.AmazonSimpleEmailService;
import com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClientBuilder;
import com.amazonaws.services.simpleemail.model.SendEmailRequest;
import com.amazonaws.services.simpleemail.model.SendEmailResult;

public class SimpleEmailService {
    public static void main(String[] args) {
        // Set up the client
        AmazonSimpleEmailService client = AmazonSimpleEmailServiceClientBuilder.defaultClient();

        // Create the request
        SendEmailRequest request = new SendEmailRequest()
            .withDestination(
                // Set the recipient
                new Destination().withToAddresses("recipient@example.com"))
            .withMessage(
                // Set the email message
                new Message()
                    .withSubject(new Content().withData("Test email"))
                    .withBody(new Body().withText(new Content().withData("Hello, this is a test email."))))
            .withSource("sender@example.com"); // Set the sender

        // Send the email
        SendEmailResult result = client.sendEmail(request);

        // Print the result
        System.out.println("Email sent with ID: " + result.getMessageId());
    }
}

