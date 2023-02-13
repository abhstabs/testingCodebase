package ai.privado.test.aws;

import com.amazonaws.services.dataexchange.AmazonDataExchange;
import com.amazonaws.services.dataexchange.model.CreateDataSetRequest;
import com.amazonaws.services.dataexchange.model.CreateRevisionRequest;
import com.amazonaws.services.dataexchange.model.DataSetEntry;
import com.amazonaws.services.dataexchange.model.ImportAssetFromSignedUrlRequest;

import java.util.ArrayList;
import java.util.List;

public class DataExchange {
    public static void AWSDataExchangeFirstNameFlow(String firstName, String lastName, String phoneNumber, String dob, AmazonDataExchange dataExchangeClient) {
        String dataSetName = firstName + " " + lastName + " Personal Data";
        String revisionId = "Revision1";
        String assetName = firstName + " " + lastName + " Asset";

        // Create a new data set
        CreateDataSetRequest createDataSetRequest = new CreateDataSetRequest()
                .withName(dataSetName)
                .withDescription("Personal data of " + firstName + " " + lastName);
        String dataSetId = dataExchangeClient.createDataSet(createDataSetRequest).getId();

        // Create a revision for the data set
        CreateRevisionRequest createRevisionRequest = new CreateRevisionRequest()
                .withDataSetId(dataSetId)
                .withComment("First revision for " + firstName + " " + lastName + " data");
        String revisionArn = dataExchangeClient.createRevision(createRevisionRequest).getArn();

        // Prepare the asset
        List<DataSetEntry> entries = new ArrayList<>();
        entries.add(new DataSetEntry().withEntryName("firstName").withContent(firstName));
        entries.add(new DataSetEntry().withEntryName("lastName").withContent(lastName));
        entries.add(new DataSetEntry().withEntryName("phoneNumber").withContent(phoneNumber));
        entries.add(new DataSetEntry().withEntryName("dob").withContent(dob));

        // Import the asset
        ImportAssetFromSignedUrlRequest importAssetRequest = new ImportAssetFromSignedUrlRequest()
                .withDataSetId(dataSetId)
                .withRevisionId(revisionId)
                .withAssetName(assetName)
                .withEntries(entries);
        dataExchangeClient.importAssetFromSignedUrl(importAssetRequest);
    }
}

