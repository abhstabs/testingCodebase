package ai.privado.test.aws;

import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.translatemedical.AWSTranslateMedical;
import com.amazonaws.services.translatemedical.AWSTranslateMedicalClientBuilder;
import com.amazonaws.services.translatemedical.model.TranslateMedicalTextRequest;
import com.amazonaws.services.translatemedical.model.TranslateMedicalTextResult;

public class TranslateMedical {
public static void main(String[] args) {
// Replace with your access key and secret key
AWSCredentials credentials = new BasicAWSCredentials("accessKey", "secretKey");

    // Create a client configuration
    ClientConfiguration clientConfig = new ClientConfiguration();

    // Create a TranslateMedical client
    AWSTranslateMedical translateMedical = AWSTranslateMedicalClientBuilder.standard()
            .withCredentials(new AWSStaticCredentialsProvider(credentials))
            .withClientConfiguration(clientConfig)
            .build();

    // Create a TranslateMedicalTextRequest
    TranslateMedicalTextRequest request = new TranslateMedicalTextRequest()
            .withSourceLanguageCode("en")
            .withTargetLanguageCode("fr")
            .withText("I have a headache");

    // Translate the text
    TranslateMedicalTextResult result = translateMedical.translateMedicalText(request);
    System.out.println("Translated Text: " + result.getTranslatedText());
}
}
