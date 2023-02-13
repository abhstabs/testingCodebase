package ai.privado.test.aws;

import com.amazonaws.services.elasticmapreduce.AmazonElasticMapReduce;
import com.amazonaws.services.elasticmapreduce.AmazonElasticMapReduceClientBuilder;
import com.amazonaws.services.elasticmapreduce.model.ListClustersRequest;
import com.amazonaws.services.elasticmapreduce.model.ListClustersResult;

public class ElasticMapReduce {

    public static void main(String[] args) {

        AmazonElasticMapReduce emr = AmazonElasticMapReduceClientBuilder.defaultClient();

        ListClustersRequest request = new ListClustersRequest();
        ListClustersResult result = emr.listClusters(request);

        System.out.println("List of EMR clusters: " + result.getClusters());
    }
}

