import com.amazonaws.services.config.AWSConfig;
import com.amazonaws.services.config.AWSConfigClientBuilder;
import com.amazonaws.services.config.model.PutConfigurationRecorderRequest;
import com.amazonaws.services.config.model.ConfigurationRecorder;
import com.amazonaws.services.config.model.RecordingGroup;

public class ConfigWorker {

    private AWSConfig config;

    public ConfigWorker() {
        config = AWSConfigClientBuilder.defaultClient();
    }

    public void processPersonalData(Map<String,String> personalData) {
        RecordingGroup recordingGroup = new RecordingGroup()
            .withAllSupported(false)
            .withIncludeGlobalResourceTypes(false)
            .withResourceTypes(Arrays.asList("AWS::S3::Object"));

        ConfigurationRecorder configRecorder = new ConfigurationRecorder()
            .withName("PersonalDataRecorder")
            .withRecordingGroup(recordingGroup);

        PutConfigurationRecorderRequest request = new PutConfigurationRecorderRequest()
            .withConfigurationRecorder(configRecorder);

        config.putConfigurationRecorder(request);
    }
}

