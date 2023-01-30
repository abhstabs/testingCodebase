import com.amazonaws.services.cloudtrail.AWSCloudTrail;
import com.amazonaws.services.cloudtrail.AWSCloudTrailClientBuilder;
import com.amazonaws.services.cloudtrail.model.PutEventSelectorsRequest;
import com.amazonaws.services.cloudtrail.model.EventSelector;
import com.amazonaws.services.cloudtrail.model.DataResource;

public class CloudTrailWorker {

    private AWSCloudTrail cloudTrail;

    public CloudTrailWorker() {
        cloudTrail = AWSCloudTrailClientBuilder.defaultClient();
    }

    public void processPersonalData(Map<String,String> personalData) {
        DataResource dataResource = new DataResource()
            .withType("AWS::S3::Object")
            .withValues(Arrays.asList("arn:aws:s3:::personal-data-bucket/*"));

        EventSelector eventSelector = new EventSelector()
            .withReadWriteType("All")
            .withIncludeManagementEvents(false)
            .withDataResources(Arrays.asList(dataResource));

        PutEventSelectorsRequest request = new PutEventSelectorsRequest()
            .withTrailName("PersonalDataTrail")
            .withEventSelectors(Arrays.asList(eventSelector));

        cloudTrail.putEventSelectors(request);
    }
}

