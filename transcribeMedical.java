import com.amazonaws.services.transcribemedical.AWSTranscribeMedical;
import com.amazonaws.services.transcribemedical.AWSTranscribeMedicalClientBuilder;
import com.amazonaws.services.transcribemedical.model.StartMedicalTranscriptionJobRequest;
import com.amazonaws.services.transcribemedical.model.StartMedicalTranscriptionJobResult;

public class TranscribeMedicalSink {
    public static void main(String[] args) {
        // Setup the Transcribe Medical client
        AWSTranscribeMedical transcribeMedical = AWSTranscribeMedicalClientBuilder.standard()
                .withRegion("us-west-2")
                .build();
        
        // Define the input and output settings for the transcription job
        StartMedicalTranscriptionJobRequest request = new StartMedicalTranscriptionJobRequest()
                .withLanguageCode("en-US")
                .withMediaSampleRateHertz(8000)
                .withMediaFormat("wav")
                .withTranscriptionJobName("my-transcription-job")
                .withOutputBucketName("my-output-bucket")
                .withInputMediaFileUri("s3://my-input-bucket/audio-file.wav");
        
        // Start the transcription job
        StartMedicalTranscriptionJobResult result = transcribeMedical.startMedicalTranscriptionJob(request);
        
        // Print the job status
        System.out.println("Transcription job status: " + result.getTranscriptionJob().getTranscriptionJobStatus());
    }
}

