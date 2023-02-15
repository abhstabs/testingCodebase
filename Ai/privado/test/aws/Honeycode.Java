package Ai.privado.test.aws;

import com.amazonaws.services.honeycode.AmazonHoneycode;
import com.amazonaws.services.honeycode.AmazonHoneycodeClientBuilder;
import com.amazonaws.services.honeycode.model.*;

import java.util.ArrayList;
import java.util.List;

public class Honeycode {
    private final AmazonHoneycode honeycodeClient;

    public Honeycode() {
        honeycodeClient = AmazonHoneycodeClientBuilder.defaultClient();
    }

    public void processPersonalData(String personalData) {
        // 1. Prepare the personal data to be stored in the Honeycode table
        List<Row> rows = new ArrayList<>();
        Row row = new Row().withDataItems(new PutItemInput().withValue(personalData));
        rows.add(row);

        // 2. Store the personal data in the Honeycode table
        BatchUpsertTableRowsRequest request = new BatchUpsertTableRowsRequest()
            .withTableId("table-id")
            .withWorkbookId("workbook-id")
            .withRowsToUpsert(new UpsertRowsRequest().withRows(rows));
        BatchUpsertTableRowsResult result = honeycodeClient.batchUpsertTableRows(request);
    }
}

