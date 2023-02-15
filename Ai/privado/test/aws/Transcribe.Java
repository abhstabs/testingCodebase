package Ai.privado.test.aws;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.transcribe.AmazonTranscribe;
import com.amazonaws.services.transcribe.AmazonTranscribeClientBuilder;
import com.amazonaws.services.transcribe.model.StartTranscriptionJobRequest;
import com.amazonaws.services.transcribe.model.StartTranscriptionJobResult;

public class Transcribe {
    public static void main(String[] args) {
        // Replace with your access key and secret key
        String accessKey = "ACCESS_KEY";
        String secretKey = "SECRET_KEY";
        AWSCredentials credentials = new BasicAWSCredentials(accessKey, secretKey);
        AmazonTranscribe transcribe = AmazonTranscribeClientBuilder
                .standard()
                .withCredentials(new AWSStaticCredentialsProvider(credentials))
                .withRegion(Regions.US_EAST_1)
                .build();

        // Replace with your file's S3 bucket and key
        String s3Bucket = "BUCKET_NAME";
        String s3Key = "FILE_KEY";

        StartTranscriptionJobRequest request = new StartTranscriptionJobRequest()
                .withLanguageCode("en-US")
                .withMediaFormat("mp3")
                .withMediaSampleRateHertz(8000)
                .withTranscriptionJobName("TranscriptionJobName")
                .withMedia(new Media().withMediaFileUri("s3://" + s3Bucket + "/" + s3Key));

        StartTranscriptionJobResult result = transcribe.startTranscriptionJob(request);
        System.out.println("Transcription Job ID: " + result.getTranscriptionJob().getTranscriptionJobName());
    }
}

