import com.amazonaws.services.rekognition.AmazonRekognition;
import com.amazonaws.services.rekognition.AmazonRekognitionClientBuilder;
import com.amazonaws.services.rekognition.model.DetectLabelsRequest;
import com.amazonaws.services.rekognition.model.DetectLabelsResult;
import com.amazonaws.services.rekognition.model.Image;
import com.amazonaws.services.rekognition.model.Label;
import java.util.List;

public class RekognitionSink {

    public static void main(String[] args) {
        // Create an Amazon Rekognition client
        AmazonRekognition rekognitionClient = AmazonRekognitionClientBuilder.defaultClient();

        // Provide an image to detect labels in
        Image image = new Image()
            .withBytes(ByteBuffer.wrap(imageBytes));

        // Create a DetectLabelsRequest
        DetectLabelsRequest request = new DetectLabelsRequest()
            .withImage(image)
            .withMaxLabels(10)
            .withMinConfidence(75F);

        // Send the request
        DetectLabelsResult result = rekognitionClient.detectLabels(request);

        // Get the list of labels
        List<Label> labels = result.getLabels();

        // Print out the labels
        for (Label label : labels) {
            System.out.println(label.getName() + ": " + label.getConfidence().toString());
        }
    }
}

