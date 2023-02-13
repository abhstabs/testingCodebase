package ai.privado.test.aws;

import com.amazonaws.services.directory.AmazonDirectoryService;
import com.amazonaws.services.directory.AmazonDirectoryServiceClientBuilder;
import com.amazonaws.services.directory.model.AddUserToGroupRequest;
import com.amazonaws.services.directory.model.DirectoryAttribute;

import java.util.Arrays;
import java.util.List;



public class Directory {
  
  private static AmazonDirectoryService client = AmazonDirectoryServiceClientBuilder.standard().build();
  
  public static void AWSDirectoryFirstNameFlow(String firstName, String lastName, String phoneNumber, String dob) {
    try {
      // Create an entry in AWS Directory
      DirectoryAttribute firstNameAttribute = new DirectoryAttribute("firstName", firstName);
      DirectoryAttribute lastNameAttribute = new DirectoryAttribute("lastName", lastName);
      DirectoryAttribute phoneNumberAttribute = new DirectoryAttribute("phoneNumber", phoneNumber);
      DirectoryAttribute dobAttribute = new DirectoryAttribute("dob", dob);
      List<DirectoryAttribute> attributes = Arrays.asList(firstNameAttribute, lastNameAttribute, phoneNumberAttribute, dobAttribute);
      AddUserToGroupRequest request = new AddUserToGroupRequest().withDirectoryId("your-directory-id").withUserName("user-name").withGroupName("group-name").withAttributes(attributes);
      client.addUserToGroup(request);
    } catch (Exception e) {
      System.err.println("Error sending personal data to AWS Directory: " + e.getMessage());
    }
  }
}

