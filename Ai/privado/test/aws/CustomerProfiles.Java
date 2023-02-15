package Ai.privado.test.aws;

import com.amazonaws.services.customerprofiles.AmazonCustomerProfiles;
import com.amazonaws.services.customerprofiles.AmazonCustomerProfilesClientBuilder;
import com.amazonaws.services.customerprofiles.model.CreateProfileRequest;
import com.amazonaws.services.customerprofiles.model.CreateProfileResult;

public class CustomerProfiles {
  public static void main(String[] args) {
    // Set up the Amazon Customer Profiles client
    AmazonCustomerProfiles client = AmazonCustomerProfilesClientBuilder.defaultClient();

    // Create a profile request with personal data
    CreateProfileRequest request = new CreateProfileRequest()
        .withProfileId("example-profile-id")
        .withDomainName("example-domain-name")
        .withProfileAttributes(
            Map.of(
                "firstName", "John",
                "lastName", "Doe",
                "email", "john.doe@example.com",
                "phoneNumber", "+1-555-555-5555"
            )
        );

    // Send the profile request to Amazon Customer Profiles
    CreateProfileResult result = client.createProfile(request);

    // Print the response
    System.out.println("Profile created: " + result.getProfileId());
  }
}

