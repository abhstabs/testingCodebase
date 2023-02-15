package Ai.privado.test.aws;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.eventbridge.AmazonEventBridge;
import com.amazonaws.services.eventbridge.AmazonEventBridgeClientBuilder;
import com.amazonaws.services.eventbridge.model.PutEventsRequest;
import com.amazonaws.services.eventbridge.model.PutEventsResult;
import com.amazonaws.services.eventbridge.model.PutEventsResultEntry;

import java.util.ArrayList;
import java.util.List;

public class EventBridge {
    public static void main(String[] args) {
        // Replace with your access key and secret key
        AWSCredentials credentials = new BasicAWSCredentials("access_key", "secret_key");

        // Create an EventBridge client
        AmazonEventBridge client = AmazonEventBridgeClientBuilder
                .standard()
                .withCredentials(new AWSStaticCredentialsProvider(credentials))
                .build();

        // Create a new event to send to EventBridge
        com.amazonaws.services.eventbridge.model.Event event = new com.amazonaws.services.eventbridge.model.Event()
                .withDetailType("example-detail-type")
                .withSource("example-source")
                .withTime(new java.util.Date())
                .withDetail("example-detail");

        // Create a list of events to send
        List<com.amazonaws.services.eventbridge.model.Event> events = new ArrayList<>();
        events.add(event);

        // Create a PutEventsRequest to send to EventBridge
        PutEventsRequest request = new PutEventsRequest()
                .withEntries(
                        new com.amazonaws.services.eventbridge.model.PutEventsRequestEntry()
                                .withEventBusName("default")
                                .withEvents(events)
                );

        // Send the events to EventBridge
        PutEventsResult result = client.putEvents(request);

        // Print the results of sending the events
        for (PutEventsResultEntry entry : result.getEntries()) {
            System.out.println("Event sent: " + entry.getEventId());
        }
    }
}

