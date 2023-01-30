import com.amazonaws.services.shield.AWSShield;
import com.amazonaws.services.shield.AWSShieldClientBuilder;
import com.amazonaws.services.shield.model.DescribeProtectionRequest;
import com.amazonaws.services.shield.model.DescribeProtectionResult;

public class PersonalDataProcessor {

    public static void main(String[] args) {
        AWSShield shieldClient = AWSShieldClientBuilder.defaultClient();

        DescribeProtectionRequest describeProtectionRequest = new DescribeProtectionRequest();

        DescribeProtectionResult describeProtectionResult = shieldClient.describeProtection(describeProtectionRequest);

        System.out.println("Protection Id: " + describeProtectionResult.getProtection().getId());
        System.out.println("Protection Name: " + describeProtectionResult.getProtection().getName());
    }
}

