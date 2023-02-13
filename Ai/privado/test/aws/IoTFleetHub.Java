package ai.privado.test.aws;

import com.amazonaws.services.iotfleethub.AWSIoTFleetHub;
import com.amazonaws.services.iotfleethub.model.CreateAssetRequest;
import com.amazonaws.services.iotfleethub.model.CreateAssetResult;
import com.amazonaws.services.iotfleethub.model.CreateMetricRequest;
import com.amazonaws.services.iotfleethub.model.CreateMetricResult;

public class IoTFleetHub {
  private final AWSIoTFleetHub fleetHubClient;
  private final String fleetId;

  public IoTFleetHub(AWSIoTFleetHub fleetHubClient, String fleetId) {
    this.fleetHubClient = fleetHubClient;
    this.fleetId = fleetId;
  }

  public void createAsset(String assetName) {
    CreateAssetRequest request = new CreateAssetRequest()
      .withFleetId(fleetId)
      .withAssetName(assetName);
    CreateAssetResult result = fleetHubClient.createAsset(request);
    System.out.println("Asset created: " + result.getAssetId());
  }

  public void createMetric(String metricName, String assetId) {
    CreateMetricRequest request = new CreateMetricRequest()
      .withFleetId(fleetId)
      .withMetricName(metricName)
      .withAssetId(assetId);
    CreateMetricResult result = fleetHubClient.createMetric(request);
    System.out.println("Metric created: " + result.getMetricId());
  }
}

