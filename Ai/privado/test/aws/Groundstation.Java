package Ai.privado.test.aws;

import com.amazonaws.services.groundstation.model.CreateDataflowEndpointGroupRequest;
import com.amazonaws.services.groundstation.model.DataflowEndpoint;
import com.amazonaws.services.groundstation.model.EndpointDetails;

import java.util.ArrayList;
import java.util.List;

public class Groundstation {
    private AWSModelStationClient client;
    private String dataflowEndpointGroupId;

    public Groundstation(AWSModelStationClient client) {
        this.client = client;
    }

    public void createDataflowEndpointGroup(String name, List<String> endpoints) {
        List<DataflowEndpoint> dataflowEndpoints = new ArrayList<>();
        for (String endpoint : endpoints) {
            DataflowEndpoint dataflowEndpoint = new DataflowEndpoint()
                .withEndpointDetails(new EndpointDetails().withEndpoint(endpoint));
            dataflowEndpoints.add(dataflowEndpoint);
        }
        CreateDataflowEndpointGroupRequest request = new CreateDataflowEndpointGroupRequest()
            .withEndpointDetails(dataflowEndpoints)
            .withName(name);
        dataflowEndpointGroupId = client.createDataflowEndpointGroup(request).getDataflowEndpointGroupId();
    }

    public void sendMessage(String message) {
        // Code to send message to dataflow endpoint group goes here
    }

    public void deleteDataflowEndpointGroup() {
        client.deleteDataflowEndpointGroup(dataflowEndpointGroupId);
    }
}

