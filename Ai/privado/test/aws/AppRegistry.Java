package Ai.privado.test.aws;

import com.amazonaws.services.appregistry.AWSAppRegistry;
import com.amazonaws.services.appregistry.AWSAppRegistryClientBuilder;
import com.amazonaws.services.appregistry.model.Attribute;
import com.amazonaws.services.appregistry.model.CreateAttributeGroupRequest;
import com.amazonaws.services.appregistry.model.CreateAttributeGroupResult;

import java.util.HashMap;
import java.util.Map;

public class AppRegistry {

    private final AWSAppRegistry appRegistryClient;

    public AppRegistry() {
        appRegistryClient = AWSAppRegistryClientBuilder.defaultClient();
    }

    public void processPersonalData(String firstName, String lastName, String email) {
        // Create a map to store the personal data attributes
        Map<String, String> personalDataMap = new HashMap<>();
        personalDataMap.put("first_name", firstName);
        personalDataMap.put("last_name", lastName);
        personalDataMap.put("email", email);

        // Create a list of attributes to store in the attribute group
        Map<String, Attribute> attributes = new HashMap<>();
        for (Map.Entry<String, String> entry : personalDataMap.entrySet()) {
            Attribute attribute = new Attribute();
            attribute.setName(entry.getKey());
            attribute.setType("STRING");
            attribute.setDescription("Personal data attribute: " + entry.getKey());
            attributes.put(entry.getKey(), attribute);
        }

        // Create the attribute group using the list of attributes
        CreateAttributeGroupRequest createAttributeGroupRequest = new CreateAttributeGroupRequest()
                .withAttributeGroupName("PersonalDataAttributeGroup")
                .withAttributes(attributes)
                .withDescription("Attribute group for storing personal data");
        CreateAttributeGroupResult createAttributeGroupResult = appRegistryClient
                .createAttributeGroup(createAttributeGroupRequest);

        System.out.println("Attribute group created with ARN: " + createAttributeGroupResult.getAttributeGroupArn());
    }

    public static void main(String[] args) {
        SecurityToken processor = new SecurityToken();
        processor.processPersonalData("John", "Doe", "johndoe@example.com");
    }
}

