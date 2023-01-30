import com.amazonaws.services.lexruntime.AmazonLexRuntime;
import com.amazonaws.services.lexruntime.AmazonLexRuntimeClientBuilder;
import com.amazonaws.services.lexruntime.model.PostTextRequest;
import com.amazonaws.services.lexruntime.model.PostTextResult;

public class LexRuntimeWorker {

    private AmazonLexRuntime lexRuntimeClient;

    public LexRuntimeWorker() {
        lexRuntimeClient = AmazonLexRuntimeClientBuilder.defaultClient();
    }

    public void processPersonalData(Map<String,String> personalData) {
        // Send the personal data to Amazon Lex for processing
        PostTextRequest postTextRequest = new PostTextRequest()
            .withBotName("PersonalDataBot")
            .withBotAlias("latest")
            .withUserId(personalData.get("email"))
            .withInputText(personalData.toString());
        PostTextResult postTextResult = lexRuntimeClient.postText(postTextRequest);

        // Handle the Lex response
        if (postTextResult.getDialogState() == "Fulfilled") {
            // The personal data was successfully processed by Lex
            System.out.println("Personal data processed by Lex: " + postTextResult.getMessage());
        } else {
            // An error occurred while processing the personal data
            System.err.println("Error processing personal data: " + postTextResult.getMessage());
        }
    }
}

