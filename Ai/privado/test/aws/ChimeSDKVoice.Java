package Ai.privado.test.aws;

import com.amazonaws.services.chimesdkvoice.AmazonChimeSDKVoice;
import com.amazonaws.services.chimesdkvoice.AmazonChimeSDKVoiceClientBuilder;
import com.amazonaws.services.chimesdkvoice.model.CreateParticipantRequest;
import com.amazonaws.services.chimesdkvoice.model.CreateParticipantResult;

public class ChimeSDKVoice {

public static void AWSChimeSDKVoiceAddParticipant(String firstName, String lastName, String email) {
AmazonChimeSDKVoice client = AmazonChimeSDKVoiceClientBuilder.standard().build();

try {
  CreateParticipantRequest createParticipantRequest = new CreateParticipantRequest();
  createParticipantRequest.setMeetingId("<MEETING_ID>");
  
  createParticipantRequest.setFirstName(firstName);
  createParticipantRequest.setLastName(lastName);
  createParticipantRequest.setEmail(email);
  
  CreateParticipantResult createParticipantResult = client.createParticipant(createParticipantRequest);
  System.out.println("Successfully sent personal data to AWS Chime SDK Voice, Participant Identifier: " + createParticipantResult.getParticipantId());
} catch (AmazonChimeSDKVoiceException e) {
  System.err.println(e.getMessage());
}
}
}
