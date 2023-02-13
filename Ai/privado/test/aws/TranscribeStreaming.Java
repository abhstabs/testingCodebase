package ai.privado.test.aws;

import com.amazonaws.services.transcribestreaming.AmazonTranscribeStreaming;
import com.amazonaws.services.transcribestreaming.AmazonTranscribeStreamingClientBuilder;
import com.amazonaws.services.transcribestreaming.model.StartStreamTranscriptionRequest;
import com.amazonaws.services.transcribestreaming.model.StartStreamTranscriptionResult;

public class TranscribeStreaming {

    public static void main(String[] args) {
        AmazonTranscribeStreaming transcribe = AmazonTranscribeStreamingClientBuilder.defaultClient();

        StartStreamTranscriptionRequest request = new StartStreamTranscriptionRequest()
            .withLanguageCode("en-US")
            .withMediaEncoding("pcm")
            .withMediaSampleRateHertz(16000)
            .withTranscriptionJobName("MyTranscriptionJob")
            .withMediaEventHandler(new MyAudioStreamHandler());

        StartStreamTranscriptionResult result = transcribe.startStreamTranscription(request);
        System.out.println("Transcription started with job id: " + result.getTranscriptionJob().getTranscriptionJobName());
    }
}

class MyAudioStreamHandler implements MediaEventStreamHandler {

    @Override
    public void onAudioEvent(AudioEvent audioEvent) {
        // handle audio data
    }

    @Override
    public void onTranscriptionEvent(TranscriptionEvent transcriptionEvent) {
        // handle transcription event
    }

    @Override
    public void onError(Throwable throwable) {
        // handle error
    }
}

