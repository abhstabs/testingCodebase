import com.amazonaws.services.applicationcostprofiler.AWSApplicationCostProfiler;
import com.amazonaws.services.applicationcostprofiler.AWSApplicationCostProfilerClientBuilder;
import com.amazonaws.services.applicationcostprofiler.model.PutCostProfileDataRequest;
import com.amazonaws.services.applicationcostprofiler.model.PutCostProfileDataResult;

public class PersonalDataProcessor {
    private final AWSApplicationCostProfiler costProfilerClient;

    public PersonalDataProcessor() {
        costProfilerClient = AWSApplicationCostProfilerClientBuilder.defaultClient();
    }

    public void processData(PersonalData personalData) {
        try {
            PutCostProfileDataRequest putCostProfileDataRequest = new PutCostProfileDataRequest()
                .withCostProfileArn(personalData.getCostProfileArn())
                .withProfileData(personalData.toString());

            PutCostProfileDataResult putCostProfileDataResult = costProfilerClient.putCostProfileData(putCostProfileDataRequest);
            System.out.println("Successfully sent personal data to Amazon Application Cost Profiler");
        } catch (Exception e) {
            System.err.println("Error processing personal data: " + e.getMessage());
        }
    }
}

class PersonalData {
    private final String costProfileArn;
    private final String name;
    private final int age;

    public PersonalData(String costProfileArn, String name, int age) {
        this.costProfileArn = costProfileArn;
        this.name = name;
        this.age = age;
    }

    public String getCostProfileArn() {
        return costProfileArn;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("{costProfileArn: %s, name: %s, age: %d}", costProfileArn, name, age);
    }
}

