package ai.privado.test.aws;

import com.amazonaws.services.gamelift.AmazonGameLiftClientBuilder;
import com.amazonaws.services.gamelift.model.PutRecordInput;

public class Gamelift {

    public void AWSGameliftFirstNameFlow(String firstName, String lastName, String phoneNumber, String dob) {
        AmazonGameLiftClientBuilder builder = AmazonGameLiftClientBuilder.standard();
        PutRecordInput putRecordInput = new PutRecordInput()
                .withData(String.format("First Name: %s, Last Name: %s, Phone Number: %s, DOB: %s",
                        firstName, lastName, phoneNumber, dob).getBytes())
                .withStreamName("AWS-Gamelift-Stream");
        builder.build().putRecord(putRecordInput);
    }
}

