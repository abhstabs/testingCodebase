package ai.privado.test.aws;

import com.amazonaws.services.rdsdata.AWSRDSData;
import com.amazonaws.services.rdsdata.AWSRDSDataClientBuilder;
import com.amazonaws.services.rdsdata.model.ExecuteSqlRequest;
import com.amazonaws.services.rdsdata.model.ExecuteSqlResult;
import com.amazonaws.services.rdsdata.model.Field;

import java.util.List;

public class RDSData {
    public static void main(String[] args) {
        // Initialize the Amazon RDS Data client
        AWSRDSData rdsDataClient = AWSRDSDataClientBuilder.defaultClient();
        
        // Define the SQL query to retrieve personal data
        String sql = "SELECT * FROM personal_data;";
        
        // Define the RDS Data Request
        ExecuteSqlRequest rdsDataRequest = new ExecuteSqlRequest()
            .withAwsSecretStoreArn("arn:aws:secretsmanager:us-west-2:123456789012:secret:my-secret")
            .withDbClusterOrInstanceArn("arn:aws:rds:us-west-2:123456789012:cluster:my-cluster")
            .withSqlStatements(sql);
        
        // Send the RDS Data Request
        ExecuteSqlResult rdsDataResult = rdsDataClient.executeSql(rdsDataRequest);
        
        // Get the RDS Data Result
        List<Field> fields = rdsDataResult.getResultSet().getRecords().get(0).getFields();
        
        // Print the RDS Data Result
        System.out.println("RDS Data Result:");
        for (Field field : fields) {
            System.out.println(field.getStringValue());
        }
    }
}

