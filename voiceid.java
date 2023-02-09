import com.amazonaws.services.voiceid.model.CreateProfileRequest;
import com.amazonaws.services.voiceid.model.CreateProfileResult;
import com.amazonaws.services.voiceid.model.VoiceIdClient;

public class VoiceIDProcessor {

    private VoiceIdClient voiceIdClient;

    public VoiceIDProcessor(VoiceIdClient voiceIdClient) {
        this.voiceIdClient = voiceIdClient;
    }

    public void processPersonalData(String firstName, String lastName, String phoneNumber) {
        // Create a new profile in Voice ID
        CreateProfileRequest createProfileRequest = new CreateProfileRequest()
                .withFirstName(firstName)
                .withLastName(lastName)
                .withPhoneNumber(phoneNumber);
        CreateProfileResult createProfileResult = voiceIdClient.createProfile(createProfileRequest);
        System.out.println("Profile created with ID: " + createProfileResult.getProfileId());
    }
}

