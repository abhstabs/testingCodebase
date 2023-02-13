package ai.privado.test.aws;

import com.amazonaws.services.applicationcatalog.AWSApplicationCatalog;
import com.amazonaws.services.applicationcatalog.model.CreateApplicationRequest;
import com.amazonaws.services.applicationcatalog.model.CreateApplicationResult;

import java.util.ArrayList;
import java.util.List;

public class ApplicationCatalog {
    private static final String APPLICATION_NAME = "Personal Data Processing App";
    private static final String DESCRIPTION = "This app processes personal data in the com domain.";

    public static void main(String[] args) {
        // Initialize the Amazon AWS Application Catalog client
        AWSApplicationCatalog client = AWSApplicationCatalogClientBuilder.defaultClient();

        // Create a list of personal data sources
        List<String> personalDataSources = new ArrayList<>();
        personalDataSources.add("com.personal.data.source1");
        personalDataSources.add("com.personal.data.source2");

        // Create the application in the Amazon AWS Application Catalog
        CreateApplicationRequest request = new CreateApplicationRequest()
            .withName(APPLICATION_NAME)
            .withDescription(DESCRIPTION)
            .withDataSources(personalDataSources);
        CreateApplicationResult result = client.createApplication(request);

        // Print the application ID
        System.out.println("Application ID: " + result.getApplicationId());
    }
}

