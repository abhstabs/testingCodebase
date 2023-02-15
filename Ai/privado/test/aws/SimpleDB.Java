package Ai.privado.test.aws;

import com.amazonaws.services.simpledb.AmazonSimpleDB;
import com.amazonaws.services.simpledb.AmazonSimpleDBClientBuilder;
import com.amazonaws.services.simpledb.model.PutAttributesRequest;
import com.amazonaws.services.simpledb.model.ReplaceableAttribute;

import java.util.Arrays;

public class SimpleDB {

    public static void main(String[] args) {
        AmazonSimpleDB simpleDB = AmazonSimpleDBClientBuilder.defaultClient();

        ReplaceableAttribute attribute1 = new ReplaceableAttribute("name", "value", true);
        ReplaceableAttribute attribute2 = new ReplaceableAttribute("age", "25", true);

        PutAttributesRequest request = new PutAttributesRequest("mydomain", "itemName", Arrays.asList(attribute1, attribute2));

        simpleDB.putAttributes(request);

        System.out.println("Attributes added to SimpleDB successfully.");
    }
}

