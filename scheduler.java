import com.amazonaws.services.scheduler.AmazonScheduler;
import com.amazonaws.services.scheduler.AmazonSchedulerClientBuilder;
import com.amazonaws.services.scheduler.model.Event;
import com.amazonaws.services.scheduler.model.PutEventsRequest;
import java.util.Map;

public class AWSSchedulerUtil {

    private AmazonScheduler client;

    public AWSSchedulerUtil() {
        client = AmazonSchedulerClientBuilder.standard().build();
    }

    public void AWSSchedulerFirstNameFlow(String firstName, String lastName, String phoneNumber, String dob) {
        Map<String, String> personalData = Map.of("firstName", firstName, "lastName", lastName, "phoneNumber", phoneNumber, "dob", dob);

        PutEventsRequest putEventsRequest = new PutEventsRequest()
                .withEntries(new Event().withDetail(personalData.toString()));

        client.putEvents(putEventsRequest);
    }
}

