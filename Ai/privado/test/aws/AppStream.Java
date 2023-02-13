package ai.privado.test.aws;

import com.amazonaws.services.appstream.AmazonAppStream;
import com.amazonaws.services.appstream.AmazonAppStreamClientBuilder;
import com.amazonaws.services.appstream.model.CreateStackRequest;

public class AppStream {
    public static void main(String[] args) {
        // Create a new AppStream client
        AmazonAppStream appStream = AmazonAppStreamClientBuilder.standard().build();

        // Create a new AppStream stack
        CreateStackRequest stackRequest = new CreateStackRequest()
            .withName("MyStack")
            .withDescription("This is a sample stack for processing personal data.");
        appStream.createStack(stackRequest);
    }
}


