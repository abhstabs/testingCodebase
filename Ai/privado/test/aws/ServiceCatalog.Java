package ai.privado.test.aws;

import com.amazonaws.services.servicecatalog.AWSServiceCatalogClientBuilder;
import com.amazonaws.services.servicecatalog.model.CreatePortfolioRequest;

import java.util.ArrayList;
import java.util.List;

public class ServiceCatalog {
  public static void main(String[] args) {
    // Create a Portfolio
    CreatePortfolioRequest createPortfolioRequest = new CreatePortfolioRequest()
        .withDisplayName("TestPortfolio")
        .withDescription("Test Portfolio Description");

    AWSServiceCatalogClientBuilder.defaultClient().createPortfolio(createPortfolioRequest);

    // Process Personal Data
    List<String> personalData = new ArrayList<>();
    personalData.add("John Doe");
    personalData.add("Jane Doe");
    personalData.add("John Smith");

    for (String data : personalData) {
     
      System.out.println("Processing personal data: " + data);
    }
  }
}

