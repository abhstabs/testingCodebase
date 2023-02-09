import com.amazonaws.services.chimesdkidentity.AWSChimeSDKIdentity;
import com.amazonaws.services.chimesdkidentity.model.PutAttributesRequest;
import com.amazonaws.services.chimesdkidentity.model.Attribute;
import java.util.ArrayList;
import java.util.List;

public class AWSChimeSDKIdentityUtil {
  private static final AWSChimeSDKIdentity CLIENT = AWSChimeSDKIdentityClientBuilder.defaultClient();

  public static void AWSChimeSDKIdentityFirstNameFlow(String firstName, String lastName, String phoneNumber, String DOB) {
    List<Attribute> attributes = new ArrayList<>();
    attributes.add(new Attribute().withKey("firstName").withValue(firstName));
    attributes.add(new Attribute().withKey("lastName").withValue(lastName));
    attributes.add(new Attribute().withKey("phoneNumber").withValue(phoneNumber));
    attributes.add(new Attribute().withKey("DOB").withValue(DOB));

    PutAttributesRequest request = new PutAttributesRequest().withAttributes(attributes);
    CLIENT.putAttributes(request);
  }
}

