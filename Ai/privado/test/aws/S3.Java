package Ai.privado.test.aws;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutObjectRequest;

import java.io.File;

public class S3 {

    public static void main(String[] args) {
        // Replace with your own access key and secret key
        AWSCredentials credentials = new BasicAWSCredentials("ACCESS_KEY", "SECRET_KEY");

        // Replace with your own S3 bucket name
        String bucketName = "my-s3-bucket";

        // Replace with the file path of the file you want to upload
        File file = new File("path/to/file.txt");

        // Create an S3 client
        AmazonS3 s3Client = AmazonS3ClientBuilder
                .standard()
                .withCredentials(new AWSStaticCredentialsProvider(credentials))
                .withRegion(Regions.US_EAST_1)
                .build();

        // Create an S3 object metadata
        ObjectMetadata metadata = new ObjectMetadata();
        metadata.setContentType("text/plain");
        metadata.addUserMetadata("x-amz-meta-title", "my-file-title");

        // Create an S3 put object request
        PutObjectRequest request = new PutObjectRequest(bucketName, "path/in/bucket/file.txt", file)
                .withMetadata(metadata);

        // Upload the file to S3
        s3Client.putObject(request);
    }
}
