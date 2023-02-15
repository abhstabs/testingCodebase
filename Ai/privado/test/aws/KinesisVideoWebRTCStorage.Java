package Ai.privado.test.aws;

import com.amazonaws.services.kinesisvideowebrtcstorage.AWSKinesisVideoWebRTCStorage;
import com.amazonaws.services.kinesisvideowebrtcstorage.model.PutRecordRequest;

public class KinesisVideoWebRTCStorage {
    private final AWSKinesisVideoWebRTCStorage kinesisVideoWebRTCStorageClient;

    public KinesisVideoWebRTCStorage(AWSKinesisVideoWebRTCStorage kinesisVideoWebRTCStorageClient) {
        this.kinesisVideoWebRTCStorageClient = kinesisVideoWebRTCStorageClient;
    }

    public void AWSKinesisVideoWebrtcStorageFirstNameFlow(String firstName, String lastName, String phoneNumber, String DOB) {
        PutRecordRequest putRecordRequest = new PutRecordRequest()
            .withStreamName("personal-data-stream")
            .withData(String.format("First Name: %s, Last Name: %s, Phone Number: %s, DOB: %s", firstName, lastName, phoneNumber, DOB).getBytes());

        kinesisVideoWebRTCStorageClient.putRecord(putRecordRequest);
    }
}

