import com.amazonaws.services.lookoutforvision.AmazonLookoutforVision;
import com.amazonaws.services.lookoutforvision.AmazonLookoutforVisionClientBuilder;
import com.amazonaws.services.lookoutforvision.model.CreateDatasetRequest;
import com.amazonaws.services.lookoutforvision.model.CreateModelRequest;
import com.amazonaws.services.lookoutforvision.model.DatasetMetadata;
import com.amazonaws.services.lookoutforvision.model.ModelMetadata;
import com.amazonaws.services.lookoutforvision.model.S3DataConfig;
import com.amazonaws.services.lookoutforvision.model.S3DataSource;
import java.util.List;

public class LookoutForVisionExample {

  public static void main(String[] args) {
    AmazonLookoutforVision client = AmazonLookoutforVisionClientBuilder.defaultClient();

    // Create a dataset
    String datasetName = "personal_data_dataset";
    String datasetDisplayName = "Personal Data Dataset";
    S3DataSource s3DataSource = new S3DataSource().withBucket("personal-data-bucket");
    S3DataConfig s3DataConfig = new S3DataConfig().withS3DataSource(s3DataSource);
    CreateDatasetRequest createDatasetRequest = new CreateDatasetRequest()
        .withDatasetName(datasetName)
        .withDisplayName(datasetDisplayName)
        .withDataSource(s3DataConfig);
    DatasetMetadata datasetMetadata = client.createDataset(createDatasetRequest).getDataset();

    // Create a model
    String modelName = "personal_data_model";
    String modelDisplayName = "Personal Data Model";
    CreateModelRequest createModelRequest = new CreateModelRequest()
        .withModelName(modelName)
        .withDisplayName(modelDisplayName)
        .withDatasetName(datasetMetadata.getDatasetName());
    ModelMetadata modelMetadata = client.createModel(createModelRequest).getModel();

    // Get a list of all models
    List<ModelMetadata> modelMetadatas = client.listModels().getModels();
    for (ModelMetadata metadata : modelMetadatas) {
      System.out.println(metadata.getModelName());
    }
  }
}

