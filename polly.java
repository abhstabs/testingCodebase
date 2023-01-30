import com.amazonaws.services.polly.AmazonPolly;
import com.amazonaws.services.polly.AmazonPollyClientBuilder;
import com.amazonaws.services.polly.model.SynthesizeSpeechRequest;
import com.amazonaws.services.polly.model.SynthesizeSpeechResult;

public class PersonalDataProcessor {

    public static void main(String[] args) {
        AmazonPolly pollyClient = AmazonPollyClientBuilder.defaultClient();

        SynthesizeSpeechRequest synthesizeSpeechRequest = new SynthesizeSpeechRequest()
            .withText("Example personal data")
            .withVoiceId("Joanna")
            .withOutputFormat("mp3");

        SynthesizeSpeechResult synthesizeSpeechResult = pollyClient.synthesizeSpeech(synthesizeSpeechRequest);

        System.out.println("Audio Stream Length: " + synthesizeSpeechResult.getAudioStream().available());
    }
}

