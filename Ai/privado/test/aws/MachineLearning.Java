package Ai.privado.test.aws;

import com.amazonaws.services.machinelearning.AmazonMachineLearningClientBuilder;
import com.amazonaws.services.machinelearning.model.PredictRequest;
import com.amazonaws.services.machinelearning.model.PredictResult;

import java.util.List;

public class MachineLearning {

    private static final String MODEL_ID = "MODEL_ID";
    private static final String ML_ENDPOINT = "ML_ENDPOINT";

    public List<String> processPersonalData(List<String> personalData) {
        AmazonMachineLearningClientBuilder builder = AmazonMachineLearningClientBuilder.standard();
        builder.setEndpointConfiguration(ML_ENDPOINT);
        com.amazonaws.services.machinelearning.AmazonMachineLearning client = builder.build();

        PredictRequest predictRequest = new PredictRequest()
                .withMLModelId(MODEL_ID)
                .withRecord(personalData);

        PredictResult result = client.predict(predictRequest);

        return result.getPrediction().getPredictedValues();
    }
}

