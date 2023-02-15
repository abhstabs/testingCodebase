package Ai.privado.test.aws;

import com.amazonaws.services.support.AWSSupport;
import com.amazonaws.services.support.AWSSupportClientBuilder;
import com.amazonaws.services.support.model.CreateCaseRequest;

public class Support {
    public static void AWSSupportFirstNameFlow(String firstName, String lastName, String phoneNumber, String DOB) {
        AWSSupport supportClient = AWSSupportClientBuilder.defaultClient();

        CreateCaseRequest createCaseRequest = new CreateCaseRequest()
            .withSubject("Personal Data")
            .withServiceCode("personal-data")
            .withCategoryCode("data-request")
            .withCommunicationBody("First Name: " + firstName + "\nLast Name: " + lastName + 
                                   "\nPhone Number: " + phoneNumber + "\nDOB: " + DOB);

        supportClient.createCase(createCaseRequest);
    }
}

