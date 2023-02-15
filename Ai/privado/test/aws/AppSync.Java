package Ai.privado.test.aws;

import com.amazonaws.services.appsync.AWSAppSync;
import com.amazonaws.services.appsync.AWSAppSyncClientBuilder;
import com.amazonaws.services.appsync.model.*;

public class AppSync {
    public static void main(String[] args) {
        // Create a new AppSync client
        AWSAppSync client = AWSAppSyncClientBuilder.standard()
                .build();

        // Create a new GraphQL query
        ListGraphqlApisRequest listApisRequest = new ListGraphqlApisRequest();
        ListGraphqlApisResult listApisResult = client.listGraphqlApis(listApisRequest);

        // Print the result
        System.out.println(listApisResult);
    }
}

