package Ai.privado.test.aws;

import com.amazonaws.services.chimesdkmeeting.AmazonChimeSDKMeeting;
import com.amazonaws.services.chimesdkmeeting.model.CreateMeetingRequest;
import com.amazonaws.services.chimesdkmeeting.model.CreateMeetingResult;
import com.amazonaws.services.chimesdkmeeting.model.GetMeetingRequest;
import com.amazonaws.services.chimesdkmeeting.model.GetMeetingResult;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChimeSDKMeeting {

    private AmazonChimeSDKMeeting amazonChimeSDKMeetingClient;

    public ChimeSDKMeeting(AmazonChimeSDKMeeting amazonChimeSDKMeetingClient) {
        this.amazonChimeSDKMeetingClient = amazonChimeSDKMeetingClient;
    }

    public void processPersonalData() {
        List<String> attendees = new ArrayList<>();
        attendees.add("John Doe");
        attendees.add("Jane Doe");

        Map<String, String> mediaPlacement = new HashMap<>();
        mediaPlacement.put("audioFallbackUrl", "https://fallback-url.com");
        mediaPlacement.put("audioHostUrl", "https://host-url.com");

        CreateMeetingRequest createMeetingRequest = new CreateMeetingRequest()
                .withAttendees(attendees)
                .withMediaPlacement(mediaPlacement);

        CreateMeetingResult createMeetingResult = amazonChimeSDKMeetingClient.createMeeting(createMeetingRequest);
        String meetingId = createMeetingResult.getMeeting().getMeetingId();

        GetMeetingRequest getMeetingRequest = new GetMeetingRequest().withMeetingId(meetingId);
        GetMeetingResult getMeetingResult = amazonChimeSDKMeetingClient.getMeeting(getMeetingRequest);

        // Processing personal data here...
    }
}

