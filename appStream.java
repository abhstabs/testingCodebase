import com.amazonaws.services.appstream.AmazonAppStream;
import com.amazonaws.services.appstream.AmazonAppStreamClientBuilder;
import com.amazonaws.services.appstream.model.CreateStackRequest;

public class AppStreamExample {
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


