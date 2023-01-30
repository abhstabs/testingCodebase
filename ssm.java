import com.amazonaws.services.ssm.model.CreateIncidentRequest;
import com.amazonaws.services.ssm.model.CreateIncidentResult;
import com.amazonaws.services.ssm.AWSSimpleSystemsManagement;
import com.amazonaws.services.ssm.AWSSimpleSystemsManagementClientBuilder;

public class PersonalDataProcessor {
    private final AWSSimpleSystemsManagement ssmClient;

    public PersonalDataProcessor() {
        ssmClient = AWSSimpleSystemsManagementClientBuilder.defaultClient();
    }

    public void processData(PersonalData personalData) {
        try {
            CreateIncidentRequest incidentRequest = new CreateIncidentRequest()
                .withTitle(String.format("Personal Data Incident - %s", personalData.getName()))
                .withDescription(personalData.toString());

            CreateIncidentResult incidentResult = ssmClient.createIncident(incidentRequest);
            System.out.println(String.format("Successfully created incident with id %s", incidentResult.getIncidentId()));
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

