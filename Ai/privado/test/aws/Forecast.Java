package ai.privado.test.aws;

import com.amazonaws.services.forecast.AmazonForecast;
import com.amazonaws.services.forecast.AmazonForecastClientBuilder;
import com.amazonaws.services.forecast.model.CreateDatasetRequest;
import com.amazonaws.services.forecast.model.CreateDatasetResult;

public class Forecast {
    public static void main(String[] args) {
        // Build the client
        AmazonForecast forecast = AmazonForecastClientBuilder.standard().build();

        // Create a dataset
        CreateDatasetRequest createDatasetRequest = new CreateDatasetRequest()
                .withDatasetName("myDataset")
                .withDomain("RETAIL");
        CreateDatasetResult createDatasetResult = forecast.createDataset(createDatasetRequest);

        // Print the dataset ARN
        System.out.println("Dataset ARN: " + createDatasetResult.getDatasetArn());
    }
}

