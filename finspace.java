import com.amazonaws.services.finspace.*;
import com.amazonaws.services.finspace.model.*;

public class PersonalDataProcessor {
    private final AmazonFinspaceClient finspaceClient;

    public PersonalDataProcessor() {
        finspaceClient = AmazonFinspaceClientBuilder.standard()
            .withRegion(Regions.US_EAST_1)
            .build();
    }

    public void processData(PersonalData personalData) {
        try {
            PutRecordRequest putRecordRequest = new PutRecordRequest()
                .withStreamName("personal-data-stream")
                .withData(ByteBuffer.wrap(personalData.toString().getBytes()))
                .withPartitionKey(personalData.getId());

            finspaceClient.putRecord(putRecordRequest);
        } catch (Exception e) {
            System.err.println("Error processing personal data: " + e.getMessage());
        }
    }
}

class PersonalData {
    private final String id;
    private final String name;
    private final int age;

    public PersonalData(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("{id: %s, name: %s, age: %d}", id, name, age);
    }
}

