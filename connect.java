import com.amazonaws.services.connect.AmazonConnect;
import com.amazonaws.services.connect.AmazonConnectClientBuilder;

public class ConnectSample {
    public static void main(String[] args) {
        AmazonConnect connect = AmazonConnectClientBuilder.standard().build();
        
        // Use the connect object to interact with the Amazon Connect service.
    }
}

