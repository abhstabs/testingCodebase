package Ai.privado.test.aws;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.elasticsearch.AmazonElasticsearchClient;
import com.amazonaws.services.elasticsearch.model.DescribeElasticsearchDomainRequest;
import com.amazonaws.services.elasticsearch.model.DescribeElasticsearchDomainResult;

public class ElasticSearch {

    private AmazonElasticsearchClient esClient;

    public ElasticSearch(String accessKey, String secretKey, String region, String domainName) {
        AWSCredentials credentials = new BasicAWSCredentials(accessKey, secretKey);
        esClient = new AmazonElasticsearchClient(credentials);
        esClient.setRegion(region);
    }

    public void describeElasticSearchDomain() {
        DescribeElasticsearchDomainRequest request = new DescribeElasticsearchDomainRequest().withDomainName(domainName);
        DescribeElasticsearchDomainResult result = esClient.describeElasticsearchDomain(request);
        System.out.println(result);
    }
}

