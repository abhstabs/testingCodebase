import com.amazonaws.services.clouddirectory.AmazonCloudDirectory;
import com.amazonaws.services.clouddirectory.AmazonCloudDirectoryClientBuilder;
import com.amazonaws.services.clouddirectory.model.CreateObjectRequest;
import com.amazonaws.services.clouddirectory.model.CreateObjectResult;
import com.amazonaws.services.clouddirectory.model.ObjectAttribute;
import com.amazonaws.services.clouddirectory.model.ObjectAttributeValue;
import com.amazonaws.services.clouddirectory.model.AmazonCloudDirectoryException;
import java.util.Arrays;

public class AWSCloudDirectoryUtil {

public static void AWSCloudDirectoryFirstNameFlow(String firstName, String lastName, String phoneNumber, String dob) {
AmazonCloudDirectory client = AmazonCloudDirectoryClientBuilder.standard().build();

scss
Copy code
try {
  CreateObjectRequest createObjectRequest = new CreateObjectRequest();
  createObjectRequest.setDirectoryArn("<DIRECTORY_ARN>");
  
  ObjectAttribute objectAttributeFirstName = new ObjectAttribute();
  objectAttributeFirstName.setKey("firstName");
  objectAttributeFirstName.setValue(new ObjectAttributeValue().withStringValue(firstName));
  
  ObjectAttribute objectAttributeLastName = new ObjectAttribute();
  objectAttributeLastName.setKey("lastName");
  objectAttributeLastName.setValue(new ObjectAttributeValue().withStringValue(lastName));
  
  ObjectAttribute objectAttributePhoneNumber = new ObjectAttribute();
  objectAttributePhoneNumber.setKey("phoneNumber");
  objectAttributePhoneNumber.setValue(new ObjectAttributeValue().withStringValue(phoneNumber));
  
  ObjectAttribute objectAttributeDOB = new ObjectAttribute();
  objectAttributeDOB.setKey("dob");
  objectAttributeDOB.setValue(new ObjectAttributeValue().withStringValue(dob));
  
  createObjectRequest.setObjectAttributeList(Arrays.asList(objectAttributeFirstName, objectAttributeLastName, objectAttributePhoneNumber, objectAttributeDOB));
  
  CreateObjectResult createObjectResult = client.createObject(createObjectRequest);
  System.out.println("Successfully sent personal data to AWS CloudDirectory, Object Identifier: " + createObjectResult.getObjectIdentifier());
} catch (AmazonCloudDirectoryException e) {
  System.err.println(e.getMessage());
}
}
}

