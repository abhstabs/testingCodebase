package Ai.privado.test.aws;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.elasticache.AmazonElastiCache;
import com.amazonaws.services.elasticache.AmazonElastiCacheClientBuilder;
import com.amazonaws.services.elasticache.model.CreateCacheClusterRequest;
import com.amazonaws.services.elasticache.model.DescribeCacheClustersRequest;
import com.amazonaws.services.elasticache.model.DescribeCacheClustersResult;

public class ElasticCache {
    private static final String ACCESS_KEY = "access_key";
    private static final String SECRET_KEY = "secret_key";
    private static final String REGION = "us-west-2";
    private static final String CACHE_CLUSTER_ID = "myCacheCluster";

    public static void main(String[] args) {
        // Setup AWS credentials
        AWSCredentials credentials = new BasicAWSCredentials(ACCESS_KEY, SECRET_KEY);
        AmazonElastiCache elastiCache = AmazonElastiCacheClientBuilder
                .standard()
                .withCredentials(new AWSStaticCredentialsProvider(credentials))
                .withRegion(REGION)
                .build();

        // Create a cache cluster
        CreateCacheClusterRequest createCacheClusterRequest = new CreateCacheClusterRequest()
                .withCacheClusterId(CACHE_CLUSTER_ID)
                .withNumCacheNodes(1);
        elastiCache.createCacheCluster(createCacheClusterRequest);

        // Describe the cache cluster
        DescribeCacheClustersRequest describeCacheClustersRequest = new DescribeCacheClustersRequest()
                .withCacheClusterId(CACHE_CLUSTER_ID);
        DescribeCacheClustersResult describeCacheClustersResult = elastiCache.describeCacheClusters(describeCacheClustersRequest);
        System.out.println(describeCacheClustersResult);
    }
}
