package Ai.privado.test.aws;

import com.amazonaws.services.textract.AmazonTextract;
import com.amazonaws.services.textract.AmazonTextractClientBuilder;
import com.amazonaws.services.textract.model.AnalyzeDocumentRequest;
import com.amazonaws.services.textract.model.AnalyzeDocumentResult;
import com.amazonaws.services.textract.model.Block;

public class Textract {

    public static void main(String[] args) {
        AmazonTextract textractClient = AmazonTextractClientBuilder.defaultClient();

        AnalyzeDocumentRequest request = new AnalyzeDocumentRequest()
                .withDocument(new S3Object()
                        .withBucket("my-bucket")
                        .withName("example.png"))
                .withFeatureTypes("TABLES", "FORMS");

        AnalyzeDocumentResult result = textractClient.analyzeDocument(request);

        for (Block block : result.getBlocks()) {
            System.out.println("Block type: " + block.getBlockType());
        }
    }
}

