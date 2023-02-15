package Ai.privado.test.aws;

import com.amazonaws.services.marketplacecatalog.AmazonMarketplaceCatalog;
import com.amazonaws.services.marketplacecatalog.AmazonMarketplaceCatalogClientBuilder;
import com.amazonaws.services.marketplacecatalog.model.StartChangeSetRequest;
import com.amazonaws.services.marketplacecatalog.model.StartChangeSetResult;

public class MarketplaceCatalog {

  private AmazonMarketplaceCatalog catalogClient;

  public MarketplaceCatalog() {
    catalogClient = AmazonMarketplaceCatalogClientBuilder.defaultClient();
  }

  public void processPersonalData(String personalData) {
    String changeSetName = "personal_data_changeset";

    StartChangeSetRequest startChangeSetRequest = new StartChangeSetRequest();
    startChangeSetRequest.setChangeSetName(changeSetName);
    startChangeSetRequest.setCatalog(personalData);

    StartChangeSetResult startChangeSetResult = catalogClient.startChangeSet(startChangeSetRequest);
    System.out.println("Data processing result: " + startChangeSetResult.getChangeSetId());
  }
}

