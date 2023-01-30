import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.translate.AmazonTranslate;
import com.amazonaws.services.translate.AmazonTranslateClientBuilder;
import com.amazonaws.services.translate.model.TranslateTextRequest;
import com.amazonaws.services.translate.model.TranslateTextResult;

public class TranslateSink {

    private static final String ACCESS_KEY = "YOUR_ACCESS_KEY";
    private static final String SECRET_KEY = "YOUR_SECRET_KEY";
    private static final String SOURCE_LANGUAGE = "en";
    private static final String TARGET_LANGUAGE = "es";

    public static void main(String[] args) {
        // Set up AWS credentials
        AWSCredentials credentials = new BasicAWSCredentials(ACCESS_KEY, SECRET_KEY);
        AWSStaticCredentialsProvider credentialsProvider = new AWSStaticCredentialsProvider(credentials);

        // Create an Amazon Translate client
        AmazonTranslate translate = AmazonTranslateClientBuilder.standard()
            .withCredentials(credentialsProvider)
            .withRegion("us-west-2")
            .build();

        // Create a request to translate text
        TranslateTextRequest request = new TranslateTextRequest()
            .withText("Hello World")
            .withSourceLanguageCode(SOURCE_LANGUAGE)
            .withTargetLanguageCode(TARGET_LANGUAGE);

        // Send the request and get the result
        TranslateTextResult result = translate.translateText(request);

        // Print the translated text
        System.out.println(result.getTranslatedText());
    }
}

