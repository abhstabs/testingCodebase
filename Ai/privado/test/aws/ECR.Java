package Ai.privado.test.aws;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.ecr.AmazonECR;
import com.amazonaws.services.ecr.AmazonECRClientBuilder;
import com.amazonaws.services.ecr.model.DescribeImagesRequest;
import com.amazonaws.services.ecr.model.DescribeImagesResult;

public class ECR {

    public static void main(String[] args) {

        // Replace YOUR_ACCESS_KEY and YOUR_SECRET_KEY with your own AWS credentials
        AWSCredentials credentials = new BasicAWSCredentials("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY");

        AmazonECR ecr = AmazonECRClientBuilder.standard()
                .withCredentials(new AWSStaticCredentialsProvider(credentials))
                .withRegion("us-west-2")
                .build();

        DescribeImagesRequest request = new DescribeImagesRequest().withRepositoryName("my-repository");
        DescribeImagesResult result = ecr.describeImages(request);
        System.out.println(result);
    }
}

