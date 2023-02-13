package ai.privado.test.aws;

import com.amazonaws.services.quicksight.AmazonQuickSight;
import com.amazonaws.services.quicksight.AmazonQuickSightClientBuilder;
import com.amazonaws.services.quicksight.model.ListAnalysesRequest;
import com.amazonaws.services.quicksight.model.ListAnalysesResult;

public class QuickSight {
    public static void main(String[] args) {
        AmazonQuickSight client = AmazonQuickSightClientBuilder.standard().build();
        ListAnalysesRequest request = new ListAnalysesRequest();
        ListAnalysesResult result = client.listAnalyses(request);
        System.out.println("Analysis list: " + result.getAnalysisSummaryList());
    }
}

