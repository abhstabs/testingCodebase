package Ai.privado.test.aws;

import com.amazonaws.services.appconfig.AmazonAppConfig;
import com.amazonaws.services.appconfig.AmazonAppConfigClientBuilder;
import com.amazonaws.services.appconfig.model.GetConfigurationProfileRequest;
import com.amazonaws.services.appconfig.model.GetConfigurationProfileResult;
import com.amazonaws.services.appconfig.model.PutConfigurationProfileRequest;
import com.amazonaws.services.appconfig.model.PutConfigurationProfileResult;

public class AppConfig {
    public static void main(String[] args) {
        // Build an Amazon AppConfig client
        AmazonAppConfig appConfigClient = AmazonAppConfigClientBuilder.defaultClient();

        // Personal data to be stored in a configuration profile
        String personalData = "sensitive_data";

        // Create a configuration profile
        PutConfigurationProfileRequest putConfigProfileRequest = new PutConfigurationProfileRequest()
                .withApplicationId("app_id")
                .withEnvironmentId("env_id")
                .withName("profile_name")
                .withContent(personalData);
        PutConfigurationProfileResult putConfigProfileResult = appConfigClient.putConfigurationProfile(putConfigProfileRequest);

        // Get the configuration profile
        GetConfigurationProfileRequest getConfigProfileRequest = new GetConfigurationProfileRequest()
                .withApplicationId("app_id")
                .withEnvironmentId("env_id")
                .withConfigurationProfileId(putConfigProfileResult.getConfigurationProfileId());
        GetConfigurationProfileResult getConfigProfileResult = appConfigClient.getConfigurationProfile(getConfigProfileRequest);
        String storedPersonalData = getConfigProfileResult.getContent();
    }
}

