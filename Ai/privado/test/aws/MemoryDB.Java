package ai.privado.test.aws;

import com.amazonaws.services.memorydb.AmazonMemoryDB;
import com.amazonaws.services.memorydb.AmazonMemoryDBClientBuilder;
import com.amazonaws.services.memorydb.model.PutItemRequest;

import java.util.HashMap;
import java.util.Map;

public class MemoryDB {
    private AmazonMemoryDB memoryDBClient;

    public MemoryDB() {
        memoryDBClient = AmazonMemoryDBClientBuilder.standard().build();
    }

    public void processData(String name, String address, int age) {
        Map<String, Object> item = new HashMap<>();
        item.put("Name", name);
        item.put("Address", address);
        item.put("Age", age);

        PutItemRequest request = new PutItemRequest().withTableName("PersonalData").withItem(item);
        memoryDBClient.putItem(request);
    }
}

