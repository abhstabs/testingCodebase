import com.amazonaws.services.devopsguru.model.Event;
import com.amazonaws.services.devopsguru.model.PutEventRequest;
import com.amazonaws.services.devopsguru.DevOpsGuruClient;

public class AWSDevopsGuruUtil {
    
    public static void AWSDevOpsGuruFirstNameFlow(String firstName, String lastName, String phoneNumber, String DOB) {
        DevOpsGuruClient devOpsGuruClient = DevOpsGuruClient.builder().build();
        Event event = new Event();
        event.setName("PersonalDataEvent");
        event.addDetail("FirstName", firstName);
        event.addDetail("LastName", lastName);
        event.addDetail("PhoneNumber", phoneNumber);
        event.addDetail("DOB", DOB);
        PutEventRequest request = new PutEventRequest().withEvent(event);
        devOpsGuruClient.putEvent(request);
    }
}

