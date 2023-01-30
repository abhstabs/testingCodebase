import com.amazonaws.services.finspacedata.AmazonFinspaceDataClient;
import com.amazonaws.services.finspacedata.model.ListTablesRequest;
import com.amazonaws.services.finspacedata.model.ListTablesResult;

public class Main {
    public static void main(String[] args) {
        // Create an instance of the AmazonFinspaceDataClient class
        AmazonFinspaceDataClient client = new AmazonFinspaceDataClient();

        // Set the dataset name and the access key and secret key 
        client.setEndpoint("finspacedata.us-west-2.amazonaws.com");
        client.setRegion(Region.getRegion(Regions.US_WEST_2));
        client.setAWSCredentials(new BasicAWSCredentials("accessKey", "secretKey"));

        // Create a ListTablesRequest object
        ListTablesRequest request = new ListTablesRequest();
        request.setDatasetName("myDataset");

        // Send the request and get the result
        ListTablesResult result = client.listTables(request);

        // Print the names of the tables
        for (String tableName : result.getTableNames()) {
            System.out.println(tableName);
        }
    }
}

