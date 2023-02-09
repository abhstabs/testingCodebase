import com.amazonaws.services.chimesdkmediapipelines.ChimeSDKMediaPipelinesClient;
import com.amazonaws.services.chimesdkmediapipelines.model.CreatePipelineRequest;
import com.amazonaws.services.chimesdkmediapipelines.model.CreatePipelineResult;
import com.amazonaws.services.chimesdkmediapipelines.model.GetMediaSampleRequest;
import com.amazonaws.services.chimesdkmediapipelines.model.GetMediaSampleResult;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChimeSDKMediaPipelinesExample {
  static String accessKey = "ACCESS_KEY";
  static String secretKey = "SECRET_KEY";
  static String region = "REGION";

  public static void main(String[] args) {
    ChimeSDKMediaPipelinesClient client = new ChimeSDKMediaPipelinesClient(accessKey, secretKey, region);
    String pipelineName = "PIPELINE_NAME";
    String inputBucket = "INPUT_BUCKET";
    String roleArn = "ROLE_ARN";
    String mediaSampleId = "MEDIA_SAMPLE_ID";

    // Creating a pipeline
    CreatePipelineRequest createPipelineRequest = new CreatePipelineRequest();
    createPipelineRequest.setName(pipelineName);
    createPipelineRequest.setInputBucket(inputBucket);
    createPipelineRequest.setRoleArn(roleArn);
    CreatePipelineResult createPipelineResult = client.createPipeline(createPipelineRequest);
    String pipelineArn = createPipelineResult.getPipelineArn();

    // Getting media sample
    GetMediaSampleRequest getMediaSampleRequest = new GetMediaSampleRequest();
    getMediaSampleRequest.setPipelineArn(pipelineArn);
    getMediaSampleRequest.setMediaSampleId(mediaSampleId);
    GetMediaSampleResult getMediaSampleResult = client.getMediaSample(getMediaSampleRequest);
    Map<String, String> mediaMetadata = getMediaSampleResult.getMediaMetadata();
    String mediaSampleUri = getMediaSampleResult.getMediaSampleUri();
  }
}

