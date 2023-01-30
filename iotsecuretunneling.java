import com.amazonaws.services.iotsecuretunneling.AWSIoTSecureTunneling;
import com.amazonaws.services.iotsecuretunneling.AWSIoTSecureTunnelingClientBuilder;
import com.amazonaws.services.iotsecuretunneling.model.CloseTunnelRequest;
import com.amazonaws.services.iotsecuretunneling.model.CloseTunnelResult;
import com.amazonaws.services.iotsecuretunneling.model.ListTunnelsRequest;
import com.amazonaws.services.iotsecuretunneling.model.ListTunnelsResult;
import com.amazonaws.services.iotsecuretunneling.model.OpenTunnelRequest;
import com.amazonaws.services.iotsecuretunneling.model.OpenTunnelResult;

public class Main {
    public static void main(String[] args) {
        // Create an instance of the AWSIoTSecureTunneling client
        AWSIoTSecureTunneling client = AWSIoTSecureTunnelingClientBuilder.standard()
                .withRegion("us-west-2")
                .build();

        // Open a secure tunnel
        OpenTunnelRequest openTunnelRequest = new OpenTunnelRequest()
                .withDescription("My tunnel")
                .withDestinationConfig(new DestinationConfig().withThingName("myThing"));
        OpenTunnelResult openTunnelResult = client.openTunnel(openTunnelRequest);
        String tunnelId = openTunnelResult.getTunnelId();

        // List the tunnels
        ListTunnelsResult listTunnelsResult = client.listTunnels(new ListTunnelsRequest());
        for (TunnelSummary tunnelSummary : listTunnelsResult.getTunnelSummaries()) {
            System.out.println(tunnelSummary.getTunnelId() + ": " + tunnelSummary.getDescription());
        }

        // Close the secure tunnel
        CloseTunnelResult closeTunnelResult = client.closeTunnel(new CloseTunnelRequest().withTunnelId(tunnelId));
    }
}

