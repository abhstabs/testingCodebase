package ai.privado.test.aws;

import com.amazonaws.services.logs.AWSLogs;
import com.amazonaws.services.logs.AWSLogsClientBuilder;
import com.amazonaws.services.logs.model.CreateLogStreamRequest;
import com.amazonaws.services.logs.model.InputLogEvent;
import com.amazonaws.services.logs.model.PutLogEventsRequest;

import java.util.List;

public class CloudWatchLogs {
    public static void main(String[] args) {
        // Initialize the Amazon CloudWatch Logs client
        AWSLogs cloudWatchLogsClient = AWSLogsClientBuilder.defaultClient();
        
        // Define the CloudWatch Logs stream
        String logGroupName = "personal-data-logs";
        String logStreamName = "personal-data-stream";
        
        // Create the CloudWatch Logs stream if it does not exist
        if (!cloudWatchLogsClient.describeLogStreams(logGroupName).getLogStreams().stream().anyMatch(x -> x.getLogStreamName().equals(logStreamName))) {
            cloudWatchLogsClient.createLogStream(new CreateLogStreamRequest(logGroupName, logStreamName));
        }
        
        // Define the personal data to be logged
        List<String> personalData = List.of("John Doe", "Jane Doe", "John Smith");
        
        // Define the CloudWatch Logs events
        List<InputLogEvent> logEvents = personalData.stream().map(data -> {
            return new InputLogEvent()
                .withMessage(data)
                .withTimestamp(System.currentTimeMillis());
        }).collect(Collectors.toList());
        
        // Put the CloudWatch Logs events
        cloudWatchLogsClient.putLogEvents(new PutLogEventsRequest(logGroupName, logStreamName, logEvents));
    }
}

