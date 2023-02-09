import com.amazonaws.services.gluedatabrew.AWSGlueDataBrew;
import com.amazonaws.services.gluedatabrew.AWSGlueDataBrewClientBuilder;
import com.amazonaws.services.gluedatabrew.model.CreateProfileJobRequest;
import com.amazonaws.services.gluedatabrew.model.CreateProfileJobResult;

import java.util.List;

public class GlueDataBrewProcessor {
    private AWSGlueDataBrew glueDataBrewClient;

    public GlueDataBrewProcessor() {
        this.glueDataBrewClient = AWSGlueDataBrewClientBuilder.defaultClient();
    }

    public void processPersonalData(List<PersonalData> personalDataList) {
        for (PersonalData personalData : personalDataList) {
            CreateProfileJobRequest createProfileJobRequest = new CreateProfileJobRequest()
                    .withDatasetName(personalData.getDatasetName())
                    .withRecipeReference(personalData.getRecipeReference());

            CreateProfileJobResult createProfileJobResult = glueDataBrewClient.createProfileJob(createProfileJobRequest);

            // You can add additional processing logic here
        }
    }
}

class PersonalData {
    private String datasetName;
    private String recipeReference;

    public PersonalData(String datasetName, String recipeReference) {
        this.datasetName = datasetName;
        this.recipeReference = recipeReference;
    }

    public String getDatasetName() {
        return datasetName;
    }

    public String getRecipeReference() {
        return recipeReference;
    }
}

